GO=go
GOCOVER=$(GO) tool cover
GOTEST=$(GO) test

.PHONY: fmt lint vet test test-cover all

all:
	make fmt vet lint test

dev:
	go install github.com/golangci/golangci-lint/cmd/golangci-lint@v1.42.1
	go install mvdan.cc/gofumpt@latest

build-all-in-one:  
	cd examples/all-in-one && go build . && mv all-in-one ../../bin

build-cobra:  
	cd examples/cobra-test && go build . && mv cobra-test ../../bin

test:
	$(GOTEST) -v ./... -short

test-cover:
	$(GOTEST) ./... -coverprofile=coverage.out
	$(GOCOVER) -func=coverage.out
	$(GOCOVER) -html=coverage.out

vet:	## run go vet on the source files
	$(GO) vet ./...

doc:	## generate godocs and start a local documentation webserver on port 8085
	GO111MODULE=off godoc -notes=TODO -goroot=. -http=:8085 -index

lint:
	golangci-lint run

clean-compose-all-in-one:	
	cd examples/all-in-one && docker-compose down && docker-compose up -d && cd ..

fmt: 
	$(GO) fmt ./...