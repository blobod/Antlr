<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
<<<<<<< Updated upstream:src/antlr/languageParser.java
// Generated from /Users/abdallahziadalnaif/Desktop/Antlr-main/src/main/java/antlr/language.g4 by ANTLR 4.9.2
package antlr;
=======
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
// Generated from /Users/abdallahziadalnaif/Desktop/Antlr-main/src/antlr/language.g4 by ANTLR 4.9.2
package gen;
>>>>>>> Stashed changes
=======
// Generated from C:/Users/thetr/OneDrive/Dokumenter/GitHub/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
=======
// Generated from C:/Users/thetr/OneDrive/Dokumenter/GitHub/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
import org.antlr.v4.runtime.misc.*;
=======
>>>>>>> Stashed changes
=======
import org.antlr.v4.runtime.misc.*;
>>>>>>> Stashed changes
import org.antlr.v4.runtime.tree.*;

import java.util.Currency;
import java.util.List;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
import java.util.Iterator;
import java.util.ArrayList;
=======
>>>>>>> Stashed changes
=======
import java.util.Iterator;
import java.util.ArrayList;
>>>>>>> Stashed changes

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, IF=13, ELSE=14, EXPRESSION=15, OR=16, STOP=17, 
		FOR=18, WHILE=19, FOREVER=20, START=21, COMMA=22, AT_SIGN=23, VOID=24, 
		LPAR=25, RPAR=26, LCBRAC=27, RCBRAC=28, INT_TYPE=29, DOUBLE_TYPE=30, TXT_TYPE=31, 
		BOOL_TYPE=32, ASSIGN=33, INT=34, DOT=35, DOUBLE=36, TXT=37, BOOL=38, TRUE=39, 
		FALSE=40, ID=41, WS=42, COMMENT=43, LINE_COMMENT=44;
	public static final int
		RULE_language = 0, RULE_declaration = 1, RULE_stmts = 2, RULE_stmt = 3, 
		RULE_expression = 4, RULE_conditional_statement = 5, RULE_if_statement = 6, 
		RULE_iterative_statement = 7, RULE_for_loop = 8, RULE_while_loop = 9, 
		RULE_forever_loop = 10, RULE_condition = 11, RULE_idORvalue_condition = 12, 
		RULE_greather = 13, RULE_lesser = 14, RULE_equal = 15, RULE_greatherORequal = 16, 
		RULE_lesserORequal = 17, RULE_isNOTequal = 18, RULE_type_definition = 19, 
		RULE_data_type = 20, RULE_function_declaration = 21, RULE_param = 22, 
		RULE_type = 23, RULE_value = 24, RULE_iDorVALUE = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"language", "declaration", "stmts", "stmt", "expression", "conditional_statement", 
			"if_statement", "iterative_statement", "for_loop", "while_loop", "forever_loop", 
			"condition", "idORvalue_condition", "greather", "lesser", "equal", "greatherORequal", 
			"lesserORequal", "isNOTequal", "type_definition", "data_type", "function_declaration", 
			"param", "type", "value", "iDorVALUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'Greather'", "'<'", "'Lesser'", "'=='", "'Equal'", "'>='", 
			"'Greather_or_equal'", "'<='", "'Lesser_or_equal'", "'!='", "'Is_not_equal'", 
			"'if'", "'else'", null, "'||'", "'stop'", "'for'", "'while'", "'forever'", 
			"'start'", "','", "'@'", "'void'", "'('", "')'", "'{'", "'}'", "'int'", 
			"'double'", "'txt'", "'bool'", "'='", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IF", "ELSE", "EXPRESSION", "OR", "STOP", "FOR", "WHILE", "FOREVER", 
			"START", "COMMA", "AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", 
			"INT_TYPE", "DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", "INT", 
			"DOT", "DOUBLE", "TXT", "BOOL", "TRUE", "FALSE", "ID", "WS", "COMMENT", 
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
		public List<TerminalNode> AT_SIGN() { return getTokens(languageParser.AT_SIGN); }
		public TerminalNode AT_SIGN(int i) {
			return getToken(languageParser.AT_SIGN, i);
		}
		public TerminalNode START() { return getToken(languageParser.START, 0); }
		public TerminalNode STOP() { return getToken(languageParser.STOP, 0); }
		public TerminalNode EOF() { return getToken(languageParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
				{
				{
				setState(52);
				declaration();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(AT_SIGN);
			setState(59);
			match(START);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
				{
				{
				setState(60);
				declaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER))) != 0)) {
				{
				{
				setState(66);
				stmts();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(72);
				expression();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(AT_SIGN);
			setState(79);
			match(STOP);
			setState(80);
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
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				type_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
			setState(86);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				conditional_statement();
				}
				break;
			case FOR:
			case WHILE:
			case FOREVER:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
>>>>>>> Stashed changes
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
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
		public List<IDorVALUEContext> iDorVALUE() {
			return getRuleContexts(IDorVALUEContext.class);
		}
		public IDorVALUEContext iDorVALUE(int i) {
			return getRuleContext(IDorVALUEContext.class,i);
		}
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
		public List<TerminalNode> EXPRESSION() { return getTokens(languageParser.EXPRESSION); }
		public TerminalNode EXPRESSION(int i) {
			return getToken(languageParser.EXPRESSION, i);
=======
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
		public List<IDorVALUEContext> iDorVALUE() {
			return getRuleContexts(IDorVALUEContext.class);
		}
		public IDorVALUEContext iDorVALUE(int i) {
			return getRuleContext(IDorVALUEContext.class,i);
		}
		public TerminalNode MULTIPLIKATION() { return getToken(languageParser.MULTIPLIKATION, 0); }
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
	public static class Paranthesis_moreContext extends ExpressionContext {
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
		public List<TerminalNode> MULTIPLIKATION() { return getTokens(languageParser.MULTIPLIKATION); }
		public TerminalNode MULTIPLIKATION(int i) {
			return getToken(languageParser.MULTIPLIKATION, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(languageParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(languageParser.DIVISION, i);
		}
		public Paranthesis_moreContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterParanthesis_more(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitParanthesis_more(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitParanthesis_more(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public IDorVALUEContext iDorVALUE() {
			return getRuleContext(IDorVALUEContext.class,0);
		}
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
		public IDorVALUEContext iDorVALUE() {
			return getRuleContext(IDorVALUEContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(languageParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(languageParser.PLUS, i);
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
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
	public static class SubstraktionContext extends ExpressionContext {
=======

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
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
		public List<IDorVALUEContext> iDorVALUE() {
			return getRuleContexts(IDorVALUEContext.class);
		}
		public IDorVALUEContext iDorVALUE(int i) {
			return getRuleContext(IDorVALUEContext.class,i);
		}
<<<<<<< Updated upstream:src/antlr/languageParser.java
		public TerminalNode MINUS() { return getToken(languageParser.MINUS, 0); }
		public SubstraktionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterSubstraktion(this);
=======
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
		public List<IDorVALUEContext> iDorVALUE() {
			return getRuleContexts(IDorVALUEContext.class);
		}
		public IDorVALUEContext iDorVALUE(int i) {
			return getRuleContext(IDorVALUEContext.class,i);
		}
		public TerminalNode MULTIPLIKATION() { return getToken(languageParser.MULTIPLIKATION, 0); }
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
	public static class Paranthesis_moreContext extends ExpressionContext {
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
		public List<TerminalNode> MULTIPLIKATION() { return getTokens(languageParser.MULTIPLIKATION); }
		public TerminalNode MULTIPLIKATION(int i) {
			return getToken(languageParser.MULTIPLIKATION, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(languageParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(languageParser.DIVISION, i);
		}
		public Paranthesis_moreContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterParanthesis_more(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitParanthesis_more(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitParanthesis_more(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public IDorVALUEContext iDorVALUE() {
			return getRuleContext(IDorVALUEContext.class,0);
		}
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
		public IDorVALUEContext iDorVALUE() {
			return getRuleContext(IDorVALUEContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(languageParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(languageParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(languageParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(languageParser.MINUS, i);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
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
		public List<IDorVALUEContext> iDorVALUE() {
			return getRuleContexts(IDorVALUEContext.class);
		}
		public IDorVALUEContext iDorVALUE(int i) {
			return getRuleContext(IDorVALUEContext.class,i);
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
>>>>>>> Stashed changes
	public static class SubstraktionContext extends ExpressionContext {
		public List<IDorVALUEContext> iDorVALUE() {
			return getRuleContexts(IDorVALUEContext.class);
		}
		public IDorVALUEContext iDorVALUE(int i) {
			return getRuleContext(IDorVALUEContext.class,i);
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
		public List<IDorVALUEContext> iDorVALUE() {
			return getRuleContexts(IDorVALUEContext.class);
		}
		public IDorVALUEContext iDorVALUE(int i) {
			return getRuleContext(IDorVALUEContext.class,i);
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
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitPower_of(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExpressionContext {
		public List<IDorVALUEContext> iDorVALUE() {
			return getRuleContexts(IDorVALUEContext.class);
		}
		public IDorVALUEContext iDorVALUE(int i) {
			return getRuleContext(IDorVALUEContext.class,i);
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			iDorVALUE();
			setState(93);
			match(EXPRESSION);
			setState(94);
			iDorVALUE();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPRESSION) {
				{
=======
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				iDorVALUE();
				setState(100);
				match(PLUS);
				setState(101);
				iDorVALUE();
				}
				break;
			case 2:
				_localctx = new SubstraktionContext(_localctx);
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
				_localctx = new MultiplicationContext(_localctx);
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
				_localctx = new DivisionContext(_localctx);
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
				_localctx = new Power_ofContext(_localctx);
				enterOuterAlt(_localctx, 5);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
				{
				setState(95);
				match(EXPRESSION);
				setState(96);
				iDorVALUE();
				}
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
=======
				break;
			case 6:
				_localctx = new Paranthesis_moreContext(_localctx);
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
				_localctx = new ParanthesisContext(_localctx);
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
			case 8:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				iDorVALUE();
				}
				break;
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
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
		enterRule(_localctx, 10, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(102);
=======
			setState(143);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(143);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(languageParser.ELSE, 0); }
		public List<TerminalNode> RCBRAC() { return getTokens(languageParser.RCBRAC); }
		public TerminalNode RCBRAC(int i) {
			return getToken(languageParser.RCBRAC, i);
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
		enterRule(_localctx, 12, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(104);
			match(IF);
			setState(105);
			match(LPAR);
			setState(106);
			condition();
			setState(107);
			match(RPAR);
			setState(108);
			match(LCBRAC);
			setState(109);
			stmt();
			setState(111);
=======
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
			setState(145);
			match(IF);
			setState(146);
			match(LPAR);
			setState(147);
			condition();
			setState(148);
			match(RPAR);
			setState(149);
			match(LCBRAC);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(152);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case WHILE:
				case FOREVER:
					{
					setState(150);
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
					setState(151);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RCBRAC) {
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(110);
=======
				setState(157);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(157);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				match(RCBRAC);
				}
			}

			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(113);
			match(ELSE);
			setState(114);
			match(LCBRAC);
			setState(115);
			stmt();
			setState(116);
=======
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
			setState(160);
			match(ELSE);
			setState(161);
			match(LCBRAC);
			setState(162);
			stmt();
			setState(163);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
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
		enterRule(_localctx, 14, RULE_iterative_statement);
		try {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(121);
=======
			setState(168);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(168);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(118);
=======
				setState(165);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(165);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(119);
=======
				setState(166);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(166);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				while_loop();
				}
				break;
			case FOREVER:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(120);
=======
				setState(167);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(167);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
		}
		public TerminalNode EXPRESSION() { return getToken(languageParser.EXPRESSION, 0); }
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
<<<<<<< Updated upstream
=======
		}
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
		}
=======
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
		public TerminalNode LCBRAC() { return getToken(languageParser.LCBRAC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
=======
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
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
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
		enterRule(_localctx, 16, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(FOR);
			setState(124);
			match(LPAR);
			setState(125);
			type();
			setState(126);
			match(COMMA);
			{
			setState(127);
			condition();
			}
			setState(128);
			match(COMMA);
			setState(129);
			match(EXPRESSION);
			setState(130);
			match(LCBRAC);
			setState(131);
			stmt();
			setState(132);
=======
		enterRule(_localctx, 18, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(FOR);
			setState(171);
			match(LPAR);
			setState(172);
			type();
			setState(173);
			match(COMMA);
			{
			setState(174);
			condition();
			}
			setState(175);
			match(COMMA);
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case WHILE:
				case FOREVER:
					{
					setState(176);
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
					setState(177);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0) );
			setState(182);
			match(LCBRAC);
			setState(183);
			stmt();
			setState(184);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
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
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode RCBRAC() { return getToken(languageParser.RCBRAC, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		enterRule(_localctx, 18, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(134);
			match(WHILE);
			setState(135);
			match(LPAR);
			{
			setState(136);
			condition();
			}
			setState(137);
			match(RPAR);
			setState(138);
			match(LCBRAC);
			setState(139);
			stmt();
			setState(140);
=======
			setState(186);
			match(WHILE);
			setState(187);
			match(LPAR);
			{
			setState(188);
			condition();
			}
			setState(189);
			match(RPAR);
<<<<<<< Updated upstream
=======
=======
			setState(186);
			match(WHILE);
			setState(187);
			match(LPAR);
			{
			setState(188);
			condition();
			}
			setState(189);
			match(RPAR);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
			setState(190);
			match(LCBRAC);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case WHILE:
				case FOREVER:
					{
					setState(191);
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
					setState(192);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
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
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
=======
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
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
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
		enterRule(_localctx, 20, RULE_forever_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(FOREVER);
			setState(143);
			match(LCBRAC);
			setState(144);
			stmt();
			setState(145);
=======
		enterRule(_localctx, 22, RULE_forever_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(FOREVER);
			setState(201);
			match(LCBRAC);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(204);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case WHILE:
				case FOREVER:
					{
					setState(202);
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
					setState(203);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLIKATION) | (1L << DIVISION) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER) | (1L << LPAR) | (1L << INT) | (1L << DOUBLE) | (1L << TXT) | (1L << BOOL) | (1L << ID))) != 0) );
			setState(208);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
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
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(147);
			idORvalue_condition();
			setState(152);
=======
			setState(210);
			idORvalue_condition();
			setState(215);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(210);
			idORvalue_condition();
			setState(215);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(148);
				match(OR);
				setState(149);
				idORvalue_condition();
				}
				}
				setState(154);
=======
				setState(211);
				match(OR);
				setState(212);
				idORvalue_condition();
				}
				}
				setState(217);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(211);
				match(OR);
				setState(212);
				idORvalue_condition();
				}
				}
				setState(217);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 24, RULE_idORvalue_condition);
		try {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				iDorVALUE();
				setState(156);
				greather();
				setState(157);
=======
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				iDorVALUE();
				setState(219);
				greather();
				setState(220);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				iDorVALUE();
				setState(219);
				greather();
				setState(220);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				iDorVALUE();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(159);
				iDorVALUE();
				setState(160);
				lesser();
				setState(161);
=======
				setState(222);
				iDorVALUE();
				setState(223);
				lesser();
				setState(224);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(222);
				iDorVALUE();
				setState(223);
				lesser();
				setState(224);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				iDorVALUE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(163);
				iDorVALUE();
				setState(164);
				equal();
				setState(165);
=======
				setState(226);
				iDorVALUE();
				setState(227);
				equal();
				setState(228);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(226);
				iDorVALUE();
				setState(227);
				equal();
				setState(228);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				iDorVALUE();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(167);
				iDorVALUE();
				setState(168);
				greatherORequal();
				setState(169);
=======
				setState(230);
				iDorVALUE();
				setState(231);
				greatherORequal();
				setState(232);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(230);
				iDorVALUE();
				setState(231);
				greatherORequal();
				setState(232);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				iDorVALUE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(171);
				iDorVALUE();
				setState(172);
				lesserORequal();
				setState(173);
=======
				setState(234);
				iDorVALUE();
				setState(235);
				lesserORequal();
				setState(236);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(234);
				iDorVALUE();
				setState(235);
				lesserORequal();
				setState(236);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				iDorVALUE();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(175);
				iDorVALUE();
				setState(176);
				isNOTequal();
				setState(177);
=======
				setState(238);
				iDorVALUE();
				setState(239);
				isNOTequal();
				setState(240);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(238);
				iDorVALUE();
				setState(239);
				isNOTequal();
				setState(240);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 26, RULE_greather);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(181);
=======
			setState(244);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(244);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 28, RULE_lesser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(183);
=======
			setState(246);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(246);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 30, RULE_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(185);
=======
			setState(248);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(248);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 32, RULE_greatherORequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(187);
=======
			setState(250);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(250);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 34, RULE_lesserORequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(189);
=======
			setState(252);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(252);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 36, RULE_isNOTequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(191);
=======
			setState(254);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(254);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 38, RULE_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(193);
=======
			setState(256);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(256);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 40, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(195);
			type();
			setState(196);
			match(ID);
			setState(197);
			match(ASSIGN);
			setState(198);
=======
			setState(258);
			type();
			setState(259);
			match(ID);
			setState(260);
			match(ASSIGN);
			setState(261);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(258);
			type();
			setState(259);
			match(ID);
			setState(260);
			match(ASSIGN);
			setState(261);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
		enterRule(_localctx, 42, RULE_function_declaration);
		int _la;
		try {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(249);
=======
			setState(295);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(295);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case DOUBLE_TYPE:
			case TXT_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(200);
				type();
				setState(201);
				match(ID);
				setState(202);
				match(LPAR);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					{
					setState(203);
					param();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(RPAR);
				setState(210);
				match(LCBRAC);
				setState(214);
=======
				setState(263);
				type();
				setState(264);
				match(ID);
<<<<<<< Updated upstream
=======
=======
				setState(263);
				type();
				setState(264);
				match(ID);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				setState(265);
				match(LPAR);
				setState(266);
				param();
				setState(267);
				match(RPAR);
				setState(268);
				match(LCBRAC);
				setState(274);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER))) != 0)) {
					{
					{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
					setState(211);
					stmt();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					{
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
					setState(217);
					declaration();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
=======
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(269);
						stmt();
						}
						break;
					case 2:
						{
						setState(270);
						match(ID);
						}
						break;
					case 3:
						{
						setState(271);
						expression();
						}
						break;
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
				match(RCBRAC);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(225);
				match(VOID);
				setState(226);
				match(ID);
				setState(227);
				match(LPAR);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					{
					setState(228);
					param();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(RPAR);
				setState(235);
				match(LCBRAC);
				setState(239);
=======
				setState(279);
				match(VOID);
				setState(280);
				match(ID);
<<<<<<< Updated upstream
=======
=======
				setState(279);
				match(VOID);
				setState(280);
				match(ID);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				setState(281);
				match(LPAR);
				setState(282);
				param();
				setState(283);
				match(RPAR);
				setState(284);
				match(LCBRAC);
				setState(290);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FOREVER))) != 0)) {
					{
<<<<<<< Updated upstream
					{
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
					{
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
					setState(236);
					stmt();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					{
					setState(242);
					declaration();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
=======
					setState(288);
					_errHandler.sync(this);
<<<<<<< Updated upstream
=======
=======
					setState(288);
					_errHandler.sync(this);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(285);
						stmt();
						}
						break;
					case 2:
						{
						setState(286);
						match(ID);
						}
						break;
					case 3:
						{
						setState(287);
						expression();
						}
						break;
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
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
		enterRule(_localctx, 44, RULE_param);
		try {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			int _alt;
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(251);
				type();
				setState(252);
				match(ID);
=======
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << DOUBLE_TYPE) | (1L << TXT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					setState(297);
					type();
					setState(298);
					match(ID);
					}
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(258); 
=======
				setState(306); 
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
				_errHandler.sync(this);
				_alt = 1;
				do {
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
=======
				setState(306); 
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
				_errHandler.sync(this);
				_alt = 1;
				do {
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
					switch (_alt) {
					case 1:
						{
						{
						setState(254);
						type();
						setState(255);
						match(ID);
						setState(256);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(260); 
=======
					{
					{
					setState(302);
					type();
					setState(303);
					match(ID);
					setState(304);
					match(COMMA);
					}
					}
					setState(308); 
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(264);
=======
			setState(312);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(312);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 48, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(266);
=======
			setState(314);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(314);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
		enterRule(_localctx, 50, RULE_iDorVALUE);
		try {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
			setState(270);
=======
			setState(318);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
			setState(318);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case TXT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(268);
=======
				setState(316);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(316);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
				setState(269);
=======
				setState(317);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
<<<<<<< Updated upstream
=======
=======
				setState(317);
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/antlr/languageParser.java
=======
<<<<<<< Updated upstream:src/main/java/gen/languageParser.java
>>>>>>> Stashed changes
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3W\n\3\3\4\3\4\3\5\3\5\5\5]\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\br\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u0099\n\r\f\r\16\r\u009c\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00cf\n\27\f\27\16\27\u00d2\13\27"+
		"\3\27\3\27\3\27\7\27\u00d7\n\27\f\27\16\27\u00da\13\27\3\27\7\27\u00dd"+
		"\n\27\f\27\16\27\u00e0\13\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00e8"+
		"\n\27\f\27\16\27\u00eb\13\27\3\27\3\27\3\27\7\27\u00f0\n\27\f\27\16\27"+
		"\u00f3\13\27\3\27\7\27\u00f6\n\27\f\27\16\27\u00f9\13\27\3\27\5\27\u00fc"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0105\n\30\r\30\16\30\u0106"+
		"\5\30\u0109\n\30\3\31\3\31\3\32\3\32\3\33\3\33\5\33\u0111\n\33\3\33\2"+
		"\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\n\3\2"+
		"\3\4\3\2\5\6\3\2\7\b\3\2\t\n\3\2\13\f\3\2\r\16\3\2\37\"\4\2$$&(\2\u0112"+
		"\29\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2\b\\\3\2\2\2\n^\3\2\2\2\fh\3\2\2\2\16"+
		"j\3\2\2\2\20{\3\2\2\2\22}\3\2\2\2\24\u0088\3\2\2\2\26\u0090\3\2\2\2\30"+
		"\u0095\3\2\2\2\32\u00b5\3\2\2\2\34\u00b7\3\2\2\2\36\u00b9\3\2\2\2 \u00bb"+
		"\3\2\2\2\"\u00bd\3\2\2\2$\u00bf\3\2\2\2&\u00c1\3\2\2\2(\u00c3\3\2\2\2"+
		"*\u00c5\3\2\2\2,\u00fb\3\2\2\2.\u0108\3\2\2\2\60\u010a\3\2\2\2\62\u010c"+
		"\3\2\2\2\64\u0110\3\2\2\2\668\5\4\3\2\67\66\3\2\2\28;\3\2\2\29\67\3\2"+
		"\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\31\2\2=A\7\27\2\2>@\5\4\3\2?>\3"+
		"\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\6\4\2ED\3"+
		"\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2JL\5\n\6\2KJ\3"+
		"\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\31\2\2QR"+
		"\7\23\2\2RS\7\2\2\3S\3\3\2\2\2TW\5(\25\2UW\5,\27\2VT\3\2\2\2VU\3\2\2\2"+
		"W\5\3\2\2\2XY\5\b\5\2Y\7\3\2\2\2Z]\5\f\7\2[]\5\20\t\2\\Z\3\2\2\2\\[\3"+
		"\2\2\2]\t\3\2\2\2^_\5\64\33\2_`\7\21\2\2`e\5\64\33\2ab\7\21\2\2bd\5\64"+
		"\33\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3\2\2\2ge\3\2\2\2hi"+
		"\5\16\b\2i\r\3\2\2\2jk\7\17\2\2kl\7\33\2\2lm\5\30\r\2mn\7\34\2\2no\7\35"+
		"\2\2oq\5\b\5\2pr\7\36\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\20\2\2tu\7"+
		"\35\2\2uv\5\b\5\2vw\7\36\2\2w\17\3\2\2\2x|\5\22\n\2y|\5\24\13\2z|\5\26"+
		"\f\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\21\3\2\2\2}~\7\24\2\2~\177\7\33\2"+
		"\2\177\u0080\5\60\31\2\u0080\u0081\7\30\2\2\u0081\u0082\5\30\r\2\u0082"+
		"\u0083\7\30\2\2\u0083\u0084\7\21\2\2\u0084\u0085\7\35\2\2\u0085\u0086"+
		"\5\b\5\2\u0086\u0087\7\36\2\2\u0087\23\3\2\2\2\u0088\u0089\7\25\2\2\u0089"+
		"\u008a\7\33\2\2\u008a\u008b\5\30\r\2\u008b\u008c\7\34\2\2\u008c\u008d"+
		"\7\35\2\2\u008d\u008e\5\b\5\2\u008e\u008f\7\36\2\2\u008f\25\3\2\2\2\u0090"+
		"\u0091\7\26\2\2\u0091\u0092\7\35\2\2\u0092\u0093\5\b\5\2\u0093\u0094\7"+
		"\36\2\2\u0094\27\3\2\2\2\u0095\u009a\5\32\16\2\u0096\u0097\7\22\2\2\u0097"+
		"\u0099\5\32\16\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\31\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\5\64\33\2\u009e\u009f\5\34\17\2\u009f\u00a0\5\64\33\2\u00a0\u00b6"+
		"\3\2\2\2\u00a1\u00a2\5\64\33\2\u00a2\u00a3\5\36\20\2\u00a3\u00a4\5\64"+
		"\33\2\u00a4\u00b6\3\2\2\2\u00a5\u00a6\5\64\33\2\u00a6\u00a7\5 \21\2\u00a7"+
		"\u00a8\5\64\33\2\u00a8\u00b6\3\2\2\2\u00a9\u00aa\5\64\33\2\u00aa\u00ab"+
		"\5\"\22\2\u00ab\u00ac\5\64\33\2\u00ac\u00b6\3\2\2\2\u00ad\u00ae\5\64\33"+
		"\2\u00ae\u00af\5$\23\2\u00af\u00b0\5\64\33\2\u00b0\u00b6\3\2\2\2\u00b1"+
		"\u00b2\5\64\33\2\u00b2\u00b3\5&\24\2\u00b3\u00b4\5\64\33\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u009d\3\2\2\2\u00b5\u00a1\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5"+
		"\u00a9\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\33\3\2\2"+
		"\2\u00b7\u00b8\t\2\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\t\3\2\2\u00ba\37\3"+
		"\2\2\2\u00bb\u00bc\t\4\2\2\u00bc!\3\2\2\2\u00bd\u00be\t\5\2\2\u00be#\3"+
		"\2\2\2\u00bf\u00c0\t\6\2\2\u00c0%\3\2\2\2\u00c1\u00c2\t\7\2\2\u00c2\'"+
		"\3\2\2\2\u00c3\u00c4\5*\26\2\u00c4)\3\2\2\2\u00c5\u00c6\5\60\31\2\u00c6"+
		"\u00c7\7+\2\2\u00c7\u00c8\7#\2\2\u00c8\u00c9\5\64\33\2\u00c9+\3\2\2\2"+
		"\u00ca\u00cb\5\60\31\2\u00cb\u00cc\7+\2\2\u00cc\u00d0\7\33\2\2\u00cd\u00cf"+
		"\5.\30\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\34"+
		"\2\2\u00d4\u00d8\7\35\2\2\u00d5\u00d7\5\b\5\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00de\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\5\4\3\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\36\2\2\u00e2\u00fc\3\2\2\2\u00e3"+
		"\u00e4\7\32\2\2\u00e4\u00e5\7+\2\2\u00e5\u00e9\7\33\2\2\u00e6\u00e8\5"+
		".\30\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\34"+
		"\2\2\u00ed\u00f1\7\35\2\2\u00ee\u00f0\5\b\5\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f7\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\5\4\3\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\7\36\2\2\u00fb\u00ca\3\2\2\2\u00fb"+
		"\u00e3\3\2\2\2\u00fc-\3\2\2\2\u00fd\u00fe\5\60\31\2\u00fe\u00ff\7+\2\2"+
		"\u00ff\u0109\3\2\2\2\u0100\u0101\5\60\31\2\u0101\u0102\7+\2\2\u0102\u0103"+
		"\7\30\2\2\u0103\u0105\3\2\2\2\u0104\u0100\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u00fd"+
		"\3\2\2\2\u0108\u0104\3\2\2\2\u0109/\3\2\2\2\u010a\u010b\t\b\2\2\u010b"+
		"\61\3\2\2\2\u010c\u010d\t\t\2\2\u010d\63\3\2\2\2\u010e\u0111\5\62\32\2"+
		"\u010f\u0111\7+\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\65\3"+
		"\2\2\2\279AGMV\\eq{\u009a\u00b5\u00d0\u00d8\u00de\u00e9\u00f1\u00f7\u00fb"+
		"\u0106\u0108\u0110";
=======
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
>>>>>>> Stashed changes
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0143\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\5\2H\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"Q\n\3\6\3S\n\3\r\3\16\3T\3\3\3\3\3\3\3\4\3\4\5\4\\\n\4\3\5\3\5\5\5`\n"+
		"\5\3\6\3\6\5\6d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\7\3\7\6\7"+
		"\u0082\n\7\r\7\16\7\u0083\3\7\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13"+
		"\7\3\7\3\7\5\7\u0090\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009b"+
		"\n\t\f\t\16\t\u009e\13\t\3\t\5\t\u00a1\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\5\n\u00ab\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00b5"+
		"\n\13\r\13\16\13\u00b6\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00c4\n\f\f\f\16\f\u00c7\13\f\3\f\3\f\3\r\3\r\3\r\3\r\6\r\u00cf\n"+
		"\r\r\r\16\r\u00d0\3\r\3\r\3\16\3\16\3\16\7\16\u00d8\n\16\f\16\16\16\u00db"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f5\n\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u0113\n\30\f\30\16\30\u0116\13\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u0123\n\30\f\30\16\30\u0126\13\30\3\30"+
		"\3\30\5\30\u012a\n\30\3\31\3\31\3\31\5\31\u012f\n\31\3\31\3\31\3\31\3"+
		"\31\6\31\u0135\n\31\r\31\16\31\u0136\5\31\u0139\n\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\5\34\u0141\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\13\3\2\21\24\3\2\3\4\3\2\5\6\3\2\7\b"+
		"\3\2\t\n\3\2\13\f\3\2\r\16\3\2#&\4\2((*,\2\u0157\2G\3\2\2\2\4I\3\2\2\2"+
		"\6[\3\2\2\2\b_\3\2\2\2\nc\3\2\2\2\f\u008f\3\2\2\2\16\u0091\3\2\2\2\20"+
		"\u0093\3\2\2\2\22\u00aa\3\2\2\2\24\u00ac\3\2\2\2\26\u00bc\3\2\2\2\30\u00ca"+
		"\3\2\2\2\32\u00d4\3\2\2\2\34\u00f4\3\2\2\2\36\u00f6\3\2\2\2 \u00f8\3\2"+
		"\2\2\"\u00fa\3\2\2\2$\u00fc\3\2\2\2&\u00fe\3\2\2\2(\u0100\3\2\2\2*\u0102"+
		"\3\2\2\2,\u0104\3\2\2\2.\u0129\3\2\2\2\60\u0138\3\2\2\2\62\u013a\3\2\2"+
		"\2\64\u013c\3\2\2\2\66\u0140\3\2\2\28;\5\b\5\29;\5\f\7\2:8\3\2\2\2:9\3"+
		"\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?H\7\2\2\3@B\5"+
		"\6\4\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FH\5"+
		"\4\3\2G<\3\2\2\2GC\3\2\2\2H\3\3\2\2\2IJ\7\35\2\2JR\7\33\2\2KL\7/\2\2L"+
		"M\7\37\2\2MS\7 \2\2NQ\5\b\5\2OQ\5\f\7\2PN\3\2\2\2PO\3\2\2\2QS\3\2\2\2"+
		"RK\3\2\2\2RP\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\35\2"+
		"\2WX\7\27\2\2X\5\3\2\2\2Y\\\5*\26\2Z\\\5.\30\2[Y\3\2\2\2[Z\3\2\2\2\\\7"+
		"\3\2\2\2]`\5\n\6\2^`\7/\2\2_]\3\2\2\2_^\3\2\2\2`\t\3\2\2\2ad\5\16\b\2"+
		"bd\5\22\n\2ca\3\2\2\2cb\3\2\2\2d\13\3\2\2\2ef\5\66\34\2fg\7\21\2\2gh\5"+
		"\66\34\2h\u0090\3\2\2\2ij\5\66\34\2jk\7\22\2\2kl\5\66\34\2l\u0090\3\2"+
		"\2\2mn\5\66\34\2no\7\23\2\2op\5\66\34\2p\u0090\3\2\2\2qr\5\66\34\2rs\7"+
		"\24\2\2st\5\66\34\2t\u0090\3\2\2\2uv\5\66\34\2vw\7\25\2\2wx\5\66\34\2"+
		"x\u0090\3\2\2\2y{\t\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~|\3\2\2\2\177\u0081\7\37\2\2\u0080\u0082\5\f\7\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\7 \2\2\u0086\u0090\3\2\2\2\u0087\u0089\t\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0090\5\66"+
		"\34\2\u008e\u0090\5\66\34\2\u008fe\3\2\2\2\u008fi\3\2\2\2\u008fm\3\2\2"+
		"\2\u008fq\3\2\2\2\u008fu\3\2\2\2\u008f|\3\2\2\2\u008f\u008a\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\r\3\2\2\2\u0091\u0092\5\20\t\2\u0092\17\3\2\2\2\u0093"+
		"\u0094\7\17\2\2\u0094\u0095\7\37\2\2\u0095\u0096\5\32\16\2\u0096\u0097"+
		"\7 \2\2\u0097\u009c\7!\2\2\u0098\u009b\5\n\6\2\u0099\u009b\5\f\7\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a1\7\"\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a4\7!\2\2\u00a4\u00a5\5\n\6\2\u00a5"+
		"\u00a6\7\"\2\2\u00a6\21\3\2\2\2\u00a7\u00ab\5\24\13\2\u00a8\u00ab\5\26"+
		"\f\2\u00a9\u00ab\5\30\r\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\23\3\2\2\2\u00ac\u00ad\7\30\2\2\u00ad\u00ae\7\37"+
		"\2\2\u00ae\u00af\5\62\32\2\u00af\u00b0\7\34\2\2\u00b0\u00b1\5\32\16\2"+
		"\u00b1\u00b4\7\34\2\2\u00b2\u00b5\5\n\6\2\u00b3\u00b5\5\f\7\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7!\2\2\u00b9\u00ba\5\n"+
		"\6\2\u00ba\u00bb\7\"\2\2\u00bb\25\3\2\2\2\u00bc\u00bd\7\31\2\2\u00bd\u00be"+
		"\7\37\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\7 \2\2\u00c0\u00c5\7!\2\2"+
		"\u00c1\u00c4\5\n\6\2\u00c2\u00c4\5\f\7\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\"\2\2\u00c9\27\3\2\2"+
		"\2\u00ca\u00cb\7\32\2\2\u00cb\u00ce\7!\2\2\u00cc\u00cf\5\n\6\2\u00cd\u00cf"+
		"\5\f\7\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\""+
		"\2\2\u00d3\31\3\2\2\2\u00d4\u00d9\5\34\17\2\u00d5\u00d6\7\26\2\2\u00d6"+
		"\u00d8\5\34\17\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\33\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\5\66\34\2\u00dd\u00de\5\36\20\2\u00de\u00df\5\66\34\2\u00df\u00f5"+
		"\3\2\2\2\u00e0\u00e1\5\66\34\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\5\66\34"+
		"\2\u00e3\u00f5\3\2\2\2\u00e4\u00e5\5\66\34\2\u00e5\u00e6\5\"\22\2\u00e6"+
		"\u00e7\5\66\34\2\u00e7\u00f5\3\2\2\2\u00e8\u00e9\5\66\34\2\u00e9\u00ea"+
		"\5$\23\2\u00ea\u00eb\5\66\34\2\u00eb\u00f5\3\2\2\2\u00ec\u00ed\5\66\34"+
		"\2\u00ed\u00ee\5&\24\2\u00ee\u00ef\5\66\34\2\u00ef\u00f5\3\2\2\2\u00f0"+
		"\u00f1\5\66\34\2\u00f1\u00f2\5(\25\2\u00f2\u00f3\5\66\34\2\u00f3\u00f5"+
		"\3\2\2\2\u00f4\u00dc\3\2\2\2\u00f4\u00e0\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f4"+
		"\u00e8\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5\35\3\2\2"+
		"\2\u00f6\u00f7\t\3\2\2\u00f7\37\3\2\2\2\u00f8\u00f9\t\4\2\2\u00f9!\3\2"+
		"\2\2\u00fa\u00fb\t\5\2\2\u00fb#\3\2\2\2\u00fc\u00fd\t\6\2\2\u00fd%\3\2"+
		"\2\2\u00fe\u00ff\t\7\2\2\u00ff\'\3\2\2\2\u0100\u0101\t\b\2\2\u0101)\3"+
		"\2\2\2\u0102\u0103\5,\27\2\u0103+\3\2\2\2\u0104\u0105\5\62\32\2\u0105"+
		"\u0106\7/\2\2\u0106\u0107\7\'\2\2\u0107\u0108\5\66\34\2\u0108-\3\2\2\2"+
		"\u0109\u010a\5\62\32\2\u010a\u010b\7/\2\2\u010b\u010c\7\37\2\2\u010c\u010d"+
		"\5\60\31\2\u010d\u010e\7 \2\2\u010e\u0114\7!\2\2\u010f\u0113\5\n\6\2\u0110"+
		"\u0113\7/\2\2\u0111\u0113\5\f\7\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\""+
		"\2\2\u0118\u012a\3\2\2\2\u0119\u011a\7\36\2\2\u011a\u011b\7/\2\2\u011b"+
		"\u011c\7\37\2\2\u011c\u011d\5\60\31\2\u011d\u011e\7 \2\2\u011e\u0124\7"+
		"!\2\2\u011f\u0123\5\n\6\2\u0120\u0123\7/\2\2\u0121\u0123\5\f\7\2\u0122"+
		"\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u0128\7\"\2\2\u0128\u012a\3\2\2\2\u0129\u0109\3\2"+
		"\2\2\u0129\u0119\3\2\2\2\u012a/\3\2\2\2\u012b\u012c\5\62\32\2\u012c\u012d"+
		"\7/\2\2\u012d\u012f\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0139\3\2\2\2\u0130\u0131\5\62\32\2\u0131\u0132\7/\2\2\u0132\u0133\7"+
		"\34\2\2\u0133\u0135\3\2\2\2\u0134\u0130\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u012e\3\2"+
		"\2\2\u0138\u0134\3\2\2\2\u0139\61\3\2\2\2\u013a\u013b\t\t\2\2\u013b\63"+
		"\3\2\2\2\u013c\u013d\t\n\2\2\u013d\65\3\2\2\2\u013e\u0141\5\64\33\2\u013f"+
		"\u0141\7/\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\67\3\2\2\2"+
		"%:<CGPRT[_c|\u0083\u008a\u008f\u009a\u009c\u00a0\u00aa\u00b4\u00b6\u00c3"+
		"\u00c5\u00ce\u00d0\u00d9\u00f4\u0112\u0114\u0122\u0124\u0129\u012e\u0136"+
		"\u0138\u0140";
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageParser.java
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
=======
>>>>>>> Stashed changes
>>>>>>> Stashed changes:src/main/java/grammar/languageParser.java
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}