// Code generated from KSql.g4 by ANTLR 4.7.1. DO NOT EDIT.

package parser // KSql

import "github.com/antlr/antlr4/runtime/Go/antlr"

// KSqlListener is a complete listener for a parse tree produced by KSqlParser.
type KSqlListener interface {
	antlr.ParseTreeListener

	// EnterStatements is called when entering the statements production.
	EnterStatements(c *StatementsContext)

	// EnterTestStatement is called when entering the testStatement production.
	EnterTestStatement(c *TestStatementContext)

	// EnterSingleStatement is called when entering the singleStatement production.
	EnterSingleStatement(c *SingleStatementContext)

	// EnterSingleExpression is called when entering the singleExpression production.
	EnterSingleExpression(c *SingleExpressionContext)

	// EnterQueryStatement is called when entering the queryStatement production.
	EnterQueryStatement(c *QueryStatementContext)

	// EnterListProperties is called when entering the listProperties production.
	EnterListProperties(c *ListPropertiesContext)

	// EnterListTopics is called when entering the listTopics production.
	EnterListTopics(c *ListTopicsContext)

	// EnterListStreams is called when entering the listStreams production.
	EnterListStreams(c *ListStreamsContext)

	// EnterListTables is called when entering the listTables production.
	EnterListTables(c *ListTablesContext)

	// EnterListFunctions is called when entering the listFunctions production.
	EnterListFunctions(c *ListFunctionsContext)

	// EnterListConnectors is called when entering the listConnectors production.
	EnterListConnectors(c *ListConnectorsContext)

	// EnterListConnectorPlugins is called when entering the listConnectorPlugins production.
	EnterListConnectorPlugins(c *ListConnectorPluginsContext)

	// EnterListTypes is called when entering the listTypes production.
	EnterListTypes(c *ListTypesContext)

	// EnterListVariables is called when entering the listVariables production.
	EnterListVariables(c *ListVariablesContext)

	// EnterShowColumns is called when entering the showColumns production.
	EnterShowColumns(c *ShowColumnsContext)

	// EnterDescribeStreams is called when entering the describeStreams production.
	EnterDescribeStreams(c *DescribeStreamsContext)

	// EnterDescribeFunction is called when entering the describeFunction production.
	EnterDescribeFunction(c *DescribeFunctionContext)

	// EnterDescribeConnector is called when entering the describeConnector production.
	EnterDescribeConnector(c *DescribeConnectorContext)

	// EnterPrintTopic is called when entering the printTopic production.
	EnterPrintTopic(c *PrintTopicContext)

	// EnterListQueries is called when entering the listQueries production.
	EnterListQueries(c *ListQueriesContext)

	// EnterTerminateQuery is called when entering the terminateQuery production.
	EnterTerminateQuery(c *TerminateQueryContext)

	// EnterSetProperty is called when entering the setProperty production.
	EnterSetProperty(c *SetPropertyContext)

	// EnterUnsetProperty is called when entering the unsetProperty production.
	EnterUnsetProperty(c *UnsetPropertyContext)

	// EnterDefineVariable is called when entering the defineVariable production.
	EnterDefineVariable(c *DefineVariableContext)

	// EnterUndefineVariable is called when entering the undefineVariable production.
	EnterUndefineVariable(c *UndefineVariableContext)

	// EnterCreateStream is called when entering the createStream production.
	EnterCreateStream(c *CreateStreamContext)

	// EnterCreateStreamAs is called when entering the createStreamAs production.
	EnterCreateStreamAs(c *CreateStreamAsContext)

	// EnterCreateTable is called when entering the createTable production.
	EnterCreateTable(c *CreateTableContext)

	// EnterCreateTableAs is called when entering the createTableAs production.
	EnterCreateTableAs(c *CreateTableAsContext)

	// EnterCreateConnector is called when entering the createConnector production.
	EnterCreateConnector(c *CreateConnectorContext)

	// EnterInsertInto is called when entering the insertInto production.
	EnterInsertInto(c *InsertIntoContext)

	// EnterInsertValues is called when entering the insertValues production.
	EnterInsertValues(c *InsertValuesContext)

	// EnterDropStream is called when entering the dropStream production.
	EnterDropStream(c *DropStreamContext)

	// EnterDropTable is called when entering the dropTable production.
	EnterDropTable(c *DropTableContext)

	// EnterDropConnector is called when entering the dropConnector production.
	EnterDropConnector(c *DropConnectorContext)

	// EnterExplain is called when entering the explain production.
	EnterExplain(c *ExplainContext)

	// EnterRegisterType is called when entering the registerType production.
	EnterRegisterType(c *RegisterTypeContext)

	// EnterDropType is called when entering the dropType production.
	EnterDropType(c *DropTypeContext)

	// EnterAlterSource is called when entering the alterSource production.
	EnterAlterSource(c *AlterSourceContext)

	// EnterAssertValues is called when entering the assertValues production.
	EnterAssertValues(c *AssertValuesContext)

	// EnterAssertTombstone is called when entering the assertTombstone production.
	EnterAssertTombstone(c *AssertTombstoneContext)

	// EnterAssertStream is called when entering the assertStream production.
	EnterAssertStream(c *AssertStreamContext)

	// EnterAssertTable is called when entering the assertTable production.
	EnterAssertTable(c *AssertTableContext)

	// EnterRunScript is called when entering the runScript production.
	EnterRunScript(c *RunScriptContext)

	// EnterQuery is called when entering the query production.
	EnterQuery(c *QueryContext)

	// EnterResultMaterialization is called when entering the resultMaterialization production.
	EnterResultMaterialization(c *ResultMaterializationContext)

	// EnterAlterOption is called when entering the alterOption production.
	EnterAlterOption(c *AlterOptionContext)

	// EnterTableElements is called when entering the tableElements production.
	EnterTableElements(c *TableElementsContext)

	// EnterTableElement is called when entering the tableElement production.
	EnterTableElement(c *TableElementContext)

	// EnterTableProperties is called when entering the tableProperties production.
	EnterTableProperties(c *TablePropertiesContext)

	// EnterTableProperty is called when entering the tableProperty production.
	EnterTableProperty(c *TablePropertyContext)

	// EnterPrintClause is called when entering the printClause production.
	EnterPrintClause(c *PrintClauseContext)

	// EnterIntervalClause is called when entering the intervalClause production.
	EnterIntervalClause(c *IntervalClauseContext)

	// EnterLimitClause is called when entering the limitClause production.
	EnterLimitClause(c *LimitClauseContext)

	// EnterRetentionClause is called when entering the retentionClause production.
	EnterRetentionClause(c *RetentionClauseContext)

	// EnterGracePeriodClause is called when entering the gracePeriodClause production.
	EnterGracePeriodClause(c *GracePeriodClauseContext)

	// EnterWindowExpression is called when entering the windowExpression production.
	EnterWindowExpression(c *WindowExpressionContext)

	// EnterTumblingWindowExpression is called when entering the tumblingWindowExpression production.
	EnterTumblingWindowExpression(c *TumblingWindowExpressionContext)

	// EnterHoppingWindowExpression is called when entering the hoppingWindowExpression production.
	EnterHoppingWindowExpression(c *HoppingWindowExpressionContext)

	// EnterSessionWindowExpression is called when entering the sessionWindowExpression production.
	EnterSessionWindowExpression(c *SessionWindowExpressionContext)

	// EnterWindowUnit is called when entering the windowUnit production.
	EnterWindowUnit(c *WindowUnitContext)

	// EnterGroupBy is called when entering the groupBy production.
	EnterGroupBy(c *GroupByContext)

	// EnterPartitionBy is called when entering the partitionBy production.
	EnterPartitionBy(c *PartitionByContext)

	// EnterValues is called when entering the values production.
	EnterValues(c *ValuesContext)

	// EnterSelectSingle is called when entering the selectSingle production.
	EnterSelectSingle(c *SelectSingleContext)

	// EnterSelectAll is called when entering the selectAll production.
	EnterSelectAll(c *SelectAllContext)

	// EnterJoinRelation is called when entering the joinRelation production.
	EnterJoinRelation(c *JoinRelationContext)

	// EnterRelationDefault is called when entering the relationDefault production.
	EnterRelationDefault(c *RelationDefaultContext)

	// EnterJoinedSource is called when entering the joinedSource production.
	EnterJoinedSource(c *JoinedSourceContext)

	// EnterInnerJoin is called when entering the innerJoin production.
	EnterInnerJoin(c *InnerJoinContext)

	// EnterOuterJoin is called when entering the outerJoin production.
	EnterOuterJoin(c *OuterJoinContext)

	// EnterLeftJoin is called when entering the leftJoin production.
	EnterLeftJoin(c *LeftJoinContext)

	// EnterJoinWindow is called when entering the joinWindow production.
	EnterJoinWindow(c *JoinWindowContext)

	// EnterJoinWindowWithBeforeAndAfter is called when entering the joinWindowWithBeforeAndAfter production.
	EnterJoinWindowWithBeforeAndAfter(c *JoinWindowWithBeforeAndAfterContext)

	// EnterSingleJoinWindow is called when entering the singleJoinWindow production.
	EnterSingleJoinWindow(c *SingleJoinWindowContext)

	// EnterJoinWindowSize is called when entering the joinWindowSize production.
	EnterJoinWindowSize(c *JoinWindowSizeContext)

	// EnterJoinCriteria is called when entering the joinCriteria production.
	EnterJoinCriteria(c *JoinCriteriaContext)

	// EnterAliasedRelation is called when entering the aliasedRelation production.
	EnterAliasedRelation(c *AliasedRelationContext)

	// EnterColumns is called when entering the columns production.
	EnterColumns(c *ColumnsContext)

	// EnterTableName is called when entering the tableName production.
	EnterTableName(c *TableNameContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterLogicalNot is called when entering the logicalNot production.
	EnterLogicalNot(c *LogicalNotContext)

	// EnterBooleanDefault is called when entering the booleanDefault production.
	EnterBooleanDefault(c *BooleanDefaultContext)

	// EnterLogicalBinary is called when entering the logicalBinary production.
	EnterLogicalBinary(c *LogicalBinaryContext)

	// EnterPredicated is called when entering the predicated production.
	EnterPredicated(c *PredicatedContext)

	// EnterComparison is called when entering the comparison production.
	EnterComparison(c *ComparisonContext)

	// EnterBetween is called when entering the between production.
	EnterBetween(c *BetweenContext)

	// EnterInList is called when entering the inList production.
	EnterInList(c *InListContext)

	// EnterLike is called when entering the like production.
	EnterLike(c *LikeContext)

	// EnterNullPredicate is called when entering the nullPredicate production.
	EnterNullPredicate(c *NullPredicateContext)

	// EnterDistinctFrom is called when entering the distinctFrom production.
	EnterDistinctFrom(c *DistinctFromContext)

	// EnterValueExpressionDefault is called when entering the valueExpressionDefault production.
	EnterValueExpressionDefault(c *ValueExpressionDefaultContext)

	// EnterConcatenation is called when entering the concatenation production.
	EnterConcatenation(c *ConcatenationContext)

	// EnterArithmeticBinary is called when entering the arithmeticBinary production.
	EnterArithmeticBinary(c *ArithmeticBinaryContext)

	// EnterArithmeticUnary is called when entering the arithmeticUnary production.
	EnterArithmeticUnary(c *ArithmeticUnaryContext)

	// EnterAtTimeZone is called when entering the atTimeZone production.
	EnterAtTimeZone(c *AtTimeZoneContext)

	// EnterDereference is called when entering the dereference production.
	EnterDereference(c *DereferenceContext)

	// EnterSimpleCase is called when entering the simpleCase production.
	EnterSimpleCase(c *SimpleCaseContext)

	// EnterColumnReference is called when entering the columnReference production.
	EnterColumnReference(c *ColumnReferenceContext)

	// EnterSubscript is called when entering the subscript production.
	EnterSubscript(c *SubscriptContext)

	// EnterStructConstructor is called when entering the structConstructor production.
	EnterStructConstructor(c *StructConstructorContext)

	// EnterTypeConstructor is called when entering the typeConstructor production.
	EnterTypeConstructor(c *TypeConstructorContext)

	// EnterQualifiedColumnReference is called when entering the qualifiedColumnReference production.
	EnterQualifiedColumnReference(c *QualifiedColumnReferenceContext)

	// EnterCast is called when entering the cast production.
	EnterCast(c *CastContext)

	// EnterParenthesizedExpression is called when entering the parenthesizedExpression production.
	EnterParenthesizedExpression(c *ParenthesizedExpressionContext)

	// EnterArrayConstructor is called when entering the arrayConstructor production.
	EnterArrayConstructor(c *ArrayConstructorContext)

	// EnterMapConstructor is called when entering the mapConstructor production.
	EnterMapConstructor(c *MapConstructorContext)

	// EnterFunctionCall is called when entering the functionCall production.
	EnterFunctionCall(c *FunctionCallContext)

	// EnterSearchedCase is called when entering the searchedCase production.
	EnterSearchedCase(c *SearchedCaseContext)

	// EnterLiteralExpression is called when entering the literalExpression production.
	EnterLiteralExpression(c *LiteralExpressionContext)

	// EnterFunctionArgument is called when entering the functionArgument production.
	EnterFunctionArgument(c *FunctionArgumentContext)

	// EnterTimeZoneString is called when entering the timeZoneString production.
	EnterTimeZoneString(c *TimeZoneStringContext)

	// EnterComparisonOperator is called when entering the comparisonOperator production.
	EnterComparisonOperator(c *ComparisonOperatorContext)

	// EnterBooleanValue is called when entering the booleanValue production.
	EnterBooleanValue(c *BooleanValueContext)

	// EnterSqltype is called when entering the sqltype production.
	EnterSqltype(c *SqltypeContext)

	// EnterTypeParameter is called when entering the typeParameter production.
	EnterTypeParameter(c *TypeParameterContext)

	// EnterBaseType is called when entering the baseType production.
	EnterBaseType(c *BaseTypeContext)

	// EnterWhenClause is called when entering the whenClause production.
	EnterWhenClause(c *WhenClauseContext)

	// EnterVariableIdentifier is called when entering the variableIdentifier production.
	EnterVariableIdentifier(c *VariableIdentifierContext)

	// EnterUnquotedIdentifier is called when entering the unquotedIdentifier production.
	EnterUnquotedIdentifier(c *UnquotedIdentifierContext)

	// EnterQuotedIdentifierAlternative is called when entering the quotedIdentifierAlternative production.
	EnterQuotedIdentifierAlternative(c *QuotedIdentifierAlternativeContext)

	// EnterBackQuotedIdentifier is called when entering the backQuotedIdentifier production.
	EnterBackQuotedIdentifier(c *BackQuotedIdentifierContext)

	// EnterDigitIdentifier is called when entering the digitIdentifier production.
	EnterDigitIdentifier(c *DigitIdentifierContext)

	// EnterLambda is called when entering the lambda production.
	EnterLambda(c *LambdaContext)

	// EnterVariableName is called when entering the variableName production.
	EnterVariableName(c *VariableNameContext)

	// EnterVariableValue is called when entering the variableValue production.
	EnterVariableValue(c *VariableValueContext)

	// EnterSourceName is called when entering the sourceName production.
	EnterSourceName(c *SourceNameContext)

	// EnterDecimalLiteral is called when entering the decimalLiteral production.
	EnterDecimalLiteral(c *DecimalLiteralContext)

	// EnterFloatLiteral is called when entering the floatLiteral production.
	EnterFloatLiteral(c *FloatLiteralContext)

	// EnterIntegerLiteral is called when entering the integerLiteral production.
	EnterIntegerLiteral(c *IntegerLiteralContext)

	// EnterNullLiteral is called when entering the nullLiteral production.
	EnterNullLiteral(c *NullLiteralContext)

	// EnterNumericLiteral is called when entering the numericLiteral production.
	EnterNumericLiteral(c *NumericLiteralContext)

	// EnterBooleanLiteral is called when entering the booleanLiteral production.
	EnterBooleanLiteral(c *BooleanLiteralContext)

	// EnterStringLiteral is called when entering the stringLiteral production.
	EnterStringLiteral(c *StringLiteralContext)

	// EnterVariableLiteral is called when entering the variableLiteral production.
	EnterVariableLiteral(c *VariableLiteralContext)

	// EnterNonReserved is called when entering the nonReserved production.
	EnterNonReserved(c *NonReservedContext)

	// ExitStatements is called when exiting the statements production.
	ExitStatements(c *StatementsContext)

	// ExitTestStatement is called when exiting the testStatement production.
	ExitTestStatement(c *TestStatementContext)

	// ExitSingleStatement is called when exiting the singleStatement production.
	ExitSingleStatement(c *SingleStatementContext)

	// ExitSingleExpression is called when exiting the singleExpression production.
	ExitSingleExpression(c *SingleExpressionContext)

	// ExitQueryStatement is called when exiting the queryStatement production.
	ExitQueryStatement(c *QueryStatementContext)

	// ExitListProperties is called when exiting the listProperties production.
	ExitListProperties(c *ListPropertiesContext)

	// ExitListTopics is called when exiting the listTopics production.
	ExitListTopics(c *ListTopicsContext)

	// ExitListStreams is called when exiting the listStreams production.
	ExitListStreams(c *ListStreamsContext)

	// ExitListTables is called when exiting the listTables production.
	ExitListTables(c *ListTablesContext)

	// ExitListFunctions is called when exiting the listFunctions production.
	ExitListFunctions(c *ListFunctionsContext)

	// ExitListConnectors is called when exiting the listConnectors production.
	ExitListConnectors(c *ListConnectorsContext)

	// ExitListConnectorPlugins is called when exiting the listConnectorPlugins production.
	ExitListConnectorPlugins(c *ListConnectorPluginsContext)

	// ExitListTypes is called when exiting the listTypes production.
	ExitListTypes(c *ListTypesContext)

	// ExitListVariables is called when exiting the listVariables production.
	ExitListVariables(c *ListVariablesContext)

	// ExitShowColumns is called when exiting the showColumns production.
	ExitShowColumns(c *ShowColumnsContext)

	// ExitDescribeStreams is called when exiting the describeStreams production.
	ExitDescribeStreams(c *DescribeStreamsContext)

	// ExitDescribeFunction is called when exiting the describeFunction production.
	ExitDescribeFunction(c *DescribeFunctionContext)

	// ExitDescribeConnector is called when exiting the describeConnector production.
	ExitDescribeConnector(c *DescribeConnectorContext)

	// ExitPrintTopic is called when exiting the printTopic production.
	ExitPrintTopic(c *PrintTopicContext)

	// ExitListQueries is called when exiting the listQueries production.
	ExitListQueries(c *ListQueriesContext)

	// ExitTerminateQuery is called when exiting the terminateQuery production.
	ExitTerminateQuery(c *TerminateQueryContext)

	// ExitSetProperty is called when exiting the setProperty production.
	ExitSetProperty(c *SetPropertyContext)

	// ExitUnsetProperty is called when exiting the unsetProperty production.
	ExitUnsetProperty(c *UnsetPropertyContext)

	// ExitDefineVariable is called when exiting the defineVariable production.
	ExitDefineVariable(c *DefineVariableContext)

	// ExitUndefineVariable is called when exiting the undefineVariable production.
	ExitUndefineVariable(c *UndefineVariableContext)

	// ExitCreateStream is called when exiting the createStream production.
	ExitCreateStream(c *CreateStreamContext)

	// ExitCreateStreamAs is called when exiting the createStreamAs production.
	ExitCreateStreamAs(c *CreateStreamAsContext)

	// ExitCreateTable is called when exiting the createTable production.
	ExitCreateTable(c *CreateTableContext)

	// ExitCreateTableAs is called when exiting the createTableAs production.
	ExitCreateTableAs(c *CreateTableAsContext)

	// ExitCreateConnector is called when exiting the createConnector production.
	ExitCreateConnector(c *CreateConnectorContext)

	// ExitInsertInto is called when exiting the insertInto production.
	ExitInsertInto(c *InsertIntoContext)

	// ExitInsertValues is called when exiting the insertValues production.
	ExitInsertValues(c *InsertValuesContext)

	// ExitDropStream is called when exiting the dropStream production.
	ExitDropStream(c *DropStreamContext)

	// ExitDropTable is called when exiting the dropTable production.
	ExitDropTable(c *DropTableContext)

	// ExitDropConnector is called when exiting the dropConnector production.
	ExitDropConnector(c *DropConnectorContext)

	// ExitExplain is called when exiting the explain production.
	ExitExplain(c *ExplainContext)

	// ExitRegisterType is called when exiting the registerType production.
	ExitRegisterType(c *RegisterTypeContext)

	// ExitDropType is called when exiting the dropType production.
	ExitDropType(c *DropTypeContext)

	// ExitAlterSource is called when exiting the alterSource production.
	ExitAlterSource(c *AlterSourceContext)

	// ExitAssertValues is called when exiting the assertValues production.
	ExitAssertValues(c *AssertValuesContext)

	// ExitAssertTombstone is called when exiting the assertTombstone production.
	ExitAssertTombstone(c *AssertTombstoneContext)

	// ExitAssertStream is called when exiting the assertStream production.
	ExitAssertStream(c *AssertStreamContext)

	// ExitAssertTable is called when exiting the assertTable production.
	ExitAssertTable(c *AssertTableContext)

	// ExitRunScript is called when exiting the runScript production.
	ExitRunScript(c *RunScriptContext)

	// ExitQuery is called when exiting the query production.
	ExitQuery(c *QueryContext)

	// ExitResultMaterialization is called when exiting the resultMaterialization production.
	ExitResultMaterialization(c *ResultMaterializationContext)

	// ExitAlterOption is called when exiting the alterOption production.
	ExitAlterOption(c *AlterOptionContext)

	// ExitTableElements is called when exiting the tableElements production.
	ExitTableElements(c *TableElementsContext)

	// ExitTableElement is called when exiting the tableElement production.
	ExitTableElement(c *TableElementContext)

	// ExitTableProperties is called when exiting the tableProperties production.
	ExitTableProperties(c *TablePropertiesContext)

	// ExitTableProperty is called when exiting the tableProperty production.
	ExitTableProperty(c *TablePropertyContext)

	// ExitPrintClause is called when exiting the printClause production.
	ExitPrintClause(c *PrintClauseContext)

	// ExitIntervalClause is called when exiting the intervalClause production.
	ExitIntervalClause(c *IntervalClauseContext)

	// ExitLimitClause is called when exiting the limitClause production.
	ExitLimitClause(c *LimitClauseContext)

	// ExitRetentionClause is called when exiting the retentionClause production.
	ExitRetentionClause(c *RetentionClauseContext)

	// ExitGracePeriodClause is called when exiting the gracePeriodClause production.
	ExitGracePeriodClause(c *GracePeriodClauseContext)

	// ExitWindowExpression is called when exiting the windowExpression production.
	ExitWindowExpression(c *WindowExpressionContext)

	// ExitTumblingWindowExpression is called when exiting the tumblingWindowExpression production.
	ExitTumblingWindowExpression(c *TumblingWindowExpressionContext)

	// ExitHoppingWindowExpression is called when exiting the hoppingWindowExpression production.
	ExitHoppingWindowExpression(c *HoppingWindowExpressionContext)

	// ExitSessionWindowExpression is called when exiting the sessionWindowExpression production.
	ExitSessionWindowExpression(c *SessionWindowExpressionContext)

	// ExitWindowUnit is called when exiting the windowUnit production.
	ExitWindowUnit(c *WindowUnitContext)

	// ExitGroupBy is called when exiting the groupBy production.
	ExitGroupBy(c *GroupByContext)

	// ExitPartitionBy is called when exiting the partitionBy production.
	ExitPartitionBy(c *PartitionByContext)

	// ExitValues is called when exiting the values production.
	ExitValues(c *ValuesContext)

	// ExitSelectSingle is called when exiting the selectSingle production.
	ExitSelectSingle(c *SelectSingleContext)

	// ExitSelectAll is called when exiting the selectAll production.
	ExitSelectAll(c *SelectAllContext)

	// ExitJoinRelation is called when exiting the joinRelation production.
	ExitJoinRelation(c *JoinRelationContext)

	// ExitRelationDefault is called when exiting the relationDefault production.
	ExitRelationDefault(c *RelationDefaultContext)

	// ExitJoinedSource is called when exiting the joinedSource production.
	ExitJoinedSource(c *JoinedSourceContext)

	// ExitInnerJoin is called when exiting the innerJoin production.
	ExitInnerJoin(c *InnerJoinContext)

	// ExitOuterJoin is called when exiting the outerJoin production.
	ExitOuterJoin(c *OuterJoinContext)

	// ExitLeftJoin is called when exiting the leftJoin production.
	ExitLeftJoin(c *LeftJoinContext)

	// ExitJoinWindow is called when exiting the joinWindow production.
	ExitJoinWindow(c *JoinWindowContext)

	// ExitJoinWindowWithBeforeAndAfter is called when exiting the joinWindowWithBeforeAndAfter production.
	ExitJoinWindowWithBeforeAndAfter(c *JoinWindowWithBeforeAndAfterContext)

	// ExitSingleJoinWindow is called when exiting the singleJoinWindow production.
	ExitSingleJoinWindow(c *SingleJoinWindowContext)

	// ExitJoinWindowSize is called when exiting the joinWindowSize production.
	ExitJoinWindowSize(c *JoinWindowSizeContext)

	// ExitJoinCriteria is called when exiting the joinCriteria production.
	ExitJoinCriteria(c *JoinCriteriaContext)

	// ExitAliasedRelation is called when exiting the aliasedRelation production.
	ExitAliasedRelation(c *AliasedRelationContext)

	// ExitColumns is called when exiting the columns production.
	ExitColumns(c *ColumnsContext)

	// ExitTableName is called when exiting the tableName production.
	ExitTableName(c *TableNameContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitLogicalNot is called when exiting the logicalNot production.
	ExitLogicalNot(c *LogicalNotContext)

	// ExitBooleanDefault is called when exiting the booleanDefault production.
	ExitBooleanDefault(c *BooleanDefaultContext)

	// ExitLogicalBinary is called when exiting the logicalBinary production.
	ExitLogicalBinary(c *LogicalBinaryContext)

	// ExitPredicated is called when exiting the predicated production.
	ExitPredicated(c *PredicatedContext)

	// ExitComparison is called when exiting the comparison production.
	ExitComparison(c *ComparisonContext)

	// ExitBetween is called when exiting the between production.
	ExitBetween(c *BetweenContext)

	// ExitInList is called when exiting the inList production.
	ExitInList(c *InListContext)

	// ExitLike is called when exiting the like production.
	ExitLike(c *LikeContext)

	// ExitNullPredicate is called when exiting the nullPredicate production.
	ExitNullPredicate(c *NullPredicateContext)

	// ExitDistinctFrom is called when exiting the distinctFrom production.
	ExitDistinctFrom(c *DistinctFromContext)

	// ExitValueExpressionDefault is called when exiting the valueExpressionDefault production.
	ExitValueExpressionDefault(c *ValueExpressionDefaultContext)

	// ExitConcatenation is called when exiting the concatenation production.
	ExitConcatenation(c *ConcatenationContext)

	// ExitArithmeticBinary is called when exiting the arithmeticBinary production.
	ExitArithmeticBinary(c *ArithmeticBinaryContext)

	// ExitArithmeticUnary is called when exiting the arithmeticUnary production.
	ExitArithmeticUnary(c *ArithmeticUnaryContext)

	// ExitAtTimeZone is called when exiting the atTimeZone production.
	ExitAtTimeZone(c *AtTimeZoneContext)

	// ExitDereference is called when exiting the dereference production.
	ExitDereference(c *DereferenceContext)

	// ExitSimpleCase is called when exiting the simpleCase production.
	ExitSimpleCase(c *SimpleCaseContext)

	// ExitColumnReference is called when exiting the columnReference production.
	ExitColumnReference(c *ColumnReferenceContext)

	// ExitSubscript is called when exiting the subscript production.
	ExitSubscript(c *SubscriptContext)

	// ExitStructConstructor is called when exiting the structConstructor production.
	ExitStructConstructor(c *StructConstructorContext)

	// ExitTypeConstructor is called when exiting the typeConstructor production.
	ExitTypeConstructor(c *TypeConstructorContext)

	// ExitQualifiedColumnReference is called when exiting the qualifiedColumnReference production.
	ExitQualifiedColumnReference(c *QualifiedColumnReferenceContext)

	// ExitCast is called when exiting the cast production.
	ExitCast(c *CastContext)

	// ExitParenthesizedExpression is called when exiting the parenthesizedExpression production.
	ExitParenthesizedExpression(c *ParenthesizedExpressionContext)

	// ExitArrayConstructor is called when exiting the arrayConstructor production.
	ExitArrayConstructor(c *ArrayConstructorContext)

	// ExitMapConstructor is called when exiting the mapConstructor production.
	ExitMapConstructor(c *MapConstructorContext)

	// ExitFunctionCall is called when exiting the functionCall production.
	ExitFunctionCall(c *FunctionCallContext)

	// ExitSearchedCase is called when exiting the searchedCase production.
	ExitSearchedCase(c *SearchedCaseContext)

	// ExitLiteralExpression is called when exiting the literalExpression production.
	ExitLiteralExpression(c *LiteralExpressionContext)

	// ExitFunctionArgument is called when exiting the functionArgument production.
	ExitFunctionArgument(c *FunctionArgumentContext)

	// ExitTimeZoneString is called when exiting the timeZoneString production.
	ExitTimeZoneString(c *TimeZoneStringContext)

	// ExitComparisonOperator is called when exiting the comparisonOperator production.
	ExitComparisonOperator(c *ComparisonOperatorContext)

	// ExitBooleanValue is called when exiting the booleanValue production.
	ExitBooleanValue(c *BooleanValueContext)

	// ExitSqltype is called when exiting the sqltype production.
	ExitSqltype(c *SqltypeContext)

	// ExitTypeParameter is called when exiting the typeParameter production.
	ExitTypeParameter(c *TypeParameterContext)

	// ExitBaseType is called when exiting the baseType production.
	ExitBaseType(c *BaseTypeContext)

	// ExitWhenClause is called when exiting the whenClause production.
	ExitWhenClause(c *WhenClauseContext)

	// ExitVariableIdentifier is called when exiting the variableIdentifier production.
	ExitVariableIdentifier(c *VariableIdentifierContext)

	// ExitUnquotedIdentifier is called when exiting the unquotedIdentifier production.
	ExitUnquotedIdentifier(c *UnquotedIdentifierContext)

	// ExitQuotedIdentifierAlternative is called when exiting the quotedIdentifierAlternative production.
	ExitQuotedIdentifierAlternative(c *QuotedIdentifierAlternativeContext)

	// ExitBackQuotedIdentifier is called when exiting the backQuotedIdentifier production.
	ExitBackQuotedIdentifier(c *BackQuotedIdentifierContext)

	// ExitDigitIdentifier is called when exiting the digitIdentifier production.
	ExitDigitIdentifier(c *DigitIdentifierContext)

	// ExitLambda is called when exiting the lambda production.
	ExitLambda(c *LambdaContext)

	// ExitVariableName is called when exiting the variableName production.
	ExitVariableName(c *VariableNameContext)

	// ExitVariableValue is called when exiting the variableValue production.
	ExitVariableValue(c *VariableValueContext)

	// ExitSourceName is called when exiting the sourceName production.
	ExitSourceName(c *SourceNameContext)

	// ExitDecimalLiteral is called when exiting the decimalLiteral production.
	ExitDecimalLiteral(c *DecimalLiteralContext)

	// ExitFloatLiteral is called when exiting the floatLiteral production.
	ExitFloatLiteral(c *FloatLiteralContext)

	// ExitIntegerLiteral is called when exiting the integerLiteral production.
	ExitIntegerLiteral(c *IntegerLiteralContext)

	// ExitNullLiteral is called when exiting the nullLiteral production.
	ExitNullLiteral(c *NullLiteralContext)

	// ExitNumericLiteral is called when exiting the numericLiteral production.
	ExitNumericLiteral(c *NumericLiteralContext)

	// ExitBooleanLiteral is called when exiting the booleanLiteral production.
	ExitBooleanLiteral(c *BooleanLiteralContext)

	// ExitStringLiteral is called when exiting the stringLiteral production.
	ExitStringLiteral(c *StringLiteralContext)

	// ExitVariableLiteral is called when exiting the variableLiteral production.
	ExitVariableLiteral(c *VariableLiteralContext)

	// ExitNonReserved is called when exiting the nonReserved production.
	ExitNonReserved(c *NonReservedContext)
}
