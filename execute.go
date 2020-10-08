package ksqldb

import (
	"fmt"
	"io/ioutil"
	"net/http"
	"strings"
)

// Execute will execute a ksqlDB statement, such as creating
// a new stream or table. To run queries use Push or
// Pull functions.
//
// To use this function pass in the base URL of your
// ksqlDB server, and the SQL query statement
//
// Ref: https://docs.ksqldb.io/en/latest/developer-guide/ksqldb-rest-api/ksql-endpoint/
//
// TODO Add support for commandSequenceNumber and streamsProperties
// TODO Add better support for responses to CREATE/DROP/TERMINATE (e.g. commandID, commandStatus.status, etc)
func (cl *Client) Execute(q string) (err error) {

	// Create the client
	client := &http.Client{}

	// sanitise the query
	q = strings.ReplaceAll(q, "\t", "")
	q = strings.ReplaceAll(q, "\n", "")
	//  make the request
	payload := strings.NewReader("{\"ksql\":\"" + q + "\"}")
	req, err := http.NewRequest("POST", cl.url+"/ksql", payload)
	cl.log("Sending ksqlDB request:\n\t%v", q)
	if err != nil {
		return err
	}

	res, err := client.Do(req)
	if err != nil {
		return err
	}
	defer res.Body.Close()

	body, err := ioutil.ReadAll(res.Body)
	if err != nil {
		return err
	}

	if res.StatusCode != 200 {
		return fmt.Errorf("The HTTP request did not return a success code:\n%v / %v", res.StatusCode, string(body))
	}

	// log.Println("Query executed. Response:\n%v", res)
	return nil
}
