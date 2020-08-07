package main

import (
	"fmt"
	"log"
	"time"

	"github.com/rmoff/ksqldb-go"
)

func getDogUpdates() (err error) {

	rc := make(chan ksqldb.Row)
	hc := make(chan ksqldb.Header, 1)
	cc := make(chan bool)

	k := "SELECT ROWTIME, ID, NAME, DOGSIZE, AGE FROM DOGS EMIT CHANGES;"

	// This Go routine will handle rows as and when they
	// are sent to the channel
	go func() {
		var DATA_TS float64
		var ID string
		var NAME string
		var DOG_SIZE string
		var AGE string
		for row := range rc {
			if row != nil {
				// Should do some type assertions here
				DATA_TS = row[0].(float64)
				ID = row[1].(string)
				NAME = row[2].(string)
				DOG_SIZE = row[3].(string)
				AGE = row[4].(string)

				// Handle the timestamp
				t := int64(DATA_TS)
				ts := time.Unix(t/1000, 0).Format(time.RFC822)

				fmt.Printf("🐾New dog at %v: '%v' is %v and %v (id %v)\n", ts, NAME, DOG_SIZE, AGE, ID)
			}
		}

	}()

	// This Go routine shows how you can cancel a Push query as and when required
	go func() {
		time.Sleep(10 * time.Second)
		log.Println("⏱️ Terminating the continuous query now, we've seen enough")
		cc <- true
	}()

	e := ksqldb.Push(ksqlDBServer, k, rc, hc, cc)

	if e != nil {
		// handle the error better here, e.g. check for no rows returned
		return fmt.Errorf("Error running Push request against ksqlDB:\n%v", e)
	}

	return nil
}
