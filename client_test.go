package ksqldb_test

import (
	"testing"

	"github.com/rmoff/ksqldb-go"
	"github.com/stretchr/testify/assert"
)

func TestClientNotNil(t *testing.T) {
	client := ksqldb.NewClient("http://example.com", "testuser", "testpassword")
	assert.NotNil(t, client)
}
