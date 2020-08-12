package ksqldb

import (
	"context"
	"crypto/tls"
	"encoding/json"
	"fmt"
	"io/ioutil"
	"log"
	"net"
	"net/http"
	"strings"

	"golang.org/x/net/http2"
)

// Pull queries are like "traditional" RDBMS queries in which
// the query terminates once the state has been queried.
//
// To use this function pass in the base URL of your
// ksqlDB server, and the SQL query statement.
//
// The function returns a ksqldb.Header and ksqldb.Payload
// which will hold one or more rows of data. You will need to
// define variables to hold each column's value. You can adopt
// this pattern to do this:
// 		var COL1 string
// 		var COL2 float64
// 		for _, row := range r {
// 			COL1 = row[0].(string)
// 			COL2 = row[1].(float64)
// 			// Do other stuff with the data here
// 			}
// 		}
func Pull(ctx context.Context, u string, q string) (h Header, r Payload, err error) {

	// Create the client, force it to use HTTP2 (to avoid `http2: unsupported scheme`)
	client := http.Client{
		Transport: &http2.Transport{
			// So http2.Transport doesn't complain the URL scheme isn't 'https'
			AllowHTTP: true,
			// Pretend we are dialing a TLS endpoint.
			// Note, we ignore the passed tls.Config
			DialTLS: func(network, addr string, cfg *tls.Config) (net.Conn, error) {
				return net.Dial(network, addr)
			},
		},
	}

	// Create the request
	payload := strings.NewReader("{\"sql\":\"" + q + "\"}")
	req, err := http.NewRequestWithContext(ctx, "POST", u+"/query-stream", payload)

	if err != nil {
		return h, r, err
	}
	req.Header.Add("Accept", "application/json; charset=utf-8")

	res, err := client.Do(req)
	if err != nil {
		return h, r, err
	}
	defer res.Body.Close()

	body, err := ioutil.ReadAll(res.Body)
	if err != nil {
		return h, r, err
	}

	if res.StatusCode != 200 {
		return h, r, fmt.Errorf("The HTTP request did not return a success code:\n%v / %v", res.StatusCode, string(body))
	}

	var x []interface{}
	// Parse the output
	if err := json.Unmarshal(body, &x); err != nil {
		return h, r, fmt.Errorf("Could not parse the response as JSON:\n%v\n%v", err, string(body))

	}

	switch len(x) {
	case 0:
		return h, r, fmt.Errorf("No results (not even a header row) returned from lookup. Maybe we got an error:%v", err)
	case 1:
		// len 1 means we just got a header, no rows
		// Should we define our own error types here so we can return more clearly
		// an indicator that no rows were found?
		return h, r, fmt.Errorf("No result found")
	default:
		for _, z := range x {
			switch zz := z.(type) {
			case map[string]interface{}:
				// It's a header row, so extract the data
				// {"queryId":null,"columnNames":["WINDOW_START","WINDOW_END","DOG_SIZE","DOGS_CT"],"columnTypes":["STRING","STRING","STRING","BIGINT"]}
				if _, ok := zz["queryId"].(string); ok {
					h.queryId = zz["queryId"].(string)
				} else {
					log.Println("(Query ID not found - this is expected for a pull query)")
				}

				names, okn := zz["columnNames"].([]interface{})
				types, okt := zz["columnTypes"].([]interface{})
				if okn && okt {
					for col := range names {
						if n, o := names[col].(string); n != "" && o == true {
							if t, o := types[col].(string); t != "" && o == true {
								a := Column{Name: n, Type: t}
								h.columns = append(h.columns, a)

							} else {
								log.Printf("Nil type found for column %v", col)
							}
						} else {
							log.Printf("Nil name found for column %v", col)
						}
					}
				} else {
					log.Printf("Column names/types not found in header:\n%v", zz)
				}

			case []interface{}:
				// It's a row of data
				r = append(r, zz)

			}
		}

		return h, r, nil

	}
}
