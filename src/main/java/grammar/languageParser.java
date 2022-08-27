// Generated from C:/Users/thetr/OneDrive/Dokumenter/GitHub/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATER=1, LESSER=2, EQUAL=3, GREATEROREQUAL=4, LESSEROREQUAL=5, ISNOTEQUAL=6, 
		INPUT=7, PRINT=8, PRINTLN=9, BREAK=10, IF=11, ELSE=12, PLUS=13, MINUS=14, 
		MULTIPLICATION=15, DIVISION=16, POWER_OF=17, OR=18, STOP=19, FOR=20, WHILE=21, 
		FOREVER=22, COMMA=23, AT_SIGN=24, VOID=25, LPAR=26, RPAR=27, LCBRAC=28, 
		RCBRAC=29, TYPE=30, INT_TYPE=31, DOUBLE_TYPE=32, TXT_TYPE=33, BOOL_TYPE=34, 
		ASSIGN=35, INT=36, DOT=37, DOUBLE=38, TXT=39, BOOL=40, RETURN=41, TRUE=42, 
		FALSE=43, ID=44, WS=45, COMMENT=46, LINE_COMMENT=47;
	public static final int
		RULE_language = 0, RULE_stmts = 1, RULE_stmt = 2, RULE_stop = 3, RULE_declaration = 4, 
		RULE_print = 5, RULE_println = 6, RULE_input = 7, RULE_type_declaration = 8, 
		RULE_type_reassign = 9, RULE_function_declaration = 10, RULE_param = 11, 
		RULE_function_call = 12, RULE_return_func = 13, RULE_function_call_param = 14, 
		RULE_expression = 15, RULE_conditional_statement = 16, RULE_if_statement = 17, 
		RULE_break_statement = 18, RULE_iterative_statement = 19, RULE_for_loop = 20, 
		RULE_while_loop = 21, RULE_forever_loop = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"language", "stmts", "stmt", "stop", "declaration", "print", "println", 
			"input", "type_declaration", "type_reassign", "function_declaration", 
			"param", "function_call", "return_func", "function_call_param", "expression", 
			"conditional_statement", "if_statement", "break_statement", "iterative_statement", 
			"for_loop", "while_loop", "forever_loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", null, null, null, null, null, "'input'", "'print'", "'println'", 
			"'break'", "'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'^'", "'||'", 
			"'stop'", "'for'", "'while'", "'forever'", "','", "'@'", "'void'", "'('", 
			"')'", "'{'", "'}'", null, "'int'", "'double'", "'txt'", "'bool'", "'='", 
			null, "'.'", null, null, null, "'return'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATER", "LESSER", "EQUAL", "GREATEROREQUAL", "LESSEROREQUAL", 
			"ISNOTEQUAL", "INPUT", "PRINT", "PRINTLN", "BREAK", "IF", "ELSE", "PLUS", 
			"MINUS", "MULTIPLICATION", "DIVISION", "POWER_OF", "OR", "STOP", "FOR", 
			"WHILE", "FOREVER", "COMMA", "AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", 
			"RCBRAC", "TYPE", "INT_TYPE", "DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", 
			"ASSIGN", "INT", "DOT", "DOUBLE", "TXT", "BOOL", "RETURN", "TRUE", "FALSE", 
			"ID", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public languageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LanguageContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(languageParser.EOF, 0); }
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_language);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << PRINTLN) | (1L << BREAK) | (1L << IF) | (1L << STOP) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(46);
				stmts();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54);
					stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StmtContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Iterative_statementContext iterative_statement() {
			return getRuleContext(Iterative_statementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public StopContext stop() {
			return getRuleContext(StopContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				conditional_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				iterative_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				println();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				input();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				stop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				function_call();
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

	public static class StopContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(languageParser.STOP, 0); }
		public StopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitStop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitStop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopContext stop() throws RecognitionException {
		StopContext _localctx = new StopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(STOP);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Type_reassignContext type_reassign() {
			return getRuleContext(Type_reassignContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				type_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				function_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				type_reassign();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(languageParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PRINT);
			setState(77);
			match(LPAR);
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					expression(0);
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0) );
				}
				break;
			case 2:
				{
				setState(83);
				function_call();
				}
				break;
			}
			setState(86);
			match(RPAR);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(languageParser.PRINTLN, 0); }
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_println);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PRINTLN);
			setState(89);
			match(LPAR);
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					expression(0);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0) );
				}
				break;
			case 2:
				{
				setState(95);
				function_call();
				}
				break;
			}
			setState(98);
			match(RPAR);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(languageParser.INPUT, 0); }
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(INPUT);
			setState(101);
			match(LPAR);
			setState(102);
			expression(0);
			setState(103);
			match(RPAR);
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

	public static class Type_declarationContext extends ParserRuleContext {
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
	 
		public Type_declarationContext() { }
		public void copyFrom(Type_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Var_dec_no_valueContext extends Type_declarationContext {
		public TerminalNode TYPE() { return getToken(languageParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
		public Var_dec_no_valueContext(Type_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterVar_dec_no_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitVar_dec_no_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitVar_dec_no_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Var_dec_with_valueContext extends Type_declarationContext {
		public TerminalNode TYPE() { return getToken(languageParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(languageParser.ASSIGN, 0); }
		public TerminalNode BOOL() { return getToken(languageParser.BOOL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Var_dec_with_valueContext(Type_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterVar_dec_with_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitVar_dec_with_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitVar_dec_with_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_declaration);
		try {
			int _alt;
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Var_dec_with_valueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(TYPE);
				setState(106);
				match(ID);
				setState(107);
				match(ASSIGN);
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(109); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(108);
							expression(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(111); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case 2:
					{
					setState(113);
					match(BOOL);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Var_dec_no_valueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(TYPE);
				setState(117);
				match(ID);
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

	public static class Type_reassignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(languageParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Type_reassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_reassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterType_reassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitType_reassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitType_reassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_reassignContext type_reassign() throws RecognitionException {
		Type_reassignContext _localctx = new Type_reassignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_reassign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(ASSIGN);
			{
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					expression(0);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	 
		public Function_declarationContext() { }
		public void copyFrom(Function_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncVoidContext extends Function_declarationContext {
		public TerminalNode VOID() { return getToken(languageParser.VOID, 0); }
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public List<Type_declarationContext> type_declaration() {
			return getRuleContexts(Type_declarationContext.class);
		}
		public Type_declarationContext type_declaration(int i) {
			return getRuleContext(Type_declarationContext.class,i);
		}
		public FuncVoidContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterFuncVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitFuncVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitFuncVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncWithReturnContext extends Function_declarationContext {
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public Return_funcContext return_func() {
			return getRuleContext(Return_funcContext.class,0);
		}
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public TerminalNode TYPE() { return getToken(languageParser.TYPE, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public List<Type_declarationContext> type_declaration() {
			return getRuleContexts(Type_declarationContext.class);
		}
		public Type_declarationContext type_declaration(int i) {
			return getRuleContext(Type_declarationContext.class,i);
		}
		public FuncWithReturnContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterFuncWithReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitFuncWithReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitFuncWithReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_declaration);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new FuncWithReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(128);
				match(TYPE);
				}
				setState(129);
				match(ID);
				setState(130);
				match(LPAR);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(131);
					param();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(RPAR);
				setState(138);
				match(LCBRAC);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << PRINTLN) | (1L << BREAK) | (1L << IF) | (1L << STOP) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0)) {
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(139);
						stmts();
						}
						break;
					case 2:
						{
						setState(140);
						match(ID);
						}
						break;
					case 3:
						{
						setState(141);
						type_declaration();
						}
						break;
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				return_func();
				setState(148);
				match(RCBRAC);
				}
				break;
			case VOID:
				_localctx = new FuncVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(VOID);
				setState(151);
				match(ID);
				setState(152);
				match(LPAR);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(153);
					param();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(RPAR);
				setState(160);
				match(LCBRAC);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << PRINTLN) | (1L << BREAK) | (1L << IF) | (1L << STOP) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0)) {
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(161);
						stmts();
						}
						break;
					case 2:
						{
						setState(162);
						match(ID);
						}
						break;
					case 3:
						{
						setState(163);
						type_declaration();
						}
						break;
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(RCBRAC);
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

	public static class ParamContext extends ParserRuleContext {
		public List<Type_declarationContext> type_declaration() {
			return getRuleContexts(Type_declarationContext.class);
		}
		public Type_declarationContext type_declaration(int i) {
			return getRuleContext(Type_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(languageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(languageParser.COMMA, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			type_declaration();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				type_declaration();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public List<Function_call_paramContext> function_call_param() {
			return getRuleContexts(Function_call_paramContext.class);
		}
		public Function_call_paramContext function_call_param(int i) {
			return getRuleContext(Function_call_paramContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(LPAR);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(182);
				function_call_param();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(RPAR);
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

	public static class Return_funcContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(languageParser.RETURN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public Return_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterReturn_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitReturn_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitReturn_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_funcContext return_func() throws RecognitionException {
		Return_funcContext _localctx = new Return_funcContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(RETURN);
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(191);
					expression(0);
					}
					break;
				case 2:
					{
					setState(192);
					function_call();
					}
					break;
				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0) );
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

	public static class Function_call_paramContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(languageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(languageParser.COMMA, i);
		}
		public Function_call_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterFunction_call_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitFunction_call_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitFunction_call_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_paramContext function_call_param() throws RecognitionException {
		Function_call_paramContext _localctx = new Function_call_paramContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			expression(0);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(198);
				match(COMMA);
				setState(199);
				expression(0);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(languageParser.PLUS, 0); }
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(languageParser.MULTIPLICATION, 0); }
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesisContext extends ExpressionContext {
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(languageParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(languageParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(languageParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(languageParser.MINUS, i);
		}
		public List<TerminalNode> MULTIPLICATION() { return getTokens(languageParser.MULTIPLICATION); }
		public TerminalNode MULTIPLICATION(int i) {
			return getToken(languageParser.MULTIPLICATION, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(languageParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(languageParser.DIVISION, i);
		}
		public ParanthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterParanthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitParanthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitParanthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstraktionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(languageParser.MINUS, 0); }
		public SubstraktionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterSubstraktion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitSubstraktion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitSubstraktion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bigger_expressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(languageParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(languageParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(languageParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(languageParser.MINUS, i);
		}
		public List<TerminalNode> MULTIPLICATION() { return getTokens(languageParser.MULTIPLICATION); }
		public TerminalNode MULTIPLICATION(int i) {
			return getToken(languageParser.MULTIPLICATION, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(languageParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(languageParser.DIVISION, i);
		}
		public Bigger_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterBigger_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitBigger_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitBigger_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Integer_NUMContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(languageParser.INT, 0); }
		public Integer_NUMContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterInteger_NUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitInteger_NUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitInteger_NUM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualWithContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(languageParser.EQUAL, 0); }
		public EqualWithContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterEqualWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitEqualWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitEqualWith(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode TXT() { return getToken(languageParser.TXT, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserorEqualThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESSEROREQUAL() { return getToken(languageParser.LESSEROREQUAL, 0); }
		public LesserorEqualThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterLesserorEqualThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitLesserorEqualThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitLesserorEqualThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNotEqualWithContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ISNOTEQUAL() { return getToken(languageParser.ISNOTEQUAL, 0); }
		public IsNotEqualWithContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterIsNotEqualWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitIsNotEqualWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitIsNotEqualWith(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESSER() { return getToken(languageParser.LESSER, 0); }
		public LesserThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterLesserThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitLesserThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitLesserThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(languageParser.BOOL, 0); }
		public BoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(languageParser.GREATER, 0); }
		public GreaterThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Power_ofContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER_OF() { return getToken(languageParser.POWER_OF, 0); }
		public Power_ofContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterPower_of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitPower_of(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitPower_of(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_NUMContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(languageParser.DOUBLE, 0); }
		public Double_NUMContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterDouble_NUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitDouble_NUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitDouble_NUM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(languageParser.DIVISION, 0); }
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterorEqualThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATEROREQUAL() { return getToken(languageParser.GREATEROREQUAL, 0); }
		public GreaterorEqualThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGreaterorEqualThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGreaterorEqualThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGreaterorEqualThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION))) != 0) );
				setState(211);
				match(LPAR);
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(212);
					expression(0);
					}
					}
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0) );
				setState(217);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				_localctx = new Bigger_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(219);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(222); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(224);
				expression(6);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new Integer_NUMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new Double_NUMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(DOUBLE);
				}
				break;
			case 6:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(TXT);
				}
				break;
			case 7:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(233);
						match(PLUS);
						setState(234);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new SubstraktionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(236);
						match(MINUS);
						setState(237);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(239);
						match(MULTIPLICATION);
						setState(240);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(242);
						match(DIVISION);
						setState(243);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new Power_ofContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(245);
						match(POWER_OF);
						setState(246);
						expression(15);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(248);
						match(GREATER);
						setState(249);
						expression(14);
						}
						break;
					case 7:
						{
						_localctx = new LesserThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(251);
						match(LESSER);
						setState(252);
						expression(13);
						}
						break;
					case 8:
						{
						_localctx = new EqualWithContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(254);
						match(EQUAL);
						setState(255);
						expression(12);
						}
						break;
					case 9:
						{
						_localctx = new GreaterorEqualThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(257);
						match(GREATEROREQUAL);
						setState(258);
						expression(11);
						}
						break;
					case 10:
						{
						_localctx = new LesserorEqualThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(260);
						match(LESSEROREQUAL);
						setState(261);
						expression(10);
						}
						break;
					case 11:
						{
						_localctx = new IsNotEqualWithContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(263);
						match(ISNOTEQUAL);
						setState(264);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitConditional_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitConditional_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditional_statement);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				if_statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				break_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseContext extends If_statementContext {
		public TerminalNode IF() { return getToken(languageParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public List<TerminalNode> LCBRAC() { return getTokens(languageParser.LCBRAC); }
		public TerminalNode LCBRAC(int i) {
			return getToken(languageParser.LCBRAC, i);
		}
		public List<TerminalNode> RCBRAC() { return getTokens(languageParser.RCBRAC); }
		public TerminalNode RCBRAC(int i) {
			return getToken(languageParser.RCBRAC, i);
		}
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public Return_funcContext return_func() {
			return getRuleContext(Return_funcContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(languageParser.ELSE, 0); }
		public List<TerminalNode> OR() { return getTokens(languageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(languageParser.OR, i);
		}
		public ElseContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends If_statementContext {
		public TerminalNode IF() { return getToken(languageParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public Return_funcContext return_func() {
			return getRuleContext(Return_funcContext.class,0);
		}
		public List<TerminalNode> OR() { return getTokens(languageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(languageParser.OR, i);
		}
		public IfContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_statement);
		int _la;
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(IF);
				setState(275);
				match(LPAR);
				setState(276);
				expression(0);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(277);
					match(OR);
					setState(278);
					expression(0);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(RPAR);
				setState(285);
				match(LCBRAC);
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INPUT:
				case PRINT:
				case PRINTLN:
				case BREAK:
				case IF:
				case STOP:
				case FOR:
				case WHILE:
				case FOREVER:
				case VOID:
				case TYPE:
				case ID:
					{
					setState(286);
					stmts();
					}
					break;
				case RETURN:
					{
					setState(287);
					return_func();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(290);
				match(RCBRAC);
				}
				break;
			case 2:
				_localctx = new ElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(IF);
				setState(293);
				match(LPAR);
				setState(294);
				expression(0);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(295);
					match(OR);
					setState(296);
					expression(0);
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				match(RPAR);
				setState(303);
				match(LCBRAC);
				setState(306);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INPUT:
				case PRINT:
				case PRINTLN:
				case BREAK:
				case IF:
				case STOP:
				case FOR:
				case WHILE:
				case FOREVER:
				case VOID:
				case TYPE:
				case ID:
					{
					setState(304);
					stmts();
					}
					break;
				case RETURN:
					{
					setState(305);
					return_func();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(308);
				match(RCBRAC);
				{
				setState(309);
				match(ELSE);
				setState(310);
				match(LCBRAC);
				{
				setState(311);
				stmts();
				}
				setState(312);
				match(RCBRAC);
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

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(languageParser.BREAK, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(BREAK);
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

	public static class Iterative_statementContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Forever_loopContext forever_loop() {
			return getRuleContext(Forever_loopContext.class,0);
		}
		public Iterative_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterIterative_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitIterative_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitIterative_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iterative_statementContext iterative_statement() throws RecognitionException {
		Iterative_statementContext _localctx = new Iterative_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_iterative_statement);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				while_loop();
				}
				break;
			case FOREVER:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				forever_loop();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(languageParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(languageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(languageParser.COMMA, i);
		}
		public List<Type_reassignContext> type_reassign() {
			return getRuleContexts(Type_reassignContext.class);
		}
		public Type_reassignContext type_reassign(int i) {
			return getRuleContext(Type_reassignContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public Return_funcContext return_func() {
			return getRuleContext(Return_funcContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(FOR);
			setState(324);
			match(LPAR);
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(325);
				type_declaration();
				}
				break;
			case 2:
				{
				setState(326);
				type_reassign();
				}
				break;
			case 3:
				{
				setState(327);
				match(ID);
				}
				break;
			}
			setState(330);
			match(COMMA);
			{
			setState(331);
			expression(0);
			}
			setState(332);
			match(COMMA);
			setState(333);
			type_reassign();
			setState(334);
			match(RPAR);
			setState(335);
			match(LCBRAC);
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case PRINT:
			case PRINTLN:
			case BREAK:
			case IF:
			case STOP:
			case FOR:
			case WHILE:
			case FOREVER:
			case VOID:
			case TYPE:
			case ID:
				{
				setState(336);
				stmts();
				}
				break;
			case RETURN:
				{
				setState(337);
				return_func();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(340);
			match(RCBRAC);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(languageParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public Return_funcContext return_func() {
			return getRuleContext(Return_funcContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(WHILE);
			setState(343);
			match(LPAR);
			{
			setState(344);
			expression(0);
			}
			setState(345);
			match(RPAR);
			setState(346);
			match(LCBRAC);
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case PRINT:
			case PRINTLN:
			case BREAK:
			case IF:
			case STOP:
			case FOR:
			case WHILE:
			case FOREVER:
			case VOID:
			case TYPE:
			case ID:
				{
				setState(347);
				stmts();
				}
				break;
			case RETURN:
				{
				setState(348);
				return_func();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(351);
			match(RCBRAC);
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

	public static class Forever_loopContext extends ParserRuleContext {
		public TerminalNode FOREVER() { return getToken(languageParser.FOREVER, 0); }
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public Return_funcContext return_func() {
			return getRuleContext(Return_funcContext.class,0);
		}
		public Forever_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forever_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterForever_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitForever_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitForever_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forever_loopContext forever_loop() throws RecognitionException {
		Forever_loopContext _localctx = new Forever_loopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forever_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(FOREVER);
			setState(354);
			match(LCBRAC);
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case PRINT:
			case PRINTLN:
			case BREAK:
			case IF:
			case STOP:
			case FOR:
			case WHILE:
			case FOREVER:
			case VOID:
			case TYPE:
			case ID:
				{
				setState(355);
				stmts();
				}
				break;
			case RETURN:
				{
				setState(356);
				return_func();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(359);
			match(RCBRAC);
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
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u016c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\6\3:\n\3\r\3\16\3;\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\6\7R"+
		"\n\7\r\7\16\7S\3\7\5\7W\n\7\3\7\3\7\3\b\3\b\3\b\6\b^\n\b\r\b\16\b_\3\b"+
		"\5\bc\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\np\n\n\r\n\16"+
		"\nq\3\n\5\nu\n\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\7\13~\n\13\f\13\16\13"+
		"\u0081\13\13\3\f\3\f\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u0091\n\f\f\f\16\f\u0094\13\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u009d\n\f\f\f\16\f\u00a0\13\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a7\n"+
		"\f\f\f\16\f\u00aa\13\f\3\f\5\f\u00ad\n\f\3\r\3\r\3\r\7\r\u00b2\n\r\f\r"+
		"\16\r\u00b5\13\r\3\16\3\16\3\16\7\16\u00ba\n\16\f\16\16\16\u00bd\13\16"+
		"\3\16\3\16\3\17\3\17\3\17\6\17\u00c4\n\17\r\17\16\17\u00c5\3\20\3\20\3"+
		"\20\7\20\u00cb\n\20\f\20\16\20\u00ce\13\20\3\21\3\21\6\21\u00d2\n\21\r"+
		"\21\16\21\u00d3\3\21\3\21\6\21\u00d8\n\21\r\21\16\21\u00d9\3\21\3\21\3"+
		"\21\6\21\u00df\n\21\r\21\16\21\u00e0\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00e9\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u010c\n\21\f\21\16\21\u010f\13"+
		"\21\3\22\3\22\5\22\u0113\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u011a\n\23"+
		"\f\23\16\23\u011d\13\23\3\23\3\23\3\23\3\23\5\23\u0123\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u012c\n\23\f\23\16\23\u012f\13\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0135\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u013d"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\5\25\u0144\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u014b\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0155\n"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0160\n\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\5\30\u0168\n\30\3\30\3\30\3\30\2\3 \31\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\17\22\2\u0196\2\63"+
		"\3\2\2\2\49\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16Z\3"+
		"\2\2\2\20f\3\2\2\2\22x\3\2\2\2\24z\3\2\2\2\26\u00ac\3\2\2\2\30\u00ae\3"+
		"\2\2\2\32\u00b6\3\2\2\2\34\u00c0\3\2\2\2\36\u00c7\3\2\2\2 \u00e8\3\2\2"+
		"\2\"\u0112\3\2\2\2$\u013c\3\2\2\2&\u013e\3\2\2\2(\u0143\3\2\2\2*\u0145"+
		"\3\2\2\2,\u0158\3\2\2\2.\u0163\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62"+
		"\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66"+
		"\67\7\2\2\3\67\3\3\2\2\28:\5\6\4\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2"+
		"\2\2<\5\3\2\2\2=F\5\"\22\2>F\5(\25\2?F\5\n\6\2@F\5\f\7\2AF\5\16\b\2BF"+
		"\5\20\t\2CF\5\b\5\2DF\5\32\16\2E=\3\2\2\2E>\3\2\2\2E?\3\2\2\2E@\3\2\2"+
		"\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GH\7\25\2\2H\t\3"+
		"\2\2\2IM\5\22\n\2JM\5\26\f\2KM\5\24\13\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2"+
		"M\13\3\2\2\2NO\7\n\2\2OV\7\34\2\2PR\5 \21\2QP\3\2\2\2RS\3\2\2\2SQ\3\2"+
		"\2\2ST\3\2\2\2TW\3\2\2\2UW\5\32\16\2VQ\3\2\2\2VU\3\2\2\2WX\3\2\2\2XY\7"+
		"\35\2\2Y\r\3\2\2\2Z[\7\13\2\2[b\7\34\2\2\\^\5 \21\2]\\\3\2\2\2^_\3\2\2"+
		"\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2ac\5\32\16\2b]\3\2\2\2ba\3\2\2\2cd\3\2"+
		"\2\2de\7\35\2\2e\17\3\2\2\2fg\7\t\2\2gh\7\34\2\2hi\5 \21\2ij\7\35\2\2"+
		"j\21\3\2\2\2kl\7 \2\2lm\7.\2\2mt\7%\2\2np\5 \21\2on\3\2\2\2pq\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2su\7*\2\2to\3\2\2\2ts\3\2\2\2uy\3\2\2\2"+
		"vw\7 \2\2wy\7.\2\2xk\3\2\2\2xv\3\2\2\2y\23\3\2\2\2z{\7.\2\2{\177\7%\2"+
		"\2|~\5 \21\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\25\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7 \2\2\u0083\u0084\7.\2\2\u0084"+
		"\u0088\7\34\2\2\u0085\u0087\5\30\r\2\u0086\u0085\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7\35\2\2\u008c\u0092\7\36\2\2\u008d\u0091\5"+
		"\4\3\2\u008e\u0091\7.\2\2\u008f\u0091\5\22\n\2\u0090\u008d\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\5\34\17\2\u0096\u0097\7\37\2\2\u0097\u00ad\3\2\2\2\u0098\u0099"+
		"\7\33\2\2\u0099\u009a\7.\2\2\u009a\u009e\7\34\2\2\u009b\u009d\5\30\r\2"+
		"\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\35\2\2"+
		"\u00a2\u00a8\7\36\2\2\u00a3\u00a7\5\4\3\2\u00a4\u00a7\7.\2\2\u00a5\u00a7"+
		"\5\22\n\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\7\37\2\2\u00ac\u0082\3\2\2\2"+
		"\u00ac\u0098\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00b3\5\22\n\2\u00af\u00b0"+
		"\7\31\2\2\u00b0\u00b2\5\22\n\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\31\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7\u00bb\7\34\2\2\u00b8\u00ba\5\36\20\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\35\2\2"+
		"\u00bf\33\3\2\2\2\u00c0\u00c3\7+\2\2\u00c1\u00c4\5 \21\2\u00c2\u00c4\5"+
		"\32\16\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00cc\5 \21"+
		"\2\u00c8\u00c9\7\31\2\2\u00c9\u00cb\5 \21\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\37\3\2\2"+
		"\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\b\21\1\2\u00d0\u00d2\t\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\7\34\2\2\u00d6\u00d8\5 \21\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\35\2\2\u00dc\u00e9\3\2\2\2\u00dd"+
		"\u00df\t\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e9\5 \21\b\u00e3"+
		"\u00e9\7.\2\2\u00e4\u00e9\7&\2\2\u00e5\u00e9\7(\2\2\u00e6\u00e9\7)\2\2"+
		"\u00e7\u00e9\7*\2\2\u00e8\u00cf\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00e3"+
		"\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u010d\3\2\2\2\u00ea\u00eb\f\24\2\2\u00eb\u00ec\7"+
		"\17\2\2\u00ec\u010c\5 \21\25\u00ed\u00ee\f\23\2\2\u00ee\u00ef\7\20\2\2"+
		"\u00ef\u010c\5 \21\24\u00f0\u00f1\f\22\2\2\u00f1\u00f2\7\21\2\2\u00f2"+
		"\u010c\5 \21\23\u00f3\u00f4\f\21\2\2\u00f4\u00f5\7\22\2\2\u00f5\u010c"+
		"\5 \21\22\u00f6\u00f7\f\20\2\2\u00f7\u00f8\7\23\2\2\u00f8\u010c\5 \21"+
		"\21\u00f9\u00fa\f\17\2\2\u00fa\u00fb\7\3\2\2\u00fb\u010c\5 \21\20\u00fc"+
		"\u00fd\f\16\2\2\u00fd\u00fe\7\4\2\2\u00fe\u010c\5 \21\17\u00ff\u0100\f"+
		"\r\2\2\u0100\u0101\7\5\2\2\u0101\u010c\5 \21\16\u0102\u0103\f\f\2\2\u0103"+
		"\u0104\7\6\2\2\u0104\u010c\5 \21\r\u0105\u0106\f\13\2\2\u0106\u0107\7"+
		"\7\2\2\u0107\u010c\5 \21\f\u0108\u0109\f\n\2\2\u0109\u010a\7\b\2\2\u010a"+
		"\u010c\5 \21\13\u010b\u00ea\3\2\2\2\u010b\u00ed\3\2\2\2\u010b\u00f0\3"+
		"\2\2\2\u010b\u00f3\3\2\2\2\u010b\u00f6\3\2\2\2\u010b\u00f9\3\2\2\2\u010b"+
		"\u00fc\3\2\2\2\u010b\u00ff\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0105\3\2"+
		"\2\2\u010b\u0108\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e!\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0113\5$\23\2"+
		"\u0111\u0113\5&\24\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113#\3"+
		"\2\2\2\u0114\u0115\7\r\2\2\u0115\u0116\7\34\2\2\u0116\u011b\5 \21\2\u0117"+
		"\u0118\7\24\2\2\u0118\u011a\5 \21\2\u0119\u0117\3\2\2\2\u011a\u011d\3"+
		"\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\7\35\2\2\u011f\u0122\7\36\2\2\u0120\u0123\5"+
		"\4\3\2\u0121\u0123\5\34\17\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0125\7\37\2\2\u0125\u013d\3\2\2\2\u0126\u0127\7"+
		"\r\2\2\u0127\u0128\7\34\2\2\u0128\u012d\5 \21\2\u0129\u012a\7\24\2\2\u012a"+
		"\u012c\5 \21\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0131\7\35\2\2\u0131\u0134\7\36\2\2\u0132\u0135\5\4\3\2\u0133\u0135\5"+
		"\34\17\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\7\37\2\2\u0137\u0138\7\16\2\2\u0138\u0139\7\36\2\2\u0139\u013a"+
		"\5\4\3\2\u013a\u013b\7\37\2\2\u013b\u013d\3\2\2\2\u013c\u0114\3\2\2\2"+
		"\u013c\u0126\3\2\2\2\u013d%\3\2\2\2\u013e\u013f\7\f\2\2\u013f\'\3\2\2"+
		"\2\u0140\u0144\5*\26\2\u0141\u0144\5,\27\2\u0142\u0144\5.\30\2\u0143\u0140"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144)\3\2\2\2\u0145"+
		"\u0146\7\26\2\2\u0146\u014a\7\34\2\2\u0147\u014b\5\22\n\2\u0148\u014b"+
		"\5\24\13\2\u0149\u014b\7.\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2"+
		"\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\31\2\2\u014d\u014e"+
		"\5 \21\2\u014e\u014f\7\31\2\2\u014f\u0150\5\24\13\2\u0150\u0151\7\35\2"+
		"\2\u0151\u0154\7\36\2\2\u0152\u0155\5\4\3\2\u0153\u0155\5\34\17\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\37"+
		"\2\2\u0157+\3\2\2\2\u0158\u0159\7\27\2\2\u0159\u015a\7\34\2\2\u015a\u015b"+
		"\5 \21\2\u015b\u015c\7\35\2\2\u015c\u015f\7\36\2\2\u015d\u0160\5\4\3\2"+
		"\u015e\u0160\5\34\17\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\7\37\2\2\u0162-\3\2\2\2\u0163\u0164\7\30\2\2\u0164"+
		"\u0167\7\36\2\2\u0165\u0168\5\4\3\2\u0166\u0168\5\34\17\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7\37\2\2"+
		"\u016a/\3\2\2\2+\63;ELSV_bqtx\177\u0088\u0090\u0092\u009e\u00a6\u00a8"+
		"\u00ac\u00b3\u00bb\u00c3\u00c5\u00cc\u00d3\u00d9\u00e0\u00e8\u010b\u010d"+
		"\u0112\u011b\u0122\u012d\u0134\u013c\u0143\u014a\u0154\u015f\u0167";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}