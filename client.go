package ksqldb

import "log"

//NewClient creates new ksqldb client with log.Println default logging
func NewClient(url string, u string, p string) *Client {
	return &Client{
		url:      url,
		username: u,
		password: p,
		logf:     log.Printf,
	}
}
