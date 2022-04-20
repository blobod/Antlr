// Generated from /Users/abdallahziadalnaif/Desktop/Antlr-main/src/antlr/language.g4 by ANTLR 4.9.2
package gen;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, IF=13, ELSE=14, EXPRESSION=15, OR=16, STOP=17, 
		FOR=18, WHILE=19, FOREVER=20, START=21, COMMA=22, AT_SIGN=23, VOID=24, 
		LPAR=25, RPAR=26, LCBRAC=27, RCBRAC=28, INT_TYPE=29, DOUBLE_TYPE=30, TXT_TYPE=31, 
		BOOL_TYPE=32, ASSIGN=33, INT=34, DOT=35, DOUBLE=36, TXT=37, BOOL=38, TRUE=39, 
		FALSE=40, ID=41, WS=42, COMMENT=43, LINE_COMMENT=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "IF", "ELSE", "EXPRESSION", "OR", "STOP", "FOR", 
			"WHILE", "FOREVER", "START", "COMMA", "AT_SIGN", "VOID", "LPAR", "RPAR", 
			"LCBRAC", "RCBRAC", "INT_TYPE", "DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", 
			"ASSIGN", "INT", "DOT", "DOUBLE", "TXT", "BOOL", "TRUE", "FALSE", "ID", 
			"WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\6#\u0103\n#\r"+
		"#\16#\u0104\3$\3$\3%\6%\u010a\n%\r%\16%\u010b\3%\3%\6%\u0110\n%\r%\16"+
		"%\u0111\3&\3&\6&\u0116\n&\r&\16&\u0117\3\'\6\'\u011b\n\'\r\'\16\'\u011c"+
		"\3\'\6\'\u0120\n\'\r\'\16\'\u0121\5\'\u0124\n\'\3(\3(\3(\3(\3(\5(\u012b"+
		"\n(\3)\3)\3)\3)\3)\3)\5)\u0133\n)\3*\5*\u0136\n*\3*\6*\u0139\n*\r*\16"+
		"*\u013a\3+\6+\u013e\n+\r+\16+\u013f\3+\3+\3,\3,\3,\3,\7,\u0148\n,\f,\16"+
		",\u014b\13,\3,\3,\3,\3,\3,\3-\3-\3-\3-\7-\u0156\n-\f-\16-\u0159\13-\3"+
		"-\3-\3\u0149\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\n\6\2,-//\61\61"+
		"``\3\2\62;\3\2c|\3\2C\\\4\2aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2"+
		"\f\f\17\17\2\u0169\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2"+
		"\7f\3\2\2\2\th\3\2\2\2\13o\3\2\2\2\rr\3\2\2\2\17x\3\2\2\2\21{\3\2\2\2"+
		"\23\u008d\3\2\2\2\25\u0090\3\2\2\2\27\u00a0\3\2\2\2\31\u00a3\3\2\2\2\33"+
		"\u00b0\3\2\2\2\35\u00b3\3\2\2\2\37\u00b8\3\2\2\2!\u00ba\3\2\2\2#\u00bd"+
		"\3\2\2\2%\u00c2\3\2\2\2\'\u00c6\3\2\2\2)\u00cc\3\2\2\2+\u00d4\3\2\2\2"+
		"-\u00da\3\2\2\2/\u00dc\3\2\2\2\61\u00de\3\2\2\2\63\u00e3\3\2\2\2\65\u00e5"+
		"\3\2\2\2\67\u00e7\3\2\2\29\u00e9\3\2\2\2;\u00eb\3\2\2\2=\u00ef\3\2\2\2"+
		"?\u00f6\3\2\2\2A\u00fa\3\2\2\2C\u00ff\3\2\2\2E\u0102\3\2\2\2G\u0106\3"+
		"\2\2\2I\u0109\3\2\2\2K\u0113\3\2\2\2M\u0123\3\2\2\2O\u012a\3\2\2\2Q\u0132"+
		"\3\2\2\2S\u0135\3\2\2\2U\u013d\3\2\2\2W\u0143\3\2\2\2Y\u0151\3\2\2\2["+
		"\\\7@\2\2\\\4\3\2\2\2]^\7I\2\2^_\7t\2\2_`\7g\2\2`a\7c\2\2ab\7v\2\2bc\7"+
		"j\2\2cd\7g\2\2de\7t\2\2e\6\3\2\2\2fg\7>\2\2g\b\3\2\2\2hi\7N\2\2ij\7g\2"+
		"\2jk\7u\2\2kl\7u\2\2lm\7g\2\2mn\7t\2\2n\n\3\2\2\2op\7?\2\2pq\7?\2\2q\f"+
		"\3\2\2\2rs\7G\2\2st\7s\2\2tu\7w\2\2uv\7c\2\2vw\7n\2\2w\16\3\2\2\2xy\7"+
		"@\2\2yz\7?\2\2z\20\3\2\2\2{|\7I\2\2|}\7t\2\2}~\7g\2\2~\177\7c\2\2\177"+
		"\u0080\7v\2\2\u0080\u0081\7j\2\2\u0081\u0082\7g\2\2\u0082\u0083\7t\2\2"+
		"\u0083\u0084\7a\2\2\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086\u0087"+
		"\7a\2\2\u0087\u0088\7g\2\2\u0088\u0089\7s\2\2\u0089\u008a\7w\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\22\3\2\2\2\u008d\u008e\7>\2\2\u008e"+
		"\u008f\7?\2\2\u008f\24\3\2\2\2\u0090\u0091\7N\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7u\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\u0096\7t\2\2"+
		"\u0096\u0097\7a\2\2\u0097\u0098\7q\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7a\2\2\u009a\u009b\7g\2\2\u009b\u009c\7s\2\2\u009c\u009d\7w\2\2\u009d"+
		"\u009e\7c\2\2\u009e\u009f\7n\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1"+
		"\u00a2\7?\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7K\2\2\u00a4\u00a5\7u\2\2\u00a5"+
		"\u00a6\7a\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7v\2\2"+
		"\u00a9\u00aa\7a\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7s\2\2\u00ac\u00ad"+
		"\7w\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7n\2\2\u00af\32\3\2\2\2\u00b0\u00b1"+
		"\7k\2\2\u00b1\u00b2\7h\2\2\u00b2\34\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5"+
		"\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\36\3\2\2\2\u00b8\u00b9"+
		"\t\2\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7~\2\2\u00bb\u00bc\7~\2\2\u00bc\""+
		"\3\2\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7q\2\2\u00c0"+
		"\u00c1\7r\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7q\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5&\3\2\2\2\u00c6\u00c7\7y\2\2\u00c7\u00c8\7j\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2\u00cb(\3\2\2\2\u00cc"+
		"\u00cd\7h\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0\u00d1\7x\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3*\3\2\2"+
		"\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8"+
		"\7t\2\2\u00d8\u00d9\7v\2\2\u00d9,\3\2\2\2\u00da\u00db\7.\2\2\u00db.\3"+
		"\2\2\2\u00dc\u00dd\7B\2\2\u00dd\60\3\2\2\2\u00de\u00df\7x\2\2\u00df\u00e0"+
		"\7q\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7f\2\2\u00e2\62\3\2\2\2\u00e3\u00e4"+
		"\7*\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7+\2\2\u00e6\66\3\2\2\2\u00e7\u00e8"+
		"\7}\2\2\u00e88\3\2\2\2\u00e9\u00ea\7\177\2\2\u00ea:\3\2\2\2\u00eb\u00ec"+
		"\7k\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7v\2\2\u00ee<\3\2\2\2\u00ef\u00f0"+
		"\7f\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7d\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7g\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		"\u00f8\7z\2\2\u00f8\u00f9\7v\2\2\u00f9@\3\2\2\2\u00fa\u00fb\7d\2\2\u00fb"+
		"\u00fc\7q\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7n\2\2\u00feB\3\2\2\2\u00ff"+
		"\u0100\7?\2\2\u0100D\3\2\2\2\u0101\u0103\t\3\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105F\3\2\2\2"+
		"\u0106\u0107\7\60\2\2\u0107H\3\2\2\2\u0108\u010a\t\3\2\2\u0109\u0108\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010f\5G$\2\u010e\u0110\t\3\2\2\u010f\u010e\3\2\2"+
		"\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112J"+
		"\3\2\2\2\u0113\u0115\t\4\2\2\u0114\u0116\t\5\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118L\3\2\2\2"+
		"\u0119\u011b\5O(\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0124\3\2\2\2\u011e\u0120\5Q)\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u011a\3\2\2\2\u0123\u011f\3\2\2\2\u0124"+
		"N\3\2\2\2\u0125\u012b\7\63\2\2\u0126\u0127\7v\2\2\u0127\u0128\7t\2\2\u0128"+
		"\u0129\7w\2\2\u0129\u012b\7g\2\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2\2"+
		"\2\u012bP\3\2\2\2\u012c\u0133\7\62\2\2\u012d\u012e\7h\2\2\u012e\u012f"+
		"\7c\2\2\u012f\u0130\7n\2\2\u0130\u0131\7u\2\2\u0131\u0133\7g\2\2\u0132"+
		"\u012c\3\2\2\2\u0132\u012d\3\2\2\2\u0133R\3\2\2\2\u0134\u0136\t\6\2\2"+
		"\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139"+
		"\t\7\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013bT\3\2\2\2\u013c\u013e\t\b\2\2\u013d\u013c\3\2\2\2"+
		"\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0142\b+\2\2\u0142V\3\2\2\2\u0143\u0144\7\61\2\2\u0144"+
		"\u0145\7,\2\2\u0145\u0149\3\2\2\2\u0146\u0148\13\2\2\2\u0147\u0146\3\2"+
		"\2\2\u0148\u014b\3\2\2\2\u0149\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7,\2\2\u014d\u014e\7\61"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b,\2\2\u0150X\3\2\2\2\u0151\u0152"+
		"\7\61\2\2\u0152\u0153\7\61\2\2\u0153\u0157\3\2\2\2\u0154\u0156\n\t\2\2"+
		"\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\b-\2\2\u015b"+
		"Z\3\2\2\2\21\2\u0104\u010b\u0111\u0117\u011c\u0121\u0123\u012a\u0132\u0135"+
		"\u013a\u013f\u0149\u0157\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}