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

func TestClientPanic(t *testing.T) {
	defer func() {
		if r := recover(); r == nil {
			t.Errorf("The Client did not panic")
		}
	}()

	ksqldb.NewClient("", "", "")
}

func TestClientIsHttpRequest(t *testing.T) {
	client := ksqldb.NewClient("http://example.com", "testuser", "testpassword")
	assert.True(t, client.IsHttpRequest())
}

func TestClientSanitizeQuery(t *testing.T) {
	client := ksqldb.NewClient("http://example.com", "testuser", "testpassword")
	sanitizedString := client.SanitizeQuery(`

	This is the 	house of Nicolas

`)
	assert.Equal(t, "This is the house of Nicolas", sanitizedString)
}
