package ksqldb

const (
	QUERY_STREAM_ENDPOINT = "/query-stream"
	INSERTS_ENDPOINT      = "/inserts-stream"
	CLOSE_QUERY_ENDPOINT  = "/close-query"
	KSQL_ENDPOINT         = "/ksql"
	INFO_ENDPOINT         = "/info"
)

// Row represents a row returned from a query
type Row []interface{}

// Payload represents multiple rows
type Payload []Row

// Header represents a header returned from a query
type Header struct {
	queryId string
	columns []Column
}

// Column represents the metadata for a column in a Row
type Column struct {
	Name string
	Type string
}

// The ksqlDB client
type Client struct {
	urlScheme string
	url       string
	username  string
	password  string
	isDebug   bool
	logf      func(format string, v ...interface{})
}
