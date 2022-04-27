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
		GREATHER=1, LESSER=2, EQUAL=3, GREATHEROREQUAL=4, LESSEROREQUAL=5, ISNOTEQUAL=6, 
		IF=7, ELSE=8, PLUS=9, MINUS=10, MULTIPLICATION=11, DIVISION=12, POWER_OF=13, 
		OR=14, STOP=15, FOR=16, WHILE=17, FOREVER=18, START=19, COMMA=20, AT_SIGN=21, 
		VOID=22, LPAR=23, RPAR=24, LCBRAC=25, RCBRAC=26, TYPE=27, INT_TYPE=28, 
		DOUBLE_TYPE=29, TXT_TYPE=30, BOOL_TYPE=31, ASSIGN=32, VALUE=33, INT=34, 
		DOT=35, DOUBLE=36, TXT=37, BOOL=38, TRUE=39, FALSE=40, ID=41, WS=42, COMMENT=43, 
		LINE_COMMENT=44;
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
			"TXT_TYPE", "BOOL_TYPE", "ASSIGN", "VALUE", "INT", "DOT", "DOUBLE", "TXT", 
			"BOOL", "TRUE", "FALSE", "ID", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'^'", "'||'", "'stop'", "'for'", "'while'", "'forever'", 
			"'start'", "','", "'@'", "'void'", "'('", "')'", "'{'", "'}'", null, 
			"'int'", "'double'", "'txt'", "'bool'", "'='", null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATHER", "LESSER", "EQUAL", "GREATHEROREQUAL", "LESSEROREQUAL", 
			"ISNOTEQUAL", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", 
			"POWER_OF", "OR", "STOP", "FOR", "WHILE", "FOREVER", "START", "COMMA", 
			"AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "TYPE", "INT_TYPE", 
			"DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", "VALUE", "INT", "DOT", 
			"DOUBLE", "TXT", "BOOL", "TRUE", "FALSE", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0166\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2e\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3n\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4w\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u008c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u009f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00af\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\5\34\u00f8\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\5\"\u0112"+
		"\n\"\3#\6#\u0115\n#\r#\16#\u0116\3$\3$\3%\6%\u011c\n%\r%\16%\u011d\3%"+
		"\3%\6%\u0122\n%\r%\16%\u0123\3&\3&\6&\u0128\n&\r&\16&\u0129\3\'\3\'\5"+
		"\'\u012e\n\'\3(\3(\3(\3(\3(\5(\u0135\n(\3)\3)\3)\3)\3)\3)\5)\u013d\n)"+
		"\3*\5*\u0140\n*\3*\6*\u0143\n*\r*\16*\u0144\3+\6+\u0148\n+\r+\16+\u0149"+
		"\3+\3+\3,\3,\3,\3,\7,\u0152\n,\f,\16,\u0155\13,\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\7-\u0160\n-\f-\16-\u0163\13-\3-\3-\3\u0153\2.\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.\3\2\t\3\2\62;\3\2c|\3\2C\\\4\2aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\2\u017b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3d\3"+
		"\2\2\2\5m\3\2\2\2\7v\3\2\2\2\t\u008b\3\2\2\2\13\u009e\3\2\2\2\r\u00ae"+
		"\3\2\2\2\17\u00b0\3\2\2\2\21\u00b3\3\2\2\2\23\u00b8\3\2\2\2\25\u00ba\3"+
		"\2\2\2\27\u00bc\3\2\2\2\31\u00be\3\2\2\2\33\u00c0\3\2\2\2\35\u00c2\3\2"+
		"\2\2\37\u00c5\3\2\2\2!\u00ca\3\2\2\2#\u00ce\3\2\2\2%\u00d4\3\2\2\2\'\u00dc"+
		"\3\2\2\2)\u00e2\3\2\2\2+\u00e4\3\2\2\2-\u00e6\3\2\2\2/\u00eb\3\2\2\2\61"+
		"\u00ed\3\2\2\2\63\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67\u00f7\3\2\2\29\u00f9"+
		"\3\2\2\2;\u00fd\3\2\2\2=\u0104\3\2\2\2?\u0108\3\2\2\2A\u010d\3\2\2\2C"+
		"\u0111\3\2\2\2E\u0114\3\2\2\2G\u0118\3\2\2\2I\u011b\3\2\2\2K\u0125\3\2"+
		"\2\2M\u012d\3\2\2\2O\u0134\3\2\2\2Q\u013c\3\2\2\2S\u013f\3\2\2\2U\u0147"+
		"\3\2\2\2W\u014d\3\2\2\2Y\u015b\3\2\2\2[e\7@\2\2\\]\7I\2\2]^\7t\2\2^_\7"+
		"g\2\2_`\7c\2\2`a\7v\2\2ab\7j\2\2bc\7g\2\2ce\7t\2\2d[\3\2\2\2d\\\3\2\2"+
		"\2e\4\3\2\2\2fn\7>\2\2gh\7N\2\2hi\7g\2\2ij\7u\2\2jk\7u\2\2kl\7g\2\2ln"+
		"\7t\2\2mf\3\2\2\2mg\3\2\2\2n\6\3\2\2\2op\7?\2\2pw\7?\2\2qr\7G\2\2rs\7"+
		"s\2\2st\7w\2\2tu\7c\2\2uw\7n\2\2vo\3\2\2\2vq\3\2\2\2w\b\3\2\2\2xy\7@\2"+
		"\2y\u008c\7?\2\2z{\7I\2\2{|\7t\2\2|}\7g\2\2}~\7c\2\2~\177\7v\2\2\177\u0080"+
		"\7j\2\2\u0080\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082\u0083\7a\2\2\u0083"+
		"\u0084\7q\2\2\u0084\u0085\7t\2\2\u0085\u0086\7a\2\2\u0086\u0087\7g\2\2"+
		"\u0087\u0088\7s\2\2\u0088\u0089\7w\2\2\u0089\u008a\7c\2\2\u008a\u008c"+
		"\7n\2\2\u008bx\3\2\2\2\u008bz\3\2\2\2\u008c\n\3\2\2\2\u008d\u008e\7>\2"+
		"\2\u008e\u009f\7?\2\2\u008f\u0090\7N\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7u\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\u0095\7t\2\2\u0095"+
		"\u0096\7a\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\u0099\7a\2\2"+
		"\u0099\u009a\7g\2\2\u009a\u009b\7s\2\2\u009b\u009c\7w\2\2\u009c\u009d"+
		"\7c\2\2\u009d\u009f\7n\2\2\u009e\u008d\3\2\2\2\u009e\u008f\3\2\2\2\u009f"+
		"\f\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\u00af\7?\2\2\u00a2\u00a3\7K\2\2\u00a3"+
		"\u00a4\7u\2\2\u00a4\u00a5\7a\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7q\2\2"+
		"\u00a7\u00a8\7v\2\2\u00a8\u00a9\7a\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab"+
		"\7s\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7c\2\2\u00ad\u00af\7n\2\2\u00ae"+
		"\u00a0\3\2\2\2\u00ae\u00a2\3\2\2\2\u00af\16\3\2\2\2\u00b0\u00b1\7k\2\2"+
		"\u00b1\u00b2\7h\2\2\u00b2\20\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7"+
		"n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\22\3\2\2\2\u00b8\u00b9"+
		"\7-\2\2\u00b9\24\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb\26\3\2\2\2\u00bc\u00bd"+
		"\7,\2\2\u00bd\30\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf\32\3\2\2\2\u00c0\u00c1"+
		"\7`\2\2\u00c1\34\3\2\2\2\u00c2\u00c3\7~\2\2\u00c3\u00c4\7~\2\2\u00c4\36"+
		"\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7q\2\2\u00c8"+
		"\u00c9\7r\2\2\u00c9 \3\2\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7q\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0\7j\2\2\u00d0"+
		"\u00d1\7k\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2\u00d3$\3\2\2\2\u00d4"+
		"\u00d5\7h\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2"+
		"\u00d8\u00d9\7x\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7t\2\2\u00db&\3\2\2"+
		"\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7c\2\2\u00df\u00e0"+
		"\7t\2\2\u00e0\u00e1\7v\2\2\u00e1(\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3*\3"+
		"\2\2\2\u00e4\u00e5\7B\2\2\u00e5,\3\2\2\2\u00e6\u00e7\7x\2\2\u00e7\u00e8"+
		"\7q\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7f\2\2\u00ea.\3\2\2\2\u00eb\u00ec"+
		"\7*\2\2\u00ec\60\3\2\2\2\u00ed\u00ee\7+\2\2\u00ee\62\3\2\2\2\u00ef\u00f0"+
		"\7}\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7\177\2\2\u00f2\66\3\2\2\2\u00f3"+
		"\u00f8\59\35\2\u00f4\u00f8\5;\36\2\u00f5\u00f8\5=\37\2\u00f6\u00f8\5?"+
		" \2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f88\3\2\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7w\2\2\u0100\u0101\7d\2\2\u0101\u0102\7n\2\2\u0102\u0103\7g\2\2"+
		"\u0103<\3\2\2\2\u0104\u0105\7v\2\2\u0105\u0106\7z\2\2\u0106\u0107\7v\2"+
		"\2\u0107>\3\2\2\2\u0108\u0109\7d\2\2\u0109\u010a\7q\2\2\u010a\u010b\7"+
		"q\2\2\u010b\u010c\7n\2\2\u010c@\3\2\2\2\u010d\u010e\7?\2\2\u010eB\3\2"+
		"\2\2\u010f\u0112\5E#\2\u0110\u0112\5I%\2\u0111\u010f\3\2\2\2\u0111\u0110"+
		"\3\2\2\2\u0112D\3\2\2\2\u0113\u0115\t\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117F\3\2\2\2"+
		"\u0118\u0119\7\60\2\2\u0119H\3\2\2\2\u011a\u011c\t\2\2\2\u011b\u011a\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\5G$\2\u0120\u0122\t\2\2\2\u0121\u0120\3\2\2"+
		"\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124J"+
		"\3\2\2\2\u0125\u0127\t\3\2\2\u0126\u0128\t\4\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aL\3\2\2\2"+
		"\u012b\u012e\5O(\2\u012c\u012e\5Q)\2\u012d\u012b\3\2\2\2\u012d\u012c\3"+
		"\2\2\2\u012eN\3\2\2\2\u012f\u0135\7\63\2\2\u0130\u0131\7v\2\2\u0131\u0132"+
		"\7t\2\2\u0132\u0133\7w\2\2\u0133\u0135\7g\2\2\u0134\u012f\3\2\2\2\u0134"+
		"\u0130\3\2\2\2\u0135P\3\2\2\2\u0136\u013d\7\62\2\2\u0137\u0138\7h\2\2"+
		"\u0138\u0139\7c\2\2\u0139\u013a\7n\2\2\u013a\u013b\7u\2\2\u013b\u013d"+
		"\7g\2\2\u013c\u0136\3\2\2\2\u013c\u0137\3\2\2\2\u013dR\3\2\2\2\u013e\u0140"+
		"\t\5\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u0143\t\6\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145T\3\2\2\2\u0146\u0148\t\7\2\2\u0147\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\b+\2\2\u014cV\3\2\2\2\u014d\u014e\7\61\2\2"+
		"\u014e\u014f\7,\2\2\u014f\u0153\3\2\2\2\u0150\u0152\13\2\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7,\2\2\u0157\u0158\7\61"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b,\2\2\u015aX\3\2\2\2\u015b\u015c"+
		"\7\61\2\2\u015c\u015d\7\61\2\2\u015d\u0161\3\2\2\2\u015e\u0160\n\b\2\2"+
		"\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\b-\2\2\u0165"+
		"Z\3\2\2\2\27\2dmv\u008b\u009e\u00ae\u00f7\u0111\u0116\u011d\u0123\u0129"+
		"\u012d\u0134\u013c\u013f\u0144\u0149\u0153\u0161\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}