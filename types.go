package ksqldb

type KsqlDBMessageRow struct {
	Row struct {
		Columns []interface{} `json:"columns"`
	} `json:"row"`
}

type KsqlDBMessage []struct {
	Header struct {
		QueryID string `json:"queryId"`
		Schema  string `json:"schema"`
	} `json:"header,omitempty"`
	Row struct {
		Columns []interface{} `json:"columns"`
	} `json:"row,omitempty"`
}
