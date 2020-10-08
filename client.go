package ksqldb

import "log"

//NewClient creates new ksqldb client with log.Println default logging
func NewClient(url string) *Client {
	return &Client{
		url:  url,
		logf: log.Printf,
	}
}
