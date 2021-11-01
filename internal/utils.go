package internal

import (
	"fmt"
	"net/url"
	"strings"
)

// ValidateUrl checks the url; url must not contain a trailing slash
func GetUrl(path string) (*url.URL, bool, error) {
	trimmedPath := strings.TrimSuffix(path, "/")
	u, err := url.Parse(trimmedPath)
	if err != nil {
		return nil, false, fmt.Errorf("can't parse url: %w", err)
	}
	if u.Host == "" {
		return nil, false, fmt.Errorf("invalid host name given")
	}
	if u.Scheme != "http" && u.Scheme != "https" {
		return nil, false, fmt.Errorf("invalid url scheme given")
	}
	return u, true, nil
}
