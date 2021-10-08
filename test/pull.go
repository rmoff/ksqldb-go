package main

import (
	"context"
	"fmt"
	"time"

	"github.com/rmoff/ksqldb-go"
)

func getDogStats(client *ksqldb.Client, s string) (e error) {

	k := "SELECT TIMESTAMPTOSTRING(WINDOWSTART,'yyyy-MM-dd HH:mm:ss','Europe/London') AS WINDOW_START, TIMESTAMPTOSTRING(WINDOWEND,'HH:mm:ss','Europe/London') AS WINDOW_END, DOG_SIZE, DOGS_CT FROM DOGS_BY_SIZE WHERE DOG_SIZE='" + s + "';"

	ctx, cancel := context.WithTimeout(context.TODO(), 10*time.Second)
	defer cancel()
	_, r, e := client.Pull(ctx, k, true)

	if e != nil {
		// handle the error better here, e.g. check for no rows returned
		return fmt.Errorf("Error running Pull request against ksqlDB:\n%v", e)
	}

	var WINDOW_START string
	var WINDOW_END string
	var DOG_SIZE string
	var DOGS_CT float64
	for _, row := range r {
		if row != nil {
			// Should do some type assertions here
			WINDOW_START = row[0].(string)
			WINDOW_END = row[1].(string)
			DOG_SIZE = row[2].(string)
			DOGS_CT = row[3].(float64)
			fmt.Printf("🐶 There are %v dogs size %v between %v and %v\n", DOGS_CT, DOG_SIZE, WINDOW_START, WINDOW_END)
		}
	}
	return nil
}
