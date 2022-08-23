// Generated from C:/Users/thetr/OneDrive/Dokumenter/GitHub/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
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
		INPUT=7, PRINT=8, PRINTLN=9, BREAK=10, IF=11, ELSE=12, PLUS=13, MINUS=14, 
		MULTIPLICATION=15, DIVISION=16, POWER_OF=17, OR=18, STOP=19, FOR=20, WHILE=21, 
		FOREVER=22, COMMA=23, AT_SIGN=24, VOID=25, LPAR=26, RPAR=27, LCBRAC=28, 
		RCBRAC=29, TYPE=30, INT_TYPE=31, DOUBLE_TYPE=32, TXT_TYPE=33, BOOL_TYPE=34, 
		ASSIGN=35, INT=36, DOT=37, DOUBLE=38, TXT=39, BOOL=40, RETURN=41, TRUE=42, 
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
			"INPUT", "PRINT", "PRINTLN", "BREAK", "IF", "ELSE", "PLUS", "MINUS", 
			"MULTIPLICATION", "DIVISION", "POWER_OF", "OR", "STOP", "FOR", "WHILE", 
			"FOREVER", "COMMA", "AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", 
			"TYPE", "INT_TYPE", "DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", 
			"INT", "DOT", "DOUBLE", "TXT", "BOOL", "RETURN", "TRUE", "FALSE", "ID", 
			"WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u017a\b\1\4\2"+
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
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\5\37\u0108\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3$\3$\3%\6%\u0121\n%\r%\16%\u0122\3&\3&\3\'\6\'"+
		"\u0128\n\'\r\'\16\'\u0129\3\'\3\'\6\'\u012e\n\'\r\'\16\'\u012f\3(\3(\5"+
		"(\u0134\n(\3(\6(\u0137\n(\r(\16(\u0138\3(\3(\3)\3)\5)\u013f\n)\3*\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\5-\u0154\n-\3-\6-\u0157"+
		"\n-\r-\16-\u0158\3.\6.\u015c\n.\r.\16.\u015d\3.\3.\3/\3/\3/\3/\7/\u0166"+
		"\n/\f/\16/\u0169\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0174\n\60"+
		"\f\60\16\60\u0177\13\60\3\60\3\60\3\u0167\2\61\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61\3\2\7\3\2\62;\4\2aac|\6\2\62;C\\aac|\5\2\13\f\16"+
		"\17\"\"\4\2\f\f\17\17\2\u018c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5j\3\2\2\2\7s\3\2\2\2\t\u0087\3\2"+
		"\2\2\13\u009a\3\2\2\2\r\u00aa\3\2\2\2\17\u00ac\3\2\2\2\21\u00b2\3\2\2"+
		"\2\23\u00b8\3\2\2\2\25\u00c0\3\2\2\2\27\u00c6\3\2\2\2\31\u00c9\3\2\2\2"+
		"\33\u00ce\3\2\2\2\35\u00d0\3\2\2\2\37\u00d2\3\2\2\2!\u00d4\3\2\2\2#\u00d6"+
		"\3\2\2\2%\u00d8\3\2\2\2\'\u00db\3\2\2\2)\u00e0\3\2\2\2+\u00e4\3\2\2\2"+
		"-\u00ea\3\2\2\2/\u00f2\3\2\2\2\61\u00f4\3\2\2\2\63\u00f6\3\2\2\2\65\u00fb"+
		"\3\2\2\2\67\u00fd\3\2\2\29\u00ff\3\2\2\2;\u0101\3\2\2\2=\u0107\3\2\2\2"+
		"?\u0109\3\2\2\2A\u010d\3\2\2\2C\u0114\3\2\2\2E\u0118\3\2\2\2G\u011d\3"+
		"\2\2\2I\u0120\3\2\2\2K\u0124\3\2\2\2M\u0127\3\2\2\2O\u0131\3\2\2\2Q\u013e"+
		"\3\2\2\2S\u0140\3\2\2\2U\u0147\3\2\2\2W\u014c\3\2\2\2Y\u0153\3\2\2\2["+
		"\u015b\3\2\2\2]\u0161\3\2\2\2_\u016f\3\2\2\2ab\7@\2\2b\4\3\2\2\2ck\7>"+
		"\2\2de\7N\2\2ef\7g\2\2fg\7u\2\2gh\7u\2\2hi\7g\2\2ik\7t\2\2jc\3\2\2\2j"+
		"d\3\2\2\2k\6\3\2\2\2lm\7?\2\2mt\7?\2\2no\7G\2\2op\7s\2\2pq\7w\2\2qr\7"+
		"c\2\2rt\7n\2\2sl\3\2\2\2sn\3\2\2\2t\b\3\2\2\2uv\7@\2\2v\u0088\7?\2\2w"+
		"x\7I\2\2xy\7t\2\2yz\7g\2\2z{\7c\2\2{|\7v\2\2|}\7g\2\2}~\7t\2\2~\177\7"+
		"a\2\2\177\u0080\7q\2\2\u0080\u0081\7t\2\2\u0081\u0082\7a\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0084\7s\2\2\u0084\u0085\7w\2\2\u0085\u0086\7c\2\2\u0086"+
		"\u0088\7n\2\2\u0087u\3\2\2\2\u0087w\3\2\2\2\u0088\n\3\2\2\2\u0089\u008a"+
		"\7>\2\2\u008a\u009b\7?\2\2\u008b\u008c\7N\2\2\u008c\u008d\7g\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090\u0091\7t\2\2"+
		"\u0091\u0092\7a\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7a\2\2\u0095\u0096\7g\2\2\u0096\u0097\7s\2\2\u0097\u0098\7w\2\2\u0098"+
		"\u0099\7c\2\2\u0099\u009b\7n\2\2\u009a\u0089\3\2\2\2\u009a\u008b\3\2\2"+
		"\2\u009b\f\3\2\2\2\u009c\u009d\7#\2\2\u009d\u00ab\7?\2\2\u009e\u009f\7"+
		"K\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7a\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3"+
		"\7q\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7a\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7s\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7c\2\2\u00a9\u00ab\7n\2\2"+
		"\u00aa\u009c\3\2\2\2\u00aa\u009e\3\2\2\2\u00ab\16\3\2\2\2\u00ac\u00ad"+
		"\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7w\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\20\3\2\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7\22\3\2\2\2\u00b8"+
		"\u00b9\7r\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2"+
		"\u00bc\u00bd\7v\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7p\2\2\u00bf\24\3\2"+
		"\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4"+
		"\7c\2\2\u00c4\u00c5\7m\2\2\u00c5\26\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8"+
		"\7h\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc"+
		"\7u\2\2\u00cc\u00cd\7g\2\2\u00cd\32\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf\34"+
		"\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1\36\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3"+
		" \3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5\"\3\2\2\2\u00d6\u00d7\7`\2\2\u00d7"+
		"$\3\2\2\2\u00d8\u00d9\7~\2\2\u00d9\u00da\7~\2\2\u00da&\3\2\2\2\u00db\u00dc"+
		"\7u\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7r\2\2\u00df"+
		"(\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7t\2\2\u00e3"+
		"*\3\2\2\2\u00e4\u00e5\7y\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7k\2\2\u00e7"+
		"\u00e8\7n\2\2\u00e8\u00e9\7g\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7h\2\2\u00eb"+
		"\u00ec\7q\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7x\2\2"+
		"\u00ef\u00f0\7g\2\2\u00f0\u00f1\7t\2\2\u00f1.\3\2\2\2\u00f2\u00f3\7.\2"+
		"\2\u00f3\60\3\2\2\2\u00f4\u00f5\7B\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7"+
		"x\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7f\2\2\u00fa\64"+
		"\3\2\2\2\u00fb\u00fc\7*\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7+\2\2\u00fe"+
		"8\3\2\2\2\u00ff\u0100\7}\2\2\u0100:\3\2\2\2\u0101\u0102\7\177\2\2\u0102"+
		"<\3\2\2\2\u0103\u0108\5? \2\u0104\u0108\5A!\2\u0105\u0108\5C\"\2\u0106"+
		"\u0108\5E#\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2"+
		"\2\u0107\u0106\3\2\2\2\u0108>\3\2\2\2\u0109\u010a\7k\2\2\u010a\u010b\7"+
		"p\2\2\u010b\u010c\7v\2\2\u010c@\3\2\2\2\u010d\u010e\7f\2\2\u010e\u010f"+
		"\7q\2\2\u010f\u0110\7w\2\2\u0110\u0111\7d\2\2\u0111\u0112\7n\2\2\u0112"+
		"\u0113\7g\2\2\u0113B\3\2\2\2\u0114\u0115\7v\2\2\u0115\u0116\7z\2\2\u0116"+
		"\u0117\7v\2\2\u0117D\3\2\2\2\u0118\u0119\7d\2\2\u0119\u011a\7q\2\2\u011a"+
		"\u011b\7q\2\2\u011b\u011c\7n\2\2\u011cF\3\2\2\2\u011d\u011e\7?\2\2\u011e"+
		"H\3\2\2\2\u011f\u0121\t\2\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123J\3\2\2\2\u0124\u0125\7"+
		"\60\2\2\u0125L\3\2\2\2\u0126\u0128\t\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012d\5K&\2\u012c\u012e\t\2\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2"+
		"\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130N\3\2\2\2\u0131\u0133"+
		"\7$\2\2\u0132\u0134\t\3\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0137\t\4\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\7$\2\2\u013bP\3\2\2\2\u013c\u013f\5U+\2\u013d\u013f\5W,\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013fR\3\2\2\2\u0140\u0141\7t\2\2\u0141"+
		"\u0142\7g\2\2\u0142\u0143\7v\2\2\u0143\u0144\7w\2\2\u0144\u0145\7t\2\2"+
		"\u0145\u0146\7p\2\2\u0146T\3\2\2\2\u0147\u0148\7v\2\2\u0148\u0149\7t\2"+
		"\2\u0149\u014a\7w\2\2\u014a\u014b\7g\2\2\u014bV\3\2\2\2\u014c\u014d\7"+
		"h\2\2\u014d\u014e\7c\2\2\u014e\u014f\7n\2\2\u014f\u0150\7u\2\2\u0150\u0151"+
		"\7g\2\2\u0151X\3\2\2\2\u0152\u0154\t\3\2\2\u0153\u0152\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0157\t\4\2\2\u0156\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159Z\3\2\2\2"+
		"\u015a\u015c\t\5\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b.\2\2\u0160"+
		"\\\3\2\2\2\u0161\u0162\7\61\2\2\u0162\u0163\7,\2\2\u0163\u0167\3\2\2\2"+
		"\u0164\u0166\13\2\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016b\7,\2\2\u016b\u016c\7\61\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b/"+
		"\2\2\u016e^\3\2\2\2\u016f\u0170\7\61\2\2\u0170\u0171\7\61\2\2\u0171\u0175"+
		"\3\2\2\2\u0172\u0174\n\6\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u0179\b\60\2\2\u0179`\3\2\2\2\24\2js\u0087\u009a\u00aa\u0107"+
		"\u0122\u0129\u012f\u0133\u0138\u013e\u0153\u0158\u015d\u0167\u0175\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}