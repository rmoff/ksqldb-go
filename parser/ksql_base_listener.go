// Code generated from KSql.g4 by ANTLR 4.7.1. DO NOT EDIT.

package parser // KSql

import "github.com/antlr/antlr4/runtime/Go/antlr"

// BaseKSqlListener is a complete listener for a parse tree produced by KSqlParser.
type BaseKSqlListener struct{}

var _ KSqlListener = &BaseKSqlListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseKSqlListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseKSqlListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseKSqlListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseKSqlListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterStatements is called when production statements is entered.
func (s *BaseKSqlListener) EnterStatements(ctx *StatementsContext) {}

// ExitStatements is called when production statements is exited.
func (s *BaseKSqlListener) ExitStatements(ctx *StatementsContext) {}

// EnterTestStatement is called when production testStatement is entered.
func (s *BaseKSqlListener) EnterTestStatement(ctx *TestStatementContext) {}

// ExitTestStatement is called when production testStatement is exited.
func (s *BaseKSqlListener) ExitTestStatement(ctx *TestStatementContext) {}

// EnterSingleStatement is called when production singleStatement is entered.
func (s *BaseKSqlListener) EnterSingleStatement(ctx *SingleStatementContext) {}

// ExitSingleStatement is called when production singleStatement is exited.
func (s *BaseKSqlListener) ExitSingleStatement(ctx *SingleStatementContext) {}

// EnterSingleExpression is called when production singleExpression is entered.
func (s *BaseKSqlListener) EnterSingleExpression(ctx *SingleExpressionContext) {}

// ExitSingleExpression is called when production singleExpression is exited.
func (s *BaseKSqlListener) ExitSingleExpression(ctx *SingleExpressionContext) {}

// EnterQueryStatement is called when production queryStatement is entered.
func (s *BaseKSqlListener) EnterQueryStatement(ctx *QueryStatementContext) {}

// ExitQueryStatement is called when production queryStatement is exited.
func (s *BaseKSqlListener) ExitQueryStatement(ctx *QueryStatementContext) {}

// EnterListProperties is called when production listProperties is entered.
func (s *BaseKSqlListener) EnterListProperties(ctx *ListPropertiesContext) {}

// ExitListProperties is called when production listProperties is exited.
func (s *BaseKSqlListener) ExitListProperties(ctx *ListPropertiesContext) {}

// EnterListTopics is called when production listTopics is entered.
func (s *BaseKSqlListener) EnterListTopics(ctx *ListTopicsContext) {}

// ExitListTopics is called when production listTopics is exited.
func (s *BaseKSqlListener) ExitListTopics(ctx *ListTopicsContext) {}

// EnterListStreams is called when production listStreams is entered.
func (s *BaseKSqlListener) EnterListStreams(ctx *ListStreamsContext) {}

// ExitListStreams is called when production listStreams is exited.
func (s *BaseKSqlListener) ExitListStreams(ctx *ListStreamsContext) {}

// EnterListTables is called when production listTables is entered.
func (s *BaseKSqlListener) EnterListTables(ctx *ListTablesContext) {}

// ExitListTables is called when production listTables is exited.
func (s *BaseKSqlListener) ExitListTables(ctx *ListTablesContext) {}

// EnterListFunctions is called when production listFunctions is entered.
func (s *BaseKSqlListener) EnterListFunctions(ctx *ListFunctionsContext) {}

// ExitListFunctions is called when production listFunctions is exited.
func (s *BaseKSqlListener) ExitListFunctions(ctx *ListFunctionsContext) {}

// EnterListConnectors is called when production listConnectors is entered.
func (s *BaseKSqlListener) EnterListConnectors(ctx *ListConnectorsContext) {}

// ExitListConnectors is called when production listConnectors is exited.
func (s *BaseKSqlListener) ExitListConnectors(ctx *ListConnectorsContext) {}

// EnterListConnectorPlugins is called when production listConnectorPlugins is entered.
func (s *BaseKSqlListener) EnterListConnectorPlugins(ctx *ListConnectorPluginsContext) {}

// ExitListConnectorPlugins is called when production listConnectorPlugins is exited.
func (s *BaseKSqlListener) ExitListConnectorPlugins(ctx *ListConnectorPluginsContext) {}

// EnterListTypes is called when production listTypes is entered.
func (s *BaseKSqlListener) EnterListTypes(ctx *ListTypesContext) {}

// ExitListTypes is called when production listTypes is exited.
func (s *BaseKSqlListener) ExitListTypes(ctx *ListTypesContext) {}

// EnterListVariables is called when production listVariables is entered.
func (s *BaseKSqlListener) EnterListVariables(ctx *ListVariablesContext) {}

// ExitListVariables is called when production listVariables is exited.
func (s *BaseKSqlListener) ExitListVariables(ctx *ListVariablesContext) {}

// EnterShowColumns is called when production showColumns is entered.
func (s *BaseKSqlListener) EnterShowColumns(ctx *ShowColumnsContext) {}

// ExitShowColumns is called when production showColumns is exited.
func (s *BaseKSqlListener) ExitShowColumns(ctx *ShowColumnsContext) {}

// EnterDescribeStreams is called when production describeStreams is entered.
func (s *BaseKSqlListener) EnterDescribeStreams(ctx *DescribeStreamsContext) {}

// ExitDescribeStreams is called when production describeStreams is exited.
func (s *BaseKSqlListener) ExitDescribeStreams(ctx *DescribeStreamsContext) {}

// EnterDescribeFunction is called when production describeFunction is entered.
func (s *BaseKSqlListener) EnterDescribeFunction(ctx *DescribeFunctionContext) {}

// ExitDescribeFunction is called when production describeFunction is exited.
func (s *BaseKSqlListener) ExitDescribeFunction(ctx *DescribeFunctionContext) {}

// EnterDescribeConnector is called when production describeConnector is entered.
func (s *BaseKSqlListener) EnterDescribeConnector(ctx *DescribeConnectorContext) {}

// ExitDescribeConnector is called when production describeConnector is exited.
func (s *BaseKSqlListener) ExitDescribeConnector(ctx *DescribeConnectorContext) {}

// EnterPrintTopic is called when production printTopic is entered.
func (s *BaseKSqlListener) EnterPrintTopic(ctx *PrintTopicContext) {}

// ExitPrintTopic is called when production printTopic is exited.
func (s *BaseKSqlListener) ExitPrintTopic(ctx *PrintTopicContext) {}

// EnterListQueries is called when production listQueries is entered.
func (s *BaseKSqlListener) EnterListQueries(ctx *ListQueriesContext) {}

// ExitListQueries is called when production listQueries is exited.
func (s *BaseKSqlListener) ExitListQueries(ctx *ListQueriesContext) {}

// EnterTerminateQuery is called when production terminateQuery is entered.
func (s *BaseKSqlListener) EnterTerminateQuery(ctx *TerminateQueryContext) {}

// ExitTerminateQuery is called when production terminateQuery is exited.
func (s *BaseKSqlListener) ExitTerminateQuery(ctx *TerminateQueryContext) {}

// EnterSetProperty is called when production setProperty is entered.
func (s *BaseKSqlListener) EnterSetProperty(ctx *SetPropertyContext) {}

// ExitSetProperty is called when production setProperty is exited.
func (s *BaseKSqlListener) ExitSetProperty(ctx *SetPropertyContext) {}

// EnterUnsetProperty is called when production unsetProperty is entered.
func (s *BaseKSqlListener) EnterUnsetProperty(ctx *UnsetPropertyContext) {}

// ExitUnsetProperty is called when production unsetProperty is exited.
func (s *BaseKSqlListener) ExitUnsetProperty(ctx *UnsetPropertyContext) {}

// EnterDefineVariable is called when production defineVariable is entered.
func (s *BaseKSqlListener) EnterDefineVariable(ctx *DefineVariableContext) {}

// ExitDefineVariable is called when production defineVariable is exited.
func (s *BaseKSqlListener) ExitDefineVariable(ctx *DefineVariableContext) {}

// EnterUndefineVariable is called when production undefineVariable is entered.
func (s *BaseKSqlListener) EnterUndefineVariable(ctx *UndefineVariableContext) {}

// ExitUndefineVariable is called when production undefineVariable is exited.
func (s *BaseKSqlListener) ExitUndefineVariable(ctx *UndefineVariableContext) {}

// EnterCreateStream is called when production createStream is entered.
func (s *BaseKSqlListener) EnterCreateStream(ctx *CreateStreamContext) {}

// ExitCreateStream is called when production createStream is exited.
func (s *BaseKSqlListener) ExitCreateStream(ctx *CreateStreamContext) {}

// EnterCreateStreamAs is called when production createStreamAs is entered.
func (s *BaseKSqlListener) EnterCreateStreamAs(ctx *CreateStreamAsContext) {}

// ExitCreateStreamAs is called when production createStreamAs is exited.
func (s *BaseKSqlListener) ExitCreateStreamAs(ctx *CreateStreamAsContext) {}

// EnterCreateTable is called when production createTable is entered.
func (s *BaseKSqlListener) EnterCreateTable(ctx *CreateTableContext) {}

// ExitCreateTable is called when production createTable is exited.
func (s *BaseKSqlListener) ExitCreateTable(ctx *CreateTableContext) {}

// EnterCreateTableAs is called when production createTableAs is entered.
func (s *BaseKSqlListener) EnterCreateTableAs(ctx *CreateTableAsContext) {}

// ExitCreateTableAs is called when production createTableAs is exited.
func (s *BaseKSqlListener) ExitCreateTableAs(ctx *CreateTableAsContext) {}

// EnterCreateConnector is called when production createConnector is entered.
func (s *BaseKSqlListener) EnterCreateConnector(ctx *CreateConnectorContext) {}

// ExitCreateConnector is called when production createConnector is exited.
func (s *BaseKSqlListener) ExitCreateConnector(ctx *CreateConnectorContext) {}

// EnterInsertInto is called when production insertInto is entered.
func (s *BaseKSqlListener) EnterInsertInto(ctx *InsertIntoContext) {}

// ExitInsertInto is called when production insertInto is exited.
func (s *BaseKSqlListener) ExitInsertInto(ctx *InsertIntoContext) {}

// EnterInsertValues is called when production insertValues is entered.
func (s *BaseKSqlListener) EnterInsertValues(ctx *InsertValuesContext) {}

// ExitInsertValues is called when production insertValues is exited.
func (s *BaseKSqlListener) ExitInsertValues(ctx *InsertValuesContext) {}

// EnterDropStream is called when production dropStream is entered.
func (s *BaseKSqlListener) EnterDropStream(ctx *DropStreamContext) {}

// ExitDropStream is called when production dropStream is exited.
func (s *BaseKSqlListener) ExitDropStream(ctx *DropStreamContext) {}

// EnterDropTable is called when production dropTable is entered.
func (s *BaseKSqlListener) EnterDropTable(ctx *DropTableContext) {}

// ExitDropTable is called when production dropTable is exited.
func (s *BaseKSqlListener) ExitDropTable(ctx *DropTableContext) {}

// EnterDropConnector is called when production dropConnector is entered.
func (s *BaseKSqlListener) EnterDropConnector(ctx *DropConnectorContext) {}

// ExitDropConnector is called when production dropConnector is exited.
func (s *BaseKSqlListener) ExitDropConnector(ctx *DropConnectorContext) {}

// EnterExplain is called when production explain is entered.
func (s *BaseKSqlListener) EnterExplain(ctx *ExplainContext) {}

// ExitExplain is called when production explain is exited.
func (s *BaseKSqlListener) ExitExplain(ctx *ExplainContext) {}

// EnterRegisterType is called when production registerType is entered.
func (s *BaseKSqlListener) EnterRegisterType(ctx *RegisterTypeContext) {}

// ExitRegisterType is called when production registerType is exited.
func (s *BaseKSqlListener) ExitRegisterType(ctx *RegisterTypeContext) {}

// EnterDropType is called when production dropType is entered.
func (s *BaseKSqlListener) EnterDropType(ctx *DropTypeContext) {}

// ExitDropType is called when production dropType is exited.
func (s *BaseKSqlListener) ExitDropType(ctx *DropTypeContext) {}

// EnterAlterSource is called when production alterSource is entered.
func (s *BaseKSqlListener) EnterAlterSource(ctx *AlterSourceContext) {}

// ExitAlterSource is called when production alterSource is exited.
func (s *BaseKSqlListener) ExitAlterSource(ctx *AlterSourceContext) {}

// EnterAssertValues is called when production assertValues is entered.
func (s *BaseKSqlListener) EnterAssertValues(ctx *AssertValuesContext) {}

// ExitAssertValues is called when production assertValues is exited.
func (s *BaseKSqlListener) ExitAssertValues(ctx *AssertValuesContext) {}

// EnterAssertTombstone is called when production assertTombstone is entered.
func (s *BaseKSqlListener) EnterAssertTombstone(ctx *AssertTombstoneContext) {}

// ExitAssertTombstone is called when production assertTombstone is exited.
func (s *BaseKSqlListener) ExitAssertTombstone(ctx *AssertTombstoneContext) {}

// EnterAssertStream is called when production assertStream is entered.
func (s *BaseKSqlListener) EnterAssertStream(ctx *AssertStreamContext) {}

// ExitAssertStream is called when production assertStream is exited.
func (s *BaseKSqlListener) ExitAssertStream(ctx *AssertStreamContext) {}

// EnterAssertTable is called when production assertTable is entered.
func (s *BaseKSqlListener) EnterAssertTable(ctx *AssertTableContext) {}

// ExitAssertTable is called when production assertTable is exited.
func (s *BaseKSqlListener) ExitAssertTable(ctx *AssertTableContext) {}

// EnterRunScript is called when production runScript is entered.
func (s *BaseKSqlListener) EnterRunScript(ctx *RunScriptContext) {}

// ExitRunScript is called when production runScript is exited.
func (s *BaseKSqlListener) ExitRunScript(ctx *RunScriptContext) {}

// EnterQuery is called when production query is entered.
func (s *BaseKSqlListener) EnterQuery(ctx *QueryContext) {}

// ExitQuery is called when production query is exited.
func (s *BaseKSqlListener) ExitQuery(ctx *QueryContext) {}

// EnterResultMaterialization is called when production resultMaterialization is entered.
func (s *BaseKSqlListener) EnterResultMaterialization(ctx *ResultMaterializationContext) {}

// ExitResultMaterialization is called when production resultMaterialization is exited.
func (s *BaseKSqlListener) ExitResultMaterialization(ctx *ResultMaterializationContext) {}

// EnterAlterOption is called when production alterOption is entered.
func (s *BaseKSqlListener) EnterAlterOption(ctx *AlterOptionContext) {}

// ExitAlterOption is called when production alterOption is exited.
func (s *BaseKSqlListener) ExitAlterOption(ctx *AlterOptionContext) {}

// EnterTableElements is called when production tableElements is entered.
func (s *BaseKSqlListener) EnterTableElements(ctx *TableElementsContext) {}

// ExitTableElements is called when production tableElements is exited.
func (s *BaseKSqlListener) ExitTableElements(ctx *TableElementsContext) {}

// EnterTableElement is called when production tableElement is entered.
func (s *BaseKSqlListener) EnterTableElement(ctx *TableElementContext) {}

// ExitTableElement is called when production tableElement is exited.
func (s *BaseKSqlListener) ExitTableElement(ctx *TableElementContext) {}

// EnterTableProperties is called when production tableProperties is entered.
func (s *BaseKSqlListener) EnterTableProperties(ctx *TablePropertiesContext) {}

// ExitTableProperties is called when production tableProperties is exited.
func (s *BaseKSqlListener) ExitTableProperties(ctx *TablePropertiesContext) {}

// EnterTableProperty is called when production tableProperty is entered.
func (s *BaseKSqlListener) EnterTableProperty(ctx *TablePropertyContext) {}

// ExitTableProperty is called when production tableProperty is exited.
func (s *BaseKSqlListener) ExitTableProperty(ctx *TablePropertyContext) {}

// EnterPrintClause is called when production printClause is entered.
func (s *BaseKSqlListener) EnterPrintClause(ctx *PrintClauseContext) {}

// ExitPrintClause is called when production printClause is exited.
func (s *BaseKSqlListener) ExitPrintClause(ctx *PrintClauseContext) {}

// EnterIntervalClause is called when production intervalClause is entered.
func (s *BaseKSqlListener) EnterIntervalClause(ctx *IntervalClauseContext) {}

// ExitIntervalClause is called when production intervalClause is exited.
func (s *BaseKSqlListener) ExitIntervalClause(ctx *IntervalClauseContext) {}

// EnterLimitClause is called when production limitClause is entered.
func (s *BaseKSqlListener) EnterLimitClause(ctx *LimitClauseContext) {}

// ExitLimitClause is called when production limitClause is exited.
func (s *BaseKSqlListener) ExitLimitClause(ctx *LimitClauseContext) {}

// EnterRetentionClause is called when production retentionClause is entered.
func (s *BaseKSqlListener) EnterRetentionClause(ctx *RetentionClauseContext) {}

// ExitRetentionClause is called when production retentionClause is exited.
func (s *BaseKSqlListener) ExitRetentionClause(ctx *RetentionClauseContext) {}

// EnterGracePeriodClause is called when production gracePeriodClause is entered.
func (s *BaseKSqlListener) EnterGracePeriodClause(ctx *GracePeriodClauseContext) {}

// ExitGracePeriodClause is called when production gracePeriodClause is exited.
func (s *BaseKSqlListener) ExitGracePeriodClause(ctx *GracePeriodClauseContext) {}

// EnterWindowExpression is called when production windowExpression is entered.
func (s *BaseKSqlListener) EnterWindowExpression(ctx *WindowExpressionContext) {}

// ExitWindowExpression is called when production windowExpression is exited.
func (s *BaseKSqlListener) ExitWindowExpression(ctx *WindowExpressionContext) {}

// EnterTumblingWindowExpression is called when production tumblingWindowExpression is entered.
func (s *BaseKSqlListener) EnterTumblingWindowExpression(ctx *TumblingWindowExpressionContext) {}

// ExitTumblingWindowExpression is called when production tumblingWindowExpression is exited.
func (s *BaseKSqlListener) ExitTumblingWindowExpression(ctx *TumblingWindowExpressionContext) {}

// EnterHoppingWindowExpression is called when production hoppingWindowExpression is entered.
func (s *BaseKSqlListener) EnterHoppingWindowExpression(ctx *HoppingWindowExpressionContext) {}

// ExitHoppingWindowExpression is called when production hoppingWindowExpression is exited.
func (s *BaseKSqlListener) ExitHoppingWindowExpression(ctx *HoppingWindowExpressionContext) {}

// EnterSessionWindowExpression is called when production sessionWindowExpression is entered.
func (s *BaseKSqlListener) EnterSessionWindowExpression(ctx *SessionWindowExpressionContext) {}

// ExitSessionWindowExpression is called when production sessionWindowExpression is exited.
func (s *BaseKSqlListener) ExitSessionWindowExpression(ctx *SessionWindowExpressionContext) {}

// EnterWindowUnit is called when production windowUnit is entered.
func (s *BaseKSqlListener) EnterWindowUnit(ctx *WindowUnitContext) {}

// ExitWindowUnit is called when production windowUnit is exited.
func (s *BaseKSqlListener) ExitWindowUnit(ctx *WindowUnitContext) {}

// EnterGroupBy is called when production groupBy is entered.
func (s *BaseKSqlListener) EnterGroupBy(ctx *GroupByContext) {}

// ExitGroupBy is called when production groupBy is exited.
func (s *BaseKSqlListener) ExitGroupBy(ctx *GroupByContext) {}

// EnterPartitionBy is called when production partitionBy is entered.
func (s *BaseKSqlListener) EnterPartitionBy(ctx *PartitionByContext) {}

// ExitPartitionBy is called when production partitionBy is exited.
func (s *BaseKSqlListener) ExitPartitionBy(ctx *PartitionByContext) {}

// EnterValues is called when production values is entered.
func (s *BaseKSqlListener) EnterValues(ctx *ValuesContext) {}

// ExitValues is called when production values is exited.
func (s *BaseKSqlListener) ExitValues(ctx *ValuesContext) {}

// EnterSelectSingle is called when production selectSingle is entered.
func (s *BaseKSqlListener) EnterSelectSingle(ctx *SelectSingleContext) {}

// ExitSelectSingle is called when production selectSingle is exited.
func (s *BaseKSqlListener) ExitSelectSingle(ctx *SelectSingleContext) {}

// EnterSelectAll is called when production selectAll is entered.
func (s *BaseKSqlListener) EnterSelectAll(ctx *SelectAllContext) {}

// ExitSelectAll is called when production selectAll is exited.
func (s *BaseKSqlListener) ExitSelectAll(ctx *SelectAllContext) {}

// EnterJoinRelation is called when production joinRelation is entered.
func (s *BaseKSqlListener) EnterJoinRelation(ctx *JoinRelationContext) {}

// ExitJoinRelation is called when production joinRelation is exited.
func (s *BaseKSqlListener) ExitJoinRelation(ctx *JoinRelationContext) {}

// EnterRelationDefault is called when production relationDefault is entered.
func (s *BaseKSqlListener) EnterRelationDefault(ctx *RelationDefaultContext) {}

// ExitRelationDefault is called when production relationDefault is exited.
func (s *BaseKSqlListener) ExitRelationDefault(ctx *RelationDefaultContext) {}

// EnterJoinedSource is called when production joinedSource is entered.
func (s *BaseKSqlListener) EnterJoinedSource(ctx *JoinedSourceContext) {}

// ExitJoinedSource is called when production joinedSource is exited.
func (s *BaseKSqlListener) ExitJoinedSource(ctx *JoinedSourceContext) {}

// EnterInnerJoin is called when production innerJoin is entered.
func (s *BaseKSqlListener) EnterInnerJoin(ctx *InnerJoinContext) {}

// ExitInnerJoin is called when production innerJoin is exited.
func (s *BaseKSqlListener) ExitInnerJoin(ctx *InnerJoinContext) {}

// EnterOuterJoin is called when production outerJoin is entered.
func (s *BaseKSqlListener) EnterOuterJoin(ctx *OuterJoinContext) {}

// ExitOuterJoin is called when production outerJoin is exited.
func (s *BaseKSqlListener) ExitOuterJoin(ctx *OuterJoinContext) {}

// EnterLeftJoin is called when production leftJoin is entered.
func (s *BaseKSqlListener) EnterLeftJoin(ctx *LeftJoinContext) {}

// ExitLeftJoin is called when production leftJoin is exited.
func (s *BaseKSqlListener) ExitLeftJoin(ctx *LeftJoinContext) {}

// EnterJoinWindow is called when production joinWindow is entered.
func (s *BaseKSqlListener) EnterJoinWindow(ctx *JoinWindowContext) {}

// ExitJoinWindow is called when production joinWindow is exited.
func (s *BaseKSqlListener) ExitJoinWindow(ctx *JoinWindowContext) {}

// EnterJoinWindowWithBeforeAndAfter is called when production joinWindowWithBeforeAndAfter is entered.
func (s *BaseKSqlListener) EnterJoinWindowWithBeforeAndAfter(ctx *JoinWindowWithBeforeAndAfterContext) {
}

// ExitJoinWindowWithBeforeAndAfter is called when production joinWindowWithBeforeAndAfter is exited.
func (s *BaseKSqlListener) ExitJoinWindowWithBeforeAndAfter(ctx *JoinWindowWithBeforeAndAfterContext) {
}

// EnterSingleJoinWindow is called when production singleJoinWindow is entered.
func (s *BaseKSqlListener) EnterSingleJoinWindow(ctx *SingleJoinWindowContext) {}

// ExitSingleJoinWindow is called when production singleJoinWindow is exited.
func (s *BaseKSqlListener) ExitSingleJoinWindow(ctx *SingleJoinWindowContext) {}

// EnterJoinWindowSize is called when production joinWindowSize is entered.
func (s *BaseKSqlListener) EnterJoinWindowSize(ctx *JoinWindowSizeContext) {}

// ExitJoinWindowSize is called when production joinWindowSize is exited.
func (s *BaseKSqlListener) ExitJoinWindowSize(ctx *JoinWindowSizeContext) {}

// EnterJoinCriteria is called when production joinCriteria is entered.
func (s *BaseKSqlListener) EnterJoinCriteria(ctx *JoinCriteriaContext) {}

// ExitJoinCriteria is called when production joinCriteria is exited.
func (s *BaseKSqlListener) ExitJoinCriteria(ctx *JoinCriteriaContext) {}

// EnterAliasedRelation is called when production aliasedRelation is entered.
func (s *BaseKSqlListener) EnterAliasedRelation(ctx *AliasedRelationContext) {}

// ExitAliasedRelation is called when production aliasedRelation is exited.
func (s *BaseKSqlListener) ExitAliasedRelation(ctx *AliasedRelationContext) {}

// EnterColumns is called when production columns is entered.
func (s *BaseKSqlListener) EnterColumns(ctx *ColumnsContext) {}

// ExitColumns is called when production columns is exited.
func (s *BaseKSqlListener) ExitColumns(ctx *ColumnsContext) {}

// EnterTableName is called when production tableName is entered.
func (s *BaseKSqlListener) EnterTableName(ctx *TableNameContext) {}

// ExitTableName is called when production tableName is exited.
func (s *BaseKSqlListener) ExitTableName(ctx *TableNameContext) {}

// EnterExpression is called when production expression is entered.
func (s *BaseKSqlListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseKSqlListener) ExitExpression(ctx *ExpressionContext) {}

// EnterLogicalNot is called when production logicalNot is entered.
func (s *BaseKSqlListener) EnterLogicalNot(ctx *LogicalNotContext) {}

// ExitLogicalNot is called when production logicalNot is exited.
func (s *BaseKSqlListener) ExitLogicalNot(ctx *LogicalNotContext) {}

// EnterBooleanDefault is called when production booleanDefault is entered.
func (s *BaseKSqlListener) EnterBooleanDefault(ctx *BooleanDefaultContext) {}

// ExitBooleanDefault is called when production booleanDefault is exited.
func (s *BaseKSqlListener) ExitBooleanDefault(ctx *BooleanDefaultContext) {}

// EnterLogicalBinary is called when production logicalBinary is entered.
func (s *BaseKSqlListener) EnterLogicalBinary(ctx *LogicalBinaryContext) {}

// ExitLogicalBinary is called when production logicalBinary is exited.
func (s *BaseKSqlListener) ExitLogicalBinary(ctx *LogicalBinaryContext) {}

// EnterPredicated is called when production predicated is entered.
func (s *BaseKSqlListener) EnterPredicated(ctx *PredicatedContext) {}

// ExitPredicated is called when production predicated is exited.
func (s *BaseKSqlListener) ExitPredicated(ctx *PredicatedContext) {}

// EnterComparison is called when production comparison is entered.
func (s *BaseKSqlListener) EnterComparison(ctx *ComparisonContext) {}

// ExitComparison is called when production comparison is exited.
func (s *BaseKSqlListener) ExitComparison(ctx *ComparisonContext) {}

// EnterBetween is called when production between is entered.
func (s *BaseKSqlListener) EnterBetween(ctx *BetweenContext) {}

// ExitBetween is called when production between is exited.
func (s *BaseKSqlListener) ExitBetween(ctx *BetweenContext) {}

// EnterInList is called when production inList is entered.
func (s *BaseKSqlListener) EnterInList(ctx *InListContext) {}

// ExitInList is called when production inList is exited.
func (s *BaseKSqlListener) ExitInList(ctx *InListContext) {}

// EnterLike is called when production like is entered.
func (s *BaseKSqlListener) EnterLike(ctx *LikeContext) {}

// ExitLike is called when production like is exited.
func (s *BaseKSqlListener) ExitLike(ctx *LikeContext) {}

// EnterNullPredicate is called when production nullPredicate is entered.
func (s *BaseKSqlListener) EnterNullPredicate(ctx *NullPredicateContext) {}

// ExitNullPredicate is called when production nullPredicate is exited.
func (s *BaseKSqlListener) ExitNullPredicate(ctx *NullPredicateContext) {}

// EnterDistinctFrom is called when production distinctFrom is entered.
func (s *BaseKSqlListener) EnterDistinctFrom(ctx *DistinctFromContext) {}

// ExitDistinctFrom is called when production distinctFrom is exited.
func (s *BaseKSqlListener) ExitDistinctFrom(ctx *DistinctFromContext) {}

// EnterValueExpressionDefault is called when production valueExpressionDefault is entered.
func (s *BaseKSqlListener) EnterValueExpressionDefault(ctx *ValueExpressionDefaultContext) {}

// ExitValueExpressionDefault is called when production valueExpressionDefault is exited.
func (s *BaseKSqlListener) ExitValueExpressionDefault(ctx *ValueExpressionDefaultContext) {}

// EnterConcatenation is called when production concatenation is entered.
func (s *BaseKSqlListener) EnterConcatenation(ctx *ConcatenationContext) {}

// ExitConcatenation is called when production concatenation is exited.
func (s *BaseKSqlListener) ExitConcatenation(ctx *ConcatenationContext) {}

// EnterArithmeticBinary is called when production arithmeticBinary is entered.
func (s *BaseKSqlListener) EnterArithmeticBinary(ctx *ArithmeticBinaryContext) {}

// ExitArithmeticBinary is called when production arithmeticBinary is exited.
func (s *BaseKSqlListener) ExitArithmeticBinary(ctx *ArithmeticBinaryContext) {}

// EnterArithmeticUnary is called when production arithmeticUnary is entered.
func (s *BaseKSqlListener) EnterArithmeticUnary(ctx *ArithmeticUnaryContext) {}

// ExitArithmeticUnary is called when production arithmeticUnary is exited.
func (s *BaseKSqlListener) ExitArithmeticUnary(ctx *ArithmeticUnaryContext) {}

// EnterAtTimeZone is called when production atTimeZone is entered.
func (s *BaseKSqlListener) EnterAtTimeZone(ctx *AtTimeZoneContext) {}

// ExitAtTimeZone is called when production atTimeZone is exited.
func (s *BaseKSqlListener) ExitAtTimeZone(ctx *AtTimeZoneContext) {}

// EnterDereference is called when production dereference is entered.
func (s *BaseKSqlListener) EnterDereference(ctx *DereferenceContext) {}

// ExitDereference is called when production dereference is exited.
func (s *BaseKSqlListener) ExitDereference(ctx *DereferenceContext) {}

// EnterSimpleCase is called when production simpleCase is entered.
func (s *BaseKSqlListener) EnterSimpleCase(ctx *SimpleCaseContext) {}

// ExitSimpleCase is called when production simpleCase is exited.
func (s *BaseKSqlListener) ExitSimpleCase(ctx *SimpleCaseContext) {}

// EnterColumnReference is called when production columnReference is entered.
func (s *BaseKSqlListener) EnterColumnReference(ctx *ColumnReferenceContext) {}

// ExitColumnReference is called when production columnReference is exited.
func (s *BaseKSqlListener) ExitColumnReference(ctx *ColumnReferenceContext) {}

// EnterSubscript is called when production subscript is entered.
func (s *BaseKSqlListener) EnterSubscript(ctx *SubscriptContext) {}

// ExitSubscript is called when production subscript is exited.
func (s *BaseKSqlListener) ExitSubscript(ctx *SubscriptContext) {}

// EnterStructConstructor is called when production structConstructor is entered.
func (s *BaseKSqlListener) EnterStructConstructor(ctx *StructConstructorContext) {}

// ExitStructConstructor is called when production structConstructor is exited.
func (s *BaseKSqlListener) ExitStructConstructor(ctx *StructConstructorContext) {}

// EnterTypeConstructor is called when production typeConstructor is entered.
func (s *BaseKSqlListener) EnterTypeConstructor(ctx *TypeConstructorContext) {}

// ExitTypeConstructor is called when production typeConstructor is exited.
func (s *BaseKSqlListener) ExitTypeConstructor(ctx *TypeConstructorContext) {}

// EnterQualifiedColumnReference is called when production qualifiedColumnReference is entered.
func (s *BaseKSqlListener) EnterQualifiedColumnReference(ctx *QualifiedColumnReferenceContext) {}

// ExitQualifiedColumnReference is called when production qualifiedColumnReference is exited.
func (s *BaseKSqlListener) ExitQualifiedColumnReference(ctx *QualifiedColumnReferenceContext) {}

// EnterCast is called when production cast is entered.
func (s *BaseKSqlListener) EnterCast(ctx *CastContext) {}

// ExitCast is called when production cast is exited.
func (s *BaseKSqlListener) ExitCast(ctx *CastContext) {}

// EnterParenthesizedExpression is called when production parenthesizedExpression is entered.
func (s *BaseKSqlListener) EnterParenthesizedExpression(ctx *ParenthesizedExpressionContext) {}

// ExitParenthesizedExpression is called when production parenthesizedExpression is exited.
func (s *BaseKSqlListener) ExitParenthesizedExpression(ctx *ParenthesizedExpressionContext) {}

// EnterArrayConstructor is called when production arrayConstructor is entered.
func (s *BaseKSqlListener) EnterArrayConstructor(ctx *ArrayConstructorContext) {}

// ExitArrayConstructor is called when production arrayConstructor is exited.
func (s *BaseKSqlListener) ExitArrayConstructor(ctx *ArrayConstructorContext) {}

// EnterMapConstructor is called when production mapConstructor is entered.
func (s *BaseKSqlListener) EnterMapConstructor(ctx *MapConstructorContext) {}

// ExitMapConstructor is called when production mapConstructor is exited.
func (s *BaseKSqlListener) ExitMapConstructor(ctx *MapConstructorContext) {}

// EnterFunctionCall is called when production functionCall is entered.
func (s *BaseKSqlListener) EnterFunctionCall(ctx *FunctionCallContext) {}

// ExitFunctionCall is called when production functionCall is exited.
func (s *BaseKSqlListener) ExitFunctionCall(ctx *FunctionCallContext) {}

// EnterSearchedCase is called when production searchedCase is entered.
func (s *BaseKSqlListener) EnterSearchedCase(ctx *SearchedCaseContext) {}

// ExitSearchedCase is called when production searchedCase is exited.
func (s *BaseKSqlListener) ExitSearchedCase(ctx *SearchedCaseContext) {}

// EnterLiteralExpression is called when production literalExpression is entered.
func (s *BaseKSqlListener) EnterLiteralExpression(ctx *LiteralExpressionContext) {}

// ExitLiteralExpression is called when production literalExpression is exited.
func (s *BaseKSqlListener) ExitLiteralExpression(ctx *LiteralExpressionContext) {}

// EnterFunctionArgument is called when production functionArgument is entered.
func (s *BaseKSqlListener) EnterFunctionArgument(ctx *FunctionArgumentContext) {}

// ExitFunctionArgument is called when production functionArgument is exited.
func (s *BaseKSqlListener) ExitFunctionArgument(ctx *FunctionArgumentContext) {}

// EnterTimeZoneString is called when production timeZoneString is entered.
func (s *BaseKSqlListener) EnterTimeZoneString(ctx *TimeZoneStringContext) {}

// ExitTimeZoneString is called when production timeZoneString is exited.
func (s *BaseKSqlListener) ExitTimeZoneString(ctx *TimeZoneStringContext) {}

// EnterComparisonOperator is called when production comparisonOperator is entered.
func (s *BaseKSqlListener) EnterComparisonOperator(ctx *ComparisonOperatorContext) {}

// ExitComparisonOperator is called when production comparisonOperator is exited.
func (s *BaseKSqlListener) ExitComparisonOperator(ctx *ComparisonOperatorContext) {}

// EnterBooleanValue is called when production booleanValue is entered.
func (s *BaseKSqlListener) EnterBooleanValue(ctx *BooleanValueContext) {}

// ExitBooleanValue is called when production booleanValue is exited.
func (s *BaseKSqlListener) ExitBooleanValue(ctx *BooleanValueContext) {}

// EnterSqltype is called when production sqltype is entered.
func (s *BaseKSqlListener) EnterSqltype(ctx *SqltypeContext) {}

// ExitSqltype is called when production sqltype is exited.
func (s *BaseKSqlListener) ExitSqltype(ctx *SqltypeContext) {}

// EnterTypeParameter is called when production typeParameter is entered.
func (s *BaseKSqlListener) EnterTypeParameter(ctx *TypeParameterContext) {}

// ExitTypeParameter is called when production typeParameter is exited.
func (s *BaseKSqlListener) ExitTypeParameter(ctx *TypeParameterContext) {}

// EnterBaseType is called when production baseType is entered.
func (s *BaseKSqlListener) EnterBaseType(ctx *BaseTypeContext) {}

// ExitBaseType is called when production baseType is exited.
func (s *BaseKSqlListener) ExitBaseType(ctx *BaseTypeContext) {}

// EnterWhenClause is called when production whenClause is entered.
func (s *BaseKSqlListener) EnterWhenClause(ctx *WhenClauseContext) {}

// ExitWhenClause is called when production whenClause is exited.
func (s *BaseKSqlListener) ExitWhenClause(ctx *WhenClauseContext) {}

// EnterVariableIdentifier is called when production variableIdentifier is entered.
func (s *BaseKSqlListener) EnterVariableIdentifier(ctx *VariableIdentifierContext) {}

// ExitVariableIdentifier is called when production variableIdentifier is exited.
func (s *BaseKSqlListener) ExitVariableIdentifier(ctx *VariableIdentifierContext) {}

// EnterUnquotedIdentifier is called when production unquotedIdentifier is entered.
func (s *BaseKSqlListener) EnterUnquotedIdentifier(ctx *UnquotedIdentifierContext) {}

// ExitUnquotedIdentifier is called when production unquotedIdentifier is exited.
func (s *BaseKSqlListener) ExitUnquotedIdentifier(ctx *UnquotedIdentifierContext) {}

// EnterQuotedIdentifierAlternative is called when production quotedIdentifierAlternative is entered.
func (s *BaseKSqlListener) EnterQuotedIdentifierAlternative(ctx *QuotedIdentifierAlternativeContext) {
}

// ExitQuotedIdentifierAlternative is called when production quotedIdentifierAlternative is exited.
func (s *BaseKSqlListener) ExitQuotedIdentifierAlternative(ctx *QuotedIdentifierAlternativeContext) {}

// EnterBackQuotedIdentifier is called when production backQuotedIdentifier is entered.
func (s *BaseKSqlListener) EnterBackQuotedIdentifier(ctx *BackQuotedIdentifierContext) {}

// ExitBackQuotedIdentifier is called when production backQuotedIdentifier is exited.
func (s *BaseKSqlListener) ExitBackQuotedIdentifier(ctx *BackQuotedIdentifierContext) {}

// EnterDigitIdentifier is called when production digitIdentifier is entered.
func (s *BaseKSqlListener) EnterDigitIdentifier(ctx *DigitIdentifierContext) {}

// ExitDigitIdentifier is called when production digitIdentifier is exited.
func (s *BaseKSqlListener) ExitDigitIdentifier(ctx *DigitIdentifierContext) {}

// EnterLambda is called when production lambda is entered.
func (s *BaseKSqlListener) EnterLambda(ctx *LambdaContext) {}

// ExitLambda is called when production lambda is exited.
func (s *BaseKSqlListener) ExitLambda(ctx *LambdaContext) {}

// EnterVariableName is called when production variableName is entered.
func (s *BaseKSqlListener) EnterVariableName(ctx *VariableNameContext) {}

// ExitVariableName is called when production variableName is exited.
func (s *BaseKSqlListener) ExitVariableName(ctx *VariableNameContext) {}

// EnterVariableValue is called when production variableValue is entered.
func (s *BaseKSqlListener) EnterVariableValue(ctx *VariableValueContext) {}

// ExitVariableValue is called when production variableValue is exited.
func (s *BaseKSqlListener) ExitVariableValue(ctx *VariableValueContext) {}

// EnterSourceName is called when production sourceName is entered.
func (s *BaseKSqlListener) EnterSourceName(ctx *SourceNameContext) {}

// ExitSourceName is called when production sourceName is exited.
func (s *BaseKSqlListener) ExitSourceName(ctx *SourceNameContext) {}

// EnterDecimalLiteral is called when production decimalLiteral is entered.
func (s *BaseKSqlListener) EnterDecimalLiteral(ctx *DecimalLiteralContext) {}

// ExitDecimalLiteral is called when production decimalLiteral is exited.
func (s *BaseKSqlListener) ExitDecimalLiteral(ctx *DecimalLiteralContext) {}

// EnterFloatLiteral is called when production floatLiteral is entered.
func (s *BaseKSqlListener) EnterFloatLiteral(ctx *FloatLiteralContext) {}

// ExitFloatLiteral is called when production floatLiteral is exited.
func (s *BaseKSqlListener) ExitFloatLiteral(ctx *FloatLiteralContext) {}

// EnterIntegerLiteral is called when production integerLiteral is entered.
func (s *BaseKSqlListener) EnterIntegerLiteral(ctx *IntegerLiteralContext) {}

// ExitIntegerLiteral is called when production integerLiteral is exited.
func (s *BaseKSqlListener) ExitIntegerLiteral(ctx *IntegerLiteralContext) {}

// EnterNullLiteral is called when production nullLiteral is entered.
func (s *BaseKSqlListener) EnterNullLiteral(ctx *NullLiteralContext) {}

// ExitNullLiteral is called when production nullLiteral is exited.
func (s *BaseKSqlListener) ExitNullLiteral(ctx *NullLiteralContext) {}

// EnterNumericLiteral is called when production numericLiteral is entered.
func (s *BaseKSqlListener) EnterNumericLiteral(ctx *NumericLiteralContext) {}

// ExitNumericLiteral is called when production numericLiteral is exited.
func (s *BaseKSqlListener) ExitNumericLiteral(ctx *NumericLiteralContext) {}

// EnterBooleanLiteral is called when production booleanLiteral is entered.
func (s *BaseKSqlListener) EnterBooleanLiteral(ctx *BooleanLiteralContext) {}

// ExitBooleanLiteral is called when production booleanLiteral is exited.
func (s *BaseKSqlListener) ExitBooleanLiteral(ctx *BooleanLiteralContext) {}

// EnterStringLiteral is called when production stringLiteral is entered.
func (s *BaseKSqlListener) EnterStringLiteral(ctx *StringLiteralContext) {}

// ExitStringLiteral is called when production stringLiteral is exited.
func (s *BaseKSqlListener) ExitStringLiteral(ctx *StringLiteralContext) {}

// EnterVariableLiteral is called when production variableLiteral is entered.
func (s *BaseKSqlListener) EnterVariableLiteral(ctx *VariableLiteralContext) {}

// ExitVariableLiteral is called when production variableLiteral is exited.
func (s *BaseKSqlListener) ExitVariableLiteral(ctx *VariableLiteralContext) {}

// EnterNonReserved is called when production nonReserved is entered.
func (s *BaseKSqlListener) EnterNonReserved(ctx *NonReservedContext) {}

// ExitNonReserved is called when production nonReserved is exited.
func (s *BaseKSqlListener) ExitNonReserved(ctx *NonReservedContext) {}
