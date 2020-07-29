package ksqldb

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
	"log"
	"net/http"
	"strings"
)

func Pull(u string, q string) (m KsqlDBMessage, err error) {

	// Create the client, make the request
	payload := strings.NewReader("{\"ksql\":\"" + q + "\"}")
	client := &http.Client{}
	req, err := http.NewRequest("POST", u+"/query", payload)

	if err != nil {
		return m, err
	}
	req.Header.Add("Content-Type", "application/vnd.ksql.v1+json; charset=utf-8")

	res, err := client.Do(req)
	if err != nil {
		return m, err
	}
	defer res.Body.Close()

	body, err := ioutil.ReadAll(res.Body)
	if err != nil {
		return m, err
	}

	// Parse the output
	err = json.Unmarshal(body, &m)
	log.Println(string(body))
	switch len(m) {
	case 0:
		// This shouldn't happen…
		return m, fmt.Errorf("No results (not even a header row) returned from lookup")
	case 1:
		// len 1 means we just got a header, no rows
		// Should we define our own error types here so we can return more clearly
		// an indicator that no rows were found?
		return m, fmt.Errorf("No result found")
	default:
		return m, nil
	}

}
