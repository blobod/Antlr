// Generated from /Users/abdallahziadalnaif/Desktop/Antlr/src/main/java/grammar/language.g4 by ANTLR 4.9.2
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
		GREATHER=1, LESSER=2, EQUAL=3, GREATHEROREQUAL=4, LESSEROREQUAL=5, ISNOTEQUAL=6, 
		PRINT=7, BREAK=8, IF=9, ELSE=10, PLUS=11, MINUS=12, MULTIPLICATION=13, 
		DIVISION=14, POWER_OF=15, OR=16, STOP=17, FOR=18, WHILE=19, FOREVER=20, 
		START=21, COMMA=22, AT_SIGN=23, VOID=24, LPAR=25, RPAR=26, LCBRAC=27, 
		RCBRAC=28, TYPE=29, INT_TYPE=30, DOUBLE_TYPE=31, TXT_TYPE=32, BOOL_TYPE=33, 
		ASSIGN=34, VALUE=35, INT=36, DOT=37, DOUBLE=38, TXT=39, BOOL=40, TRUE=41, 
		FALSE=42, ID=43, WS=44, COMMENT=45, LINE_COMMENT=46;
	public static final int
		RULE_language = 0, RULE_entrypoint = 1, RULE_stmts = 2, RULE_stmt = 3, 
		RULE_declaration = 4, RULE_print = 5, RULE_type_definition = 6, RULE_type_reassign = 7, 
		RULE_function_declaration = 8, RULE_param = 9, RULE_expression = 10, RULE_conditional_statement = 11, 
		RULE_if_statement = 12, RULE_break_statement = 13, RULE_iterative_statement = 14, 
		RULE_for_loop = 15, RULE_while_loop = 16, RULE_forever_loop = 17, RULE_condition = 18, 
		RULE_boolean_expression = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"language", "entrypoint", "stmts", "stmt", "declaration", "print", "type_definition", 
			"type_reassign", "function_declaration", "param", "expression", "conditional_statement", 
			"if_statement", "break_statement", "iterative_statement", "for_loop", 
			"while_loop", "forever_loop", "condition", "boolean_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'print'", "'break'", "'if'", 
			"'else'", "'+'", "'-'", "'*'", "'/'", "'^'", "'||'", "'stop'", "'for'", 
			"'while'", "'forever'", "'start'", "','", "'@'", "'void'", "'('", "')'", 
			"'{'", "'}'", null, "'int'", "'double'", "'txt'", "'bool'", "'='", null, 
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATHER", "LESSER", "EQUAL", "GREATHEROREQUAL", "LESSEROREQUAL", 
			"ISNOTEQUAL", "PRINT", "BREAK", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "POWER_OF", "OR", "STOP", "FOR", "WHILE", "FOREVER", "START", 
			"COMMA", "AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "TYPE", 
			"INT_TYPE", "DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", "VALUE", 
			"INT", "DOT", "DOUBLE", "TXT", "BOOL", "TRUE", "FALSE", "ID", "WS", "COMMENT", 
			"LINE_COMMENT"
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
		public EntrypointContext entrypoint() {
			return getRuleContext(EntrypointContext.class,0);
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(40);
					stmts();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(47);
					stmts();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				entrypoint();
				setState(54);
				match(EOF);
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

	public static class EntrypointContext extends ParserRuleContext {
		public List<TerminalNode> AT_SIGN() { return getTokens(languageParser.AT_SIGN); }
		public TerminalNode AT_SIGN(int i) {
			return getToken(languageParser.AT_SIGN, i);
		}
		public TerminalNode START() { return getToken(languageParser.START, 0); }
		public TerminalNode STOP() { return getToken(languageParser.STOP, 0); }
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public EntrypointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrypoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterEntrypoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitEntrypoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitEntrypoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntrypointContext entrypoint() throws RecognitionException {
		EntrypointContext _localctx = new EntrypointContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entrypoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(58);
			match(AT_SIGN);
			setState(59);
			match(START);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				stmts();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0) );
			setState(65);
			match(AT_SIGN);
			setState(66);
			match(STOP);
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

	public static class StmtsContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
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
		enterRule(_localctx, 4, RULE_stmts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			stmt();
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
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				conditional_statement();
				}
				break;
			case FOR:
			case WHILE:
			case FOREVER:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				iterative_statement();
				}
				break;
			case VOID:
			case TYPE:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				declaration();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				print();
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

	public static class DeclarationContext extends ParserRuleContext {
		public Type_definitionContext type_definition() {
			return getRuleContext(Type_definitionContext.class,0);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				type_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				function_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
			setState(81);
			match(PRINT);
			setState(82);
			match(LPAR);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(83);
					expression(0);
					}
					break;
				case 2:
					{
					setState(84);
					stmt();
					}
					break;
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << VALUE) | (1L << ID))) != 0) );
			setState(89);
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

	public static class Type_definitionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(languageParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(languageParser.ASSIGN, 0); }
		public TerminalNode VALUE() { return getToken(languageParser.VALUE, 0); }
		public TerminalNode TXT() { return getToken(languageParser.TXT, 0); }
		public TerminalNode BOOL() { return getToken(languageParser.BOOL, 0); }
		public Type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterType_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitType_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitType_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_definitionContext type_definition() throws RecognitionException {
		Type_definitionContext _localctx = new Type_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(TYPE);
			setState(92);
			match(ID);
			setState(93);
			match(ASSIGN);
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0)) ) {
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

	public static class Type_reassignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(languageParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(languageParser.VALUE, 0); }
		public TerminalNode TXT() { return getToken(languageParser.TXT, 0); }
		public TerminalNode BOOL() { return getToken(languageParser.BOOL, 0); }
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
		enterRule(_localctx, 14, RULE_type_reassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(ID);
			setState(97);
			match(ASSIGN);
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(98);
				expression(0);
				}
				break;
			case 2:
				{
				setState(99);
				match(ID);
				}
				break;
			case 3:
				{
				setState(100);
				match(VALUE);
				}
				break;
			case 4:
				{
				setState(101);
				match(TXT);
				}
				break;
			case 5:
				{
				setState(102);
				match(BOOL);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public TerminalNode TYPE() { return getToken(languageParser.TYPE, 0); }
		public TerminalNode VOID() { return getToken(languageParser.VOID, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Type_definitionContext> type_definition() {
			return getRuleContexts(Type_definitionContext.class);
		}
		public Type_definitionContext type_definition(int i) {
			return getRuleContext(Type_definitionContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			match(ID);
			setState(107);
			match(LPAR);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				param();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==TYPE );
			setState(113);
			match(RPAR);
			setState(114);
			match(LCBRAC);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << VALUE) | (1L << ID))) != 0)) {
				{
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(115);
					stmt();
					}
					break;
				case 2:
					{
					setState(116);
					match(ID);
					}
					break;
				case 3:
					{
					setState(117);
					expression(0);
					}
					break;
				case 4:
					{
					setState(118);
					type_definition();
					}
					break;
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(languageParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
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
		enterRule(_localctx, 18, RULE_param);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(TYPE);
				setState(127);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(128);
					match(COMMA);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(TYPE);
				setState(135);
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
	public static class NumberContext extends ExpressionContext {
		public TerminalNode VALUE() { return getToken(languageParser.VALUE, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitNumber(this);
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
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
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION))) != 0) );
				setState(144);
				match(LPAR);
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					expression(0);
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << VALUE) | (1L << ID))) != 0) );
				setState(150);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				_localctx = new Bigger_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(152);
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
					setState(155); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(157);
				expression(3);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(VALUE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(163);
						match(PLUS);
						setState(164);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new SubstraktionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(166);
						match(MINUS);
						setState(167);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(169);
						match(MULTIPLICATION);
						setState(170);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(172);
						match(DIVISION);
						setState(173);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new Power_ofContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(175);
						match(POWER_OF);
						setState(176);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 22, RULE_conditional_statement);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				if_statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		public TerminalNode IF() { return getToken(languageParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(languageParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(IF);
			setState(187);
			match(LPAR);
			setState(188);
			condition();
			setState(189);
			match(RPAR);
			setState(190);
			match(LCBRAC);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				stmt();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0) );
			setState(196);
			match(RCBRAC);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(197);
				match(ELSE);
				setState(198);
				match(LCBRAC);
				setState(199);
				stmt();
				setState(200);
				match(RCBRAC);
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
		enterRule(_localctx, 26, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		enterRule(_localctx, 28, RULE_iterative_statement);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				while_loop();
				}
				break;
			case FOREVER:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		enterRule(_localctx, 30, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(FOR);
			setState(212);
			match(LPAR);
			{
			setState(213);
			stmt();
			}
			setState(214);
			match(COMMA);
			{
			setState(215);
			condition();
			}
			setState(216);
			match(COMMA);
			setState(217);
			expression(0);
			setState(218);
			match(LCBRAC);
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				stmt();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0) );
			setState(224);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
		enterRule(_localctx, 32, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(WHILE);
			setState(227);
			match(LPAR);
			{
			setState(228);
			condition();
			}
			setState(229);
			match(RPAR);
			setState(230);
			match(LCBRAC);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				stmt();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0) );
			setState(236);
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
		enterRule(_localctx, 34, RULE_forever_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(FOREVER);
			setState(239);
			match(LCBRAC);
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				stmt();
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0) );
			setState(245);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(languageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(languageParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			boolean_expression();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(248);
				match(OR);
				setState(249);
				boolean_expression();
				}
				}
				setState(254);
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
	 
		public Boolean_expressionContext() { }
		public void copyFrom(Boolean_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreatherThanContext extends Boolean_expressionContext {
		public TerminalNode GREATHER() { return getToken(languageParser.GREATHER, 0); }
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(languageParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(languageParser.VALUE, i);
		}
		public GreatherThanContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGreatherThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGreatherThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGreatherThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreatherorEqualThanContext extends Boolean_expressionContext {
		public TerminalNode GREATHEROREQUAL() { return getToken(languageParser.GREATHEROREQUAL, 0); }
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(languageParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(languageParser.VALUE, i);
		}
		public GreatherorEqualThanContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGreatherorEqualThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGreatherorEqualThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGreatherorEqualThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualWithContext extends Boolean_expressionContext {
		public TerminalNode EQUAL() { return getToken(languageParser.EQUAL, 0); }
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(languageParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(languageParser.VALUE, i);
		}
		public EqualWithContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
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
	public static class LesserorEqualThanContext extends Boolean_expressionContext {
		public TerminalNode LESSEROREQUAL() { return getToken(languageParser.LESSEROREQUAL, 0); }
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(languageParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(languageParser.VALUE, i);
		}
		public LesserorEqualThanContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
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
	public static class IsNotEqualWithContext extends Boolean_expressionContext {
		public TerminalNode ISNOTEQUAL() { return getToken(languageParser.ISNOTEQUAL, 0); }
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(languageParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(languageParser.VALUE, i);
		}
		public IsNotEqualWithContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
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
	public static class LesserThanContext extends Boolean_expressionContext {
		public TerminalNode LESSER() { return getToken(languageParser.LESSER, 0); }
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(languageParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(languageParser.VALUE, i);
		}
		public LesserThanContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
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

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolean_expression);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new GreatherThanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				match(GREATHER);
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new LesserThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				match(LESSER);
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new EqualWithContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				match(EQUAL);
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new GreatherorEqualThanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(265);
				match(GREATHEROREQUAL);
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				_localctx = new LesserorEqualThanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				match(LESSEROREQUAL);
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				_localctx = new IsNotEqualWithContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(271);
				match(ISNOTEQUAL);
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0116\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\2\5\2;\n\2\3\3\3\3\3\3\6\3@\n\3\r\3"+
		"\16\3A\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\5\6R\n"+
		"\6\3\7\3\7\3\7\3\7\6\7X\n\7\r\7\16\7Y\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\n\3\n\6\np\n\n\r\n\16\nq\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\7\13\u0084\n\13\f\13\16\13\u0087\13\13\3\13\3\13\5\13\u008b\n\13\3\f"+
		"\3\f\6\f\u008f\n\f\r\f\16\f\u0090\3\f\3\f\6\f\u0095\n\f\r\f\16\f\u0096"+
		"\3\f\3\f\3\f\6\f\u009c\n\f\r\f\16\f\u009d\3\f\3\f\3\f\5\f\u00a3\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b4\n"+
		"\f\f\f\16\f\u00b7\13\f\3\r\3\r\5\r\u00bb\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\6\16\u00c3\n\16\r\16\16\16\u00c4\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00cd\n\16\3\17\3\17\3\20\3\20\3\20\5\20\u00d4\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00df\n\21\r\21\16\21\u00e0\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00eb\n\22\r\22\16\22\u00ec\3\22"+
		"\3\22\3\23\3\23\3\23\6\23\u00f4\n\23\r\23\16\23\u00f5\3\23\3\23\3\24\3"+
		"\24\3\24\7\24\u00fd\n\24\f\24\16\24\u0100\13\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u0114\n\25\3\25\2\3\26\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(\2\6\5\2%%)*--\4\2\32\32\37\37\3\2\r\20\4\2%%--\2\u0130\2:\3\2\2"+
		"\2\4<\3\2\2\2\6F\3\2\2\2\bL\3\2\2\2\nQ\3\2\2\2\fS\3\2\2\2\16]\3\2\2\2"+
		"\20b\3\2\2\2\22k\3\2\2\2\24\u008a\3\2\2\2\26\u00a2\3\2\2\2\30\u00ba\3"+
		"\2\2\2\32\u00bc\3\2\2\2\34\u00ce\3\2\2\2\36\u00d3\3\2\2\2 \u00d5\3\2\2"+
		"\2\"\u00e4\3\2\2\2$\u00f0\3\2\2\2&\u00f9\3\2\2\2(\u0113\3\2\2\2*,\5\6"+
		"\4\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60"+
		";\7\2\2\3\61\63\5\6\4\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65"+
		"\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\5\4\3\289\7\2\2\39;\3\2\2\2:"+
		"-\3\2\2\2:\64\3\2\2\2;\3\3\2\2\2<=\7\31\2\2=?\7\27\2\2>@\5\6\4\2?>\3\2"+
		"\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\31\2\2DE\7\23\2\2E\5"+
		"\3\2\2\2FG\5\b\5\2G\7\3\2\2\2HM\5\30\r\2IM\5\36\20\2JM\5\n\6\2KM\5\f\7"+
		"\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\t\3\2\2\2NR\5\16\b\2OR\5\22"+
		"\n\2PR\5\20\t\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\13\3\2\2\2ST\7\t\2\2TW"+
		"\7\33\2\2UX\5\26\f\2VX\5\b\5\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2"+
		"YZ\3\2\2\2Z[\3\2\2\2[\\\7\34\2\2\\\r\3\2\2\2]^\7\37\2\2^_\7-\2\2_`\7$"+
		"\2\2`a\t\2\2\2a\17\3\2\2\2bc\7-\2\2ci\7$\2\2dj\5\26\f\2ej\7-\2\2fj\7%"+
		"\2\2gj\7)\2\2hj\7*\2\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2"+
		"\2j\21\3\2\2\2kl\t\3\2\2lm\7-\2\2mo\7\33\2\2np\5\24\13\2on\3\2\2\2pq\3"+
		"\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\34\2\2t{\7\35\2\2uz\5\b\5\2v"+
		"z\7-\2\2wz\5\26\f\2xz\5\16\b\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2"+
		"z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\36\2\2\177\23"+
		"\3\2\2\2\u0080\u0081\7\37\2\2\u0081\u008b\7-\2\2\u0082\u0084\7\30\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\37\2\2"+
		"\u0089\u008b\7-\2\2\u008a\u0080\3\2\2\2\u008a\u0085\3\2\2\2\u008b\25\3"+
		"\2\2\2\u008c\u008e\b\f\1\2\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\7\33\2\2\u0093\u0095\5\26\f\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\7\34\2\2\u0099\u00a3\3\2\2\2\u009a\u009c\t\4\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\5\26\f\5\u00a0\u00a3\7-\2\2\u00a1"+
		"\u00a3\7%\2\2\u00a2\u008c\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00b5\3\2\2\2\u00a4\u00a5\f\13\2\2\u00a5"+
		"\u00a6\7\r\2\2\u00a6\u00b4\5\26\f\f\u00a7\u00a8\f\n\2\2\u00a8\u00a9\7"+
		"\16\2\2\u00a9\u00b4\5\26\f\13\u00aa\u00ab\f\t\2\2\u00ab\u00ac\7\17\2\2"+
		"\u00ac\u00b4\5\26\f\n\u00ad\u00ae\f\b\2\2\u00ae\u00af\7\20\2\2\u00af\u00b4"+
		"\5\26\f\t\u00b0\u00b1\f\7\2\2\u00b1\u00b2\7\21\2\2\u00b2\u00b4\5\26\f"+
		"\b\u00b3\u00a4\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ad"+
		"\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\27\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\5\32\16"+
		"\2\u00b9\u00bb\5\34\17\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\31\3\2\2\2\u00bc\u00bd\7\13\2\2\u00bd\u00be\7\33\2\2\u00be\u00bf\5&\24"+
		"\2\u00bf\u00c0\7\34\2\2\u00c0\u00c2\7\35\2\2\u00c1\u00c3\5\b\5\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cc\7\36\2\2\u00c7\u00c8\7\f\2\2\u00c8"+
		"\u00c9\7\35\2\2\u00c9\u00ca\5\b\5\2\u00ca\u00cb\7\36\2\2\u00cb\u00cd\3"+
		"\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\33\3\2\2\2\u00ce"+
		"\u00cf\7\n\2\2\u00cf\35\3\2\2\2\u00d0\u00d4\5 \21\2\u00d1\u00d4\5\"\22"+
		"\2\u00d2\u00d4\5$\23\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\37\3\2\2\2\u00d5\u00d6\7\24\2\2\u00d6\u00d7\7\33\2\2\u00d7"+
		"\u00d8\5\b\5\2\u00d8\u00d9\7\30\2\2\u00d9\u00da\5&\24\2\u00da\u00db\7"+
		"\30\2\2\u00db\u00dc\5\26\f\2\u00dc\u00de\7\35\2\2\u00dd\u00df\5\b\5\2"+
		"\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\36\2\2\u00e3!\3\2\2\2\u00e4"+
		"\u00e5\7\25\2\2\u00e5\u00e6\7\33\2\2\u00e6\u00e7\5&\24\2\u00e7\u00e8\7"+
		"\34\2\2\u00e8\u00ea\7\35\2\2\u00e9\u00eb\5\b\5\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\7\36\2\2\u00ef#\3\2\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f3"+
		"\7\35\2\2\u00f2\u00f4\5\b\5\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\7\36\2\2\u00f8%\3\2\2\2\u00f9\u00fe\5(\25\2\u00fa\u00fb\7\22\2\2\u00fb"+
		"\u00fd\5(\25\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\'\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102"+
		"\t\5\2\2\u0102\u0103\7\3\2\2\u0103\u0114\t\5\2\2\u0104\u0105\t\5\2\2\u0105"+
		"\u0106\7\4\2\2\u0106\u0114\t\5\2\2\u0107\u0108\t\5\2\2\u0108\u0109\7\5"+
		"\2\2\u0109\u0114\t\5\2\2\u010a\u010b\t\5\2\2\u010b\u010c\7\6\2\2\u010c"+
		"\u0114\t\5\2\2\u010d\u010e\t\5\2\2\u010e\u010f\7\7\2\2\u010f\u0114\t\5"+
		"\2\2\u0110\u0111\t\5\2\2\u0111\u0112\7\b\2\2\u0112\u0114\t\5\2\2\u0113"+
		"\u0101\3\2\2\2\u0113\u0104\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u010a\3\2"+
		"\2\2\u0113\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114)\3\2\2\2\37-\64:AL"+
		"QWYiqy{\u0085\u008a\u0090\u0096\u009d\u00a2\u00b3\u00b5\u00ba\u00c4\u00cc"+
		"\u00d3\u00e0\u00ec\u00f5\u00fe\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}