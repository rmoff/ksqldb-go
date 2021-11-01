package main

import (
	"fmt"

	"github.com/antlr/antlr4/runtime/Go/antlr"
	"github.com/rmoff/ksqldb-go/parser"
)

func main() {
	k := "SELECT TIMESTAMPTOSTRING(WINDOWSTART,'yyyy-MM-dd HH:mm:ss','Europe/London') AS WINDOW_START, TIMESTAMPTOSTRING(WINDOWEND,'HH:mm:ss','Europe/London') AS WINDOW_END, DOG_SIZE, DOGS_CT FROM DOGS_BY_SIZE WHERE DOG_SIZE='large';"

	input := antlr.NewInputStream(k)
	lexer := parser.NewKSqlLexer(input)
	stream := antlr.NewCommonTokenStream(lexer, 0)
	p := parser.NewKSqlParser(stream)
	p.AddErrorListener(antlr.NewDiagnosticErrorListener(true))
	p.BuildParseTrees = true
	tree := p.Statements()
	fmt.Println(tree)
	//antlr.ParseTreeWalkerDefault.Walk(NewTreeShapeListener(), tree)
}
