package internal_test

import (
	"testing"

	"github.com/rmoff/ksqldb-go/internal"
	"github.com/stretchr/testify/assert"
)

var tests = []struct {
	name    string
	url     string
	want    bool
	message string
}{
	{"empty url", "", false, "invalid host name given"},
	{"check localhost with port", "http://localhost:8123", true, ""},
	{"check localhost without port", "http://localhost", true, ""},
	{"invalid url scheme", "httpx://google.com", false, "invalid url scheme given"},
	{"invalid protocol", "stomp://localhost", false, "invalid url scheme given"},
	{"invalid host", "httpx://", false, "invalid host name given"},
	{"empty url scheme", "://hostname", false, "can't parse url: parse \"://hostname\": missing protocol scheme"},
	{"check url parser", "http://ahsd^öf023as", false, "can't parse url: parse \"http://ahsd^öf023as\": invalid character \"^\" in host name"},
}

func TestGetUrlValid(t *testing.T) {
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			_, valid, err := internal.GetUrl(tt.url)
			// fmt.Println(fmt.Sprintf("%v. %v: %v: %v => isValid:%v error: %v", idx, tt.name, tt.url, tt.want, valid, err))
			assert.Equal(t, tt.want, valid, "they should be equal")
			if err != nil {
				assert.Equal(t, tt.message, err.Error())
			}
		})
	}
}
