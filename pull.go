package ksqldb

import (
	"context"
	"crypto/tls"
	"encoding/json"
	"fmt"
	"io/ioutil"
	"net"
	"net/http"
	"strconv"
	"strings"

	"golang.org/x/net/http2"
)

// Pull queries are like "traditional" RDBMS queries in which
// the query terminates once the state has been queried.
//
// To use this function pass in the the SQL query statement, and
// a boolean for whether full table scans should be enabled.
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
func (cl *Client) Pull(ctx context.Context, q string, s bool) (h Header, r Payload, err error) {

	// Create the request
	payload := strings.NewReader(`{"properties":{"ksql.query.pull.table.scan.enabled": ` + strconv.FormatBool(s) + `},"sql":"` + q + `"}`)

	req, err := cl.newQueryStreamRequest(ctx, payload)
	cl.log("%+v", payload)

	if err != nil {
		return h, r, fmt.Errorf("can't create new request with context:\n%w", err)
	}

	// If we've got creds to pass, let's pass them
	if cl.username != "" {
		req.SetBasicAuth(cl.username, cl.password)
	}

	client := &http.Client{}
	if cl.IsHttpRequest() {
		// ksqlDB uses HTTP2 and if the server is on HTTP then Golang will not
		// use HTTP2 unless we force it to, thus.
		// Without this you get the error `http2: unsupported scheme`
		// TODO: refactor transport for unit testing
		client.Transport = &http2.Transport{
			AllowHTTP: true,
			// Pretend we are dialing a TLS endpoint.
			// Note, we ignore the passed tls.Config
			DialTLS: func(network, addr string, cfg *tls.Config) (net.Conn, error) {
				return net.Dial(network, addr)
			},
		}
	}

	res, err := client.Do(req)
	if err != nil {
		return h, r, fmt.Errorf("can't do request:\n%w", err)
	}
	defer res.Body.Close()

	body, err := ioutil.ReadAll(res.Body)
	if err != nil {
		return h, r, fmt.Errorf("can't read response body:\n%w", err)
	}

	if res.StatusCode != http.StatusOK {
		return h, r, fmt.Errorf("the http request did not return a success code:\n%v / %v", res.StatusCode, string(body))
	}

	var x []interface{}
	// Parse the output
	if err := json.Unmarshal(body, &x); err != nil {
		return h, r, fmt.Errorf("could not parse the response as json:\n%w\n%v", err, string(body))

	}

	switch len(x) {
	case 0:
		return h, r, fmt.Errorf("%w (not even a header row) returned from lookup. Maybe we got an error:%v", ErrNotFound, err)
	case 1:
		// len 1 means we just got a header, no rows
		// Should we define our own error types here so we can return more clearly
		// an indicator that no rows were found?
		// ANSWER: yes
		return h, r, ErrNotFound
	default:
		for _, z := range x {
			switch zz := z.(type) {
			case map[string]interface{}:
				// It's a header row, so extract the data
				// {"queryId":null,"columnNames":["WINDOW_START","WINDOW_END","DOG_SIZE","DOGS_CT"],"columnTypes":["STRING","STRING","STRING","BIGINT"]}
				if _, ok := zz["queryId"].(string); ok {
					h.queryId = zz["queryId"].(string)
				} else {
					// it is a hard fact, so we should throw an error?
					cl.log("(query id not found - this is expected for a pull query)")
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

			case []interface{}:
				// It's a row of data
				r = append(r, zz)
			}
		}

		return h, r, nil
	}
}
