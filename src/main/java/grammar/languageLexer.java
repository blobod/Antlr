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
		GREATHER=1, LESSER=2, EQUAL=3, GREATHEROREQUAL=4, LESSEROREQUAL=5, ISNOTEQUAL=6, 
		IF=7, ELSE=8, PLUS=9, MINUS=10, MULTIPLICATION=11, DIVISION=12, POWER_OF=13, 
		OR=14, STOP=15, FOR=16, WHILE=17, FOREVER=18, START=19, COMMA=20, AT_SIGN=21, 
		VOID=22, LPAR=23, RPAR=24, LCBRAC=25, RCBRAC=26, TYPE=27, INT_TYPE=28, 
		DOUBLE_TYPE=29, TXT_TYPE=30, BOOL_TYPE=31, ASSIGN=32, INT=33, DOT=34, 
		DOUBLE=35, TXT=36, BOOL=37, TRUE=38, FALSE=39, ID=40, WS=41, COMMENT=42, 
		LINE_COMMENT=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GREATHER", "LESSER", "EQUAL", "GREATHEROREQUAL", "LESSEROREQUAL", "ISNOTEQUAL", 
			"IF", "ELSE", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "POWER_OF", 
			"OR", "STOP", "FOR", "WHILE", "FOREVER", "START", "COMMA", "AT_SIGN", 
			"VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "TYPE", "INT_TYPE", "DOUBLE_TYPE", 
			"TXT_TYPE", "BOOL_TYPE", "ASSIGN", "INT", "DOT", "DOUBLE", "TXT", "BOOL", 
			"TRUE", "FALSE", "ID", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'^'", "'||'", "'stop'", "'for'", "'while'", "'forever'", 
			"'start'", "','", "'@'", "'void'", "'('", "')'", "'{'", "'}'", null, 
			"'int'", "'double'", "'txt'", "'bool'", "'='", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATHER", "LESSER", "EQUAL", "GREATHEROREQUAL", "LESSEROREQUAL", 
			"ISNOTEQUAL", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", 
			"POWER_OF", "OR", "STOP", "FOR", "WHILE", "FOREVER", "START", "COMMA", 
			"AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "TYPE", "INT_TYPE", 
			"DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", "INT", "DOT", "DOUBLE", 
			"TXT", "BOOL", "TRUE", "FALSE", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0160\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2c\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3l\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4u\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008a"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u009d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00ad\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\5\34\u00f6\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\6\"\u010f\n\""+
		"\r\"\16\"\u0110\3#\3#\3$\6$\u0116\n$\r$\16$\u0117\3$\3$\6$\u011c\n$\r"+
		"$\16$\u011d\3%\3%\6%\u0122\n%\r%\16%\u0123\3&\3&\5&\u0128\n&\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u012f\n\'\3(\3(\3(\3(\3(\3(\5(\u0137\n(\3)\5)\u013a\n)"+
		"\3)\6)\u013d\n)\r)\16)\u013e\3*\6*\u0142\n*\r*\16*\u0143\3*\3*\3+\3+\3"+
		"+\3+\7+\u014c\n+\f+\16+\u014f\13+\3+\3+\3+\3+\3+\3,\3,\3,\3,\7,\u015a"+
		"\n,\f,\16,\u015d\13,\3,\3,\3\u014d\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2"+
		"\t\3\2\62;\3\2c|\3\2C\\\4\2aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2"+
		"\f\f\17\17\2\u0174\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3b\3\2\2\2\5k\3\2\2\2\7t\3\2\2\2"+
		"\t\u0089\3\2\2\2\13\u009c\3\2\2\2\r\u00ac\3\2\2\2\17\u00ae\3\2\2\2\21"+
		"\u00b1\3\2\2\2\23\u00b6\3\2\2\2\25\u00b8\3\2\2\2\27\u00ba\3\2\2\2\31\u00bc"+
		"\3\2\2\2\33\u00be\3\2\2\2\35\u00c0\3\2\2\2\37\u00c3\3\2\2\2!\u00c8\3\2"+
		"\2\2#\u00cc\3\2\2\2%\u00d2\3\2\2\2\'\u00da\3\2\2\2)\u00e0\3\2\2\2+\u00e2"+
		"\3\2\2\2-\u00e4\3\2\2\2/\u00e9\3\2\2\2\61\u00eb\3\2\2\2\63\u00ed\3\2\2"+
		"\2\65\u00ef\3\2\2\2\67\u00f5\3\2\2\29\u00f7\3\2\2\2;\u00fb\3\2\2\2=\u0102"+
		"\3\2\2\2?\u0106\3\2\2\2A\u010b\3\2\2\2C\u010e\3\2\2\2E\u0112\3\2\2\2G"+
		"\u0115\3\2\2\2I\u011f\3\2\2\2K\u0127\3\2\2\2M\u012e\3\2\2\2O\u0136\3\2"+
		"\2\2Q\u0139\3\2\2\2S\u0141\3\2\2\2U\u0147\3\2\2\2W\u0155\3\2\2\2Yc\7@"+
		"\2\2Z[\7I\2\2[\\\7t\2\2\\]\7g\2\2]^\7c\2\2^_\7v\2\2_`\7j\2\2`a\7g\2\2"+
		"ac\7t\2\2bY\3\2\2\2bZ\3\2\2\2c\4\3\2\2\2dl\7>\2\2ef\7N\2\2fg\7g\2\2gh"+
		"\7u\2\2hi\7u\2\2ij\7g\2\2jl\7t\2\2kd\3\2\2\2ke\3\2\2\2l\6\3\2\2\2mn\7"+
		"?\2\2nu\7?\2\2op\7G\2\2pq\7s\2\2qr\7w\2\2rs\7c\2\2su\7n\2\2tm\3\2\2\2"+
		"to\3\2\2\2u\b\3\2\2\2vw\7@\2\2w\u008a\7?\2\2xy\7I\2\2yz\7t\2\2z{\7g\2"+
		"\2{|\7c\2\2|}\7v\2\2}~\7j\2\2~\177\7g\2\2\177\u0080\7t\2\2\u0080\u0081"+
		"\7a\2\2\u0081\u0082\7q\2\2\u0082\u0083\7t\2\2\u0083\u0084\7a\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7s\2\2\u0086\u0087\7w\2\2\u0087\u0088\7c\2\2"+
		"\u0088\u008a\7n\2\2\u0089v\3\2\2\2\u0089x\3\2\2\2\u008a\n\3\2\2\2\u008b"+
		"\u008c\7>\2\2\u008c\u009d\7?\2\2\u008d\u008e\7N\2\2\u008e\u008f\7g\2\2"+
		"\u008f\u0090\7u\2\2\u0090\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092\u0093"+
		"\7t\2\2\u0093\u0094\7a\2\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096"+
		"\u0097\7a\2\2\u0097\u0098\7g\2\2\u0098\u0099\7s\2\2\u0099\u009a\7w\2\2"+
		"\u009a\u009b\7c\2\2\u009b\u009d\7n\2\2\u009c\u008b\3\2\2\2\u009c\u008d"+
		"\3\2\2\2\u009d\f\3\2\2\2\u009e\u009f\7#\2\2\u009f\u00ad\7?\2\2\u00a0\u00a1"+
		"\7K\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7a\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7a\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\u00a9\7s\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ad"+
		"\7n\2\2\u00ac\u009e\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ad\16\3\2\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7h\2\2\u00b0\20\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\22\3\2\2\2\u00b6"+
		"\u00b7\7-\2\2\u00b7\24\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\26\3\2\2\2\u00ba"+
		"\u00bb\7,\2\2\u00bb\30\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd\32\3\2\2\2\u00be"+
		"\u00bf\7`\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7~\2\2\u00c1\u00c2\7~\2\2\u00c2"+
		"\36\3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7q\2\2\u00c6"+
		"\u00c7\7r\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7y\2\2\u00cd\u00ce\7j\2\2\u00ce"+
		"\u00cf\7k\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1$\3\2\2\2\u00d2"+
		"\u00d3\7h\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7g\2\2"+
		"\u00d6\u00d7\7x\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7t\2\2\u00d9&\3\2\2"+
		"\2\u00da\u00db\7u\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de"+
		"\7t\2\2\u00de\u00df\7v\2\2\u00df(\3\2\2\2\u00e0\u00e1\7.\2\2\u00e1*\3"+
		"\2\2\2\u00e2\u00e3\7B\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7x\2\2\u00e5\u00e6"+
		"\7q\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7f\2\2\u00e8.\3\2\2\2\u00e9\u00ea"+
		"\7*\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7+\2\2\u00ec\62\3\2\2\2\u00ed\u00ee"+
		"\7}\2\2\u00ee\64\3\2\2\2\u00ef\u00f0\7\177\2\2\u00f0\66\3\2\2\2\u00f1"+
		"\u00f6\59\35\2\u00f2\u00f6\5;\36\2\u00f3\u00f6\5=\37\2\u00f4\u00f6\5?"+
		" \2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f68\3\2\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\u00fa\7v\2\2\u00fa:\3\2\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7q\2\2\u00fd"+
		"\u00fe\7w\2\2\u00fe\u00ff\7d\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7g\2\2"+
		"\u0101<\3\2\2\2\u0102\u0103\7v\2\2\u0103\u0104\7z\2\2\u0104\u0105\7v\2"+
		"\2\u0105>\3\2\2\2\u0106\u0107\7d\2\2\u0107\u0108\7q\2\2\u0108\u0109\7"+
		"q\2\2\u0109\u010a\7n\2\2\u010a@\3\2\2\2\u010b\u010c\7?\2\2\u010cB\3\2"+
		"\2\2\u010d\u010f\t\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111D\3\2\2\2\u0112\u0113\7\60\2\2"+
		"\u0113F\3\2\2\2\u0114\u0116\t\2\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3"+
		"\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011b\5E#\2\u011a\u011c\t\2\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2"+
		"\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eH\3\2\2\2\u011f\u0121"+
		"\t\3\2\2\u0120\u0122\t\4\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124J\3\2\2\2\u0125\u0128\5M\'\2\u0126"+
		"\u0128\5O(\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128L\3\2\2\2\u0129"+
		"\u012f\7\63\2\2\u012a\u012b\7v\2\2\u012b\u012c\7t\2\2\u012c\u012d\7w\2"+
		"\2\u012d\u012f\7g\2\2\u012e\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012fN\3"+
		"\2\2\2\u0130\u0137\7\62\2\2\u0131\u0132\7h\2\2\u0132\u0133\7c\2\2\u0133"+
		"\u0134\7n\2\2\u0134\u0135\7u\2\2\u0135\u0137\7g\2\2\u0136\u0130\3\2\2"+
		"\2\u0136\u0131\3\2\2\2\u0137P\3\2\2\2\u0138\u013a\t\5\2\2\u0139\u0138"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u013d\t\6\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013fR\3\2\2\2\u0140\u0142\t\7\2\2\u0141\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\b*\2\2\u0146T\3\2\2\2\u0147\u0148\7\61\2\2\u0148\u0149\7,\2\2\u0149"+
		"\u014d\3\2\2\2\u014a\u014c\13\2\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3"+
		"\2\2\2\u014d\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0151\7,\2\2\u0151\u0152\7\61\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0154\b+\2\2\u0154V\3\2\2\2\u0155\u0156\7\61\2\2\u0156\u0157"+
		"\7\61\2\2\u0157\u015b\3\2\2\2\u0158\u015a\n\b\2\2\u0159\u0158\3\2\2\2"+
		"\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\b,\2\2\u015fX\3\2\2\2\26\2bk"+
		"t\u0089\u009c\u00ac\u00f5\u0110\u0117\u011d\u0123\u0127\u012e\u0136\u0139"+
		"\u013e\u0143\u014d\u015b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}