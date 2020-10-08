// @rmoff
//
package main

import (
	"fmt"
	"log"
	"os"
	"time"
)

const ksqlDBServer string = "http://localhost:8088"
const ksqlDBUser string = ""
const ksqlDBPW string = ""

func main() {

	client, err := setup()
	if err != nil {
		log.Printf("Failed to run setup statements.\n%v\nExiting.", err)
		os.Exit(1)
	}

	// Do a pull query
	fmt.Printf("\n\n" + `
	  	  🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀
		✨It's… a Golang client for ksqlDB! ✨
		  🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀

	Check this out, we can do pull queries, which are like K/V lookups
	against materialised views of state built from streams of events in Kafka:` + "\n\n")
	if e := getDogStats(client, "medium"); e != nil {
		fmt.Printf("error calling getDogStats:\n%v", e)
	}

	time.Sleep(3 * time.Second)
	// Do a push query
	fmt.Printf("\n\n" + `
		                      ❇️ ❇️ ❇️ ❇️ ❇️ ❇️

	➜ We can also do push queries, in which we subscribe to a stream of
	notifications of events. This could be every event arriving on a topic,
	or it could be events that match a given condition specified in a WHERE
	clause. Note that this is a continuous query. Here we use the cancel option
	to terminate it after 10 seconds, but by default it will run until the program
	is killed.` + "\n\n\n")
	time.Sleep(2 * time.Second)
	if e := getDogUpdates(client); e != nil {
		fmt.Printf("error calling getDogUpdates:\n%v", e)
	}
}
