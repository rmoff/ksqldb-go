package ksqldb

import (
	"bufio"
	"context"
	"crypto/tls"
	"encoding/json"
	"fmt"
	"io/ioutil"
	"log"
	"net"
	"net/http"
	"strings"
	"time"

	"golang.org/x/net/http2"
)

// Push queries are continuous queries in which new events
// or changes to a table's state are pushed to the client.
// You can think of them as subscribing to a stream of changes.
//
// Since push queries never end, this function expects a channel
// to which it can write new rows of data as and when they are
// received.
//
// To use this function pass in a context, the SQL query statement,
// and two channels:
//
// * ksqldb.Row - rows of data
// * ksqldb.Header - header (including column definitions).
//                  If you don't want to block before receiving
//				    row data then make this channel buffered.
//
// The channel is populated with ksqldb.Row which represents
// one row of data. You will need to define variables to hold
// each column's value. You can adopt this pattern to do this:
// 		var DATA_TS float64
// 		var ID string
// 		for row := range rc {
// 			if row != nil {
//				DATA_TS = row[0].(float64)
// 				ID = row[1].(string)
func (cl *Client) Push(ctx context.Context, q string, rc chan<- Row, hc chan<- Header) (err error) {

	payload := strings.NewReader("{\"properties\":{\"ksql.streams.auto.offset.reset\": \"latest\"},\"sql\":\"" + q + "\"}")
	req, err := http.NewRequestWithContext(ctx, "POST", cl.url+"/query-stream", payload)
	if err != nil {
		return err
	}

	// If we've got creds to pass, let's pass them
	if cl.username != "" {
		req.SetBasicAuth(cl.username, cl.password)
	}

	client := &http.Client{}
	if req.URL.Scheme == "http" {
		// ksqlDB uses HTTP2 and if the server is on HTTP then Golang will not
		// use HTTP2 unless we force it to, thus.
		// Without this you get the error `http2: unsupported scheme`
		client.Transport = &http2.Transport{
			AllowHTTP: true,
			// Pretend we are dialing a TLS endpoint.
			// Note, we ignore the passed tls.Config
			DialTLS: func(network, addr string, cfg *tls.Config) (net.Conn, error) {
				return net.Dial(network, addr)
			},
		}
	}

	go cl.heartbeat(*client, ctx)

	//  make the request
	cl.log("Sending ksqlDB request:\n\t%v", q)
	res, err := client.Do(req)
	if err != nil {
		return err
	}
	defer res.Body.Close()

	reader := bufio.NewReader(res.Body)

	doThis := true
	var x interface{}
	var h Header

	for doThis {
		select {
		case <-ctx.Done():
			// close the channels and terminate the loop regardless
			defer close(rc)
			defer close(hc)
			defer func() { doThis = false }()
			// Try to close the query
			payload := strings.NewReader("{\"queryId\":\"" + h.queryId + "\"}")
			req, err := http.NewRequestWithContext(ctx, "POST", cl.url+"/close-query", payload)
			cl.log("Closing ksqlDB query\t%v", h.queryId)
			if err != nil {
				return fmt.Errorf("Failed to construct HTTP request to cancel query\n%v", err)
			}

			res, err := client.Do(req)
			if err != nil {
				return fmt.Errorf("Failed to execute HTTP request to cancel query\n%v", err)
			}
			if res.StatusCode != 200 {
				return fmt.Errorf("Close query failed:\n%v", res)
			}
			log.Println("Query closed.")
		default:

			// Read the next chunk
			body, err := reader.ReadBytes('\n')
			if err != nil {
				doThis = false
			}
			if res.StatusCode != 200 {
				return fmt.Errorf("The HTTP request did not return a success code:\n%v / %v", res.StatusCode, string(body))
			}
			// log.Println(string(body))
			if len(body) > 0 {

				// Parse the output
				if err := json.Unmarshal(body, &x); err != nil {
					return fmt.Errorf("Could not parse the response as JSON:\n%v\n%v", err, string(body))
				}

				switch zz := x.(type) {
				case map[string]interface{}:
					// It's a header row, so extract the data
					// {"queryId":null,"columnNames":["WINDOW_START","WINDOW_END","DOG_SIZE","DOGS_CT"],"columnTypes":["STRING","STRING","STRING","BIGINT"]}
					if _, ok := zz["queryId"].(string); ok {
						h.queryId = zz["queryId"].(string)
					} else {
						cl.log("Query ID not found - this is expected for a pull query")
					}

					names, okn := zz["columnNames"].([]interface{})
					types, okt := zz["columnTypes"].([]interface{})
					if okn && okt {
						for col := range names {
							if n, ok := names[col].(string); n != "" && ok {
								if t, ok := types[col].(string); t != "" && ok {
									a := Column{Name: n, Type: t}
									h.columns = append(h.columns, a)

								} else {
									cl.log("Nil type found for column %v", col)
								}
							} else {
								cl.log("Nil name found for column %v", col)
							}
						}
					} else {
						cl.log("Column names/types not found in header:\n%v", zz)
					}
					// log.Println("Header:", h)
					hc <- h

				case []interface{}:
					// It's a row of data
					// log.Println("Row:", zz)
					rc <- zz
				}
			}

		}

	}
	return nil
}

func (cl *Client) heartbeat(client http.Client, ctx context.Context) {
	missedHeartbeat := 0
	heartbeatThreshold := 9 // Default for KSQL Server is close connection after 10 minutes of no activity
	ticker := time.NewTicker(1 * time.Minute)

	for range ticker.C {
		fmt.Println("Sending heartbeat...")

		pingPayload := strings.NewReader("{\"ksql\":\"SHOW STREAMS;\"}")
		pingReq, err := http.NewRequest("POST", cl.url+"/ksql", pingPayload)
		cl.log("Sending ksqlDB request:\n\t%v", pingPayload)
		if err != nil {
			missedHeartbeat += 1
			cl.log("Couldn't create new HTTP request, %s", err)
		} else {

			res, err := client.Do(pingReq)
			if err != nil {
				missedHeartbeat += 1
				log.Printf("Failed to send heartbeat: %v", res.StatusCode)
			} else {

				bodyBytes, err := ioutil.ReadAll(res.Body)
				if err != nil {
					missedHeartbeat += 1
					log.Printf("Failed to read heartbeat body: %v", res.StatusCode)
				} else {
					res.Body.Close()

					body := string(bodyBytes)

					if res.StatusCode != 200 {
						missedHeartbeat += 1
						log.Printf("The heartbeat did not return a success code:\n%v / %v", res.StatusCode, string(body))
					} else {
						missedHeartbeat = 0
						fmt.Println("Got heartbeat!")
					}
				}
			}
		}

		if missedHeartbeat == heartbeatThreshold {
			defer ctx.Done()

			cl.log("Missed %s heartbeats, close connection", heartbeatThreshold)
			ticker.Stop()
		}
	}
}
