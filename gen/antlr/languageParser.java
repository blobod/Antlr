// Generated from C:/Users/thetr/OneDrive/Dokumenter/GitHub/Antlr/src/main/java/antlr\language.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, IF=13, ELSE=14, PLUS=15, MINUS=16, MULTIPLIKATION=17, 
		DIVISION=18, POWER_OF=19, OR=20, STOP=21, FOR=22, WHILE=23, FOREVER=24, 
		START=25, COMMA=26, AT_SIGN=27, VOID=28, LPAR=29, RPAR=30, LCBRAC=31, 
		RCBRAC=32, INT_TYPE=33, DOUBLE_TYPE=34, TXT_TYPE=35, BOOL_TYPE=36, ASSIGN=37, 
		INT=38, DOT=39, DOUBLE=40, TXT=41, BOOL=42, TRUE=43, FALSE=44, ID=45, 
		WS=46, COMMENT=47, LINE_COMMENT=48;
	public static final int
		RULE_language = 0, RULE_entrypoint = 1, RULE_declaration = 2, RULE_stmts = 3, 
		RULE_stmt = 4, RULE_expression = 5, RULE_conditional_statement = 6, RULE_if_statement = 7, 
		RULE_iterative_statement = 8, RULE_for_loop = 9, RULE_while_loop = 10, 
		RULE_forever_loop = 11, RULE_condition = 12, RULE_idORvalue_condition = 13, 
		RULE_greather = 14, RULE_lesser = 15, RULE_equal = 16, RULE_greatherORequal = 17, 
		RULE_lesserORequal = 18, RULE_isNOTequal = 19, RULE_type_definition = 20, 
		RULE_data_type = 21, RULE_function_declaration = 22, RULE_param = 23, 
		RULE_type = 24, RULE_value = 25, RULE_iDorVALUE = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"language", "entrypoint", "declaration", "stmts", "stmt", "expression", 
			"conditional_statement", "if_statement", "iterative_statement", "for_loop", 
			"while_loop", "forever_loop", "condition", "idORvalue_condition", "greather", 
			"lesser", "equal", "greatherORequal", "lesserORequal", "isNOTequal", 
			"type_definition", "data_type", "function_declaration", "param", "type", 
			"value", "iDorVALUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'Greather'", "'<'", "'Lesser'", "'=='", "'Equal'", "'>='", 
			"'Greather_or_equal'", "'<='", "'Lesser_or_equal'", "'!='", "'Is_not_equal'", 
			"'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'^'", "'||'", "'stop'", 
			"'for'", "'while'", "'forever'", "'start'", "','", "'@'", "'void'", "'('", 
			"')'", "'{'", "'}'", "'int'", "'double'", "'txt'", "'bool'", "'='", null, 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IF", "ELSE", "PLUS", "MINUS", "MULTIPLIKATION", "DIVISION", "POWER_OF", 
			"OR", "STOP", "FOR", "WHILE", "FOREVER", "START", "COMMA", "AT_SIGN", 
			"VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "INT_TYPE", "DOUBLE_TYPE", 
			"TXT_TYPE", "BOOL_TYPE", "ASSIGN", "INT", "DOT", "DOUBLE", "TXT", "BOOL", 
			"TRUE", "FALSE", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EntrypointContext entrypoint() {
			return getRuleContext(EntrypointContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case IF:
			case PLUS:
			case MINUS:
			case MULTIPLIKATION:
			case DIVISION:
			case FOR:
			case WHILE:
			case FOREVER:
			case LPAR:
			case INT:
			case DOUBLE:
			case TXT:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(54);
						stmts();
						}
						break;
					case 2:
						{
						setState(55);
						expression();
						}
						break;
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				match(EOF);
				}
				}
				break;
			case AT_SIGN:
			case VOID:
			case INT_TYPE:
			case DOUBLE_TYPE:
			case TXT_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					{
					setState(62);
					declaration();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
				entrypoint();
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

	public static class EntrypointContext extends ParserRuleContext {
		public List<TerminalNode> AT_SIGN() { return getTokens(languageParser.AT_SIGN); }
		public TerminalNode AT_SIGN(int i) {
			return getToken(languageParser.AT_SIGN, i);
		}
		public TerminalNode START() { return getToken(languageParser.START, 0); }
		public TerminalNode STOP() { return getToken(languageParser.STOP, 0); }
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(languageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(languageParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(languageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(languageParser.RPAR, i);
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
			setState(71);
			match(AT_SIGN);
			setState(72);
			match(START);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(73);
					match(ID);
					setState(74);
					match(LPAR);
					setState(75);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(76);
						stmts();
						}
						break;
					case 2:
						{
						setState(77);
						expression();
						}
						break;
					}
					}
					break;
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0) );
			setState(84);
			match(AT_SIGN);
			setState(85);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Type_definitionContext type_definition() {
			return getRuleContext(Type_definitionContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
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
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				type_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				function_declaration();
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

	public static class StmtsContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
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
		enterRule(_localctx, 6, RULE_stmts);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case WHILE:
			case FOREVER:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				stmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(ID);
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

	public static class StmtContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Iterative_statementContext iterative_statement() {
			return getRuleContext(Iterative_statementContext.class,0);
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
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				conditional_statement();
				}
				break;
			case FOR:
			case WHILE:
			case FOREVER:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				iterative_statement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public IDorVALUEContext left;
		public IDorVALUEContext right;
		public List<TerminalNode> PLUS() { return getTokens(languageParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(languageParser.PLUS, i);
		}
		public List<IDorVALUEContext> iDorVALUE() {
			return getRuleContexts(IDorVALUEContext.class);
		}
		public IDorVALUEContext iDorVALUE(int i) {
			return getRuleContext(IDorVALUEContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(languageParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(languageParser.MINUS, i);
		}
		public List<TerminalNode> MULTIPLIKATION() { return getTokens(languageParser.MULTIPLIKATION); }
		public TerminalNode MULTIPLIKATION(int i) {
			return getToken(languageParser.MULTIPLIKATION, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(languageParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(languageParser.DIVISION, i);
		}
		public TerminalNode POWER_OF() { return getToken(languageParser.POWER_OF, 0); }
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((ExpressionContext)_localctx).left = iDorVALUE();
				setState(100);
				match(PLUS);
				setState(101);
				((ExpressionContext)_localctx).right = iDorVALUE();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				iDorVALUE();
				setState(104);
				match(MINUS);
				setState(105);
				iDorVALUE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				iDorVALUE();
				setState(108);
				match(MULTIPLIKATION);
				setState(109);
				iDorVALUE();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				iDorVALUE();
				setState(112);
				match(DIVISION);
				setState(113);
				iDorVALUE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				iDorVALUE();
				setState(116);
				match(POWER_OF);
				setState(117);
				iDorVALUE();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION))) != 0)) {
					{
					{
					setState(119);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(LPAR);
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(126);
					expression();
					}
					}
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0) );
				setState(131);
				match(RPAR);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION))) != 0)) {
					{
					{
					setState(133);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				iDorVALUE();
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
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
		enterRule(_localctx, 12, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			if_statement();
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
		public TerminalNode ELSE() { return getToken(languageParser.ELSE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> RCBRAC() { return getTokens(languageParser.RCBRAC); }
		public TerminalNode RCBRAC(int i) {
			return getToken(languageParser.RCBRAC, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		enterRule(_localctx, 14, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IF);
			setState(145);
			match(LPAR);
			setState(146);
			condition();
			setState(147);
			match(RPAR);
			setState(148);
			match(LCBRAC);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case WHILE:
				case FOREVER:
					{
					setState(149);
					stmt();
					}
					break;
				case PLUS:
				case MINUS:
				case MULTIPLIKATION:
				case DIVISION:
				case LPAR:
				case INT:
				case DOUBLE:
				case TXT:
				case BOOL:
				case ID:
					{
					setState(150);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RCBRAC) {
				{
				setState(156);
				match(RCBRAC);
				}
			}

			{
			setState(159);
			match(ELSE);
			setState(160);
			match(LCBRAC);
			setState(161);
			stmt();
			setState(162);
			match(RCBRAC);
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
		enterRule(_localctx, 16, RULE_iterative_statement);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				while_loop();
				}
				break;
			case FOREVER:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(languageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(languageParser.COMMA, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 18, RULE_for_loop);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(FOR);
				setState(170);
				match(LPAR);
				setState(171);
				type();
				setState(172);
				match(COMMA);
				{
				setState(173);
				condition();
				}
				setState(174);
				match(COMMA);
				setState(175);
				stmt();
				setState(176);
				match(LCBRAC);
				setState(177);
				stmt();
				setState(178);
				match(RCBRAC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(FOR);
				setState(181);
				match(LPAR);
				setState(182);
				type();
				setState(183);
				match(COMMA);
				{
				setState(184);
				condition();
				}
				setState(185);
				match(COMMA);
				setState(186);
				expression();
				setState(187);
				match(LCBRAC);
				setState(188);
				stmt();
				setState(189);
				match(RCBRAC);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 20, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(WHILE);
			setState(194);
			match(LPAR);
			{
			setState(195);
			condition();
			}
			setState(196);
			match(RPAR);
			setState(197);
			match(LCBRAC);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case WHILE:
				case FOREVER:
					{
					setState(198);
					stmt();
					}
					break;
				case PLUS:
				case MINUS:
				case MULTIPLIKATION:
				case DIVISION:
				case LPAR:
				case INT:
				case DOUBLE:
				case TXT:
				case BOOL:
				case ID:
					{
					setState(199);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
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
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 22, RULE_forever_loop);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(FOREVER);
				setState(208);
				match(LCBRAC);
				setState(209);
				stmt();
				setState(210);
				match(RCBRAC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(FOREVER);
				setState(213);
				match(LCBRAC);
				setState(214);
				expression();
				setState(215);
				match(RCBRAC);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<IdORvalue_conditionContext> idORvalue_condition() {
			return getRuleContexts(IdORvalue_conditionContext.class);
		}
		public IdORvalue_conditionContext idORvalue_condition(int i) {
			return getRuleContext(IdORvalue_conditionContext.class,i);
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
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			idORvalue_condition();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(220);
				match(OR);
				setState(221);
				idORvalue_condition();
				}
				}
				setState(226);
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

	public static class IdORvalue_conditionContext extends ParserRuleContext {
		public List<IDorVALUEContext> iDorVALUE() {
			return getRuleContexts(IDorVALUEContext.class);
		}
		public IDorVALUEContext iDorVALUE(int i) {
			return getRuleContext(IDorVALUEContext.class,i);
		}
		public GreatherContext greather() {
			return getRuleContext(GreatherContext.class,0);
		}
		public LesserContext lesser() {
			return getRuleContext(LesserContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public GreatherORequalContext greatherORequal() {
			return getRuleContext(GreatherORequalContext.class,0);
		}
		public LesserORequalContext lesserORequal() {
			return getRuleContext(LesserORequalContext.class,0);
		}
		public IsNOTequalContext isNOTequal() {
			return getRuleContext(IsNOTequalContext.class,0);
		}
		public IdORvalue_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idORvalue_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterIdORvalue_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitIdORvalue_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitIdORvalue_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdORvalue_conditionContext idORvalue_condition() throws RecognitionException {
		IdORvalue_conditionContext _localctx = new IdORvalue_conditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_idORvalue_condition);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				iDorVALUE();
				setState(228);
				greather();
				setState(229);
				iDorVALUE();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				iDorVALUE();
				setState(232);
				lesser();
				setState(233);
				iDorVALUE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				iDorVALUE();
				setState(236);
				equal();
				setState(237);
				iDorVALUE();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				iDorVALUE();
				setState(240);
				greatherORequal();
				setState(241);
				iDorVALUE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				iDorVALUE();
				setState(244);
				lesserORequal();
				setState(245);
				iDorVALUE();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				iDorVALUE();
				setState(248);
				isNOTequal();
				setState(249);
				iDorVALUE();
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

	public static class GreatherContext extends ParserRuleContext {
		public GreatherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greather; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGreather(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGreather(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGreather(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreatherContext greather() throws RecognitionException {
		GreatherContext _localctx = new GreatherContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_greather);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class LesserContext extends ParserRuleContext {
		public LesserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterLesser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitLesser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitLesser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LesserContext lesser() throws RecognitionException {
		LesserContext _localctx = new LesserContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lesser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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

	public static class GreatherORequalContext extends ParserRuleContext {
		public GreatherORequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greatherORequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterGreatherORequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitGreatherORequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitGreatherORequal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreatherORequalContext greatherORequal() throws RecognitionException {
		GreatherORequalContext _localctx = new GreatherORequalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_greatherORequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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

	public static class LesserORequalContext extends ParserRuleContext {
		public LesserORequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesserORequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterLesserORequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitLesserORequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitLesserORequal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LesserORequalContext lesserORequal() throws RecognitionException {
		LesserORequalContext _localctx = new LesserORequalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lesserORequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	public static class IsNOTequalContext extends ParserRuleContext {
		public IsNOTequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isNOTequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterIsNOTequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitIsNOTequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitIsNOTequal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsNOTequalContext isNOTequal() throws RecognitionException {
		IsNOTequalContext _localctx = new IsNOTequalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_isNOTequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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

	public static class Type_definitionContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			data_type();
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

	public static class Data_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(languageParser.ASSIGN, 0); }
		public IDorVALUEContext iDorVALUE() {
			return getRuleContext(IDorVALUEContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			type();
			setState(268);
			match(ID);
			setState(269);
			match(ASSIGN);
			setState(270);
			iDorVALUE();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(languageParser.LPAR, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(languageParser.RPAR, 0); }
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
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
		public TerminalNode VOID() { return getToken(languageParser.VOID, 0); }
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
		enterRule(_localctx, 44, RULE_function_declaration);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case DOUBLE_TYPE:
			case TXT_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				type();
				setState(273);
				match(ID);
				setState(274);
				match(LPAR);
				setState(275);
				param();
				setState(276);
				match(RPAR);
				setState(277);
				match(LCBRAC);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(278);
						stmt();
						}
						break;
					case 2:
						{
						setState(279);
						match(ID);
						}
						break;
					case 3:
						{
						setState(280);
						expression();
						}
						break;
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				match(RCBRAC);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(VOID);
				setState(289);
				match(ID);
				setState(290);
				match(LPAR);
				setState(291);
				param();
				setState(292);
				match(RPAR);
				setState(293);
				match(LCBRAC);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(294);
						stmt();
						}
						break;
					case 2:
						{
						setState(295);
						match(ID);
						}
						break;
					case 3:
						{
						setState(296);
						expression();
						}
						break;
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(languageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(languageParser.ID, i);
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
		enterRule(_localctx, 46, RULE_param);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					setState(306);
					type();
					setState(307);
					match(ID);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(311);
					type();
					setState(312);
					match(ID);
					setState(313);
					match(COMMA);
					}
					}
					setState(317); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0) );
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(languageParser.INT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(languageParser.DOUBLE_TYPE, 0); }
		public TerminalNode TXT_TYPE() { return getToken(languageParser.TXT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(languageParser.BOOL_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(languageParser.INT, 0); }
		public TerminalNode TXT() { return getToken(languageParser.TXT, 0); }
		public TerminalNode DOUBLE() { return getToken(languageParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(languageParser.BOOL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL))) != 0)) ) {
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

	public static class IDorVALUEContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
		public IDorVALUEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iDorVALUE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterIDorVALUE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitIDorVALUE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitIDorVALUE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IDorVALUEContext iDorVALUE() throws RecognitionException {
		IDorVALUEContext _localctx = new IDorVALUEContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_iDorVALUE);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case TXT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u014c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\5\2H\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"Q\n\3\6\3S\n\3\r\3\16\3T\3\3\3\3\3\3\3\4\3\4\5\4\\\n\4\3\5\3\5\5\5`\n"+
		"\5\3\6\3\6\5\6d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\7\3\7\6\7"+
		"\u0082\n\7\r\7\16\7\u0083\3\7\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13"+
		"\7\3\7\5\7\u008f\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009a\n\t"+
		"\f\t\16\t\u009d\13\t\3\t\5\t\u00a0\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\5\n\u00aa\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c2\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cb\n\f\f\f\16\f\u00ce\13\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\16"+
		"\7\16\u00e1\n\16\f\16\16\16\u00e4\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00fe\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u011c\n\30\f\30\16\30\u011f\13"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u012c"+
		"\n\30\f\30\16\30\u012f\13\30\3\30\3\30\5\30\u0133\n\30\3\31\3\31\3\31"+
		"\5\31\u0138\n\31\3\31\3\31\3\31\3\31\6\31\u013e\n\31\r\31\16\31\u013f"+
		"\5\31\u0142\n\31\3\32\3\32\3\33\3\33\3\34\3\34\5\34\u014a\n\34\3\34\2"+
		"\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\13"+
		"\3\2\21\24\3\2\3\4\3\2\5\6\3\2\7\b\3\2\t\n\3\2\13\f\3\2\r\16\3\2#&\4\2"+
		"((*,\2\u015d\2G\3\2\2\2\4I\3\2\2\2\6[\3\2\2\2\b_\3\2\2\2\nc\3\2\2\2\f"+
		"\u008e\3\2\2\2\16\u0090\3\2\2\2\20\u0092\3\2\2\2\22\u00a9\3\2\2\2\24\u00c1"+
		"\3\2\2\2\26\u00c3\3\2\2\2\30\u00db\3\2\2\2\32\u00dd\3\2\2\2\34\u00fd\3"+
		"\2\2\2\36\u00ff\3\2\2\2 \u0101\3\2\2\2\"\u0103\3\2\2\2$\u0105\3\2\2\2"+
		"&\u0107\3\2\2\2(\u0109\3\2\2\2*\u010b\3\2\2\2,\u010d\3\2\2\2.\u0132\3"+
		"\2\2\2\60\u0141\3\2\2\2\62\u0143\3\2\2\2\64\u0145\3\2\2\2\66\u0149\3\2"+
		"\2\28;\5\b\5\29;\5\f\7\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2"+
		"\2\2=?\3\2\2\2><\3\2\2\2?H\7\2\2\3@B\5\6\4\2A@\3\2\2\2BE\3\2\2\2CA\3\2"+
		"\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FH\5\4\3\2G<\3\2\2\2GC\3\2\2\2H\3\3"+
		"\2\2\2IJ\7\35\2\2JR\7\33\2\2KL\7/\2\2LM\7\37\2\2MS\7 \2\2NQ\5\b\5\2OQ"+
		"\5\f\7\2PN\3\2\2\2PO\3\2\2\2QS\3\2\2\2RK\3\2\2\2RP\3\2\2\2ST\3\2\2\2T"+
		"R\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\35\2\2WX\7\27\2\2X\5\3\2\2\2Y\\\5*\26"+
		"\2Z\\\5.\30\2[Y\3\2\2\2[Z\3\2\2\2\\\7\3\2\2\2]`\5\n\6\2^`\7/\2\2_]\3\2"+
		"\2\2_^\3\2\2\2`\t\3\2\2\2ad\5\16\b\2bd\5\22\n\2ca\3\2\2\2cb\3\2\2\2d\13"+
		"\3\2\2\2ef\5\66\34\2fg\7\21\2\2gh\5\66\34\2h\u008f\3\2\2\2ij\5\66\34\2"+
		"jk\7\22\2\2kl\5\66\34\2l\u008f\3\2\2\2mn\5\66\34\2no\7\23\2\2op\5\66\34"+
		"\2p\u008f\3\2\2\2qr\5\66\34\2rs\7\24\2\2st\5\66\34\2t\u008f\3\2\2\2uv"+
		"\5\66\34\2vw\7\25\2\2wx\5\66\34\2x\u008f\3\2\2\2y{\t\2\2\2zy\3\2\2\2{"+
		"~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0081\7\37\2"+
		"\2\u0080\u0082\5\f\7\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7 \2\2\u0086"+
		"\u008f\3\2\2\2\u0087\u0089\t\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008f\5\66\34\2\u008ee\3\2\2\2\u008ei\3\2\2\2\u008e"+
		"m\3\2\2\2\u008eq\3\2\2\2\u008eu\3\2\2\2\u008e|\3\2\2\2\u008e\u008a\3\2"+
		"\2\2\u008f\r\3\2\2\2\u0090\u0091\5\20\t\2\u0091\17\3\2\2\2\u0092\u0093"+
		"\7\17\2\2\u0093\u0094\7\37\2\2\u0094\u0095\5\32\16\2\u0095\u0096\7 \2"+
		"\2\u0096\u009b\7!\2\2\u0097\u009a\5\n\6\2\u0098\u009a\5\f\7\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\7\""+
		"\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\7\20\2\2\u00a2\u00a3\7!\2\2\u00a3\u00a4\5\n\6\2\u00a4\u00a5\7\""+
		"\2\2\u00a5\21\3\2\2\2\u00a6\u00aa\5\24\13\2\u00a7\u00aa\5\26\f\2\u00a8"+
		"\u00aa\5\30\r\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\23\3\2\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\7\37\2\2\u00ad"+
		"\u00ae\5\62\32\2\u00ae\u00af\7\34\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b1"+
		"\7\34\2\2\u00b1\u00b2\5\n\6\2\u00b2\u00b3\7!\2\2\u00b3\u00b4\5\n\6\2\u00b4"+
		"\u00b5\7\"\2\2\u00b5\u00c2\3\2\2\2\u00b6\u00b7\7\30\2\2\u00b7\u00b8\7"+
		"\37\2\2\u00b8\u00b9\5\62\32\2\u00b9\u00ba\7\34\2\2\u00ba\u00bb\5\32\16"+
		"\2\u00bb\u00bc\7\34\2\2\u00bc\u00bd\5\f\7\2\u00bd\u00be\7!\2\2\u00be\u00bf"+
		"\5\n\6\2\u00bf\u00c0\7\"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00ab\3\2\2\2\u00c1"+
		"\u00b6\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00c5\7\37"+
		"\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7 \2\2\u00c7\u00cc\7!\2\2\u00c8"+
		"\u00cb\5\n\6\2\u00c9\u00cb\5\f\7\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\"\2\2\u00d0\27\3\2\2"+
		"\2\u00d1\u00d2\7\32\2\2\u00d2\u00d3\7!\2\2\u00d3\u00d4\5\n\6\2\u00d4\u00d5"+
		"\7\"\2\2\u00d5\u00dc\3\2\2\2\u00d6\u00d7\7\32\2\2\u00d7\u00d8\7!\2\2\u00d8"+
		"\u00d9\5\f\7\2\u00d9\u00da\7\"\2\2\u00da\u00dc\3\2\2\2\u00db\u00d1\3\2"+
		"\2\2\u00db\u00d6\3\2\2\2\u00dc\31\3\2\2\2\u00dd\u00e2\5\34\17\2\u00de"+
		"\u00df\7\26\2\2\u00df\u00e1\5\34\17\2\u00e0\u00de\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\33\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\5\66\34\2\u00e6\u00e7\5\36\20\2\u00e7\u00e8"+
		"\5\66\34\2\u00e8\u00fe\3\2\2\2\u00e9\u00ea\5\66\34\2\u00ea\u00eb\5 \21"+
		"\2\u00eb\u00ec\5\66\34\2\u00ec\u00fe\3\2\2\2\u00ed\u00ee\5\66\34\2\u00ee"+
		"\u00ef\5\"\22\2\u00ef\u00f0\5\66\34\2\u00f0\u00fe\3\2\2\2\u00f1\u00f2"+
		"\5\66\34\2\u00f2\u00f3\5$\23\2\u00f3\u00f4\5\66\34\2\u00f4\u00fe\3\2\2"+
		"\2\u00f5\u00f6\5\66\34\2\u00f6\u00f7\5&\24\2\u00f7\u00f8\5\66\34\2\u00f8"+
		"\u00fe\3\2\2\2\u00f9\u00fa\5\66\34\2\u00fa\u00fb\5(\25\2\u00fb\u00fc\5"+
		"\66\34\2\u00fc\u00fe\3\2\2\2\u00fd\u00e5\3\2\2\2\u00fd\u00e9\3\2\2\2\u00fd"+
		"\u00ed\3\2\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f9\3\2"+
		"\2\2\u00fe\35\3\2\2\2\u00ff\u0100\t\3\2\2\u0100\37\3\2\2\2\u0101\u0102"+
		"\t\4\2\2\u0102!\3\2\2\2\u0103\u0104\t\5\2\2\u0104#\3\2\2\2\u0105\u0106"+
		"\t\6\2\2\u0106%\3\2\2\2\u0107\u0108\t\7\2\2\u0108\'\3\2\2\2\u0109\u010a"+
		"\t\b\2\2\u010a)\3\2\2\2\u010b\u010c\5,\27\2\u010c+\3\2\2\2\u010d\u010e"+
		"\5\62\32\2\u010e\u010f\7/\2\2\u010f\u0110\7\'\2\2\u0110\u0111\5\66\34"+
		"\2\u0111-\3\2\2\2\u0112\u0113\5\62\32\2\u0113\u0114\7/\2\2\u0114\u0115"+
		"\7\37\2\2\u0115\u0116\5\60\31\2\u0116\u0117\7 \2\2\u0117\u011d\7!\2\2"+
		"\u0118\u011c\5\n\6\2\u0119\u011c\7/\2\2\u011a\u011c\5\f\7\2\u011b\u0118"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0121\7\"\2\2\u0121\u0133\3\2\2\2\u0122\u0123\7\36\2\2\u0123"+
		"\u0124\7/\2\2\u0124\u0125\7\37\2\2\u0125\u0126\5\60\31\2\u0126\u0127\7"+
		" \2\2\u0127\u012d\7!\2\2\u0128\u012c\5\n\6\2\u0129\u012c\7/\2\2\u012a"+
		"\u012c\5\f\7\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2"+
		"\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\"\2\2\u0131\u0133\3\2"+
		"\2\2\u0132\u0112\3\2\2\2\u0132\u0122\3\2\2\2\u0133/\3\2\2\2\u0134\u0135"+
		"\5\62\32\2\u0135\u0136\7/\2\2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u0142\3\2\2\2\u0139\u013a\5\62\32\2\u013a\u013b"+
		"\7/\2\2\u013b\u013c\7\34\2\2\u013c\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u0137\3\2\2\2\u0141\u013d\3\2\2\2\u0142\61\3\2\2\2\u0143\u0144"+
		"\t\t\2\2\u0144\63\3\2\2\2\u0145\u0146\t\n\2\2\u0146\65\3\2\2\2\u0147\u014a"+
		"\5\64\33\2\u0148\u014a\7/\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2"+
		"\u014a\67\3\2\2\2#:<CGPRT[_c|\u0083\u008a\u008e\u0099\u009b\u009f\u00a9"+
		"\u00c1\u00ca\u00cc\u00db\u00e2\u00fd\u011b\u011d\u012b\u012d\u0132\u0137"+
		"\u013f\u0141\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}