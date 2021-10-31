package ksqldb_test

import (
	"testing"

	"github.com/rmoff/ksqldb-go"
	"github.com/stretchr/testify/assert"
)

func TestClientDebugModeAfterClientInit(t *testing.T) {
	client := ksqldb.NewClient("http://example.com", "testuser", "testpassword")
	assert.False(t, client.GetDebugMode(), false)
}

func TestClientDebugMethod(t *testing.T) {
	client := ksqldb.NewClient("http://example.com", "testuser", "testpassword")
	client.Debug()
	assert.True(t, client.GetDebugMode())
}

func TestClientSetDebug(t *testing.T) {
	client := ksqldb.NewClient("http://example.com", "testuser", "testpassword")
	client.SetDebug(true)
	assert.True(t, client.GetDebugMode())
	client.SetDebug(false)
	assert.False(t, client.GetDebugMode())
}
