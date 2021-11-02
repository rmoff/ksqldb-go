package ksqldb

import (
	"github.com/antlr/antlr4/runtime/Go/antlr"
	"github.com/rmoff/ksqldb-go/parser"
)

func (cl *Client) ParseKSQL(sql string) *parser.KSqlSyntaxErrorList {
	errors := parser.KSqlSyntaxErrorList{}

	input := antlr.NewInputStream(sql)
	lexerErrorListener := &parser.KSqlErrorListener{}
	lexer := parser.NewKSqlLexer(input)
	lexer.RemoveErrorListeners()
	lexer.AddErrorListener(lexerErrorListener)

	stream := antlr.NewCommonTokenStream(lexer, 0)
	parserErrorListener := &parser.KSqlErrorListener{}
	p := parser.NewKSqlParser(stream)
	p.RemoveErrorListeners()
	p.AddErrorListener(parserErrorListener)

	antlr.ParseTreeWalkerDefault.Walk(&parser.BaseKSqlListener{}, p.Statements())
	cl.log("lexer has errors: %v", lexerErrorListener.HasErrors())
	cl.log("parser has errors: %v", parserErrorListener.HasErrors())

	if lexerErrorListener.HasErrors() {
		cl.log("parser error count: %v", lexerErrorListener.ErrorCount())
		errors = append(errors, lexerErrorListener.Errors...)
	}
	if parserErrorListener.HasErrors() {
		cl.log("parser error count: %v", parserErrorListener.ErrorCount())
		errors = append(errors, parserErrorListener.Errors...)
	}

	if lexerErrorListener.HasErrors() || parserErrorListener.HasErrors() {
		cl.log("lexer and/or parse errors found: %v, %v", len(errors), errors)
		return &errors
	}
	return nil
}
