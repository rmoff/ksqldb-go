# ksqlDB Go library

Robin Moffatt <robin@moffatt.me><br>
v0.04, 8 October 2020

[![Go Reference](https://pkg.go.dev/badge/github.com/rmoff/ksqldb-go.svg)](https://pkg.go.dev/github.com/rmoff/ksqldb-go)

This is a Go client for [ksqlDB](https://ksqldb.io/). It supports both pull and push queries, as well as command execution. Furthermore you can get the server-infos, -health and parse your ksql-statements with the provided `KSqlParser`.

⚠️ Disclaimer #1: [I am brand new to Go!](https://rmoff.net/2020/06/25/learning-golang-some-rough-notes-s01e00/) Tips (or PRs) to improve the code very welcome :)

⚠️ Disclaimer #2: This is a personal project and not supported or endorsed by Confluent.

![Animation of the ksqlDB Golang client in action](ksqldb-go.gif)

## Installation

Module install:

This client is a Go module, therefore you can have it simply by adding the following import to your code:

```golang
import "github.com/rmoff/ksqldb-go"
```

Then run a build to have this client automatically added to your go.mod file as a dependency.

Manual install:

```bash
go get -u github.com/rmoff/ksqldb-go
```

## Examples

You can find the examples in the [examples directory](examples).

- [all in one example](examples/all-in-one)
- [cobra example](examples/cobra-test)
- [KSqlGrammar example](examples/ksqlgrammar)

See the [test environment here](examples/all-in-one/environment.adoc)
and [this sample code](examples/all-in-one/main.go) which you can run with

### All in one example

The All in one example shows basic usage of the `ksqldb-go` package. To run it, you need a `Kafka` runtime environment. You can start it, with `docker-compose up -d`.

Then

```bash
go run ./examples/all-in-one
```

### Cobra example

The [Cobra](https://github.com/spf13/cobra) example splits the different use cases into `Cobra` commands.

Start the docker-compose from the all-in-one example and then:

```bash
$ go run ./examples/cobra-test

ksqldb-go example with cobra

Usage:
  cobra-test [command]

Available Commands:
  completion   generate the autocompletion script for the specified shell
  help         Help about any command
  info         Displays your server infos
  pull         print the dog stats
  push         push dogs example like all-in-one example, but with ParseKSQL
  serverhealth display the server state of your servers
  setup        setup a dummy connector like in all-in-one example

Flags:
      --config string     config file (default is $HOME/.cobra-test.yaml)
  -h, --help              help for cobra-test
      --host string       set the ksqldb host (default "http://localhost:8088")
      --logger string     set logging output to json (default "json")
      --password string   set the ksqldb user password
      --username string   set the ksqldb user name

Use "cobra-test [command] --help" for more information about a command.
```

### KSql Grammar example

This example was written to test and fix the `Antlr4` generation problems for golang. We have changed the `Antlr4` file, cause there are some type problems. `Antlr4` code generation introduced some bugs, which we had fix manually. So, be carefull if you are using our `Makefile` to generate the `KSqlParser`. It breaks the code!

We had copied the `Antlr4` file from the original sources from `confluent`.
It seems, that some errors will not be found by the parser, because the terminal symbols are not existing in the grammar.

The Parser is used to check the `KSql Syntax`. If there are syntax errors, we are collecting the errors and you'll get a notice about them.

The example has a bug in in the `Select` statement to output the errors.

Feel free to play around :)

## How to use the ksqldb-go package?

### Create a ksqlDB Client

```golang
// this creates a client with enabled Debug messages
client := ksqldb.NewClient("http://ksqldb:8088","username","password").Debug()
```

For no authentication just use blank username and password values.

### Debug Mode

```golang
// this creates a client without Debug messages
client := ksqldb.NewClient("http://ksqldb:8088","username","password")

// if you want do enable the debug mode after creation of the client
client.SetDebug(true)

// to get the current debug mode
mode := client.GetDebugMode()
```

### Pull query

```golang
ctx, ctxCancel := context.WithTimeout(context.Background(), 10 \* time.Second)
defer ctxCancel()

k := "SELECT TIMESTAMPTOSTRING(WINDOWSTART,'yyyy-MM-dd HH:mm:ss','Europe/London') AS WINDOW*START, TIMESTAMPTOSTRING(WINDOWEND,'HH:mm:ss','Europe/London') AS WINDOW_END, DOG_SIZE, DOGS_CT FROM DOGS_BY_SIZE WHERE DOG_SIZE='" + s + "';"

// your select statement will be checked with integrated KSqlParser
_, r, e := client.Pull(ctx, k, false)
if e != nil {
  // handle the error better here, e.g. check for no rows returned
  return fmt.Errorf("error running pull request against ksqlDB:\n%v", e)
}

var DOG*SIZE string
var DOGS_CT float64
for *, row := range r {
  if row != nil {
    // Should do some type assertions here
    DOG_SIZE = row[2].(string)
    DOGS_CT = row[3].(float64)
    fmt.Printf("🐶 There are %v dogs size %v\n", DOGS_CT, DOG_SIZE)
  }
}
```

### Push query

```golang
rc := make(chan ksqldb.Row)
hc := make(chan ksqldb.Header, 1)

k := "SELECT ROWTIME, ID, NAME, DOGSIZE, AGE FROM DOGS EMIT CHANGES;"

// This Go routine will handle rows as and when they
// are sent to the channel
go func() {
var NAME string
var DOG_SIZE string
for row := range rc {
  if row != nil {
      // Should do some type assertions here
      NAME = row[2].(string)
      DOG_SIZE = row[3].(string)
      fmt.Printf("🐾%v: %v\n",  NAME, DOG_SIZE)
    }
  }
}()

ctx, ctxCancel := context.WithTimeout(context.Background(), 10 \* time.Second)
defer ctxCancel()

e := client.Push(ctx, k, rc, hc)

if e != nil {
// handle the error better here, e.g. check for no rows returned
return fmt.Errorf("error running push request against ksqlDB:\n%v", e)
}
```

### Execute a command

```golang
if err := client.Execute(ctx, ksqlDBServer, ` CREATE STREAM DOGS (ID STRING KEY, NAME STRING, DOGSIZE STRING, AGE STRING) WITH (KAFKA_TOPIC='dogs', VALUE_FORMAT='JSON');`); err != nil {
return fmt.Errorf("error creating the dogs stream.\n%v", err)
}

```

## TODO

See https://github.com/rmoff/ksqldb-go/issues?q=is%3Aissue+is%3Aopen+label%3A%22help+wanted%22

And this, if we want to provide a full blown ksqlDB client.
See https://docs.ksqldb.io/en/latest/developer-guide/ksqldb-clients/contributing/

## Contributors

<a href="https://github.com/rmoff/ksqldb-go/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=rmoff/ksqldb-go" />
</a>

Made with [contrib.rocks](https://contrib.rocks).

## License

[Apache Apache License Version 2.0](LICENSE)
