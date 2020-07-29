package ksqldb

import (
	"bufio"
	"encoding/json"
	"fmt"
	"net/http"
	"strings"
)

// Push queries are continuous queries in which new events
// or changes to a table's state are pushed to the client.
// You can think of them as subscribing to a stream of changes.
//
// Since push queries never end, this function expects a channel
// to which it can write new rows of data as and when they are
// received.

// To use this function pass in the base URL of your
// ksqlDB server, the SQL query statement, and a channel.
//
// The channel is populated with KsqlDBMessageRow which represents
// one row of data. You will need to define variables to hold
// each column's value. You can adopt this pattern to do this:
// 		var COL1 string
// 		var COL2 float64
// 		if r := msg.Row.Columns; r != nil {
// 			COL1 = r[0].(string)
// 			COL2 = r[1].(float64)
// 			// Do other stuff with the data here
// 		}
func Push(u string, q string, rc chan KsqlDBMessageRow) (err error) {

	// Create the client, make the request
	payload := strings.NewReader("{\"ksql\":\"" + q + "\"}")
	client := &http.Client{}
	req, err := http.NewRequest("POST", u+"/query", payload)

	if err != nil {
		return err
	}
	req.Header.Add("Content-Type", "application/vnd.ksql.v1+json; charset=utf-8")

	res, err := client.Do(req)
	if err != nil {
		return err
	}
	defer res.Body.Close()

	var r KsqlDBMessageRow

	reader := bufio.NewReader(res.Body)
	doThis := true
	defer close(rc)
	for doThis {
		// Read the next chunk
		lb, err := reader.ReadBytes('\n')
		if err != nil {
			doThis = false
		}

		if len(lb) > 2 {

			// Do a dirty hack to remove the trailing comma and \r so that the `row` can be
			// parsed as JSON
			// e.g.
			// {"row":{"columns":["Burnett St",1595373720000,122,117]}},
			//   becomes
			// {"row":{"columns":["Burnett St",1595373720000,122,117]}}
			//
			// Pretty sure instead of `ReadBytes` above I should be using
			// Scanner (https://golang.org/pkg/bufio/#Scanner) to split on ASCII 44 10 13 (,CRLF)
			lb = lb[:len(lb)-2]

			// Convert the JSON to Go object
			if strings.Index(string(lb), "[{\"header\"") == 0 {
				// it's the header row; ignore it
			} else if strings.Index(string(lb), "{\"row\":{\"columns\"") == 0 {
				// Looks like a Row, let's process it!
				err = json.Unmarshal(lb, &r)
				if err != nil {
					return fmt.Errorf("error decoding row JSON %v\n%v)", string(lb), err)
				} else {
					if r.Row.Columns != nil {

						rc <- r
					}
				}
			} else {
				return fmt.Errorf("Got something that didn't look like a row or header from ksqlDB and is probably an error:\n%v", string(lb))

			}
		}
	}

	return nil
}
