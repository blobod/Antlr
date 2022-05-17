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
		INPUT=7, PRINT=8, BREAK=9, IF=10, ELSE=11, PLUS=12, MINUS=13, MULTIPLICATION=14, 
		DIVISION=15, POWER_OF=16, OR=17, STOP=18, FOR=19, WHILE=20, FOREVER=21, 
		START=22, COMMA=23, AT_SIGN=24, VOID=25, LPAR=26, RPAR=27, LCBRAC=28, 
		RCBRAC=29, TYPE=30, INT_TYPE=31, DOUBLE_TYPE=32, TXT_TYPE=33, BOOL_TYPE=34, 
		ASSIGN=35, VALUE=36, INT=37, DOT=38, DOUBLE=39, TXT=40, BOOL=41, TRUE=42, 
		FALSE=43, ID=44, WS=45, COMMENT=46, LINE_COMMENT=47;
	public static final int
		RULE_language = 0, RULE_entrypoint = 1, RULE_stmts = 2, RULE_stmt = 3, 
		RULE_declaration = 4, RULE_print = 5, RULE_input = 6, RULE_type_definition = 7, 
		RULE_type_reassign = 8, RULE_function_declaration = 9, RULE_param = 10, 
		RULE_expression = 11, RULE_conditional_statement = 12, RULE_if_statement = 13, 
		RULE_break_statement = 14, RULE_iterative_statement = 15, RULE_for_loop = 16, 
		RULE_while_loop = 17, RULE_forever_loop = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"language", "entrypoint", "stmts", "stmt", "declaration", "print", "input", 
			"type_definition", "type_reassign", "function_declaration", "param", 
			"expression", "conditional_statement", "if_statement", "break_statement", 
			"iterative_statement", "for_loop", "while_loop", "forever_loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", null, null, null, null, null, "'input'", "'print'", "'break'", 
			"'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'^'", "'||'", "'stop'", 
			"'for'", "'while'", "'forever'", "'start'", "','", "'@'", "'void'", "'('", 
			"')'", "'{'", "'}'", null, "'int'", "'double'", "'txt'", "'bool'", "'='", 
			null, null, "'.'", null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATER", "LESSER", "EQUAL", "GREATEROREQUAL", "LESSEROREQUAL", 
			"ISNOTEQUAL", "INPUT", "PRINT", "BREAK", "IF", "ELSE", "PLUS", "MINUS", 
			"MULTIPLICATION", "DIVISION", "POWER_OF", "OR", "STOP", "FOR", "WHILE", 
			"FOREVER", "START", "COMMA", "AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", 
			"RCBRAC", "TYPE", "INT_TYPE", "DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", 
			"ASSIGN", "VALUE", "INT", "DOT", "DOUBLE", "TXT", "BOOL", "TRUE", "FALSE", 
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(38);
					stmts();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(45);
					stmts();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				entrypoint();
				setState(52);
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
			setState(56);
			match(AT_SIGN);
			setState(57);
			match(START);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				stmts();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << ID))) != 0) );
			setState(63);
			match(AT_SIGN);
			setState(64);
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
		enterRule(_localctx, 4, RULE_stmts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(66);
					stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				conditional_statement();
				}
				break;
			case FOR:
			case WHILE:
			case FOREVER:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				iterative_statement();
				}
				break;
			case VOID:
			case TYPE:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				declaration();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				print();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				input();
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				type_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				function_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
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
			setState(83);
			match(PRINT);
			setState(84);
			match(LPAR);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				expression(0);
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << VALUE) | (1L << TXT) | (1L << ID))) != 0) );
			setState(90);
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
		enterRule(_localctx, 12, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(INPUT);
			setState(93);
			match(LPAR);
			setState(94);
			expression(0);
			setState(95);
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
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
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
		enterRule(_localctx, 14, RULE_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(TYPE);
			setState(98);
			match(ID);
			setState(99);
			match(ASSIGN);
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << TXT) | (1L << BOOL))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_type_reassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(ASSIGN);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(104);
				expression(0);
				}
				break;
			case 2:
				{
				setState(105);
				match(ID);
				}
				break;
			case 3:
				{
				setState(106);
				match(VALUE);
				}
				break;
			case 4:
				{
				setState(107);
				match(TXT);
				}
				break;
			case 5:
				{
				setState(108);
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
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
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
		enterRule(_localctx, 18, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(112);
			match(ID);
			setState(113);
			match(LPAR);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				param();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA || _la==TYPE );
			setState(119);
			match(RPAR);
			setState(120);
			match(LCBRAC);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << PRINT) | (1L << BREAK) | (1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << VOID) | (1L << TYPE) | (1L << VALUE) | (1L << TXT) | (1L << ID))) != 0)) {
				{
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(121);
					stmts();
					}
					break;
				case 2:
					{
					setState(122);
					match(ID);
					}
					break;
				case 3:
					{
					setState(123);
					expression(0);
					}
					break;
				case 4:
					{
					setState(124);
					type_definition();
					}
					break;
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
		enterRule(_localctx, 20, RULE_param);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(TYPE);
				setState(133);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(134);
					match(COMMA);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(TYPE);
				setState(141);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
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
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION))) != 0) );
				setState(150);
				match(LPAR);
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151);
					expression(0);
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLICATION) | (1L << DIVISION) | (1L << VALUE) | (1L << TXT) | (1L << ID))) != 0) );
				setState(156);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				_localctx = new Bigger_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(158);
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
					setState(161); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(163);
				expression(4);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(VALUE);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(TXT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(170);
						match(PLUS);
						setState(171);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new SubstraktionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(173);
						match(MINUS);
						setState(174);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(176);
						match(MULTIPLICATION);
						setState(177);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(179);
						match(DIVISION);
						setState(180);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new Power_ofContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(182);
						match(POWER_OF);
						setState(183);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(185);
						match(GREATER);
						setState(186);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new LesserThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(188);
						match(LESSER);
						setState(189);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new EqualWithContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(191);
						match(EQUAL);
						setState(192);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new GreaterorEqualThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(194);
						match(GREATEROREQUAL);
						setState(195);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new LesserorEqualThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(197);
						match(LESSEROREQUAL);
						setState(198);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new IsNotEqualWithContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(200);
						match(ISNOTEQUAL);
						setState(201);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(206);
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
		enterRule(_localctx, 24, RULE_conditional_statement);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				if_statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
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
		enterRule(_localctx, 26, RULE_if_statement);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(IF);
				setState(212);
				match(LPAR);
				setState(213);
				expression(0);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(214);
					match(OR);
					setState(215);
					expression(0);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(RPAR);
				setState(222);
				match(LCBRAC);
				{
				setState(223);
				stmts();
				}
				setState(224);
				match(RCBRAC);
				}
				break;
			case 2:
				_localctx = new ElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(IF);
				setState(227);
				match(LPAR);
				setState(228);
				expression(0);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(229);
					match(OR);
					setState(230);
					expression(0);
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(RPAR);
				setState(237);
				match(LCBRAC);
				{
				setState(238);
				stmts();
				}
				setState(239);
				match(RCBRAC);
				{
				setState(240);
				match(ELSE);
				setState(241);
				match(LCBRAC);
				{
				setState(242);
				stmts();
				}
				setState(243);
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
		enterRule(_localctx, 28, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 30, RULE_iterative_statement);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				while_loop();
				}
				break;
			case FOREVER:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
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
		enterRule(_localctx, 32, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(FOR);
			setState(255);
			match(LPAR);
			{
			setState(256);
			stmt();
			}
			setState(257);
			match(COMMA);
			{
			setState(258);
			expression(0);
			}
			setState(259);
			match(COMMA);
			setState(260);
			expression(0);
			setState(261);
			match(LCBRAC);
			{
			setState(262);
			stmts();
			}
			setState(263);
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
		enterRule(_localctx, 34, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(WHILE);
			setState(266);
			match(LPAR);
			{
			setState(267);
			expression(0);
			}
			setState(268);
			match(RPAR);
			setState(269);
			match(LCBRAC);
			{
			setState(270);
			stmts();
			}
			setState(271);
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
		enterRule(_localctx, 36, RULE_forever_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(FOREVER);
			setState(274);
			match(LCBRAC);
			{
			setState(275);
			stmts();
			}
			setState(276);
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
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0119\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\3\2\3\2\5\29\n\2\3\3\3\3\3\3\6\3>\n\3\r\3\16\3?\3"+
		"\3\3\3\3\3\3\4\6\4F\n\4\r\4\16\4G\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6"+
		"\3\6\5\6T\n\6\3\7\3\7\3\7\6\7Y\n\7\r\7\16\7Z\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13"+
		"\3\13\3\13\6\13v\n\13\r\13\16\13w\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0080"+
		"\n\13\f\13\16\13\u0083\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16"+
		"\f\u008d\13\f\3\f\3\f\5\f\u0091\n\f\3\r\3\r\6\r\u0095\n\r\r\r\16\r\u0096"+
		"\3\r\3\r\6\r\u009b\n\r\r\r\16\r\u009c\3\r\3\r\3\r\6\r\u00a2\n\r\r\r\16"+
		"\r\u00a3\3\r\3\r\3\r\3\r\5\r\u00aa\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\16"+
		"\3\16\5\16\u00d4\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u00db\n\17\f\17\16"+
		"\17\u00de\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00ea\n\17\f\17\16\17\u00ed\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00f8\n\17\3\20\3\20\3\21\3\21\3\21\5\21\u00ff\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\2\3\30\25\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5\4\2&&*+\4\2\33\33  \3\2\16"+
		"\21\2\u0134\28\3\2\2\2\4:\3\2\2\2\6E\3\2\2\2\bN\3\2\2\2\nS\3\2\2\2\fU"+
		"\3\2\2\2\16^\3\2\2\2\20c\3\2\2\2\22h\3\2\2\2\24q\3\2\2\2\26\u0090\3\2"+
		"\2\2\30\u00a9\3\2\2\2\32\u00d3\3\2\2\2\34\u00f7\3\2\2\2\36\u00f9\3\2\2"+
		"\2 \u00fe\3\2\2\2\"\u0100\3\2\2\2$\u010b\3\2\2\2&\u0113\3\2\2\2(*\5\6"+
		"\4\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2.9\7\2"+
		"\2\3/\61\5\6\4\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2"+
		"\63\65\3\2\2\2\64\62\3\2\2\2\65\66\5\4\3\2\66\67\7\2\2\3\679\3\2\2\28"+
		"+\3\2\2\28\62\3\2\2\29\3\3\2\2\2:;\7\32\2\2;=\7\30\2\2<>\5\6\4\2=<\3\2"+
		"\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\32\2\2BC\7\24\2\2C\5"+
		"\3\2\2\2DF\5\b\5\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2"+
		"IO\5\32\16\2JO\5 \21\2KO\5\n\6\2LO\5\f\7\2MO\5\16\b\2NI\3\2\2\2NJ\3\2"+
		"\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PT\5\20\t\2QT\5\24\13\2R"+
		"T\5\22\n\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\13\3\2\2\2UV\7\n\2\2VX\7\34"+
		"\2\2WY\5\30\r\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]"+
		"\7\35\2\2]\r\3\2\2\2^_\7\t\2\2_`\7\34\2\2`a\5\30\r\2ab\7\35\2\2b\17\3"+
		"\2\2\2cd\7 \2\2de\7.\2\2ef\7%\2\2fg\t\2\2\2g\21\3\2\2\2hi\7.\2\2io\7%"+
		"\2\2jp\5\30\r\2kp\7.\2\2lp\7&\2\2mp\7*\2\2np\7+\2\2oj\3\2\2\2ok\3\2\2"+
		"\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\23\3\2\2\2qr\t\3\2\2rs\7.\2\2su\7\34"+
		"\2\2tv\5\26\f\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7"+
		"\35\2\2z\u0081\7\36\2\2{\u0080\5\6\4\2|\u0080\7.\2\2}\u0080\5\30\r\2~"+
		"\u0080\5\20\t\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0085\7\37\2\2\u0085\25\3\2\2\2\u0086\u0087"+
		"\7 \2\2\u0087\u0091\7.\2\2\u0088\u008a\7\31\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7 \2\2\u008f\u0091\7.\2\2\u0090\u0086"+
		"\3\2\2\2\u0090\u008b\3\2\2\2\u0091\27\3\2\2\2\u0092\u0094\b\r\1\2\u0093"+
		"\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\7\34\2\2\u0099"+
		"\u009b\5\30\r\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\35\2\2\u009f"+
		"\u00aa\3\2\2\2\u00a0\u00a2\t\4\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00aa\5\30\r\6\u00a6\u00aa\7.\2\2\u00a7\u00aa\7&\2\2\u00a8\u00aa\7*\2"+
		"\2\u00a9\u0092\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ce\3\2\2\2\u00ab\u00ac\f\22\2\2"+
		"\u00ac\u00ad\7\16\2\2\u00ad\u00cd\5\30\r\23\u00ae\u00af\f\21\2\2\u00af"+
		"\u00b0\7\17\2\2\u00b0\u00cd\5\30\r\22\u00b1\u00b2\f\20\2\2\u00b2\u00b3"+
		"\7\20\2\2\u00b3\u00cd\5\30\r\21\u00b4\u00b5\f\17\2\2\u00b5\u00b6\7\21"+
		"\2\2\u00b6\u00cd\5\30\r\20\u00b7\u00b8\f\16\2\2\u00b8\u00b9\7\22\2\2\u00b9"+
		"\u00cd\5\30\r\17\u00ba\u00bb\f\r\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00cd\5"+
		"\30\r\16\u00bd\u00be\f\f\2\2\u00be\u00bf\7\4\2\2\u00bf\u00cd\5\30\r\r"+
		"\u00c0\u00c1\f\13\2\2\u00c1\u00c2\7\5\2\2\u00c2\u00cd\5\30\r\f\u00c3\u00c4"+
		"\f\n\2\2\u00c4\u00c5\7\6\2\2\u00c5\u00cd\5\30\r\13\u00c6\u00c7\f\t\2\2"+
		"\u00c7\u00c8\7\7\2\2\u00c8\u00cd\5\30\r\n\u00c9\u00ca\f\b\2\2\u00ca\u00cb"+
		"\7\b\2\2\u00cb\u00cd\5\30\r\t\u00cc\u00ab\3\2\2\2\u00cc\u00ae\3\2\2\2"+
		"\u00cc\u00b1\3\2\2\2\u00cc\u00b4\3\2\2\2\u00cc\u00b7\3\2\2\2\u00cc\u00ba"+
		"\3\2\2\2\u00cc\u00bd\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc"+
		"\u00c6\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4"+
		"\5\34\17\2\u00d2\u00d4\5\36\20\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2"+
		"\2\u00d4\33\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\7\34\2\2\u00d7\u00dc"+
		"\5\30\r\2\u00d8\u00d9\7\23\2\2\u00d9\u00db\5\30\r\2\u00da\u00d8\3\2\2"+
		"\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\35\2\2\u00e0\u00e1\7\36\2\2"+
		"\u00e1\u00e2\5\6\4\2\u00e2\u00e3\7\37\2\2\u00e3\u00f8\3\2\2\2\u00e4\u00e5"+
		"\7\f\2\2\u00e5\u00e6\7\34\2\2\u00e6\u00eb\5\30\r\2\u00e7\u00e8\7\23\2"+
		"\2\u00e8\u00ea\5\30\r\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00ef\7\35\2\2\u00ef\u00f0\7\36\2\2\u00f0\u00f1\5\6\4\2\u00f1"+
		"\u00f2\7\37\2\2\u00f2\u00f3\7\r\2\2\u00f3\u00f4\7\36\2\2\u00f4\u00f5\5"+
		"\6\4\2\u00f5\u00f6\7\37\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00d5\3\2\2\2\u00f7"+
		"\u00e4\3\2\2\2\u00f8\35\3\2\2\2\u00f9\u00fa\7\13\2\2\u00fa\37\3\2\2\2"+
		"\u00fb\u00ff\5\"\22\2\u00fc\u00ff\5$\23\2\u00fd\u00ff\5&\24\2\u00fe\u00fb"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff!\3\2\2\2\u0100"+
		"\u0101\7\25\2\2\u0101\u0102\7\34\2\2\u0102\u0103\5\b\5\2\u0103\u0104\7"+
		"\31\2\2\u0104\u0105\5\30\r\2\u0105\u0106\7\31\2\2\u0106\u0107\5\30\r\2"+
		"\u0107\u0108\7\36\2\2\u0108\u0109\5\6\4\2\u0109\u010a\7\37\2\2\u010a#"+
		"\3\2\2\2\u010b\u010c\7\26\2\2\u010c\u010d\7\34\2\2\u010d\u010e\5\30\r"+
		"\2\u010e\u010f\7\35\2\2\u010f\u0110\7\36\2\2\u0110\u0111\5\6\4\2\u0111"+
		"\u0112\7\37\2\2\u0112%\3\2\2\2\u0113\u0114\7\27\2\2\u0114\u0115\7\36\2"+
		"\2\u0115\u0116\5\6\4\2\u0116\u0117\7\37\2\2\u0117\'\3\2\2\2\33+\628?G"+
		"NSZow\177\u0081\u008b\u0090\u0096\u009c\u00a3\u00a9\u00cc\u00ce\u00d3"+
		"\u00dc\u00eb\u00f7\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}