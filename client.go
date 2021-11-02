package ksqldb

import (
	"context"
	"fmt"
	"io"
	"log"
	"net/http"
	"strings"

	"github.com/rmoff/ksqldb-go/internal"
)

// NewClient creates new ksqldb client with log.Println default logging.
func NewClient(url string, u string, p string) *Client {
	uri, valid, err := internal.GetUrl(url)

	if !valid && err != nil {
		panic(err)
	}

	return &Client{
		urlScheme: uri.Scheme,
		url:       url,
		username:  u,
		password:  p,
		logf:      log.Printf,
		isDebug:   false,
	}
}

func (cl *Client) newQueryStreamRequest(ctx context.Context, payload io.Reader) (*http.Request, error) {
	req, err := cl.newPostRequest(ctx, QUERY_STREAM_ENDPOINT, payload)
	//req.Header.Add("Accept", "application/vnd.ksql.v1+json; q=0.9, application/json; q=0.5")
	return req, err
}

func (cl *Client) newCloseQueryRequest(ctx context.Context, payload io.Reader) (*http.Request, error) {
	return cl.newPostRequest(ctx, CLOSE_QUERY_ENDPOINT, payload)
}

func (cl *Client) newKsqlRequest(payload io.Reader) (*http.Request, error) {
	return http.NewRequest("POST", cl.url+KSQL_ENDPOINT, payload)
}

func (cl *Client) newPostRequest(ctx context.Context, endpoint string, payload io.Reader) (*http.Request, error) {
	req, err := http.NewRequestWithContext(ctx, "POST", cl.url+endpoint, payload)
	if err != nil {
		return req, fmt.Errorf("can't create new request with context:\n%w", err)
	}
	// TODO: unclear which request needs which header
	// req.Header.Add("Content-Type", "application/vnd.ksql.v1+json; charset=utf-8")
	//  req.Header.Add("Accept", "application/json; charset=utf-8")
	// This is described in the api, but it does'nt works!
	// https://docs.confluent.io/5.2.0/ksql/docs/developer-guide/api.html#content-types
	// req.Header.Add("Accept", "application/vnd.ksql.v1+json; q=0.9, application/json; q=0.5")

	return req, nil
}

// IsHttpRequest checks if it's a http request or not
func (cl *Client) IsHttpRequest() bool {
	return cl.urlScheme == "http"
}

// SanitizeQuery sanitizes the given content
func (cl *Client) SanitizeQuery(content string) string {
	content = strings.ReplaceAll(content, "\t", "")
	content = strings.ReplaceAll(content, "\n", "")
	return content
}
