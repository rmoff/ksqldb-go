package ksqldb

// log logging data.
func (cl *Client) log(format string, v ...interface{}) {
	if cl.isDebug {
		cl.logf(format, v)
	}
}

// SetLogFunc sets custom logging function with func(format string, v ...interface{}) profile.
func (cl *Client) SetLogFunc(fn func(format string, v ...interface{})) *Client {
	if fn != nil {
		cl.logf = fn
	}
	return cl
}

// Debug sets debug mode for logging.
func (cl *Client) Debug() *Client {
	cl.isDebug = true

	return cl
}

// SetDebug enables or disables debug mode.
func (cl *Client) SetDebug(mode bool) *Client {
	cl.isDebug = mode

	return cl
}

// GetDebugMode gets the current debug mode.
func (cl *Client) GetDebugMode() bool {
	return cl.isDebug
}
