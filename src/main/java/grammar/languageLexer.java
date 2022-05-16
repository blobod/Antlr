// Generated from C:/Users/thetr/Desktop/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATER=1, LESSER=2, EQUAL=3, GREATEROREQUAL=4, LESSEROREQUAL=5, ISNOTEQUAL=6, 
		SCAN=7, PRINT=8, BREAK=9, IF=10, ELSE=11, PLUS=12, MINUS=13, MULTIPLICATION=14, 
		DIVISION=15, POWER_OF=16, OR=17, STOP=18, FOR=19, WHILE=20, FOREVER=21, 
		START=22, COMMA=23, AT_SIGN=24, VOID=25, LPAR=26, RPAR=27, LCBRAC=28, 
		RCBRAC=29, TYPE=30, INT_TYPE=31, DOUBLE_TYPE=32, TXT_TYPE=33, BOOL_TYPE=34, 
		ASSIGN=35, VALUE=36, INT=37, DOT=38, DOUBLE=39, TXT=40, BOOL=41, TRUE=42, 
		FALSE=43, ID=44, WS=45, COMMENT=46, LINE_COMMENT=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GREATER", "LESSER", "EQUAL", "GREATEROREQUAL", "LESSEROREQUAL", "ISNOTEQUAL", 
			"SCAN", "PRINT", "BREAK", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "POWER_OF", "OR", "STOP", "FOR", "WHILE", "FOREVER", "START", 
			"COMMA", "AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "TYPE", 
			"INT_TYPE", "DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", "VALUE", 
			"INT", "DOT", "DOUBLE", "TXT", "BOOL", "TRUE", "FALSE", "ID", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", null, null, null, null, null, "'scan'", "'print'", "'break'", 
			"'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'^'", "'||'", "'stop'", 
			"'for'", "'while'", "'forever'", "'start'", "','", "'@'", "'void'", "'('", 
			"')'", "'{'", "'}'", null, "'int'", "'double'", "'txt'", "'bool'", "'='", 
			null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATER", "LESSER", "EQUAL", "GREATEROREQUAL", "LESSEROREQUAL", 
			"ISNOTEQUAL", "SCAN", "PRINT", "BREAK", "IF", "ELSE", "PLUS", "MINUS", 
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


	public languageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0173\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3k\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4t\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0088\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009b"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ab"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\5\37\u0105\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3$\3$\3%\3%\5%\u011f\n%\3&\6&\u0122\n&\r&\16&\u0123\3\'\3\'"+
		"\3(\6(\u0129\n(\r(\16(\u012a\3(\3(\6(\u012f\n(\r(\16(\u0130\3)\3)\6)\u0135"+
		"\n)\r)\16)\u0136\3*\3*\5*\u013b\n*\3+\3+\3+\3+\3+\5+\u0142\n+\3,\3,\3"+
		",\3,\3,\3,\5,\u014a\n,\3-\5-\u014d\n-\3-\6-\u0150\n-\r-\16-\u0151\3.\6"+
		".\u0155\n.\r.\16.\u0156\3.\3.\3/\3/\3/\3/\7/\u015f\n/\f/\16/\u0162\13"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u016d\n\60\f\60\16\60\u0170"+
		"\13\60\3\60\3\60\3\u0160\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"\3\2\t\3\2\62;\3\2c|\3\2C\\\4\2aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17\2\u0187\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5j\3\2\2\2\7s\3\2\2\2\t\u0087\3\2\2\2\13"+
		"\u009a\3\2\2\2\r\u00aa\3\2\2\2\17\u00ac\3\2\2\2\21\u00b1\3\2\2\2\23\u00b7"+
		"\3\2\2\2\25\u00bd\3\2\2\2\27\u00c0\3\2\2\2\31\u00c5\3\2\2\2\33\u00c7\3"+
		"\2\2\2\35\u00c9\3\2\2\2\37\u00cb\3\2\2\2!\u00cd\3\2\2\2#\u00cf\3\2\2\2"+
		"%\u00d2\3\2\2\2\'\u00d7\3\2\2\2)\u00db\3\2\2\2+\u00e1\3\2\2\2-\u00e9\3"+
		"\2\2\2/\u00ef\3\2\2\2\61\u00f1\3\2\2\2\63\u00f3\3\2\2\2\65\u00f8\3\2\2"+
		"\2\67\u00fa\3\2\2\29\u00fc\3\2\2\2;\u00fe\3\2\2\2=\u0104\3\2\2\2?\u0106"+
		"\3\2\2\2A\u010a\3\2\2\2C\u0111\3\2\2\2E\u0115\3\2\2\2G\u011a\3\2\2\2I"+
		"\u011e\3\2\2\2K\u0121\3\2\2\2M\u0125\3\2\2\2O\u0128\3\2\2\2Q\u0132\3\2"+
		"\2\2S\u013a\3\2\2\2U\u0141\3\2\2\2W\u0149\3\2\2\2Y\u014c\3\2\2\2[\u0154"+
		"\3\2\2\2]\u015a\3\2\2\2_\u0168\3\2\2\2ab\7@\2\2b\4\3\2\2\2ck\7>\2\2de"+
		"\7N\2\2ef\7g\2\2fg\7u\2\2gh\7u\2\2hi\7g\2\2ik\7t\2\2jc\3\2\2\2jd\3\2\2"+
		"\2k\6\3\2\2\2lm\7?\2\2mt\7?\2\2no\7G\2\2op\7s\2\2pq\7w\2\2qr\7c\2\2rt"+
		"\7n\2\2sl\3\2\2\2sn\3\2\2\2t\b\3\2\2\2uv\7@\2\2v\u0088\7?\2\2wx\7I\2\2"+
		"xy\7t\2\2yz\7g\2\2z{\7c\2\2{|\7v\2\2|}\7g\2\2}~\7t\2\2~\177\7a\2\2\177"+
		"\u0080\7q\2\2\u0080\u0081\7t\2\2\u0081\u0082\7a\2\2\u0082\u0083\7g\2\2"+
		"\u0083\u0084\7s\2\2\u0084\u0085\7w\2\2\u0085\u0086\7c\2\2\u0086\u0088"+
		"\7n\2\2\u0087u\3\2\2\2\u0087w\3\2\2\2\u0088\n\3\2\2\2\u0089\u008a\7>\2"+
		"\2\u008a\u009b\7?\2\2\u008b\u008c\7N\2\2\u008c\u008d\7g\2\2\u008d\u008e"+
		"\7u\2\2\u008e\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7a\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\u0095\7a\2\2"+
		"\u0095\u0096\7g\2\2\u0096\u0097\7s\2\2\u0097\u0098\7w\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009b\7n\2\2\u009a\u0089\3\2\2\2\u009a\u008b\3\2\2\2\u009b"+
		"\f\3\2\2\2\u009c\u009d\7#\2\2\u009d\u00ab\7?\2\2\u009e\u009f\7K\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7a\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7q\2\2"+
		"\u00a3\u00a4\7v\2\2\u00a4\u00a5\7a\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7s\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7c\2\2\u00a9\u00ab\7n\2\2\u00aa"+
		"\u009c\3\2\2\2\u00aa\u009e\3\2\2\2\u00ab\16\3\2\2\2\u00ac\u00ad\7u\2\2"+
		"\u00ad\u00ae\7e\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7p\2\2\u00b0\20\3\2"+
		"\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5"+
		"\7p\2\2\u00b5\u00b6\7v\2\2\u00b6\22\3\2\2\2\u00b7\u00b8\7d\2\2\u00b8\u00b9"+
		"\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7m\2\2\u00bc"+
		"\24\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7h\2\2\u00bf\26\3\2\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\30\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\7/\2"+
		"\2\u00c8\34\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7"+
		"\61\2\2\u00cc \3\2\2\2\u00cd\u00ce\7`\2\2\u00ce\"\3\2\2\2\u00cf\u00d0"+
		"\7~\2\2\u00d0\u00d1\7~\2\2\u00d1$\3\2\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7r\2\2\u00d6&\3\2\2\2\u00d7\u00d8"+
		"\7h\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7t\2\2\u00da(\3\2\2\2\u00db\u00dc"+
		"\7y\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7n\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0*\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7q\2\2\u00e3"+
		"\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7x\2\2\u00e6\u00e7\7g\2\2"+
		"\u00e7\u00e8\7t\2\2\u00e8,\3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7v\2"+
		"\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7v\2\2\u00ee.\3\2"+
		"\2\2\u00ef\u00f0\7.\2\2\u00f0\60\3\2\2\2\u00f1\u00f2\7B\2\2\u00f2\62\3"+
		"\2\2\2\u00f3\u00f4\7x\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7k\2\2\u00f6"+
		"\u00f7\7f\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7*\2\2\u00f9\66\3\2\2\2\u00fa"+
		"\u00fb\7+\2\2\u00fb8\3\2\2\2\u00fc\u00fd\7}\2\2\u00fd:\3\2\2\2\u00fe\u00ff"+
		"\7\177\2\2\u00ff<\3\2\2\2\u0100\u0105\5? \2\u0101\u0105\5A!\2\u0102\u0105"+
		"\5C\"\2\u0103\u0105\5E#\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105>\3\2\2\2\u0106\u0107\7k\2\2\u0107"+
		"\u0108\7p\2\2\u0108\u0109\7v\2\2\u0109@\3\2\2\2\u010a\u010b\7f\2\2\u010b"+
		"\u010c\7q\2\2\u010c\u010d\7w\2\2\u010d\u010e\7d\2\2\u010e\u010f\7n\2\2"+
		"\u010f\u0110\7g\2\2\u0110B\3\2\2\2\u0111\u0112\7v\2\2\u0112\u0113\7z\2"+
		"\2\u0113\u0114\7v\2\2\u0114D\3\2\2\2\u0115\u0116\7d\2\2\u0116\u0117\7"+
		"q\2\2\u0117\u0118\7q\2\2\u0118\u0119\7n\2\2\u0119F\3\2\2\2\u011a\u011b"+
		"\7?\2\2\u011bH\3\2\2\2\u011c\u011f\5K&\2\u011d\u011f\5O(\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011d\3\2\2\2\u011fJ\3\2\2\2\u0120\u0122\t\2\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124L\3\2\2\2\u0125\u0126\7\60\2\2\u0126N\3\2\2\2\u0127\u0129\t"+
		"\2\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\5M\'\2\u012d\u012f\t\2"+
		"\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131P\3\2\2\2\u0132\u0134\t\3\2\2\u0133\u0135\t\4\2\2"+
		"\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137R\3\2\2\2\u0138\u013b\5U+\2\u0139\u013b\5W,\2\u013a\u0138"+
		"\3\2\2\2\u013a\u0139\3\2\2\2\u013bT\3\2\2\2\u013c\u0142\7\63\2\2\u013d"+
		"\u013e\7v\2\2\u013e\u013f\7t\2\2\u013f\u0140\7w\2\2\u0140\u0142\7g\2\2"+
		"\u0141\u013c\3\2\2\2\u0141\u013d\3\2\2\2\u0142V\3\2\2\2\u0143\u014a\7"+
		"\62\2\2\u0144\u0145\7h\2\2\u0145\u0146\7c\2\2\u0146\u0147\7n\2\2\u0147"+
		"\u0148\7u\2\2\u0148\u014a\7g\2\2\u0149\u0143\3\2\2\2\u0149\u0144\3\2\2"+
		"\2\u014aX\3\2\2\2\u014b\u014d\t\5\2\2\u014c\u014b\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0150\t\6\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152Z\3\2\2\2"+
		"\u0153\u0155\t\7\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b.\2\2\u0159"+
		"\\\3\2\2\2\u015a\u015b\7\61\2\2\u015b\u015c\7,\2\2\u015c\u0160\3\2\2\2"+
		"\u015d\u015f\13\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\7,\2\2\u0164\u0165\7\61\2\2\u0165\u0166\3\2\2\2\u0166\u0167\b/"+
		"\2\2\u0167^\3\2\2\2\u0168\u0169\7\61\2\2\u0169\u016a\7\61\2\2\u016a\u016e"+
		"\3\2\2\2\u016b\u016d\n\b\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0171\u0172\b\60\2\2\u0172`\3\2\2\2\26\2js\u0087\u009a\u00aa\u0104"+
		"\u011e\u0123\u012a\u0130\u0136\u013a\u0141\u0149\u014c\u0151\u0156\u0160"+
		"\u016e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}