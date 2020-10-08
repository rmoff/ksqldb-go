package ksqldb

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

type Client struct {
	url     string
	isDebug bool
	logf    func(format string, v ...interface{})
}
