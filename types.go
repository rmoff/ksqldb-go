package ksqldb

const (
	QUERY_STREAM_ENDPOINT = "/query-stream"
	INSERTS_ENDPOINT      = "/inserts-stream"
	CLOSE_QUERY_ENDPOINT  = "/close-query"
	KSQL_ENDPOINT         = "/ksql"
	INFO_ENDPOINT         = "/info"
	HEALTHCHECK_ENDPOINT  = "/healthcheck"
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

type ServerInfo struct {
	Version        string `json:"version"`
	KafkaClusterID string `json:"kafkaClusterId"`
	KSQLServiceID  string `json:"ksqlServiceId"`
}

type ServerInfoResponse struct {
	KSQLServerInfo ServerInfo `json:"KsqlServerInfo"`
}

type ServerHealth struct {
	IsHealthy *bool `json:"isHealthy"`
	Details   struct {
		Metastore struct {
			IsHealthy *bool `json:"isHealthy"`
		} `json:"metastore"`
		Kafka struct {
			IsHealthy *bool `json:"isHealthy"`
		} `json:"kafka"`
	} `json:"details"`
	KSQLServiceID string `json:"ksqlServiceId"`
}
