package ksqldb

type Row []interface{}

type Payload []Row

type Header struct {
	queryId string
	columns []Column
}

type Column struct {
	Name string
	Type string
}

type Client struct {
	url     string
	isDebug bool
	logf    func(format string, v ...interface{})
}
