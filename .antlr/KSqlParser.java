// Generated from /home/tmeitz/workspace/golang/src/github.com/thmeitz/ksqldb-go/KSql.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, EMIT=9, 
		CHANGES=10, FINAL=11, SELECT=12, FROM=13, AS=14, ALL=15, DISTINCT=16, 
		WHERE=17, WITHIN=18, WINDOW=19, GROUP=20, BY=21, HAVING=22, LIMIT=23, 
		AT=24, OR=25, AND=26, IN=27, NOT=28, EXISTS=29, BETWEEN=30, LIKE=31, ESCAPE=32, 
		IS=33, NULL=34, TRUE=35, FALSE=36, INTEGER=37, DATE=38, TIME=39, TIMESTAMP=40, 
		INTERVAL=41, YEAR=42, MONTH=43, DAY=44, HOUR=45, MINUTE=46, SECOND=47, 
		MILLISECOND=48, YEARS=49, MONTHS=50, DAYS=51, HOURS=52, MINUTES=53, SECONDS=54, 
		MILLISECONDS=55, ZONE=56, TUMBLING=57, HOPPING=58, SIZE=59, ADVANCE=60, 
		RETENTION=61, GRACE=62, PERIOD=63, CASE=64, WHEN=65, THEN=66, ELSE=67, 
		END=68, JOIN=69, FULL=70, OUTER=71, INNER=72, LEFT=73, RIGHT=74, ON=75, 
		PARTITION=76, STRUCT=77, WITH=78, VALUES=79, CREATE=80, TABLE=81, TOPIC=82, 
		STREAM=83, STREAMS=84, INSERT=85, DELETE=86, INTO=87, DESCRIBE=88, EXTENDED=89, 
		PRINT=90, EXPLAIN=91, ANALYZE=92, TYPE=93, TYPES=94, CAST=95, SHOW=96, 
		LIST=97, TABLES=98, TOPICS=99, QUERY=100, QUERIES=101, TERMINATE=102, 
		LOAD=103, COLUMNS=104, COLUMN=105, PARTITIONS=106, FUNCTIONS=107, FUNCTION=108, 
		DROP=109, TO=110, RENAME=111, ARRAY=112, MAP=113, SET=114, DEFINE=115, 
		UNDEFINE=116, RESET=117, SESSION=118, SAMPLE=119, EXPORT=120, CATALOG=121, 
		PROPERTIES=122, BEGINNING=123, UNSET=124, RUN=125, SCRIPT=126, DECIMAL=127, 
		KEY=128, CONNECTOR=129, CONNECTORS=130, SINK=131, SOURCE=132, NAMESPACE=133, 
		MATERIALIZED=134, VIEW=135, PRIMARY=136, REPLACE=137, ASSERT=138, ADD=139, 
		ALTER=140, VARIABLES=141, PLUGINS=142, IF=143, EQ=144, NEQ=145, LT=146, 
		LTE=147, GT=148, GTE=149, PLUS=150, MINUS=151, ASTERISK=152, SLASH=153, 
		PERCENT=154, CONCAT=155, ASSIGN=156, STRUCT_FIELD_REF=157, LAMBDA_EXPRESSION=158, 
		STRING=159, INTEGER_VALUE=160, DECIMAL_VALUE=161, FLOATING_POINT_VALUE=162, 
		IDENTIFIER=163, DIGIT_IDENTIFIER=164, QUOTED_IDENTIFIER=165, BACKQUOTED_IDENTIFIER=166, 
		VARIABLE=167, SIMPLE_COMMENT=168, DIRECTIVE_COMMENT=169, BRACKETED_COMMENT=170, 
		WS=171, UNRECOGNIZED=172, DELIMITER=173;
	public static final int
		RULE_statements = 0, RULE_testStatement = 1, RULE_singleStatement = 2, 
		RULE_singleExpression = 3, RULE_statement = 4, RULE_assertStatement = 5, 
		RULE_runScript = 6, RULE_query = 7, RULE_resultMaterialization = 8, RULE_alterOption = 9, 
		RULE_tableElements = 10, RULE_tableElement = 11, RULE_tableProperties = 12, 
		RULE_tableProperty = 13, RULE_printClause = 14, RULE_intervalClause = 15, 
		RULE_limitClause = 16, RULE_retentionClause = 17, RULE_gracePeriodClause = 18, 
		RULE_windowExpression = 19, RULE_tumblingWindowExpression = 20, RULE_hoppingWindowExpression = 21, 
		RULE_sessionWindowExpression = 22, RULE_windowUnit = 23, RULE_groupBy = 24, 
		RULE_partitionBy = 25, RULE_values = 26, RULE_selectItem = 27, RULE_relation = 28, 
		RULE_joinedSource = 29, RULE_joinType = 30, RULE_joinWindow = 31, RULE_withinExpression = 32, 
		RULE_joinWindowSize = 33, RULE_joinCriteria = 34, RULE_aliasedRelation = 35, 
		RULE_columns = 36, RULE_relationPrimary = 37, RULE_expression = 38, RULE_booleanExpression = 39, 
		RULE_predicated = 40, RULE_predicate = 41, RULE_valueExpression = 42, 
		RULE_primaryExpression = 43, RULE_functionArgument = 44, RULE_timeZoneSpecifier = 45, 
		RULE_comparisonOperator = 46, RULE_booleanValue = 47, RULE_sqltype = 48, 
		RULE_typeParameter = 49, RULE_baseType = 50, RULE_whenClause = 51, RULE_identifier = 52, 
		RULE_lambdaFunction = 53, RULE_variableName = 54, RULE_variableValue = 55, 
		RULE_sourceName = 56, RULE_number = 57, RULE_literal = 58, RULE_nonReserved = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "testStatement", "singleStatement", "singleExpression", 
			"statement", "assertStatement", "runScript", "query", "resultMaterialization", 
			"alterOption", "tableElements", "tableElement", "tableProperties", "tableProperty", 
			"printClause", "intervalClause", "limitClause", "retentionClause", "gracePeriodClause", 
			"windowExpression", "tumblingWindowExpression", "hoppingWindowExpression", 
			"sessionWindowExpression", "windowUnit", "groupBy", "partitionBy", "values", 
			"selectItem", "relation", "joinedSource", "joinType", "joinWindow", "withinExpression", 
			"joinWindowSize", "joinCriteria", "aliasedRelation", "columns", "relationPrimary", 
			"expression", "booleanExpression", "predicated", "predicate", "valueExpression", 
			"primaryExpression", "functionArgument", "timeZoneSpecifier", "comparisonOperator", 
			"booleanValue", "sqltype", "typeParameter", "baseType", "whenClause", 
			"identifier", "lambdaFunction", "variableName", "variableValue", "sourceName", 
			"number", "literal", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'('", "')'", "'.'", "'['", "']'", "'STRING'", "'EMIT'", 
			"'CHANGES'", "'FINAL'", "'SELECT'", "'FROM'", "'AS'", "'ALL'", "'DISTINCT'", 
			"'WHERE'", "'WITHIN'", "'WINDOW'", "'GROUP'", "'BY'", "'HAVING'", "'LIMIT'", 
			"'AT'", "'OR'", "'AND'", "'IN'", "'NOT'", "'EXISTS'", "'BETWEEN'", "'LIKE'", 
			"'ESCAPE'", "'IS'", "'NULL'", "'TRUE'", "'FALSE'", "'INTEGER'", "'DATE'", 
			"'TIME'", "'TIMESTAMP'", "'INTERVAL'", "'YEAR'", "'MONTH'", "'DAY'", 
			"'HOUR'", "'MINUTE'", "'SECOND'", "'MILLISECOND'", "'YEARS'", "'MONTHS'", 
			"'DAYS'", "'HOURS'", "'MINUTES'", "'SECONDS'", "'MILLISECONDS'", "'ZONE'", 
			"'TUMBLING'", "'HOPPING'", "'SIZE'", "'ADVANCE'", "'RETENTION'", "'GRACE'", 
			"'PERIOD'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", 
			"'FULL'", "'OUTER'", "'INNER'", "'LEFT'", "'RIGHT'", "'ON'", "'PARTITION'", 
			"'STRUCT'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", "'TOPIC'", "'STREAM'", 
			"'STREAMS'", "'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", "'EXTENDED'", 
			"'PRINT'", "'EXPLAIN'", "'ANALYZE'", "'TYPE'", "'TYPES'", "'CAST'", "'SHOW'", 
			"'LIST'", "'TABLES'", "'TOPICS'", "'QUERY'", "'QUERIES'", "'TERMINATE'", 
			"'LOAD'", "'COLUMNS'", "'COLUMN'", "'PARTITIONS'", "'FUNCTIONS'", "'FUNCTION'", 
			"'DROP'", "'TO'", "'RENAME'", "'ARRAY'", "'MAP'", "'SET'", "'DEFINE'", 
			"'UNDEFINE'", "'RESET'", "'SESSION'", "'SAMPLE'", "'EXPORT'", "'CATALOG'", 
			"'PROPERTIES'", "'BEGINNING'", "'UNSET'", "'RUN'", "'SCRIPT'", "'DECIMAL'", 
			"'KEY'", "'CONNECTOR'", "'CONNECTORS'", "'SINK'", "'SOURCE'", "'NAMESPACE'", 
			"'MATERIALIZED'", "'VIEW'", "'PRIMARY'", "'REPLACE'", "'ASSERT'", "'ADD'", 
			"'ALTER'", "'VARIABLES'", "'PLUGINS'", "'IF'", "'='", null, "'<'", "'<='", 
			"'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "':='", "'->'", 
			"'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "EMIT", "CHANGES", 
			"FINAL", "SELECT", "FROM", "AS", "ALL", "DISTINCT", "WHERE", "WITHIN", 
			"WINDOW", "GROUP", "BY", "HAVING", "LIMIT", "AT", "OR", "AND", "IN", 
			"NOT", "EXISTS", "BETWEEN", "LIKE", "ESCAPE", "IS", "NULL", "TRUE", "FALSE", 
			"INTEGER", "DATE", "TIME", "TIMESTAMP", "INTERVAL", "YEAR", "MONTH", 
			"DAY", "HOUR", "MINUTE", "SECOND", "MILLISECOND", "YEARS", "MONTHS", 
			"DAYS", "HOURS", "MINUTES", "SECONDS", "MILLISECONDS", "ZONE", "TUMBLING", 
			"HOPPING", "SIZE", "ADVANCE", "RETENTION", "GRACE", "PERIOD", "CASE", 
			"WHEN", "THEN", "ELSE", "END", "JOIN", "FULL", "OUTER", "INNER", "LEFT", 
			"RIGHT", "ON", "PARTITION", "STRUCT", "WITH", "VALUES", "CREATE", "TABLE", 
			"TOPIC", "STREAM", "STREAMS", "INSERT", "DELETE", "INTO", "DESCRIBE", 
			"EXTENDED", "PRINT", "EXPLAIN", "ANALYZE", "TYPE", "TYPES", "CAST", "SHOW", 
			"LIST", "TABLES", "TOPICS", "QUERY", "QUERIES", "TERMINATE", "LOAD", 
			"COLUMNS", "COLUMN", "PARTITIONS", "FUNCTIONS", "FUNCTION", "DROP", "TO", 
			"RENAME", "ARRAY", "MAP", "SET", "DEFINE", "UNDEFINE", "RESET", "SESSION", 
			"SAMPLE", "EXPORT", "CATALOG", "PROPERTIES", "BEGINNING", "UNSET", "RUN", 
			"SCRIPT", "DECIMAL", "KEY", "CONNECTOR", "CONNECTORS", "SINK", "SOURCE", 
			"NAMESPACE", "MATERIALIZED", "VIEW", "PRIMARY", "REPLACE", "ASSERT", 
			"ADD", "ALTER", "VARIABLES", "PLUGINS", "IF", "EQ", "NEQ", "LT", "LTE", 
			"GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "CONCAT", 
			"ASSIGN", "STRUCT_FIELD_REF", "LAMBDA_EXPRESSION", "STRING", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "FLOATING_POINT_VALUE", "IDENTIFIER", "DIGIT_IDENTIFIER", 
			"QUOTED_IDENTIFIER", "BACKQUOTED_IDENTIFIER", "VARIABLE", "SIMPLE_COMMENT", 
			"DIRECTIVE_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "DELIMITER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KSqlParser.EOF, 0); }
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (CREATE - 80)) | (1L << (INSERT - 80)) | (1L << (DESCRIBE - 80)) | (1L << (PRINT - 80)) | (1L << (EXPLAIN - 80)) | (1L << (SHOW - 80)) | (1L << (LIST - 80)) | (1L << (TERMINATE - 80)) | (1L << (DROP - 80)) | (1L << (SET - 80)) | (1L << (DEFINE - 80)) | (1L << (UNDEFINE - 80)) | (1L << (UNSET - 80)) | (1L << (ALTER - 80)))) != 0)) {
				{
				{
				setState(120);
				singleStatement();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestStatementContext extends ParserRuleContext {
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public RunScriptContext runScript() {
			return getRuleContext(RunScriptContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KSqlParser.EOF, 0); }
		public TestStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testStatement; }
	}

	public final TestStatementContext testStatement() throws RecognitionException {
		TestStatementContext _localctx = new TestStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_testStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case CREATE:
			case INSERT:
			case DESCRIBE:
			case PRINT:
			case EXPLAIN:
			case SHOW:
			case LIST:
			case TERMINATE:
			case DROP:
			case SET:
			case DEFINE:
			case UNDEFINE:
			case UNSET:
			case ALTER:
				{
				setState(128);
				singleStatement();
				}
				break;
			case ASSERT:
				{
				setState(129);
				assertStatement();
				setState(130);
				match(T__0);
				}
				break;
			case RUN:
				{
				setState(132);
				runScript();
				setState(133);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(137);
				match(EOF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			statement();
			setState(141);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KSqlParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			expression();
			setState(144);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListTablesContext extends StatementContext {
		public TerminalNode TABLES() { return getToken(KSqlParser.TABLES, 0); }
		public TerminalNode LIST() { return getToken(KSqlParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public TerminalNode EXTENDED() { return getToken(KSqlParser.EXTENDED, 0); }
		public ListTablesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DefineVariableContext extends StatementContext {
		public TerminalNode DEFINE() { return getToken(KSqlParser.DEFINE, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(KSqlParser.EQ, 0); }
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public DefineVariableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(KSqlParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(KSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(KSqlParser.TABLE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode OR() { return getToken(KSqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(KSqlParser.REPLACE, 0); }
		public TerminalNode SOURCE() { return getToken(KSqlParser.SOURCE, 0); }
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KSqlParser.EXISTS, 0); }
		public TableElementsContext tableElements() {
			return getRuleContext(TableElementsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(KSqlParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class UnsetPropertyContext extends StatementContext {
		public TerminalNode UNSET() { return getToken(KSqlParser.UNSET, 0); }
		public TerminalNode STRING() { return getToken(KSqlParser.STRING, 0); }
		public UnsetPropertyContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ListTypesContext extends StatementContext {
		public TerminalNode TYPES() { return getToken(KSqlParser.TYPES, 0); }
		public TerminalNode LIST() { return getToken(KSqlParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public ListTypesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(KSqlParser.DESCRIBE, 0); }
		public TerminalNode FUNCTION() { return getToken(KSqlParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RegisterTypeContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(KSqlParser.CREATE, 0); }
		public TerminalNode TYPE() { return getToken(KSqlParser.TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(KSqlParser.AS, 0); }
		public SqltypeContext sqltype() {
			return getRuleContext(SqltypeContext.class,0);
		}
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KSqlParser.EXISTS, 0); }
		public RegisterTypeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ListTopicsContext extends StatementContext {
		public TerminalNode TOPICS() { return getToken(KSqlParser.TOPICS, 0); }
		public TerminalNode LIST() { return getToken(KSqlParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public TerminalNode ALL() { return getToken(KSqlParser.ALL, 0); }
		public TerminalNode EXTENDED() { return getToken(KSqlParser.EXTENDED, 0); }
		public ListTopicsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ListQueriesContext extends StatementContext {
		public TerminalNode QUERIES() { return getToken(KSqlParser.QUERIES, 0); }
		public TerminalNode LIST() { return getToken(KSqlParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public TerminalNode EXTENDED() { return getToken(KSqlParser.EXTENDED, 0); }
		public ListQueriesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropStreamContext extends StatementContext {
		public TerminalNode DROP() { return getToken(KSqlParser.DROP, 0); }
		public TerminalNode STREAM() { return getToken(KSqlParser.STREAM, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(KSqlParser.EXISTS, 0); }
		public TerminalNode DELETE() { return getToken(KSqlParser.DELETE, 0); }
		public TerminalNode TOPIC() { return getToken(KSqlParser.TOPIC, 0); }
		public DropStreamContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class QueryStatementContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QueryStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateStreamAsContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(KSqlParser.CREATE, 0); }
		public TerminalNode STREAM() { return getToken(KSqlParser.STREAM, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(KSqlParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(KSqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(KSqlParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KSqlParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(KSqlParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateStreamAsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateTableAsContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(KSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(KSqlParser.TABLE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(KSqlParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(KSqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(KSqlParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KSqlParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(KSqlParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateTableAsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateConnectorContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(KSqlParser.CREATE, 0); }
		public TerminalNode CONNECTOR() { return getToken(KSqlParser.CONNECTOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(KSqlParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode SINK() { return getToken(KSqlParser.SINK, 0); }
		public TerminalNode SOURCE() { return getToken(KSqlParser.SOURCE, 0); }
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KSqlParser.EXISTS, 0); }
		public CreateConnectorContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateStreamContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(KSqlParser.CREATE, 0); }
		public TerminalNode STREAM() { return getToken(KSqlParser.STREAM, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode OR() { return getToken(KSqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(KSqlParser.REPLACE, 0); }
		public TerminalNode SOURCE() { return getToken(KSqlParser.SOURCE, 0); }
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KSqlParser.EXISTS, 0); }
		public TableElementsContext tableElements() {
			return getRuleContext(TableElementsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(KSqlParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateStreamContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ListConnectorsContext extends StatementContext {
		public TerminalNode CONNECTORS() { return getToken(KSqlParser.CONNECTORS, 0); }
		public TerminalNode LIST() { return getToken(KSqlParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public TerminalNode SOURCE() { return getToken(KSqlParser.SOURCE, 0); }
		public TerminalNode SINK() { return getToken(KSqlParser.SINK, 0); }
		public ListConnectorsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ListVariablesContext extends StatementContext {
		public TerminalNode VARIABLES() { return getToken(KSqlParser.VARIABLES, 0); }
		public TerminalNode LIST() { return getToken(KSqlParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public ListVariablesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ListStreamsContext extends StatementContext {
		public TerminalNode STREAMS() { return getToken(KSqlParser.STREAMS, 0); }
		public TerminalNode LIST() { return getToken(KSqlParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public TerminalNode EXTENDED() { return getToken(KSqlParser.EXTENDED, 0); }
		public ListStreamsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowColumnsContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(KSqlParser.DESCRIBE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(KSqlParser.EXTENDED, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(KSqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(KSqlParser.TABLE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(KSqlParser.EXISTS, 0); }
		public TerminalNode DELETE() { return getToken(KSqlParser.DELETE, 0); }
		public TerminalNode TOPIC() { return getToken(KSqlParser.TOPIC, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropConnectorContext extends StatementContext {
		public TerminalNode DROP() { return getToken(KSqlParser.DROP, 0); }
		public TerminalNode CONNECTOR() { return getToken(KSqlParser.CONNECTOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(KSqlParser.EXISTS, 0); }
		public DropConnectorContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ListConnectorPluginsContext extends StatementContext {
		public TerminalNode CONNECTOR() { return getToken(KSqlParser.CONNECTOR, 0); }
		public TerminalNode PLUGINS() { return getToken(KSqlParser.PLUGINS, 0); }
		public TerminalNode LIST() { return getToken(KSqlParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public ListConnectorPluginsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ListFunctionsContext extends StatementContext {
		public TerminalNode FUNCTIONS() { return getToken(KSqlParser.FUNCTIONS, 0); }
		public TerminalNode LIST() { return getToken(KSqlParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public ListFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DescribeConnectorContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(KSqlParser.DESCRIBE, 0); }
		public TerminalNode CONNECTOR() { return getToken(KSqlParser.CONNECTOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeConnectorContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(KSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(KSqlParser.INTO, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode WITH() { return getToken(KSqlParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AlterSourceContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(KSqlParser.ALTER, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public List<AlterOptionContext> alterOption() {
			return getRuleContexts(AlterOptionContext.class);
		}
		public AlterOptionContext alterOption(int i) {
			return getRuleContext(AlterOptionContext.class,i);
		}
		public TerminalNode STREAM() { return getToken(KSqlParser.STREAM, 0); }
		public TerminalNode TABLE() { return getToken(KSqlParser.TABLE, 0); }
		public AlterSourceContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class PrintTopicContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(KSqlParser.PRINT, 0); }
		public PrintClauseContext printClause() {
			return getRuleContext(PrintClauseContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KSqlParser.STRING, 0); }
		public PrintTopicContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ListPropertiesContext extends StatementContext {
		public TerminalNode PROPERTIES() { return getToken(KSqlParser.PROPERTIES, 0); }
		public TerminalNode LIST() { return getToken(KSqlParser.LIST, 0); }
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public ListPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropTypeContext extends StatementContext {
		public TerminalNode DROP() { return getToken(KSqlParser.DROP, 0); }
		public TerminalNode TYPE() { return getToken(KSqlParser.TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(KSqlParser.EXISTS, 0); }
		public DropTypeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetPropertyContext extends StatementContext {
		public TerminalNode SET() { return getToken(KSqlParser.SET, 0); }
		public List<TerminalNode> STRING() { return getTokens(KSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(KSqlParser.STRING, i);
		}
		public TerminalNode EQ() { return getToken(KSqlParser.EQ, 0); }
		public SetPropertyContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class TerminateQueryContext extends StatementContext {
		public TerminalNode TERMINATE() { return getToken(KSqlParser.TERMINATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ALL() { return getToken(KSqlParser.ALL, 0); }
		public TerminateQueryContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class UndefineVariableContext extends StatementContext {
		public TerminalNode UNDEFINE() { return getToken(KSqlParser.UNDEFINE, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public UndefineVariableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class InsertValuesContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(KSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(KSqlParser.INTO, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(KSqlParser.VALUES, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public InsertValuesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DescribeStreamsContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(KSqlParser.DESCRIBE, 0); }
		public TerminalNode STREAMS() { return getToken(KSqlParser.STREAMS, 0); }
		public TerminalNode EXTENDED() { return getToken(KSqlParser.EXTENDED, 0); }
		public DescribeStreamsContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new QueryStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				query();
				}
				break;
			case 2:
				_localctx = new ListPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(148);
				match(PROPERTIES);
				}
				break;
			case 3:
				_localctx = new ListTopicsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(150);
					match(ALL);
					}
				}

				setState(153);
				match(TOPICS);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(154);
					match(EXTENDED);
					}
				}

				}
				break;
			case 4:
				_localctx = new ListStreamsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				match(STREAMS);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(159);
					match(EXTENDED);
					}
				}

				}
				break;
			case 5:
				_localctx = new ListTablesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				match(TABLES);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(164);
					match(EXTENDED);
					}
				}

				}
				break;
			case 6:
				_localctx = new ListFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				match(FUNCTIONS);
				}
				break;
			case 7:
				_localctx = new ListConnectorsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINK || _la==SOURCE) {
					{
					setState(170);
					_la = _input.LA(1);
					if ( !(_la==SINK || _la==SOURCE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(173);
				match(CONNECTORS);
				}
				break;
			case 8:
				_localctx = new ListConnectorPluginsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				match(CONNECTOR);
				setState(176);
				match(PLUGINS);
				}
				break;
			case 9:
				_localctx = new ListTypesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				match(TYPES);
				}
				break;
			case 10:
				_localctx = new ListVariablesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				match(VARIABLES);
				}
				break;
			case 11:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(181);
				match(DESCRIBE);
				setState(182);
				sourceName();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(183);
					match(EXTENDED);
					}
				}

				}
				break;
			case 12:
				_localctx = new DescribeStreamsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(186);
				match(DESCRIBE);
				setState(187);
				match(STREAMS);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(188);
					match(EXTENDED);
					}
				}

				}
				break;
			case 13:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(191);
				match(DESCRIBE);
				setState(192);
				match(FUNCTION);
				setState(193);
				identifier();
				}
				break;
			case 14:
				_localctx = new DescribeConnectorContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(194);
				match(DESCRIBE);
				setState(195);
				match(CONNECTOR);
				setState(196);
				identifier();
				}
				break;
			case 15:
				_localctx = new PrintTopicContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(197);
				match(PRINT);
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
				case EMIT:
				case CHANGES:
				case FINAL:
				case ESCAPE:
				case INTEGER:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case INTERVAL:
				case YEAR:
				case MONTH:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case ZONE:
				case PARTITION:
				case STRUCT:
				case EXPLAIN:
				case ANALYZE:
				case TYPE:
				case TYPES:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case PARTITIONS:
				case FUNCTIONS:
				case FUNCTION:
				case ARRAY:
				case MAP:
				case SET:
				case RESET:
				case SESSION:
				case KEY:
				case SINK:
				case SOURCE:
				case PRIMARY:
				case REPLACE:
				case ASSERT:
				case ADD:
				case ALTER:
				case IF:
				case IDENTIFIER:
				case DIGIT_IDENTIFIER:
				case QUOTED_IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
				case VARIABLE:
					{
					setState(198);
					identifier();
					}
					break;
				case STRING:
					{
					setState(199);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202);
				printClause();
				}
				break;
			case 16:
				_localctx = new ListQueriesContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==SHOW || _la==LIST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				match(QUERIES);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(205);
					match(EXTENDED);
					}
				}

				}
				break;
			case 17:
				_localctx = new TerminateQueryContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(208);
				match(TERMINATE);
				setState(209);
				identifier();
				}
				break;
			case 18:
				_localctx = new TerminateQueryContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(210);
				match(TERMINATE);
				setState(211);
				match(ALL);
				}
				break;
			case 19:
				_localctx = new SetPropertyContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(212);
				match(SET);
				setState(213);
				match(STRING);
				setState(214);
				match(EQ);
				setState(215);
				match(STRING);
				}
				break;
			case 20:
				_localctx = new UnsetPropertyContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(216);
				match(UNSET);
				setState(217);
				match(STRING);
				}
				break;
			case 21:
				_localctx = new DefineVariableContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(218);
				match(DEFINE);
				setState(219);
				variableName();
				setState(220);
				match(EQ);
				setState(221);
				variableValue();
				}
				break;
			case 22:
				_localctx = new UndefineVariableContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(223);
				match(UNDEFINE);
				setState(224);
				variableName();
				}
				break;
			case 23:
				_localctx = new CreateStreamContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(225);
				match(CREATE);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(226);
					match(OR);
					setState(227);
					match(REPLACE);
					}
				}

				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SOURCE) {
					{
					setState(230);
					match(SOURCE);
					}
				}

				setState(233);
				match(STREAM);
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(234);
					match(IF);
					setState(235);
					match(NOT);
					setState(236);
					match(EXISTS);
					}
					break;
				}
				setState(239);
				sourceName();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(240);
					tableElements();
					}
				}

				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(243);
					match(WITH);
					setState(244);
					tableProperties();
					}
				}

				}
				break;
			case 24:
				_localctx = new CreateStreamAsContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(247);
				match(CREATE);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(248);
					match(OR);
					setState(249);
					match(REPLACE);
					}
				}

				setState(252);
				match(STREAM);
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(253);
					match(IF);
					setState(254);
					match(NOT);
					setState(255);
					match(EXISTS);
					}
					break;
				}
				setState(258);
				sourceName();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(259);
					match(WITH);
					setState(260);
					tableProperties();
					}
				}

				setState(263);
				match(AS);
				setState(264);
				query();
				}
				break;
			case 25:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(266);
				match(CREATE);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(267);
					match(OR);
					setState(268);
					match(REPLACE);
					}
				}

				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SOURCE) {
					{
					setState(271);
					match(SOURCE);
					}
				}

				setState(274);
				match(TABLE);
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(275);
					match(IF);
					setState(276);
					match(NOT);
					setState(277);
					match(EXISTS);
					}
					break;
				}
				setState(280);
				sourceName();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(281);
					tableElements();
					}
				}

				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(284);
					match(WITH);
					setState(285);
					tableProperties();
					}
				}

				}
				break;
			case 26:
				_localctx = new CreateTableAsContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(288);
				match(CREATE);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(289);
					match(OR);
					setState(290);
					match(REPLACE);
					}
				}

				setState(293);
				match(TABLE);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(294);
					match(IF);
					setState(295);
					match(NOT);
					setState(296);
					match(EXISTS);
					}
					break;
				}
				setState(299);
				sourceName();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(300);
					match(WITH);
					setState(301);
					tableProperties();
					}
				}

				setState(304);
				match(AS);
				setState(305);
				query();
				}
				break;
			case 27:
				_localctx = new CreateConnectorContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(307);
				match(CREATE);
				setState(308);
				_la = _input.LA(1);
				if ( !(_la==SINK || _la==SOURCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				match(CONNECTOR);
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(310);
					match(IF);
					setState(311);
					match(NOT);
					setState(312);
					match(EXISTS);
					}
					break;
				}
				setState(315);
				identifier();
				setState(316);
				match(WITH);
				setState(317);
				tableProperties();
				}
				break;
			case 28:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(319);
				match(INSERT);
				setState(320);
				match(INTO);
				setState(321);
				sourceName();
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(322);
					match(WITH);
					setState(323);
					tableProperties();
					}
				}

				setState(326);
				query();
				}
				break;
			case 29:
				_localctx = new InsertValuesContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(328);
				match(INSERT);
				setState(329);
				match(INTO);
				setState(330);
				sourceName();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(331);
					columns();
					}
				}

				setState(334);
				match(VALUES);
				setState(335);
				values();
				}
				break;
			case 30:
				_localctx = new DropStreamContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(337);
				match(DROP);
				setState(338);
				match(STREAM);
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(339);
					match(IF);
					setState(340);
					match(EXISTS);
					}
					break;
				}
				setState(343);
				sourceName();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELETE) {
					{
					setState(344);
					match(DELETE);
					setState(345);
					match(TOPIC);
					}
				}

				}
				break;
			case 31:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(348);
				match(DROP);
				setState(349);
				match(TABLE);
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(350);
					match(IF);
					setState(351);
					match(EXISTS);
					}
					break;
				}
				setState(354);
				sourceName();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELETE) {
					{
					setState(355);
					match(DELETE);
					setState(356);
					match(TOPIC);
					}
				}

				}
				break;
			case 32:
				_localctx = new DropConnectorContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(359);
				match(DROP);
				setState(360);
				match(CONNECTOR);
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(361);
					match(IF);
					setState(362);
					match(EXISTS);
					}
					break;
				}
				setState(365);
				identifier();
				}
				break;
			case 33:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(366);
				match(EXPLAIN);
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(367);
					statement();
					}
					break;
				case 2:
					{
					setState(368);
					identifier();
					}
					break;
				}
				}
				break;
			case 34:
				_localctx = new RegisterTypeContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(371);
				match(CREATE);
				setState(372);
				match(TYPE);
				setState(376);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(373);
					match(IF);
					setState(374);
					match(NOT);
					setState(375);
					match(EXISTS);
					}
					break;
				}
				setState(378);
				identifier();
				setState(379);
				match(AS);
				setState(380);
				sqltype(0);
				}
				break;
			case 35:
				_localctx = new DropTypeContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(382);
				match(DROP);
				setState(383);
				match(TYPE);
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(384);
					match(IF);
					setState(385);
					match(EXISTS);
					}
					break;
				}
				setState(388);
				identifier();
				}
				break;
			case 36:
				_localctx = new AlterSourceContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(389);
				match(ALTER);
				setState(390);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==STREAM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(391);
				sourceName();
				setState(392);
				alterOption();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(393);
					match(T__1);
					setState(394);
					alterOption();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
	 
		public AssertStatementContext() { }
		public void copyFrom(AssertStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssertValuesContext extends AssertStatementContext {
		public TerminalNode ASSERT() { return getToken(KSqlParser.ASSERT, 0); }
		public List<TerminalNode> VALUES() { return getTokens(KSqlParser.VALUES); }
		public TerminalNode VALUES(int i) {
			return getToken(KSqlParser.VALUES, i);
		}
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public AssertValuesContext(AssertStatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssertTombstoneContext extends AssertStatementContext {
		public TerminalNode ASSERT() { return getToken(KSqlParser.ASSERT, 0); }
		public TerminalNode NULL() { return getToken(KSqlParser.NULL, 0); }
		public TerminalNode VALUES() { return getToken(KSqlParser.VALUES, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode KEY() { return getToken(KSqlParser.KEY, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public AssertTombstoneContext(AssertStatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssertTableContext extends AssertStatementContext {
		public TerminalNode ASSERT() { return getToken(KSqlParser.ASSERT, 0); }
		public TerminalNode TABLE() { return getToken(KSqlParser.TABLE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TableElementsContext tableElements() {
			return getRuleContext(TableElementsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(KSqlParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public AssertTableContext(AssertStatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssertStreamContext extends AssertStatementContext {
		public TerminalNode ASSERT() { return getToken(KSqlParser.ASSERT, 0); }
		public TerminalNode STREAM() { return getToken(KSqlParser.STREAM, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TableElementsContext tableElements() {
			return getRuleContext(TableElementsContext.class,0);
		}
		public TerminalNode WITH() { return getToken(KSqlParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public AssertStreamContext(AssertStatementContext ctx) { copyFrom(ctx); }
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assertStatement);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new AssertValuesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(ASSERT);
				setState(403);
				match(VALUES);
				setState(404);
				sourceName();
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(405);
					columns();
					}
				}

				setState(408);
				match(VALUES);
				setState(409);
				values();
				}
				break;
			case 2:
				_localctx = new AssertTombstoneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(ASSERT);
				setState(412);
				match(NULL);
				setState(413);
				match(VALUES);
				setState(414);
				sourceName();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(415);
					columns();
					}
				}

				setState(418);
				match(KEY);
				setState(419);
				values();
				}
				break;
			case 3:
				_localctx = new AssertStreamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(ASSERT);
				setState(422);
				match(STREAM);
				setState(423);
				sourceName();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(424);
					tableElements();
					}
				}

				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(427);
					match(WITH);
					setState(428);
					tableProperties();
					}
				}

				}
				break;
			case 4:
				_localctx = new AssertTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				match(ASSERT);
				setState(432);
				match(TABLE);
				setState(433);
				sourceName();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(434);
					tableElements();
					}
				}

				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(437);
					match(WITH);
					setState(438);
					tableProperties();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RunScriptContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(KSqlParser.RUN, 0); }
		public TerminalNode SCRIPT() { return getToken(KSqlParser.SCRIPT, 0); }
		public TerminalNode STRING() { return getToken(KSqlParser.STRING, 0); }
		public RunScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runScript; }
	}

	public final RunScriptContext runScript() throws RecognitionException {
		RunScriptContext _localctx = new RunScriptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_runScript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(RUN);
			setState(444);
			match(SCRIPT);
			setState(445);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public RelationContext from;
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(KSqlParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TerminalNode FROM() { return getToken(KSqlParser.FROM, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode WINDOW() { return getToken(KSqlParser.WINDOW, 0); }
		public WindowExpressionContext windowExpression() {
			return getRuleContext(WindowExpressionContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(KSqlParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(KSqlParser.GROUP, 0); }
		public List<TerminalNode> BY() { return getTokens(KSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(KSqlParser.BY, i);
		}
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(KSqlParser.PARTITION, 0); }
		public PartitionByContext partitionBy() {
			return getRuleContext(PartitionByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(KSqlParser.HAVING, 0); }
		public TerminalNode EMIT() { return getToken(KSqlParser.EMIT, 0); }
		public ResultMaterializationContext resultMaterialization() {
			return getRuleContext(ResultMaterializationContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(SELECT);
			setState(448);
			selectItem();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(449);
				match(T__1);
				setState(450);
				selectItem();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(FROM);
			setState(457);
			((QueryContext)_localctx).from = relation();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(458);
				match(WINDOW);
				setState(459);
				windowExpression();
				}
			}

			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(462);
				match(WHERE);
				setState(463);
				((QueryContext)_localctx).where = booleanExpression(0);
				}
			}

			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(466);
				match(GROUP);
				setState(467);
				match(BY);
				setState(468);
				groupBy();
				}
			}

			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(471);
				match(PARTITION);
				setState(472);
				match(BY);
				setState(473);
				partitionBy();
				}
			}

			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(476);
				match(HAVING);
				setState(477);
				((QueryContext)_localctx).having = booleanExpression(0);
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EMIT) {
				{
				setState(480);
				match(EMIT);
				setState(481);
				resultMaterialization();
				}
			}

			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(484);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultMaterializationContext extends ParserRuleContext {
		public TerminalNode CHANGES() { return getToken(KSqlParser.CHANGES, 0); }
		public TerminalNode FINAL() { return getToken(KSqlParser.FINAL, 0); }
		public ResultMaterializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultMaterialization; }
	}

	public final ResultMaterializationContext resultMaterialization() throws RecognitionException {
		ResultMaterializationContext _localctx = new ResultMaterializationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_resultMaterialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if ( !(_la==CHANGES || _la==FINAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterOptionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(KSqlParser.ADD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SqltypeContext sqltype() {
			return getRuleContext(SqltypeContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(KSqlParser.COLUMN, 0); }
		public AlterOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterOption; }
	}

	public final AlterOptionContext alterOption() throws RecognitionException {
		AlterOptionContext _localctx = new AlterOptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alterOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(ADD);
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(490);
				match(COLUMN);
				}
				break;
			}
			setState(493);
			identifier();
			setState(494);
			sqltype(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableElementsContext extends ParserRuleContext {
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TableElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElements; }
	}

	public final TableElementsContext tableElements() throws RecognitionException {
		TableElementsContext _localctx = new TableElementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tableElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(T__2);
			setState(497);
			tableElement();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(498);
				match(T__1);
				setState(499);
				tableElement();
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SqltypeContext sqltype() {
			return getRuleContext(SqltypeContext.class,0);
		}
		public TerminalNode KEY() { return getToken(KSqlParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(KSqlParser.PRIMARY, 0); }
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			identifier();
			setState(508);
			sqltype(0);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY || _la==PRIMARY) {
				{
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIMARY) {
					{
					setState(509);
					match(PRIMARY);
					}
				}

				setState(512);
				match(KEY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertiesContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperties; }
	}

	public final TablePropertiesContext tableProperties() throws RecognitionException {
		TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__2);
			setState(516);
			tableProperty();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(517);
				match(T__1);
				setState(518);
				tableProperty();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(KSqlParser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KSqlParser.STRING, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case EMIT:
			case CHANGES:
			case FINAL:
			case ESCAPE:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case PARTITION:
			case STRUCT:
			case EXPLAIN:
			case ANALYZE:
			case TYPE:
			case TYPES:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case PARTITIONS:
			case FUNCTIONS:
			case FUNCTION:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case KEY:
			case SINK:
			case SOURCE:
			case PRIMARY:
			case REPLACE:
			case ASSERT:
			case ADD:
			case ALTER:
			case IF:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case VARIABLE:
				{
				setState(526);
				identifier();
				}
				break;
			case STRING:
				{
				setState(527);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(530);
			match(EQ);
			setState(531);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(KSqlParser.FROM, 0); }
		public TerminalNode BEGINNING() { return getToken(KSqlParser.BEGINNING, 0); }
		public IntervalClauseContext intervalClause() {
			return getRuleContext(IntervalClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public PrintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printClause; }
	}

	public final PrintClauseContext printClause() throws RecognitionException {
		PrintClauseContext _localctx = new PrintClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(533);
				match(FROM);
				setState(534);
				match(BEGINNING);
				}
			}

			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERVAL || _la==SAMPLE) {
				{
				setState(537);
				intervalClause();
				}
			}

			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(540);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalClauseContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode INTERVAL() { return getToken(KSqlParser.INTERVAL, 0); }
		public TerminalNode SAMPLE() { return getToken(KSqlParser.SAMPLE, 0); }
		public IntervalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalClause; }
	}

	public final IntervalClauseContext intervalClause() throws RecognitionException {
		IntervalClauseContext _localctx = new IntervalClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_intervalClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ( !(_la==INTERVAL || _la==SAMPLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(544);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(KSqlParser.LIMIT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(LIMIT);
			setState(547);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetentionClauseContext extends ParserRuleContext {
		public TerminalNode RETENTION() { return getToken(KSqlParser.RETENTION, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WindowUnitContext windowUnit() {
			return getRuleContext(WindowUnitContext.class,0);
		}
		public RetentionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retentionClause; }
	}

	public final RetentionClauseContext retentionClause() throws RecognitionException {
		RetentionClauseContext _localctx = new RetentionClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_retentionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(RETENTION);
			setState(550);
			number();
			setState(551);
			windowUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GracePeriodClauseContext extends ParserRuleContext {
		public TerminalNode GRACE() { return getToken(KSqlParser.GRACE, 0); }
		public TerminalNode PERIOD() { return getToken(KSqlParser.PERIOD, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WindowUnitContext windowUnit() {
			return getRuleContext(WindowUnitContext.class,0);
		}
		public GracePeriodClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gracePeriodClause; }
	}

	public final GracePeriodClauseContext gracePeriodClause() throws RecognitionException {
		GracePeriodClauseContext _localctx = new GracePeriodClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_gracePeriodClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(GRACE);
			setState(554);
			match(PERIOD);
			setState(555);
			number();
			setState(556);
			windowUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowExpressionContext extends ParserRuleContext {
		public TumblingWindowExpressionContext tumblingWindowExpression() {
			return getRuleContext(TumblingWindowExpressionContext.class,0);
		}
		public HoppingWindowExpressionContext hoppingWindowExpression() {
			return getRuleContext(HoppingWindowExpressionContext.class,0);
		}
		public SessionWindowExpressionContext sessionWindowExpression() {
			return getRuleContext(SessionWindowExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KSqlParser.IDENTIFIER, 0); }
		public WindowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowExpression; }
	}

	public final WindowExpressionContext windowExpression() throws RecognitionException {
		WindowExpressionContext _localctx = new WindowExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_windowExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(558);
				match(IDENTIFIER);
				}
			}

			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TUMBLING:
				{
				setState(561);
				tumblingWindowExpression();
				}
				break;
			case HOPPING:
				{
				setState(562);
				hoppingWindowExpression();
				}
				break;
			case SESSION:
				{
				setState(563);
				sessionWindowExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TumblingWindowExpressionContext extends ParserRuleContext {
		public TerminalNode TUMBLING() { return getToken(KSqlParser.TUMBLING, 0); }
		public TerminalNode SIZE() { return getToken(KSqlParser.SIZE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WindowUnitContext windowUnit() {
			return getRuleContext(WindowUnitContext.class,0);
		}
		public RetentionClauseContext retentionClause() {
			return getRuleContext(RetentionClauseContext.class,0);
		}
		public GracePeriodClauseContext gracePeriodClause() {
			return getRuleContext(GracePeriodClauseContext.class,0);
		}
		public TumblingWindowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tumblingWindowExpression; }
	}

	public final TumblingWindowExpressionContext tumblingWindowExpression() throws RecognitionException {
		TumblingWindowExpressionContext _localctx = new TumblingWindowExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tumblingWindowExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(TUMBLING);
			setState(567);
			match(T__2);
			setState(568);
			match(SIZE);
			setState(569);
			number();
			setState(570);
			windowUnit();
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(571);
				match(T__1);
				setState(572);
				retentionClause();
				}
				break;
			}
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(575);
				match(T__1);
				setState(576);
				gracePeriodClause();
				}
			}

			setState(579);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HoppingWindowExpressionContext extends ParserRuleContext {
		public TerminalNode HOPPING() { return getToken(KSqlParser.HOPPING, 0); }
		public TerminalNode SIZE() { return getToken(KSqlParser.SIZE, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<WindowUnitContext> windowUnit() {
			return getRuleContexts(WindowUnitContext.class);
		}
		public WindowUnitContext windowUnit(int i) {
			return getRuleContext(WindowUnitContext.class,i);
		}
		public TerminalNode ADVANCE() { return getToken(KSqlParser.ADVANCE, 0); }
		public TerminalNode BY() { return getToken(KSqlParser.BY, 0); }
		public RetentionClauseContext retentionClause() {
			return getRuleContext(RetentionClauseContext.class,0);
		}
		public GracePeriodClauseContext gracePeriodClause() {
			return getRuleContext(GracePeriodClauseContext.class,0);
		}
		public HoppingWindowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hoppingWindowExpression; }
	}

	public final HoppingWindowExpressionContext hoppingWindowExpression() throws RecognitionException {
		HoppingWindowExpressionContext _localctx = new HoppingWindowExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_hoppingWindowExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(HOPPING);
			setState(582);
			match(T__2);
			setState(583);
			match(SIZE);
			setState(584);
			number();
			setState(585);
			windowUnit();
			setState(586);
			match(T__1);
			setState(587);
			match(ADVANCE);
			setState(588);
			match(BY);
			setState(589);
			number();
			setState(590);
			windowUnit();
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(591);
				match(T__1);
				setState(592);
				retentionClause();
				}
				break;
			}
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(595);
				match(T__1);
				setState(596);
				gracePeriodClause();
				}
			}

			setState(599);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SessionWindowExpressionContext extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(KSqlParser.SESSION, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WindowUnitContext windowUnit() {
			return getRuleContext(WindowUnitContext.class,0);
		}
		public RetentionClauseContext retentionClause() {
			return getRuleContext(RetentionClauseContext.class,0);
		}
		public GracePeriodClauseContext gracePeriodClause() {
			return getRuleContext(GracePeriodClauseContext.class,0);
		}
		public SessionWindowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sessionWindowExpression; }
	}

	public final SessionWindowExpressionContext sessionWindowExpression() throws RecognitionException {
		SessionWindowExpressionContext _localctx = new SessionWindowExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sessionWindowExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(SESSION);
			setState(602);
			match(T__2);
			setState(603);
			number();
			setState(604);
			windowUnit();
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(605);
				match(T__1);
				setState(606);
				retentionClause();
				}
				break;
			}
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(609);
				match(T__1);
				setState(610);
				gracePeriodClause();
				}
			}

			setState(613);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowUnitContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(KSqlParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(KSqlParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(KSqlParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(KSqlParser.SECOND, 0); }
		public TerminalNode MILLISECOND() { return getToken(KSqlParser.MILLISECOND, 0); }
		public TerminalNode DAYS() { return getToken(KSqlParser.DAYS, 0); }
		public TerminalNode HOURS() { return getToken(KSqlParser.HOURS, 0); }
		public TerminalNode MINUTES() { return getToken(KSqlParser.MINUTES, 0); }
		public TerminalNode SECONDS() { return getToken(KSqlParser.SECONDS, 0); }
		public TerminalNode MILLISECONDS() { return getToken(KSqlParser.MILLISECONDS, 0); }
		public WindowUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowUnit; }
	}

	public final WindowUnitContext windowUnit() throws RecognitionException {
		WindowUnitContext _localctx = new WindowUnitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_windowUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << MILLISECOND) | (1L << DAYS) | (1L << HOURS) | (1L << MINUTES) | (1L << SECONDS) | (1L << MILLISECONDS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByContext extends ParserRuleContext {
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_groupBy);
		int _la;
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				valueExpression(0);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(618);
					match(T__1);
					setState(619);
					valueExpression(0);
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(T__2);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << EMIT) | (1L << CHANGES) | (1L << FINAL) | (1L << ESCAPE) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CASE - 64)) | (1L << (PARTITION - 64)) | (1L << (STRUCT - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (TYPE - 64)) | (1L << (TYPES - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (FUNCTION - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (SESSION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KEY - 128)) | (1L << (SINK - 128)) | (1L << (SOURCE - 128)) | (1L << (PRIMARY - 128)) | (1L << (REPLACE - 128)) | (1L << (ASSERT - 128)) | (1L << (ADD - 128)) | (1L << (ALTER - 128)) | (1L << (IF - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (STRING - 128)) | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128)) | (1L << (FLOATING_POINT_VALUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (DIGIT_IDENTIFIER - 128)) | (1L << (QUOTED_IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
					{
					setState(626);
					valueExpression(0);
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(627);
						match(T__1);
						setState(628);
						valueExpression(0);
						}
						}
						setState(633);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(636);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionByContext extends ParserRuleContext {
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PartitionByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionBy; }
	}

	public final PartitionByContext partitionBy() throws RecognitionException {
		PartitionByContext _localctx = new PartitionByContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_partitionBy);
		int _la;
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				valueExpression(0);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(640);
					match(T__1);
					setState(641);
					valueExpression(0);
					}
					}
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(T__2);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << EMIT) | (1L << CHANGES) | (1L << FINAL) | (1L << ESCAPE) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CASE - 64)) | (1L << (PARTITION - 64)) | (1L << (STRUCT - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (TYPE - 64)) | (1L << (TYPES - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (FUNCTION - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (SESSION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KEY - 128)) | (1L << (SINK - 128)) | (1L << (SOURCE - 128)) | (1L << (PRIMARY - 128)) | (1L << (REPLACE - 128)) | (1L << (ASSERT - 128)) | (1L << (ADD - 128)) | (1L << (ALTER - 128)) | (1L << (IF - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (STRING - 128)) | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128)) | (1L << (FLOATING_POINT_VALUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (DIGIT_IDENTIFIER - 128)) | (1L << (QUOTED_IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
					{
					setState(648);
					valueExpression(0);
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(649);
						match(T__1);
						setState(650);
						valueExpression(0);
						}
						}
						setState(655);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(658);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(T__2);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << EMIT) | (1L << CHANGES) | (1L << FINAL) | (1L << ESCAPE) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CASE - 64)) | (1L << (PARTITION - 64)) | (1L << (STRUCT - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (TYPE - 64)) | (1L << (TYPES - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (FUNCTION - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (SESSION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KEY - 128)) | (1L << (SINK - 128)) | (1L << (SOURCE - 128)) | (1L << (PRIMARY - 128)) | (1L << (REPLACE - 128)) | (1L << (ASSERT - 128)) | (1L << (ADD - 128)) | (1L << (ALTER - 128)) | (1L << (IF - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (STRING - 128)) | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128)) | (1L << (FLOATING_POINT_VALUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (DIGIT_IDENTIFIER - 128)) | (1L << (QUOTED_IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
				{
				setState(662);
				valueExpression(0);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(663);
					match(T__1);
					setState(664);
					valueExpression(0);
					}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(672);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(KSqlParser.ASTERISK, 0); }
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(KSqlParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_selectItem);
		int _la;
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				expression();
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << EMIT) | (1L << CHANGES) | (1L << FINAL) | (1L << AS) | (1L << ESCAPE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PARTITION - 76)) | (1L << (STRUCT - 76)) | (1L << (EXPLAIN - 76)) | (1L << (ANALYZE - 76)) | (1L << (TYPE - 76)) | (1L << (TYPES - 76)) | (1L << (SHOW - 76)) | (1L << (TABLES - 76)) | (1L << (COLUMNS - 76)) | (1L << (COLUMN - 76)) | (1L << (PARTITIONS - 76)) | (1L << (FUNCTIONS - 76)) | (1L << (FUNCTION - 76)) | (1L << (ARRAY - 76)) | (1L << (MAP - 76)) | (1L << (SET - 76)) | (1L << (RESET - 76)) | (1L << (SESSION - 76)) | (1L << (KEY - 76)) | (1L << (SINK - 76)) | (1L << (SOURCE - 76)) | (1L << (PRIMARY - 76)) | (1L << (REPLACE - 76)) | (1L << (ASSERT - 76)) | (1L << (ADD - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (ALTER - 140)) | (1L << (IF - 140)) | (1L << (IDENTIFIER - 140)) | (1L << (DIGIT_IDENTIFIER - 140)) | (1L << (QUOTED_IDENTIFIER - 140)) | (1L << (BACKQUOTED_IDENTIFIER - 140)) | (1L << (VARIABLE - 140)))) != 0)) {
					{
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(675);
						match(AS);
						}
					}

					setState(678);
					identifier();
					}
				}

				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				identifier();
				setState(682);
				match(T__4);
				setState(683);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				match(ASTERISK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
	}
	public static class JoinRelationContext extends RelationContext {
		public AliasedRelationContext left;
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public List<JoinedSourceContext> joinedSource() {
			return getRuleContexts(JoinedSourceContext.class);
		}
		public JoinedSourceContext joinedSource(int i) {
			return getRuleContext(JoinedSourceContext.class,i);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_relation);
		int _la;
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new JoinRelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				((JoinRelationContext)_localctx).left = aliasedRelation();
				setState(690); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(689);
					joinedSource();
					}
					}
					setState(692); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (JOIN - 69)) | (1L << (FULL - 69)) | (1L << (INNER - 69)) | (1L << (LEFT - 69)))) != 0) );
				}
				break;
			case 2:
				_localctx = new RelationDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				aliasedRelation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinedSourceContext extends ParserRuleContext {
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(KSqlParser.JOIN, 0); }
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public JoinWindowContext joinWindow() {
			return getRuleContext(JoinWindowContext.class,0);
		}
		public JoinedSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedSource; }
	}

	public final JoinedSourceContext joinedSource() throws RecognitionException {
		JoinedSourceContext _localctx = new JoinedSourceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_joinedSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			joinType();
			setState(698);
			match(JOIN);
			setState(699);
			aliasedRelation();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITHIN) {
				{
				setState(700);
				joinWindow();
				}
			}

			setState(703);
			joinCriteria();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
	 
		public JoinTypeContext() { }
		public void copyFrom(JoinTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InnerJoinContext extends JoinTypeContext {
		public TerminalNode INNER() { return getToken(KSqlParser.INNER, 0); }
		public InnerJoinContext(JoinTypeContext ctx) { copyFrom(ctx); }
	}
	public static class LeftJoinContext extends JoinTypeContext {
		public TerminalNode LEFT() { return getToken(KSqlParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(KSqlParser.OUTER, 0); }
		public LeftJoinContext(JoinTypeContext ctx) { copyFrom(ctx); }
	}
	public static class OuterJoinContext extends JoinTypeContext {
		public TerminalNode FULL() { return getToken(KSqlParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(KSqlParser.OUTER, 0); }
		public OuterJoinContext(JoinTypeContext ctx) { copyFrom(ctx); }
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_joinType);
		int _la;
		try {
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				_localctx = new InnerJoinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(705);
					match(INNER);
					}
				}

				}
				break;
			case FULL:
				_localctx = new OuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				match(FULL);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(709);
					match(OUTER);
					}
				}

				}
				break;
			case LEFT:
				_localctx = new LeftJoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				match(LEFT);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(713);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinWindowContext extends ParserRuleContext {
		public TerminalNode WITHIN() { return getToken(KSqlParser.WITHIN, 0); }
		public WithinExpressionContext withinExpression() {
			return getRuleContext(WithinExpressionContext.class,0);
		}
		public JoinWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinWindow; }
	}

	public final JoinWindowContext joinWindow() throws RecognitionException {
		JoinWindowContext _localctx = new JoinWindowContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_joinWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(WITHIN);
			setState(719);
			withinExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithinExpressionContext extends ParserRuleContext {
		public WithinExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withinExpression; }
	 
		public WithinExpressionContext() { }
		public void copyFrom(WithinExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleJoinWindowContext extends WithinExpressionContext {
		public JoinWindowSizeContext joinWindowSize() {
			return getRuleContext(JoinWindowSizeContext.class,0);
		}
		public GracePeriodClauseContext gracePeriodClause() {
			return getRuleContext(GracePeriodClauseContext.class,0);
		}
		public SingleJoinWindowContext(WithinExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class JoinWindowWithBeforeAndAfterContext extends WithinExpressionContext {
		public List<JoinWindowSizeContext> joinWindowSize() {
			return getRuleContexts(JoinWindowSizeContext.class);
		}
		public JoinWindowSizeContext joinWindowSize(int i) {
			return getRuleContext(JoinWindowSizeContext.class,i);
		}
		public GracePeriodClauseContext gracePeriodClause() {
			return getRuleContext(GracePeriodClauseContext.class,0);
		}
		public JoinWindowWithBeforeAndAfterContext(WithinExpressionContext ctx) { copyFrom(ctx); }
	}

	public final WithinExpressionContext withinExpression() throws RecognitionException {
		WithinExpressionContext _localctx = new WithinExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_withinExpression);
		int _la;
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new JoinWindowWithBeforeAndAfterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				match(T__2);
				setState(722);
				joinWindowSize();
				setState(723);
				match(T__1);
				setState(724);
				joinWindowSize();
				setState(725);
				match(T__3);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRACE) {
					{
					setState(726);
					gracePeriodClause();
					}
				}

				}
				break;
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case FLOATING_POINT_VALUE:
				_localctx = new SingleJoinWindowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				joinWindowSize();
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRACE) {
					{
					setState(730);
					gracePeriodClause();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinWindowSizeContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WindowUnitContext windowUnit() {
			return getRuleContext(WindowUnitContext.class,0);
		}
		public JoinWindowSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinWindowSize; }
	}

	public final JoinWindowSizeContext joinWindowSize() throws RecognitionException {
		JoinWindowSizeContext _localctx = new JoinWindowSizeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_joinWindowSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			number();
			setState(736);
			windowUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(KSqlParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_joinCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(ON);
			setState(739);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(KSqlParser.AS, 0); }
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			relationPrimary();
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(742);
					match(AS);
					}
				}

				setState(745);
				sourceName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(T__2);
			setState(749);
			identifier();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(750);
				match(T__1);
				setState(751);
				identifier();
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(757);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_relationPrimary);
		try {
			_localctx = new TableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			sourceName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(KSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(KSqlParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__7:
			case EMIT:
			case CHANGES:
			case FINAL:
			case ESCAPE:
			case NULL:
			case TRUE:
			case FALSE:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case CASE:
			case PARTITION:
			case STRUCT:
			case EXPLAIN:
			case ANALYZE:
			case TYPE:
			case TYPES:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case PARTITIONS:
			case FUNCTIONS:
			case FUNCTION:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case KEY:
			case SINK:
			case SOURCE:
			case PRIMARY:
			case REPLACE:
			case ASSERT:
			case ADD:
			case ALTER:
			case IF:
			case PLUS:
			case MINUS:
			case STRING:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case FLOATING_POINT_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case VARIABLE:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(764);
				predicated();
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(765);
				match(NOT);
				setState(766);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(775);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(769);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(770);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(771);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(772);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(773);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(774);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			((PredicatedContext)_localctx).valueExpression = valueExpression(0);
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(781);
				predicate(((PredicatedContext)_localctx).valueExpression);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public Token escape;
		public TerminalNode LIKE() { return getToken(KSqlParser.LIKE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(KSqlParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(KSqlParser.STRING, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(KSqlParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(KSqlParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(KSqlParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(KSqlParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(KSqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(KSqlParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(KSqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(KSqlParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(KSqlParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 82, RULE_predicate);
		int _la;
		try {
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				comparisonOperator();
				setState(785);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(787);
					match(NOT);
					}
				}

				setState(790);
				match(BETWEEN);
				setState(791);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(792);
				match(AND);
				setState(793);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 3:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(795);
					match(NOT);
					}
				}

				setState(798);
				match(IN);
				setState(799);
				match(T__2);
				setState(800);
				expression();
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(801);
					match(T__1);
					setState(802);
					expression();
					}
					}
					setState(807);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(808);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(810);
					match(NOT);
					}
				}

				setState(813);
				match(LIKE);
				setState(814);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(817);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(815);
					match(ESCAPE);
					setState(816);
					((LikeContext)_localctx).escape = match(STRING);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(819);
				match(IS);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(820);
					match(NOT);
					}
				}

				setState(823);
				match(NULL);
				}
				break;
			case 6:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(824);
				match(IS);
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(825);
					match(NOT);
					}
				}

				setState(828);
				match(DISTINCT);
				setState(829);
				match(FROM);
				setState(830);
				((DistinctFromContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(KSqlParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(KSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(KSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(KSqlParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(KSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KSqlParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(KSqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(KSqlParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(KSqlParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(834);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(835);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(836);
				valueExpression(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(853);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(851);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(839);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(840);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (ASTERISK - 152)) | (1L << (SLASH - 152)) | (1L << (PERCENT - 152)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(841);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(842);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(843);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(844);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(845);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(846);
						match(CONCAT);
						setState(847);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(848);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(849);
						match(AT);
						setState(850);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public TerminalNode STRUCT_FIELD_REF() { return getToken(KSqlParser.STRUCT_FIELD_REF, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(KSqlParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(KSqlParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(KSqlParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StructConstructorContext extends PrimaryExpressionContext {
		public TerminalNode STRUCT() { return getToken(KSqlParser.STRUCT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(KSqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(KSqlParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StructConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KSqlParser.STRING, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class QualifiedColumnReferenceContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(KSqlParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(KSqlParser.AS, 0); }
		public SqltypeContext sqltype() {
			return getRuleContext(SqltypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(KSqlParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MapConstructorContext extends PrimaryExpressionContext {
		public TerminalNode MAP() { return getToken(KSqlParser.MAP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(KSqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(KSqlParser.ASSIGN, i);
		}
		public MapConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(KSqlParser.ASTERISK, 0); }
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
		}
		public List<LambdaFunctionContext> lambdaFunction() {
			return getRuleContexts(LambdaFunctionContext.class);
		}
		public LambdaFunctionContext lambdaFunction(int i) {
			return getRuleContext(LambdaFunctionContext.class,i);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(KSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(KSqlParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(KSqlParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends PrimaryExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(857);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(858);
				identifier();
				setState(859);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(861);
				match(CASE);
				setState(862);
				valueExpression(0);
				setState(864); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(863);
					whenClause();
					}
					}
					setState(866); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(868);
					match(ELSE);
					setState(869);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(872);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(874);
				match(CASE);
				setState(876); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(875);
					whenClause();
					}
					}
					setState(878); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(880);
					match(ELSE);
					setState(881);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(884);
				match(END);
				}
				break;
			case 5:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(886);
				match(CAST);
				setState(887);
				match(T__2);
				setState(888);
				expression();
				setState(889);
				match(AS);
				setState(890);
				sqltype(0);
				setState(891);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(893);
				match(ARRAY);
				setState(894);
				match(T__5);
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << EMIT) | (1L << CHANGES) | (1L << FINAL) | (1L << NOT) | (1L << ESCAPE) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CASE - 64)) | (1L << (PARTITION - 64)) | (1L << (STRUCT - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (TYPE - 64)) | (1L << (TYPES - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (FUNCTION - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (SESSION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KEY - 128)) | (1L << (SINK - 128)) | (1L << (SOURCE - 128)) | (1L << (PRIMARY - 128)) | (1L << (REPLACE - 128)) | (1L << (ASSERT - 128)) | (1L << (ADD - 128)) | (1L << (ALTER - 128)) | (1L << (IF - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (STRING - 128)) | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128)) | (1L << (FLOATING_POINT_VALUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (DIGIT_IDENTIFIER - 128)) | (1L << (QUOTED_IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
					{
					setState(895);
					expression();
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(896);
						match(T__1);
						setState(897);
						expression();
						}
						}
						setState(902);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(905);
				match(T__6);
				}
				break;
			case 7:
				{
				_localctx = new MapConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(906);
				match(MAP);
				setState(907);
				match(T__2);
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << EMIT) | (1L << CHANGES) | (1L << FINAL) | (1L << NOT) | (1L << ESCAPE) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CASE - 64)) | (1L << (PARTITION - 64)) | (1L << (STRUCT - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (TYPE - 64)) | (1L << (TYPES - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (FUNCTION - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (SESSION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KEY - 128)) | (1L << (SINK - 128)) | (1L << (SOURCE - 128)) | (1L << (PRIMARY - 128)) | (1L << (REPLACE - 128)) | (1L << (ASSERT - 128)) | (1L << (ADD - 128)) | (1L << (ALTER - 128)) | (1L << (IF - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (STRING - 128)) | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128)) | (1L << (FLOATING_POINT_VALUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (DIGIT_IDENTIFIER - 128)) | (1L << (QUOTED_IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
					{
					setState(908);
					expression();
					setState(909);
					match(ASSIGN);
					setState(910);
					expression();
					setState(918);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(911);
						match(T__1);
						setState(912);
						expression();
						setState(913);
						match(ASSIGN);
						setState(914);
						expression();
						}
						}
						setState(920);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(923);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new StructConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(924);
				match(STRUCT);
				setState(925);
				match(T__2);
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << EMIT) | (1L << CHANGES) | (1L << FINAL) | (1L << ESCAPE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PARTITION - 76)) | (1L << (STRUCT - 76)) | (1L << (EXPLAIN - 76)) | (1L << (ANALYZE - 76)) | (1L << (TYPE - 76)) | (1L << (TYPES - 76)) | (1L << (SHOW - 76)) | (1L << (TABLES - 76)) | (1L << (COLUMNS - 76)) | (1L << (COLUMN - 76)) | (1L << (PARTITIONS - 76)) | (1L << (FUNCTIONS - 76)) | (1L << (FUNCTION - 76)) | (1L << (ARRAY - 76)) | (1L << (MAP - 76)) | (1L << (SET - 76)) | (1L << (RESET - 76)) | (1L << (SESSION - 76)) | (1L << (KEY - 76)) | (1L << (SINK - 76)) | (1L << (SOURCE - 76)) | (1L << (PRIMARY - 76)) | (1L << (REPLACE - 76)) | (1L << (ASSERT - 76)) | (1L << (ADD - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (ALTER - 140)) | (1L << (IF - 140)) | (1L << (IDENTIFIER - 140)) | (1L << (DIGIT_IDENTIFIER - 140)) | (1L << (QUOTED_IDENTIFIER - 140)) | (1L << (BACKQUOTED_IDENTIFIER - 140)) | (1L << (VARIABLE - 140)))) != 0)) {
					{
					setState(926);
					identifier();
					setState(927);
					match(ASSIGN);
					setState(928);
					expression();
					setState(936);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(929);
						match(T__1);
						setState(930);
						identifier();
						setState(931);
						match(ASSIGN);
						setState(932);
						expression();
						}
						}
						setState(938);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(941);
				match(T__3);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(942);
				identifier();
				setState(943);
				match(T__2);
				setState(944);
				match(ASTERISK);
				setState(945);
				match(T__3);
				}
				break;
			case 10:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(947);
				identifier();
				setState(948);
				match(T__2);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << EMIT) | (1L << CHANGES) | (1L << FINAL) | (1L << NOT) | (1L << ESCAPE) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << MILLISECOND) | (1L << DAYS) | (1L << HOURS) | (1L << MINUTES) | (1L << SECONDS) | (1L << MILLISECONDS) | (1L << ZONE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CASE - 64)) | (1L << (PARTITION - 64)) | (1L << (STRUCT - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (TYPE - 64)) | (1L << (TYPES - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (FUNCTION - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (SESSION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KEY - 128)) | (1L << (SINK - 128)) | (1L << (SOURCE - 128)) | (1L << (PRIMARY - 128)) | (1L << (REPLACE - 128)) | (1L << (ASSERT - 128)) | (1L << (ADD - 128)) | (1L << (ALTER - 128)) | (1L << (IF - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (STRING - 128)) | (1L << (INTEGER_VALUE - 128)) | (1L << (DECIMAL_VALUE - 128)) | (1L << (FLOATING_POINT_VALUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (DIGIT_IDENTIFIER - 128)) | (1L << (QUOTED_IDENTIFIER - 128)) | (1L << (BACKQUOTED_IDENTIFIER - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
					{
					setState(949);
					functionArgument();
					setState(954);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(950);
							match(T__1);
							setState(951);
							functionArgument();
							}
							} 
						}
						setState(956);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					}
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(957);
						match(T__1);
						setState(958);
						lambdaFunction();
						}
						}
						setState(963);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(966);
				match(T__3);
				}
				break;
			case 11:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(968);
				identifier();
				}
				break;
			case 12:
				{
				_localctx = new QualifiedColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(969);
				identifier();
				setState(970);
				match(T__4);
				setState(971);
				identifier();
				}
				break;
			case 13:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(973);
				match(T__2);
				setState(974);
				expression();
				setState(975);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(987);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(979);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(980);
						match(T__5);
						setState(981);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(982);
						match(T__6);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(984);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(985);
						match(STRUCT_FIELD_REF);
						setState(986);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WindowUnitContext windowUnit() {
			return getRuleContext(WindowUnitContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionArgument);
		try {
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				windowUnit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(KSqlParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(KSqlParser.ZONE, 0); }
		public TerminalNode STRING() { return getToken(KSqlParser.STRING, 0); }
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_timeZoneSpecifier);
		try {
			_localctx = new TimeZoneStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(TIME);
			setState(997);
			match(ZONE);
			setState(998);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(KSqlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(KSqlParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(KSqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(KSqlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(KSqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(KSqlParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			_la = _input.LA(1);
			if ( !(((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (EQ - 144)) | (1L << (NEQ - 144)) | (1L << (LT - 144)) | (1L << (LTE - 144)) | (1L << (GT - 144)) | (1L << (GTE - 144)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(KSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KSqlParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqltypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(KSqlParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(KSqlParser.LT, 0); }
		public List<SqltypeContext> sqltype() {
			return getRuleContexts(SqltypeContext.class);
		}
		public SqltypeContext sqltype(int i) {
			return getRuleContext(SqltypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(KSqlParser.GT, 0); }
		public TerminalNode MAP() { return getToken(KSqlParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(KSqlParser.STRUCT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DECIMAL() { return getToken(KSqlParser.DECIMAL, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public SqltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqltype; }
	}

	public final SqltypeContext sqltype() throws RecognitionException {
		return sqltype(0);
	}

	private SqltypeContext sqltype(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SqltypeContext _localctx = new SqltypeContext(_ctx, _parentState);
		SqltypeContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_sqltype, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1005);
				match(ARRAY);
				setState(1006);
				match(LT);
				setState(1007);
				sqltype(0);
				setState(1008);
				match(GT);
				}
				break;
			case 2:
				{
				setState(1010);
				match(MAP);
				setState(1011);
				match(LT);
				setState(1012);
				sqltype(0);
				setState(1013);
				match(T__1);
				setState(1014);
				sqltype(0);
				setState(1015);
				match(GT);
				}
				break;
			case 3:
				{
				setState(1017);
				match(STRUCT);
				setState(1018);
				match(LT);
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << EMIT) | (1L << CHANGES) | (1L << FINAL) | (1L << ESCAPE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PARTITION - 76)) | (1L << (STRUCT - 76)) | (1L << (EXPLAIN - 76)) | (1L << (ANALYZE - 76)) | (1L << (TYPE - 76)) | (1L << (TYPES - 76)) | (1L << (SHOW - 76)) | (1L << (TABLES - 76)) | (1L << (COLUMNS - 76)) | (1L << (COLUMN - 76)) | (1L << (PARTITIONS - 76)) | (1L << (FUNCTIONS - 76)) | (1L << (FUNCTION - 76)) | (1L << (ARRAY - 76)) | (1L << (MAP - 76)) | (1L << (SET - 76)) | (1L << (RESET - 76)) | (1L << (SESSION - 76)) | (1L << (KEY - 76)) | (1L << (SINK - 76)) | (1L << (SOURCE - 76)) | (1L << (PRIMARY - 76)) | (1L << (REPLACE - 76)) | (1L << (ASSERT - 76)) | (1L << (ADD - 76)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (ALTER - 140)) | (1L << (IF - 140)) | (1L << (IDENTIFIER - 140)) | (1L << (DIGIT_IDENTIFIER - 140)) | (1L << (QUOTED_IDENTIFIER - 140)) | (1L << (BACKQUOTED_IDENTIFIER - 140)) | (1L << (VARIABLE - 140)))) != 0)) {
					{
					setState(1019);
					identifier();
					setState(1020);
					sqltype(0);
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1021);
						match(T__1);
						setState(1022);
						identifier();
						setState(1023);
						sqltype(0);
						}
						}
						setState(1029);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1032);
				match(GT);
				}
				break;
			case 4:
				{
				setState(1033);
				match(DECIMAL);
				setState(1034);
				match(T__2);
				setState(1035);
				number();
				setState(1036);
				match(T__1);
				setState(1037);
				number();
				setState(1038);
				match(T__3);
				}
				break;
			case 5:
				{
				setState(1040);
				baseType();
				setState(1052);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1041);
					match(T__2);
					setState(1042);
					typeParameter();
					setState(1047);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1043);
						match(T__1);
						setState(1044);
						typeParameter();
						}
						}
						setState(1049);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1050);
					match(T__3);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1060);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SqltypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sqltype);
					setState(1056);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(1057);
					match(ARRAY);
					}
					} 
				}
				setState(1062);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(KSqlParser.INTEGER_VALUE, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==INTEGER_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(KSqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(KSqlParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(WHEN);
			setState(1068);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1069);
			match(THEN);
			setState(1070);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableIdentifierContext extends IdentifierContext {
		public TerminalNode VARIABLE() { return getToken(KSqlParser.VARIABLE, 0); }
		public VariableIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(KSqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class QuotedIdentifierAlternativeContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(KSqlParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(KSqlParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(KSqlParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifier);
		try {
			setState(1078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				match(VARIABLE);
				}
				break;
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1074);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case T__7:
			case EMIT:
			case CHANGES:
			case FINAL:
			case ESCAPE:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case PARTITION:
			case STRUCT:
			case EXPLAIN:
			case ANALYZE:
			case TYPE:
			case TYPES:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case PARTITIONS:
			case FUNCTIONS:
			case FUNCTION:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case KEY:
			case SINK:
			case SOURCE:
			case PRIMARY:
			case REPLACE:
			case ASSERT:
			case ADD:
			case ALTER:
			case IF:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1075);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1076);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1077);
				match(DIGIT_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionContext extends ParserRuleContext {
		public LambdaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunction; }
	 
		public LambdaFunctionContext() { }
		public void copyFrom(LambdaFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LambdaContext extends LambdaFunctionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LAMBDA_EXPRESSION() { return getToken(KSqlParser.LAMBDA_EXPRESSION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(LambdaFunctionContext ctx) { copyFrom(ctx); }
	}

	public final LambdaFunctionContext lambdaFunction() throws RecognitionException {
		LambdaFunctionContext _localctx = new LambdaFunctionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_lambdaFunction);
		int _la;
		try {
			setState(1097);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case EMIT:
			case CHANGES:
			case FINAL:
			case ESCAPE:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case PARTITION:
			case STRUCT:
			case EXPLAIN:
			case ANALYZE:
			case TYPE:
			case TYPES:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case PARTITIONS:
			case FUNCTIONS:
			case FUNCTION:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case KEY:
			case SINK:
			case SOURCE:
			case PRIMARY:
			case REPLACE:
			case ASSERT:
			case ADD:
			case ALTER:
			case IF:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case VARIABLE:
				_localctx = new LambdaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				identifier();
				setState(1081);
				match(LAMBDA_EXPRESSION);
				setState(1082);
				expression();
				}
				break;
			case T__2:
				_localctx = new LambdaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(T__2);
				setState(1085);
				identifier();
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1086);
					match(T__1);
					setState(1087);
					identifier();
					}
					}
					setState(1092);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1093);
				match(T__3);
				setState(1094);
				match(LAMBDA_EXPRESSION);
				setState(1095);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KSqlParser.IDENTIFIER, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(KSqlParser.STRING, 0); }
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SourceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceName; }
	}

	public final SourceNameContext sourceName() throws RecognitionException {
		SourceNameContext _localctx = new SourceNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sourceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(KSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(KSqlParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOATING_POINT_VALUE() { return getToken(KSqlParser.FLOATING_POINT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(KSqlParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(KSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(KSqlParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_number);
		int _la;
		try {
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1105);
					match(MINUS);
					}
				}

				setState(1108);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1109);
					match(MINUS);
					}
				}

				setState(1112);
				match(FLOATING_POINT_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1113);
					match(MINUS);
					}
				}

				setState(1116);
				match(INTEGER_VALUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends LiteralContext {
		public TerminalNode NULL() { return getToken(KSqlParser.NULL, 0); }
		public NullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(KSqlParser.STRING, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class VariableLiteralContext extends LiteralContext {
		public TerminalNode VARIABLE() { return getToken(KSqlParser.VARIABLE, 0); }
		public VariableLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class NumericLiteralContext extends LiteralContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralContext extends LiteralContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_literal);
		try {
			setState(1124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1119);
				match(NULL);
				}
				break;
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case FLOATING_POINT_VALUE:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1121);
				booleanValue();
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1122);
				match(STRING);
				}
				break;
			case VARIABLE:
				_localctx = new VariableLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1123);
				match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(KSqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(KSqlParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(KSqlParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(KSqlParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(KSqlParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(KSqlParser.FUNCTIONS, 0); }
		public TerminalNode FUNCTION() { return getToken(KSqlParser.FUNCTION, 0); }
		public TerminalNode SESSION() { return getToken(KSqlParser.SESSION, 0); }
		public TerminalNode STRUCT() { return getToken(KSqlParser.STRUCT, 0); }
		public TerminalNode MAP() { return getToken(KSqlParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(KSqlParser.ARRAY, 0); }
		public TerminalNode PARTITION() { return getToken(KSqlParser.PARTITION, 0); }
		public TerminalNode INTEGER() { return getToken(KSqlParser.INTEGER, 0); }
		public TerminalNode DATE() { return getToken(KSqlParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(KSqlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(KSqlParser.TIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(KSqlParser.INTERVAL, 0); }
		public TerminalNode ZONE() { return getToken(KSqlParser.ZONE, 0); }
		public TerminalNode YEAR() { return getToken(KSqlParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(KSqlParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(KSqlParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(KSqlParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(KSqlParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(KSqlParser.SECOND, 0); }
		public TerminalNode EXPLAIN() { return getToken(KSqlParser.EXPLAIN, 0); }
		public TerminalNode ANALYZE() { return getToken(KSqlParser.ANALYZE, 0); }
		public TerminalNode TYPE() { return getToken(KSqlParser.TYPE, 0); }
		public TerminalNode TYPES() { return getToken(KSqlParser.TYPES, 0); }
		public TerminalNode SET() { return getToken(KSqlParser.SET, 0); }
		public TerminalNode RESET() { return getToken(KSqlParser.RESET, 0); }
		public TerminalNode IF() { return getToken(KSqlParser.IF, 0); }
		public TerminalNode SOURCE() { return getToken(KSqlParser.SOURCE, 0); }
		public TerminalNode SINK() { return getToken(KSqlParser.SINK, 0); }
		public TerminalNode PRIMARY() { return getToken(KSqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(KSqlParser.KEY, 0); }
		public TerminalNode EMIT() { return getToken(KSqlParser.EMIT, 0); }
		public TerminalNode CHANGES() { return getToken(KSqlParser.CHANGES, 0); }
		public TerminalNode FINAL() { return getToken(KSqlParser.FINAL, 0); }
		public TerminalNode ESCAPE() { return getToken(KSqlParser.ESCAPE, 0); }
		public TerminalNode REPLACE() { return getToken(KSqlParser.REPLACE, 0); }
		public TerminalNode ASSERT() { return getToken(KSqlParser.ASSERT, 0); }
		public TerminalNode ALTER() { return getToken(KSqlParser.ALTER, 0); }
		public TerminalNode ADD() { return getToken(KSqlParser.ADD, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << EMIT) | (1L << CHANGES) | (1L << FINAL) | (1L << ESCAPE) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << ZONE))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PARTITION - 76)) | (1L << (STRUCT - 76)) | (1L << (EXPLAIN - 76)) | (1L << (ANALYZE - 76)) | (1L << (TYPE - 76)) | (1L << (TYPES - 76)) | (1L << (SHOW - 76)) | (1L << (TABLES - 76)) | (1L << (COLUMNS - 76)) | (1L << (COLUMN - 76)) | (1L << (PARTITIONS - 76)) | (1L << (FUNCTIONS - 76)) | (1L << (FUNCTION - 76)) | (1L << (ARRAY - 76)) | (1L << (MAP - 76)) | (1L << (SET - 76)) | (1L << (RESET - 76)) | (1L << (SESSION - 76)) | (1L << (KEY - 76)) | (1L << (SINK - 76)) | (1L << (SOURCE - 76)) | (1L << (PRIMARY - 76)) | (1L << (REPLACE - 76)) | (1L << (ASSERT - 76)) | (1L << (ADD - 76)))) != 0) || _la==ALTER || _la==IF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 42:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 43:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 48:
			return sqltype_sempred((SqltypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sqltype_sempred(SqltypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00af\u046b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u008a\n\3\3\3\5\3\u008d\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u009a\n\6\3\6\3\6\5\6\u009e\n\6\3\6\3\6\3\6\5\6\u00a3\n\6\3\6"+
		"\3\6\3\6\5\6\u00a8\n\6\3\6\3\6\3\6\3\6\5\6\u00ae\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bb\n\6\3\6\3\6\3\6\5\6\u00c0\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cb\n\6\3\6\3\6\3\6\3\6\5\6\u00d1"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00e7\n\6\3\6\5\6\u00ea\n\6\3\6\3\6\3\6\3\6\5\6\u00f0"+
		"\n\6\3\6\3\6\5\6\u00f4\n\6\3\6\3\6\5\6\u00f8\n\6\3\6\3\6\3\6\5\6\u00fd"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u0103\n\6\3\6\3\6\3\6\5\6\u0108\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0110\n\6\3\6\5\6\u0113\n\6\3\6\3\6\3\6\3\6\5\6\u0119"+
		"\n\6\3\6\3\6\5\6\u011d\n\6\3\6\3\6\5\6\u0121\n\6\3\6\3\6\3\6\5\6\u0126"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u012c\n\6\3\6\3\6\3\6\5\6\u0131\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u013c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0147\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u014f\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0158\n\6\3\6\3\6\3\6\5\6\u015d\n\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0163\n\6\3\6\3\6\3\6\5\6\u0168\n\6\3\6\3\6\3\6\3\6\5\6\u016e\n"+
		"\6\3\6\3\6\3\6\3\6\5\6\u0174\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u017b\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0185\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u018e\n\6\f\6\16\6\u0191\13\6\5\6\u0193\n\6\3\7\3\7\3\7\3\7\5\7\u0199"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01a3\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u01ac\n\7\3\7\3\7\5\7\u01b0\n\7\3\7\3\7\3\7\3\7\5\7\u01b6"+
		"\n\7\3\7\3\7\5\7\u01ba\n\7\5\7\u01bc\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\7\t\u01c6\n\t\f\t\16\t\u01c9\13\t\3\t\3\t\3\t\3\t\5\t\u01cf\n\t\3\t"+
		"\3\t\5\t\u01d3\n\t\3\t\3\t\3\t\5\t\u01d8\n\t\3\t\3\t\3\t\5\t\u01dd\n\t"+
		"\3\t\3\t\5\t\u01e1\n\t\3\t\3\t\5\t\u01e5\n\t\3\t\5\t\u01e8\n\t\3\n\3\n"+
		"\3\13\3\13\5\13\u01ee\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u01f7\n"+
		"\f\f\f\16\f\u01fa\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u0201\n\r\3\r\5\r\u0204"+
		"\n\r\3\16\3\16\3\16\3\16\7\16\u020a\n\16\f\16\16\16\u020d\13\16\3\16\3"+
		"\16\3\17\3\17\5\17\u0213\n\17\3\17\3\17\3\17\3\20\3\20\5\20\u021a\n\20"+
		"\3\20\5\20\u021d\n\20\3\20\5\20\u0220\n\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\5\25\u0232\n\25"+
		"\3\25\3\25\3\25\5\25\u0237\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0240\n\26\3\26\3\26\5\26\u0244\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0254\n\27\3\27\3\27\5\27"+
		"\u0258\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0262\n\30\3"+
		"\30\3\30\5\30\u0266\n\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u026f"+
		"\n\32\f\32\16\32\u0272\13\32\3\32\3\32\3\32\3\32\7\32\u0278\n\32\f\32"+
		"\16\32\u027b\13\32\5\32\u027d\n\32\3\32\5\32\u0280\n\32\3\33\3\33\3\33"+
		"\7\33\u0285\n\33\f\33\16\33\u0288\13\33\3\33\3\33\3\33\3\33\7\33\u028e"+
		"\n\33\f\33\16\33\u0291\13\33\5\33\u0293\n\33\3\33\5\33\u0296\n\33\3\34"+
		"\3\34\3\34\3\34\7\34\u029c\n\34\f\34\16\34\u029f\13\34\5\34\u02a1\n\34"+
		"\3\34\3\34\3\35\3\35\5\35\u02a7\n\35\3\35\5\35\u02aa\n\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u02b1\n\35\3\36\3\36\6\36\u02b5\n\36\r\36\16\36\u02b6"+
		"\3\36\5\36\u02ba\n\36\3\37\3\37\3\37\3\37\5\37\u02c0\n\37\3\37\3\37\3"+
		" \5 \u02c5\n \3 \3 \5 \u02c9\n \3 \3 \5 \u02cd\n \5 \u02cf\n \3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02da\n\"\3\"\3\"\5\"\u02de\n\"\5\"\u02e0"+
		"\n\"\3#\3#\3#\3$\3$\3$\3%\3%\5%\u02ea\n%\3%\5%\u02ed\n%\3&\3&\3&\3&\7"+
		"&\u02f3\n&\f&\16&\u02f6\13&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\5)\u0302\n"+
		")\3)\3)\3)\3)\3)\3)\7)\u030a\n)\f)\16)\u030d\13)\3*\3*\5*\u0311\n*\3+"+
		"\3+\3+\3+\5+\u0317\n+\3+\3+\3+\3+\3+\3+\5+\u031f\n+\3+\3+\3+\3+\3+\7+"+
		"\u0326\n+\f+\16+\u0329\13+\3+\3+\3+\5+\u032e\n+\3+\3+\3+\3+\5+\u0334\n"+
		"+\3+\3+\5+\u0338\n+\3+\3+\3+\5+\u033d\n+\3+\3+\3+\5+\u0342\n+\3,\3,\3"+
		",\3,\5,\u0348\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0356\n,\f,\16"+
		",\u0359\13,\3-\3-\3-\3-\3-\3-\3-\3-\6-\u0363\n-\r-\16-\u0364\3-\3-\5-"+
		"\u0369\n-\3-\3-\3-\3-\6-\u036f\n-\r-\16-\u0370\3-\3-\5-\u0375\n-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0385\n-\f-\16-\u0388\13-\5-"+
		"\u038a\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0397\n-\f-\16-\u039a\13"+
		"-\5-\u039c\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u03a9\n-\f-\16-\u03ac"+
		"\13-\5-\u03ae\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u03bb\n-\f-\16-\u03be"+
		"\13-\3-\3-\7-\u03c2\n-\f-\16-\u03c5\13-\5-\u03c7\n-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\5-\u03d4\n-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u03de\n-\f-\16"+
		"-\u03e1\13-\3.\3.\5.\u03e5\n.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\7\62\u0404\n\62\f\62\16\62\u0407\13\62\5\62"+
		"\u0409\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\7\62\u0418\n\62\f\62\16\62\u041b\13\62\3\62\3\62\5\62\u041f\n\62"+
		"\5\62\u0421\n\62\3\62\3\62\7\62\u0425\n\62\f\62\16\62\u0428\13\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u0439\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0443\n"+
		"\67\f\67\16\67\u0446\13\67\3\67\3\67\3\67\3\67\5\67\u044c\n\67\38\38\3"+
		"9\39\3:\3:\3;\5;\u0455\n;\3;\3;\5;\u0459\n;\3;\3;\5;\u045d\n;\3;\5;\u0460"+
		"\n;\3<\3<\3<\3<\3<\5<\u0467\n<\3=\3=\3=\2\6PVXb>\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvx\2\16\3\2bc\3\2\u0085\u0086\4\2SSUU\3\2\f\r\4\2++yy\4\2.\62\659\3"+
		"\2\u0098\u0099\3\2\u009a\u009c\3\2\u0092\u0097\3\2%&\4\2\n\n\u00a2\u00a2"+
		"\21\2\n\r\"\"\'\61::NO]`bbddjnrtwx\u0082\u0082\u0085\u0086\u008a\u008e"+
		"\u0091\u0091\2\u0503\2}\3\2\2\2\4\u0089\3\2\2\2\6\u008e\3\2\2\2\b\u0091"+
		"\3\2\2\2\n\u0192\3\2\2\2\f\u01bb\3\2\2\2\16\u01bd\3\2\2\2\20\u01c1\3\2"+
		"\2\2\22\u01e9\3\2\2\2\24\u01eb\3\2\2\2\26\u01f2\3\2\2\2\30\u01fd\3\2\2"+
		"\2\32\u0205\3\2\2\2\34\u0212\3\2\2\2\36\u0219\3\2\2\2 \u0221\3\2\2\2\""+
		"\u0224\3\2\2\2$\u0227\3\2\2\2&\u022b\3\2\2\2(\u0231\3\2\2\2*\u0238\3\2"+
		"\2\2,\u0247\3\2\2\2.\u025b\3\2\2\2\60\u0269\3\2\2\2\62\u027f\3\2\2\2\64"+
		"\u0295\3\2\2\2\66\u0297\3\2\2\28\u02b0\3\2\2\2:\u02b9\3\2\2\2<\u02bb\3"+
		"\2\2\2>\u02ce\3\2\2\2@\u02d0\3\2\2\2B\u02df\3\2\2\2D\u02e1\3\2\2\2F\u02e4"+
		"\3\2\2\2H\u02e7\3\2\2\2J\u02ee\3\2\2\2L\u02f9\3\2\2\2N\u02fb\3\2\2\2P"+
		"\u0301\3\2\2\2R\u030e\3\2\2\2T\u0341\3\2\2\2V\u0347\3\2\2\2X\u03d3\3\2"+
		"\2\2Z\u03e4\3\2\2\2\\\u03e6\3\2\2\2^\u03ea\3\2\2\2`\u03ec\3\2\2\2b\u0420"+
		"\3\2\2\2d\u0429\3\2\2\2f\u042b\3\2\2\2h\u042d\3\2\2\2j\u0438\3\2\2\2l"+
		"\u044b\3\2\2\2n\u044d\3\2\2\2p\u044f\3\2\2\2r\u0451\3\2\2\2t\u045f\3\2"+
		"\2\2v\u0466\3\2\2\2x\u0468\3\2\2\2z|\5\6\4\2{z\3\2\2\2|\177\3\2\2\2}{"+
		"\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\2\2\3\u0081"+
		"\3\3\2\2\2\u0082\u008a\5\6\4\2\u0083\u0084\5\f\7\2\u0084\u0085\7\3\2\2"+
		"\u0085\u008a\3\2\2\2\u0086\u0087\5\16\b\2\u0087\u0088\7\3\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u008d\7\2\2\3\u008c\u008b\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\5\3\2\2\2\u008e\u008f\5\n\6\2\u008f\u0090\7\3\2\2\u0090\7\3"+
		"\2\2\2\u0091\u0092\5N(\2\u0092\u0093\7\2\2\3\u0093\t\3\2\2\2\u0094\u0193"+
		"\5\20\t\2\u0095\u0096\t\2\2\2\u0096\u0193\7|\2\2\u0097\u0099\t\2\2\2\u0098"+
		"\u009a\7\21\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u009d\7e\2\2\u009c\u009e\7[\2\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u0193\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\u00a2\7V"+
		"\2\2\u00a1\u00a3\7[\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u0193\3\2\2\2\u00a4\u00a5\t\2\2\2\u00a5\u00a7\7d\2\2\u00a6\u00a8\7[\2"+
		"\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u0193\3\2\2\2\u00a9\u00aa"+
		"\t\2\2\2\u00aa\u0193\7m\2\2\u00ab\u00ad\t\2\2\2\u00ac\u00ae\t\3\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u0193\7\u0084"+
		"\2\2\u00b0\u00b1\t\2\2\2\u00b1\u00b2\7\u0083\2\2\u00b2\u0193\7\u0090\2"+
		"\2\u00b3\u00b4\t\2\2\2\u00b4\u0193\7`\2\2\u00b5\u00b6\t\2\2\2\u00b6\u0193"+
		"\7\u008f\2\2\u00b7\u00b8\7Z\2\2\u00b8\u00ba\5r:\2\u00b9\u00bb\7[\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u0193\3\2\2\2\u00bc\u00bd\7Z"+
		"\2\2\u00bd\u00bf\7V\2\2\u00be\u00c0\7[\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u0193\3\2\2\2\u00c1\u00c2\7Z\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u0193\5j\66\2\u00c4\u00c5\7Z\2\2\u00c5\u00c6\7\u0083\2\2\u00c6\u0193"+
		"\5j\66\2\u00c7\u00ca\7\\\2\2\u00c8\u00cb\5j\66\2\u00c9\u00cb\7\u00a1\2"+
		"\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u0193"+
		"\5\36\20\2\u00cd\u00ce\t\2\2\2\u00ce\u00d0\7g\2\2\u00cf\u00d1\7[\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u0193\3\2\2\2\u00d2\u00d3\7h"+
		"\2\2\u00d3\u0193\5j\66\2\u00d4\u00d5\7h\2\2\u00d5\u0193\7\21\2\2\u00d6"+
		"\u00d7\7t\2\2\u00d7\u00d8\7\u00a1\2\2\u00d8\u00d9\7\u0092\2\2\u00d9\u0193"+
		"\7\u00a1\2\2\u00da\u00db\7~\2\2\u00db\u0193\7\u00a1\2\2\u00dc\u00dd\7"+
		"u\2\2\u00dd\u00de\5n8\2\u00de\u00df\7\u0092\2\2\u00df\u00e0\5p9\2\u00e0"+
		"\u0193\3\2\2\2\u00e1\u00e2\7v\2\2\u00e2\u0193\5n8\2\u00e3\u00e6\7R\2\2"+
		"\u00e4\u00e5\7\33\2\2\u00e5\u00e7\7\u008b\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00ea\7\u0086\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\7U\2\2\u00ec"+
		"\u00ed\7\u0091\2\2\u00ed\u00ee\7\36\2\2\u00ee\u00f0\7\37\2\2\u00ef\u00ec"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\5r:\2\u00f2"+
		"\u00f4\5\26\f\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3"+
		"\2\2\2\u00f5\u00f6\7P\2\2\u00f6\u00f8\5\32\16\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u0193\3\2\2\2\u00f9\u00fc\7R\2\2\u00fa\u00fb\7\33"+
		"\2\2\u00fb\u00fd\7\u008b\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0102\7U\2\2\u00ff\u0100\7\u0091\2\2\u0100\u0101"+
		"\7\36\2\2\u0101\u0103\7\37\2\2\u0102\u00ff\3\2\2\2\u0102\u0103\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104\u0107\5r:\2\u0105\u0106\7P\2\2\u0106\u0108"+
		"\5\32\16\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2"+
		"\u0109\u010a\7\20\2\2\u010a\u010b\5\20\t\2\u010b\u0193\3\2\2\2\u010c\u010f"+
		"\7R\2\2\u010d\u010e\7\33\2\2\u010e\u0110\7\u008b\2\2\u010f\u010d\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u0113\7\u0086\2\2\u0112"+
		"\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0118\7S"+
		"\2\2\u0115\u0116\7\u0091\2\2\u0116\u0117\7\36\2\2\u0117\u0119\7\37\2\2"+
		"\u0118\u0115\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c"+
		"\5r:\2\u011b\u011d\5\26\f\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011f\7P\2\2\u011f\u0121\5\32\16\2\u0120\u011e\3"+
		"\2\2\2\u0120\u0121\3\2\2\2\u0121\u0193\3\2\2\2\u0122\u0125\7R\2\2\u0123"+
		"\u0124\7\33\2\2\u0124\u0126\7\u008b\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012b\7S\2\2\u0128\u0129\7\u0091\2"+
		"\2\u0129\u012a\7\36\2\2\u012a\u012c\7\37\2\2\u012b\u0128\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\5r:\2\u012e\u012f\7P\2"+
		"\2\u012f\u0131\5\32\16\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\7\20\2\2\u0133\u0134\5\20\t\2\u0134\u0193\3"+
		"\2\2\2\u0135\u0136\7R\2\2\u0136\u0137\t\3\2\2\u0137\u013b\7\u0083\2\2"+
		"\u0138\u0139\7\u0091\2\2\u0139\u013a\7\36\2\2\u013a\u013c\7\37\2\2\u013b"+
		"\u0138\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\5j"+
		"\66\2\u013e\u013f\7P\2\2\u013f\u0140\5\32\16\2\u0140\u0193\3\2\2\2\u0141"+
		"\u0142\7W\2\2\u0142\u0143\7Y\2\2\u0143\u0146\5r:\2\u0144\u0145\7P\2\2"+
		"\u0145\u0147\5\32\16\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\5\20\t\2\u0149\u0193\3\2\2\2\u014a\u014b\7W\2\2\u014b"+
		"\u014c\7Y\2\2\u014c\u014e\5r:\2\u014d\u014f\5J&\2\u014e\u014d\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7Q\2\2\u0151\u0152"+
		"\5\66\34\2\u0152\u0193\3\2\2\2\u0153\u0154\7o\2\2\u0154\u0157\7U\2\2\u0155"+
		"\u0156\7\u0091\2\2\u0156\u0158\7\37\2\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015c\5r:\2\u015a\u015b\7X\2\2\u015b"+
		"\u015d\7T\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0193\3\2"+
		"\2\2\u015e\u015f\7o\2\2\u015f\u0162\7S\2\2\u0160\u0161\7\u0091\2\2\u0161"+
		"\u0163\7\37\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0164\u0167\5r:\2\u0165\u0166\7X\2\2\u0166\u0168\7T\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0193\3\2\2\2\u0169\u016a\7o\2\2\u016a"+
		"\u016d\7\u0083\2\2\u016b\u016c\7\u0091\2\2\u016c\u016e\7\37\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0193\5j"+
		"\66\2\u0170\u0173\7]\2\2\u0171\u0174\5\n\6\2\u0172\u0174\5j\66\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0193\3\2\2\2\u0175\u0176\7R"+
		"\2\2\u0176\u017a\7_\2\2\u0177\u0178\7\u0091\2\2\u0178\u0179\7\36\2\2\u0179"+
		"\u017b\7\37\2\2\u017a\u0177\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3"+
		"\2\2\2\u017c\u017d\5j\66\2\u017d\u017e\7\20\2\2\u017e\u017f\5b\62\2\u017f"+
		"\u0193\3\2\2\2\u0180\u0181\7o\2\2\u0181\u0184\7_\2\2\u0182\u0183\7\u0091"+
		"\2\2\u0183\u0185\7\37\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0193\5j\66\2\u0187\u0188\7\u008e\2\2\u0188\u0189"+
		"\t\4\2\2\u0189\u018a\5r:\2\u018a\u018f\5\24\13\2\u018b\u018c\7\4\2\2\u018c"+
		"\u018e\5\24\13\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3"+
		"\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0094\3\2\2\2\u0192\u0095\3\2\2\2\u0192\u0097\3\2\2\2\u0192\u009f\3\2"+
		"\2\2\u0192\u00a4\3\2\2\2\u0192\u00a9\3\2\2\2\u0192\u00ab\3\2\2\2\u0192"+
		"\u00b0\3\2\2\2\u0192\u00b3\3\2\2\2\u0192\u00b5\3\2\2\2\u0192\u00b7\3\2"+
		"\2\2\u0192\u00bc\3\2\2\2\u0192\u00c1\3\2\2\2\u0192\u00c4\3\2\2\2\u0192"+
		"\u00c7\3\2\2\2\u0192\u00cd\3\2\2\2\u0192\u00d2\3\2\2\2\u0192\u00d4\3\2"+
		"\2\2\u0192\u00d6\3\2\2\2\u0192\u00da\3\2\2\2\u0192\u00dc\3\2\2\2\u0192"+
		"\u00e1\3\2\2\2\u0192\u00e3\3\2\2\2\u0192\u00f9\3\2\2\2\u0192\u010c\3\2"+
		"\2\2\u0192\u0122\3\2\2\2\u0192\u0135\3\2\2\2\u0192\u0141\3\2\2\2\u0192"+
		"\u014a\3\2\2\2\u0192\u0153\3\2\2\2\u0192\u015e\3\2\2\2\u0192\u0169\3\2"+
		"\2\2\u0192\u0170\3\2\2\2\u0192\u0175\3\2\2\2\u0192\u0180\3\2\2\2\u0192"+
		"\u0187\3\2\2\2\u0193\13\3\2\2\2\u0194\u0195\7\u008c\2\2\u0195\u0196\7"+
		"Q\2\2\u0196\u0198\5r:\2\u0197\u0199\5J&\2\u0198\u0197\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7Q\2\2\u019b\u019c\5\66\34\2"+
		"\u019c\u01bc\3\2\2\2\u019d\u019e\7\u008c\2\2\u019e\u019f\7$\2\2\u019f"+
		"\u01a0\7Q\2\2\u01a0\u01a2\5r:\2\u01a1\u01a3\5J&\2\u01a2\u01a1\3\2\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\7\u0082\2\2\u01a5"+
		"\u01a6\5\66\34\2\u01a6\u01bc\3\2\2\2\u01a7\u01a8\7\u008c\2\2\u01a8\u01a9"+
		"\7U\2\2\u01a9\u01ab\5r:\2\u01aa\u01ac\5\26\f\2\u01ab\u01aa\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ae\7P\2\2\u01ae\u01b0\5\32"+
		"\16\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01bc\3\2\2\2\u01b1"+
		"\u01b2\7\u008c\2\2\u01b2\u01b3\7S\2\2\u01b3\u01b5\5r:\2\u01b4\u01b6\5"+
		"\26\f\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b8\7P\2\2\u01b8\u01ba\5\32\16\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3"+
		"\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u0194\3\2\2\2\u01bb\u019d\3\2\2\2\u01bb"+
		"\u01a7\3\2\2\2\u01bb\u01b1\3\2\2\2\u01bc\r\3\2\2\2\u01bd\u01be\7\177\2"+
		"\2\u01be\u01bf\7\u0080\2\2\u01bf\u01c0\7\u00a1\2\2\u01c0\17\3\2\2\2\u01c1"+
		"\u01c2\7\16\2\2\u01c2\u01c7\58\35\2\u01c3\u01c4\7\4\2\2\u01c4\u01c6\5"+
		"8\35\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7\17"+
		"\2\2\u01cb\u01ce\5:\36\2\u01cc\u01cd\7\25\2\2\u01cd\u01cf\5(\25\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d1\7\23"+
		"\2\2\u01d1\u01d3\5P)\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d7"+
		"\3\2\2\2\u01d4\u01d5\7\26\2\2\u01d5\u01d6\7\27\2\2\u01d6\u01d8\5\62\32"+
		"\2\u01d7\u01d4\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\3\2\2\2\u01d9\u01da"+
		"\7N\2\2\u01da\u01db\7\27\2\2\u01db\u01dd\5\64\33\2\u01dc\u01d9\3\2\2\2"+
		"\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01df\7\30\2\2\u01df\u01e1"+
		"\5P)\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e3\7\13\2\2\u01e3\u01e5\5\22\n\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3"+
		"\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e8\5\"\22\2\u01e7\u01e6\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\21\3\2\2\2\u01e9\u01ea\t\5\2\2\u01ea\23\3\2\2\2\u01eb"+
		"\u01ed\7\u008d\2\2\u01ec\u01ee\7k\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\5j\66\2\u01f0\u01f1\5b\62\2\u01f1"+
		"\25\3\2\2\2\u01f2\u01f3\7\5\2\2\u01f3\u01f8\5\30\r\2\u01f4\u01f5\7\4\2"+
		"\2\u01f5\u01f7\5\30\r\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2"+
		"\2\2\u01fb\u01fc\7\6\2\2\u01fc\27\3\2\2\2\u01fd\u01fe\5j\66\2\u01fe\u0203"+
		"\5b\62\2\u01ff\u0201\7\u008a\2\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2"+
		"\2\u0201\u0202\3\2\2\2\u0202\u0204\7\u0082\2\2\u0203\u0200\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\31\3\2\2\2\u0205\u0206\7\5\2\2\u0206\u020b\5\34\17"+
		"\2\u0207\u0208\7\4\2\2\u0208\u020a\5\34\17\2\u0209\u0207\3\2\2\2\u020a"+
		"\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2"+
		"\2\2\u020d\u020b\3\2\2\2\u020e\u020f\7\6\2\2\u020f\33\3\2\2\2\u0210\u0213"+
		"\5j\66\2\u0211\u0213\7\u00a1\2\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2"+
		"\2\u0213\u0214\3\2\2\2\u0214\u0215\7\u0092\2\2\u0215\u0216\5v<\2\u0216"+
		"\35\3\2\2\2\u0217\u0218\7\17\2\2\u0218\u021a\7}\2\2\u0219\u0217\3\2\2"+
		"\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u021d\5 \21\2\u021c\u021b"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u0220\5\"\22\2"+
		"\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\37\3\2\2\2\u0221\u0222"+
		"\t\6\2\2\u0222\u0223\5t;\2\u0223!\3\2\2\2\u0224\u0225\7\31\2\2\u0225\u0226"+
		"\5t;\2\u0226#\3\2\2\2\u0227\u0228\7?\2\2\u0228\u0229\5t;\2\u0229\u022a"+
		"\5\60\31\2\u022a%\3\2\2\2\u022b\u022c\7@\2\2\u022c\u022d\7A\2\2\u022d"+
		"\u022e\5t;\2\u022e\u022f\5\60\31\2\u022f\'\3\2\2\2\u0230\u0232\7\u00a5"+
		"\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0236\3\2\2\2\u0233"+
		"\u0237\5*\26\2\u0234\u0237\5,\27\2\u0235\u0237\5.\30\2\u0236\u0233\3\2"+
		"\2\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237)\3\2\2\2\u0238\u0239"+
		"\7;\2\2\u0239\u023a\7\5\2\2\u023a\u023b\7=\2\2\u023b\u023c\5t;\2\u023c"+
		"\u023f\5\60\31\2\u023d\u023e\7\4\2\2\u023e\u0240\5$\23\2\u023f\u023d\3"+
		"\2\2\2\u023f\u0240\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u0242\7\4\2\2\u0242"+
		"\u0244\5&\24\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2"+
		"\2\2\u0245\u0246\7\6\2\2\u0246+\3\2\2\2\u0247\u0248\7<\2\2\u0248\u0249"+
		"\7\5\2\2\u0249\u024a\7=\2\2\u024a\u024b\5t;\2\u024b\u024c\5\60\31\2\u024c"+
		"\u024d\7\4\2\2\u024d\u024e\7>\2\2\u024e\u024f\7\27\2\2\u024f\u0250\5t"+
		";\2\u0250\u0253\5\60\31\2\u0251\u0252\7\4\2\2\u0252\u0254\5$\23\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0256\7\4"+
		"\2\2\u0256\u0258\5&\24\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u025a\7\6\2\2\u025a-\3\2\2\2\u025b\u025c\7x\2\2\u025c"+
		"\u025d\7\5\2\2\u025d\u025e\5t;\2\u025e\u0261\5\60\31\2\u025f\u0260\7\4"+
		"\2\2\u0260\u0262\5$\23\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0265\3\2\2\2\u0263\u0264\7\4\2\2\u0264\u0266\5&\24\2\u0265\u0263\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\7\6\2\2\u0268"+
		"/\3\2\2\2\u0269\u026a\t\7\2\2\u026a\61\3\2\2\2\u026b\u0270\5V,\2\u026c"+
		"\u026d\7\4\2\2\u026d\u026f\5V,\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2"+
		"\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0280\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0273\u027c\7\5\2\2\u0274\u0279\5V,\2\u0275\u0276\7\4\2\2\u0276"+
		"\u0278\5V,\2\u0277\u0275\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2"+
		"\2\u0279\u027a\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u0274"+
		"\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\7\6\2\2\u027f"+
		"\u026b\3\2\2\2\u027f\u0273\3\2\2\2\u0280\63\3\2\2\2\u0281\u0286\5V,\2"+
		"\u0282\u0283\7\4\2\2\u0283\u0285\5V,\2\u0284\u0282\3\2\2\2\u0285\u0288"+
		"\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0296\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0289\u0292\7\5\2\2\u028a\u028f\5V,\2\u028b\u028c\7\4\2"+
		"\2\u028c\u028e\5V,\2\u028d\u028b\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0292"+
		"\u028a\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\7\6"+
		"\2\2\u0295\u0281\3\2\2\2\u0295\u0289\3\2\2\2\u0296\65\3\2\2\2\u0297\u02a0"+
		"\7\5\2\2\u0298\u029d\5V,\2\u0299\u029a\7\4\2\2\u029a\u029c\5V,\2\u029b"+
		"\u0299\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2"+
		"\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u0298\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7\6\2\2\u02a3\67\3\2\2"+
		"\2\u02a4\u02a9\5N(\2\u02a5\u02a7\7\20\2\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7"+
		"\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\5j\66\2\u02a9\u02a6\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02b1\3\2\2\2\u02ab\u02ac\5j\66\2\u02ac\u02ad\7\7"+
		"\2\2\u02ad\u02ae\7\u009a\2\2\u02ae\u02b1\3\2\2\2\u02af\u02b1\7\u009a\2"+
		"\2\u02b0\u02a4\3\2\2\2\u02b0\u02ab\3\2\2\2\u02b0\u02af\3\2\2\2\u02b19"+
		"\3\2\2\2\u02b2\u02b4\5H%\2\u02b3\u02b5\5<\37\2\u02b4\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02ba\3\2"+
		"\2\2\u02b8\u02ba\5H%\2\u02b9\u02b2\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba;"+
		"\3\2\2\2\u02bb\u02bc\5> \2\u02bc\u02bd\7G\2\2\u02bd\u02bf\5H%\2\u02be"+
		"\u02c0\5@!\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2"+
		"\2\u02c1\u02c2\5F$\2\u02c2=\3\2\2\2\u02c3\u02c5\7J\2\2\u02c4\u02c3\3\2"+
		"\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02cf\3\2\2\2\u02c6\u02c8\7H\2\2\u02c7"+
		"\u02c9\7I\2\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cf\3\2"+
		"\2\2\u02ca\u02cc\7K\2\2\u02cb\u02cd\7I\2\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd"+
		"\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02c4\3\2\2\2\u02ce\u02c6\3\2\2\2\u02ce"+
		"\u02ca\3\2\2\2\u02cf?\3\2\2\2\u02d0\u02d1\7\24\2\2\u02d1\u02d2\5B\"\2"+
		"\u02d2A\3\2\2\2\u02d3\u02d4\7\5\2\2\u02d4\u02d5\5D#\2\u02d5\u02d6\7\4"+
		"\2\2\u02d6\u02d7\5D#\2\u02d7\u02d9\7\6\2\2\u02d8\u02da\5&\24\2\u02d9\u02d8"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02e0\3\2\2\2\u02db\u02dd\5D#\2\u02dc"+
		"\u02de\5&\24\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\3\2"+
		"\2\2\u02df\u02d3\3\2\2\2\u02df\u02db\3\2\2\2\u02e0C\3\2\2\2\u02e1\u02e2"+
		"\5t;\2\u02e2\u02e3\5\60\31\2\u02e3E\3\2\2\2\u02e4\u02e5\7M\2\2\u02e5\u02e6"+
		"\5P)\2\u02e6G\3\2\2\2\u02e7\u02ec\5L\'\2\u02e8\u02ea\7\20\2\2\u02e9\u02e8"+
		"\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\5r:\2\u02ec"+
		"\u02e9\3\2\2\2\u02ec\u02ed\3\2\2\2\u02edI\3\2\2\2\u02ee\u02ef\7\5\2\2"+
		"\u02ef\u02f4\5j\66\2\u02f0\u02f1\7\4\2\2\u02f1\u02f3\5j\66\2\u02f2\u02f0"+
		"\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f7\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f8\7\6\2\2\u02f8K\3\2\2\2"+
		"\u02f9\u02fa\5r:\2\u02faM\3\2\2\2\u02fb\u02fc\5P)\2\u02fcO\3\2\2\2\u02fd"+
		"\u02fe\b)\1\2\u02fe\u0302\5R*\2\u02ff\u0300\7\36\2\2\u0300\u0302\5P)\5"+
		"\u0301\u02fd\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u030b\3\2\2\2\u0303\u0304"+
		"\f\4\2\2\u0304\u0305\7\34\2\2\u0305\u030a\5P)\5\u0306\u0307\f\3\2\2\u0307"+
		"\u0308\7\33\2\2\u0308\u030a\5P)\4\u0309\u0303\3\2\2\2\u0309\u0306\3\2"+
		"\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c"+
		"Q\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u0310\5V,\2\u030f\u0311\5T+\2\u0310"+
		"\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311S\3\2\2\2\u0312\u0313\5^\60\2"+
		"\u0313\u0314\5V,\2\u0314\u0342\3\2\2\2\u0315\u0317\7\36\2\2\u0316\u0315"+
		"\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\7 \2\2\u0319"+
		"\u031a\5V,\2\u031a\u031b\7\34\2\2\u031b\u031c\5V,\2\u031c\u0342\3\2\2"+
		"\2\u031d\u031f\7\36\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0321\7\35\2\2\u0321\u0322\7\5\2\2\u0322\u0327\5"+
		"N(\2\u0323\u0324\7\4\2\2\u0324\u0326\5N(\2\u0325\u0323\3\2\2\2\u0326\u0329"+
		"\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032a\3\2\2\2\u0329"+
		"\u0327\3\2\2\2\u032a\u032b\7\6\2\2\u032b\u0342\3\2\2\2\u032c\u032e\7\36"+
		"\2\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0330\7!\2\2\u0330\u0333\5V,\2\u0331\u0332\7\"\2\2\u0332\u0334\7\u00a1"+
		"\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0342\3\2\2\2\u0335"+
		"\u0337\7#\2\2\u0336\u0338\7\36\2\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2"+
		"\2\2\u0338\u0339\3\2\2\2\u0339\u0342\7$\2\2\u033a\u033c\7#\2\2\u033b\u033d"+
		"\7\36\2\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2"+
		"\u033e\u033f\7\22\2\2\u033f\u0340\7\17\2\2\u0340\u0342\5V,\2\u0341\u0312"+
		"\3\2\2\2\u0341\u0316\3\2\2\2\u0341\u031e\3\2\2\2\u0341\u032d\3\2\2\2\u0341"+
		"\u0335\3\2\2\2\u0341\u033a\3\2\2\2\u0342U\3\2\2\2\u0343\u0344\b,\1\2\u0344"+
		"\u0348\5X-\2\u0345\u0346\t\b\2\2\u0346\u0348\5V,\6\u0347\u0343\3\2\2\2"+
		"\u0347\u0345\3\2\2\2\u0348\u0357\3\2\2\2\u0349\u034a\f\5\2\2\u034a\u034b"+
		"\t\t\2\2\u034b\u0356\5V,\6\u034c\u034d\f\4\2\2\u034d\u034e\t\b\2\2\u034e"+
		"\u0356\5V,\5\u034f\u0350\f\3\2\2\u0350\u0351\7\u009d\2\2\u0351\u0356\5"+
		"V,\4\u0352\u0353\f\7\2\2\u0353\u0354\7\32\2\2\u0354\u0356\5\\/\2\u0355"+
		"\u0349\3\2\2\2\u0355\u034c\3\2\2\2\u0355\u034f\3\2\2\2\u0355\u0352\3\2"+
		"\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"W\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u035b\b-\1\2\u035b\u03d4\5v<\2\u035c"+
		"\u035d\5j\66\2\u035d\u035e\7\u00a1\2\2\u035e\u03d4\3\2\2\2\u035f\u0360"+
		"\7B\2\2\u0360\u0362\5V,\2\u0361\u0363\5h\65\2\u0362\u0361\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0368\3\2"+
		"\2\2\u0366\u0367\7E\2\2\u0367\u0369\5N(\2\u0368\u0366\3\2\2\2\u0368\u0369"+
		"\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\7F\2\2\u036b\u03d4\3\2\2\2\u036c"+
		"\u036e\7B\2\2\u036d\u036f\5h\65\2\u036e\u036d\3\2\2\2\u036f\u0370\3\2"+
		"\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0374\3\2\2\2\u0372"+
		"\u0373\7E\2\2\u0373\u0375\5N(\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2"+
		"\2\u0375\u0376\3\2\2\2\u0376\u0377\7F\2\2\u0377\u03d4\3\2\2\2\u0378\u0379"+
		"\7a\2\2\u0379\u037a\7\5\2\2\u037a\u037b\5N(\2\u037b\u037c\7\20\2\2\u037c"+
		"\u037d\5b\62\2\u037d\u037e\7\6\2\2\u037e\u03d4\3\2\2\2\u037f\u0380\7r"+
		"\2\2\u0380\u0389\7\b\2\2\u0381\u0386\5N(\2\u0382\u0383\7\4\2\2\u0383\u0385"+
		"\5N(\2\u0384\u0382\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u0381\3\2"+
		"\2\2\u0389\u038a\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u03d4\7\t\2\2\u038c"+
		"\u038d\7s\2\2\u038d\u039b\7\5\2\2\u038e\u038f\5N(\2\u038f\u0390\7\u009e"+
		"\2\2\u0390\u0398\5N(\2\u0391\u0392\7\4\2\2\u0392\u0393\5N(\2\u0393\u0394"+
		"\7\u009e\2\2\u0394\u0395\5N(\2\u0395\u0397\3\2\2\2\u0396\u0391\3\2\2\2"+
		"\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039c"+
		"\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u038e\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039d\3\2\2\2\u039d\u03d4\7\6\2\2\u039e\u039f\7O\2\2\u039f\u03ad\7\5"+
		"\2\2\u03a0\u03a1\5j\66\2\u03a1\u03a2\7\u009e\2\2\u03a2\u03aa\5N(\2\u03a3"+
		"\u03a4\7\4\2\2\u03a4\u03a5\5j\66\2\u03a5\u03a6\7\u009e\2\2\u03a6\u03a7"+
		"\5N(\2\u03a7\u03a9\3\2\2\2\u03a8\u03a3\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa"+
		"\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2"+
		"\2\2\u03ad\u03a0\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u03d4\7\6\2\2\u03b0\u03b1\5j\66\2\u03b1\u03b2\7\5\2\2\u03b2\u03b3\7\u009a"+
		"\2\2\u03b3\u03b4\7\6\2\2\u03b4\u03d4\3\2\2\2\u03b5\u03b6\5j\66\2\u03b6"+
		"\u03c6\7\5\2\2\u03b7\u03bc\5Z.\2\u03b8\u03b9\7\4\2\2\u03b9\u03bb\5Z.\2"+
		"\u03ba\u03b8\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd"+
		"\3\2\2\2\u03bd\u03c3\3\2\2\2\u03be\u03bc\3\2\2\2\u03bf\u03c0\7\4\2\2\u03c0"+
		"\u03c2\5l\67\2\u03c1\u03bf\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2"+
		"\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6"+
		"\u03b7\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\7\6"+
		"\2\2\u03c9\u03d4\3\2\2\2\u03ca\u03d4\5j\66\2\u03cb\u03cc\5j\66\2\u03cc"+
		"\u03cd\7\7\2\2\u03cd\u03ce\5j\66\2\u03ce\u03d4\3\2\2\2\u03cf\u03d0\7\5"+
		"\2\2\u03d0\u03d1\5N(\2\u03d1\u03d2\7\6\2\2\u03d2\u03d4\3\2\2\2\u03d3\u035a"+
		"\3\2\2\2\u03d3\u035c\3\2\2\2\u03d3\u035f\3\2\2\2\u03d3\u036c\3\2\2\2\u03d3"+
		"\u0378\3\2\2\2\u03d3\u037f\3\2\2\2\u03d3\u038c\3\2\2\2\u03d3\u039e\3\2"+
		"\2\2\u03d3\u03b0\3\2\2\2\u03d3\u03b5\3\2\2\2\u03d3\u03ca\3\2\2\2\u03d3"+
		"\u03cb\3\2\2\2\u03d3\u03cf\3\2\2\2\u03d4\u03df\3\2\2\2\u03d5\u03d6\f\7"+
		"\2\2\u03d6\u03d7\7\b\2\2\u03d7\u03d8\5V,\2\u03d8\u03d9\7\t\2\2\u03d9\u03de"+
		"\3\2\2\2\u03da\u03db\f\4\2\2\u03db\u03dc\7\u009f\2\2\u03dc\u03de\5j\66"+
		"\2\u03dd\u03d5\3\2\2\2\u03dd\u03da\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd"+
		"\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0Y\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2"+
		"\u03e5\5N(\2\u03e3\u03e5\5\60\31\2\u03e4\u03e2\3\2\2\2\u03e4\u03e3\3\2"+
		"\2\2\u03e5[\3\2\2\2\u03e6\u03e7\7)\2\2\u03e7\u03e8\7:\2\2\u03e8\u03e9"+
		"\7\u00a1\2\2\u03e9]\3\2\2\2\u03ea\u03eb\t\n\2\2\u03eb_\3\2\2\2\u03ec\u03ed"+
		"\t\13\2\2\u03eda\3\2\2\2\u03ee\u03ef\b\62\1\2\u03ef\u03f0\7r\2\2\u03f0"+
		"\u03f1\7\u0094\2\2\u03f1\u03f2\5b\62\2\u03f2\u03f3\7\u0096\2\2\u03f3\u0421"+
		"\3\2\2\2\u03f4\u03f5\7s\2\2\u03f5\u03f6\7\u0094\2\2\u03f6\u03f7\5b\62"+
		"\2\u03f7\u03f8\7\4\2\2\u03f8\u03f9\5b\62\2\u03f9\u03fa\7\u0096\2\2\u03fa"+
		"\u0421\3\2\2\2\u03fb\u03fc\7O\2\2\u03fc\u0408\7\u0094\2\2\u03fd\u03fe"+
		"\5j\66\2\u03fe\u0405\5b\62\2\u03ff\u0400\7\4\2\2\u0400\u0401\5j\66\2\u0401"+
		"\u0402\5b\62\2\u0402\u0404\3\2\2\2\u0403\u03ff\3\2\2\2\u0404\u0407\3\2"+
		"\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0409\3\2\2\2\u0407"+
		"\u0405\3\2\2\2\u0408\u03fd\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2"+
		"\2\2\u040a\u0421\7\u0096\2\2\u040b\u040c\7\u0081\2\2\u040c\u040d\7\5\2"+
		"\2\u040d\u040e\5t;\2\u040e\u040f\7\4\2\2\u040f\u0410\5t;\2\u0410\u0411"+
		"\7\6\2\2\u0411\u0421\3\2\2\2\u0412\u041e\5f\64\2\u0413\u0414\7\5\2\2\u0414"+
		"\u0419\5d\63\2\u0415\u0416\7\4\2\2\u0416\u0418\5d\63\2\u0417\u0415\3\2"+
		"\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a"+
		"\u041c\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041d\7\6\2\2\u041d\u041f\3\2"+
		"\2\2\u041e\u0413\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0421\3\2\2\2\u0420"+
		"\u03ee\3\2\2\2\u0420\u03f4\3\2\2\2\u0420\u03fb\3\2\2\2\u0420\u040b\3\2"+
		"\2\2\u0420\u0412\3\2\2\2\u0421\u0426\3\2\2\2\u0422\u0423\f\b\2\2\u0423"+
		"\u0425\7r\2\2\u0424\u0422\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2"+
		"\2\2\u0426\u0427\3\2\2\2\u0427c\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042a"+
		"\t\f\2\2\u042ae\3\2\2\2\u042b\u042c\5j\66\2\u042cg\3\2\2\2\u042d\u042e"+
		"\7C\2\2\u042e\u042f\5N(\2\u042f\u0430\7D\2\2\u0430\u0431\5N(\2\u0431i"+
		"\3\2\2\2\u0432\u0439\7\u00a9\2\2\u0433\u0439\7\u00a5\2\2\u0434\u0439\7"+
		"\u00a7\2\2\u0435\u0439\5x=\2\u0436\u0439\7\u00a8\2\2\u0437\u0439\7\u00a6"+
		"\2\2\u0438\u0432\3\2\2\2\u0438\u0433\3\2\2\2\u0438\u0434\3\2\2\2\u0438"+
		"\u0435\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0437\3\2\2\2\u0439k\3\2\2\2"+
		"\u043a\u043b\5j\66\2\u043b\u043c\7\u00a0\2\2\u043c\u043d\5N(\2\u043d\u044c"+
		"\3\2\2\2\u043e\u043f\7\5\2\2\u043f\u0444\5j\66\2\u0440\u0441\7\4\2\2\u0441"+
		"\u0443\5j\66\2\u0442\u0440\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2"+
		"\2\2\u0444\u0445\3\2\2\2\u0445\u0447\3\2\2\2\u0446\u0444\3\2\2\2\u0447"+
		"\u0448\7\6\2\2\u0448\u0449\7\u00a0\2\2\u0449\u044a\5N(\2\u044a\u044c\3"+
		"\2\2\2\u044b\u043a\3\2\2\2\u044b\u043e\3\2\2\2\u044cm\3\2\2\2\u044d\u044e"+
		"\7\u00a5\2\2\u044eo\3\2\2\2\u044f\u0450\7\u00a1\2\2\u0450q\3\2\2\2\u0451"+
		"\u0452\5j\66\2\u0452s\3\2\2\2\u0453\u0455\7\u0099\2\2\u0454\u0453\3\2"+
		"\2\2\u0454\u0455\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0460\7\u00a3\2\2\u0457"+
		"\u0459\7\u0099\2\2\u0458\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a"+
		"\3\2\2\2\u045a\u0460\7\u00a4\2\2\u045b\u045d\7\u0099\2\2\u045c\u045b\3"+
		"\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0460\7\u00a2\2\2"+
		"\u045f\u0454\3\2\2\2\u045f\u0458\3\2\2\2\u045f\u045c\3\2\2\2\u0460u\3"+
		"\2\2\2\u0461\u0467\7$\2\2\u0462\u0467\5t;\2\u0463\u0467\5`\61\2\u0464"+
		"\u0467\7\u00a1\2\2\u0465\u0467\7\u00a9\2\2\u0466\u0461\3\2\2\2\u0466\u0462"+
		"\3\2\2\2\u0466\u0463\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0465\3\2\2\2\u0467"+
		"w\3\2\2\2\u0468\u0469\t\r\2\2\u0469y\3\2\2\2\u0093}\u0089\u008c\u0099"+
		"\u009d\u00a2\u00a7\u00ad\u00ba\u00bf\u00ca\u00d0\u00e6\u00e9\u00ef\u00f3"+
		"\u00f7\u00fc\u0102\u0107\u010f\u0112\u0118\u011c\u0120\u0125\u012b\u0130"+
		"\u013b\u0146\u014e\u0157\u015c\u0162\u0167\u016d\u0173\u017a\u0184\u018f"+
		"\u0192\u0198\u01a2\u01ab\u01af\u01b5\u01b9\u01bb\u01c7\u01ce\u01d2\u01d7"+
		"\u01dc\u01e0\u01e4\u01e7\u01ed\u01f8\u0200\u0203\u020b\u0212\u0219\u021c"+
		"\u021f\u0231\u0236\u023f\u0243\u0253\u0257\u0261\u0265\u0270\u0279\u027c"+
		"\u027f\u0286\u028f\u0292\u0295\u029d\u02a0\u02a6\u02a9\u02b0\u02b6\u02b9"+
		"\u02bf\u02c4\u02c8\u02cc\u02ce\u02d9\u02dd\u02df\u02e9\u02ec\u02f4\u0301"+
		"\u0309\u030b\u0310\u0316\u031e\u0327\u032d\u0333\u0337\u033c\u0341\u0347"+
		"\u0355\u0357\u0364\u0368\u0370\u0374\u0386\u0389\u0398\u039b\u03aa\u03ad"+
		"\u03bc\u03c3\u03c6\u03d3\u03dd\u03df\u03e4\u0405\u0408\u0419\u041e\u0420"+
		"\u0426\u0438\u0444\u044b\u0454\u0458\u045c\u045f\u0466";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}