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
		PRINT=7, BREAK=8, IF=9, ELSE=10, PLUS=11, MINUS=12, MULTIPLICATION=13, 
		DIVISION=14, POWER_OF=15, OR=16, STOP=17, FOR=18, WHILE=19, FOREVER=20, 
		START=21, COMMA=22, AT_SIGN=23, VOID=24, LPAR=25, RPAR=26, LCBRAC=27, 
		RCBRAC=28, TYPE=29, INT_TYPE=30, DOUBLE_TYPE=31, TXT_TYPE=32, BOOL_TYPE=33, 
		ASSIGN=34, VALUE=35, INT=36, DOT=37, DOUBLE=38, TXT=39, BOOL=40, TRUE=41, 
		FALSE=42, ID=43, WS=44, COMMENT=45, LINE_COMMENT=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GREATER", "LESSER", "EQUAL", "GREATEROREQUAL", "LESSEROREQUAL", "ISNOTEQUAL", 
			"PRINT", "BREAK", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", 
			"POWER_OF", "OR", "STOP", "FOR", "WHILE", "FOREVER", "START", "COMMA", 
			"AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "TYPE", "INT_TYPE", 
			"DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", "VALUE", "INT", "DOT", 
			"DOUBLE", "TXT", "BOOL", "TRUE", "FALSE", "ID", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", null, null, null, null, null, "'print'", "'break'", "'if'", 
			"'else'", "'+'", "'-'", "'*'", "'/'", "'^'", "'||'", "'stop'", "'for'", 
			"'while'", "'forever'", "'start'", "','", "'@'", "'void'", "'('", "')'", 
			"'{'", "'}'", null, "'int'", "'double'", "'txt'", "'bool'", "'='", null, 
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATER", "LESSER", "EQUAL", "GREATEROREQUAL", "LESSEROREQUAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u016c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3i\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0086\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0099\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a9\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u00fe\n\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\5$\u0118\n$\3%\6%\u011b\n%\r%\16%\u011c\3&\3&\3\'\6\'\u0122\n\'\r\'"+
		"\16\'\u0123\3\'\3\'\6\'\u0128\n\'\r\'\16\'\u0129\3(\3(\6(\u012e\n(\r("+
		"\16(\u012f\3)\3)\5)\u0134\n)\3*\3*\3*\3*\3*\5*\u013b\n*\3+\3+\3+\3+\3"+
		"+\3+\5+\u0143\n+\3,\5,\u0146\n,\3,\6,\u0149\n,\r,\16,\u014a\3-\6-\u014e"+
		"\n-\r-\16-\u014f\3-\3-\3.\3.\3.\3.\7.\u0158\n.\f.\16.\u015b\13.\3.\3."+
		"\3.\3.\3.\3/\3/\3/\3/\7/\u0166\n/\f/\16/\u0169\13/\3/\3/\3\u0159\2\60"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\t\3\2\62;\3\2c|\3\2C\\\4\2"+
		"aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0180\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5h\3\2\2\2\7q\3"+
		"\2\2\2\t\u0085\3\2\2\2\13\u0098\3\2\2\2\r\u00a8\3\2\2\2\17\u00aa\3\2\2"+
		"\2\21\u00b0\3\2\2\2\23\u00b6\3\2\2\2\25\u00b9\3\2\2\2\27\u00be\3\2\2\2"+
		"\31\u00c0\3\2\2\2\33\u00c2\3\2\2\2\35\u00c4\3\2\2\2\37\u00c6\3\2\2\2!"+
		"\u00c8\3\2\2\2#\u00cb\3\2\2\2%\u00d0\3\2\2\2\'\u00d4\3\2\2\2)\u00da\3"+
		"\2\2\2+\u00e2\3\2\2\2-\u00e8\3\2\2\2/\u00ea\3\2\2\2\61\u00ec\3\2\2\2\63"+
		"\u00f1\3\2\2\2\65\u00f3\3\2\2\2\67\u00f5\3\2\2\29\u00f7\3\2\2\2;\u00fd"+
		"\3\2\2\2=\u00ff\3\2\2\2?\u0103\3\2\2\2A\u010a\3\2\2\2C\u010e\3\2\2\2E"+
		"\u0113\3\2\2\2G\u0117\3\2\2\2I\u011a\3\2\2\2K\u011e\3\2\2\2M\u0121\3\2"+
		"\2\2O\u012b\3\2\2\2Q\u0133\3\2\2\2S\u013a\3\2\2\2U\u0142\3\2\2\2W\u0145"+
		"\3\2\2\2Y\u014d\3\2\2\2[\u0153\3\2\2\2]\u0161\3\2\2\2_`\7@\2\2`\4\3\2"+
		"\2\2ai\7>\2\2bc\7N\2\2cd\7g\2\2de\7u\2\2ef\7u\2\2fg\7g\2\2gi\7t\2\2ha"+
		"\3\2\2\2hb\3\2\2\2i\6\3\2\2\2jk\7?\2\2kr\7?\2\2lm\7G\2\2mn\7s\2\2no\7"+
		"w\2\2op\7c\2\2pr\7n\2\2qj\3\2\2\2ql\3\2\2\2r\b\3\2\2\2st\7@\2\2t\u0086"+
		"\7?\2\2uv\7I\2\2vw\7t\2\2wx\7g\2\2xy\7c\2\2yz\7v\2\2z{\7g\2\2{|\7t\2\2"+
		"|}\7a\2\2}~\7q\2\2~\177\7t\2\2\177\u0080\7a\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7s\2\2\u0082\u0083\7w\2\2\u0083\u0084\7c\2\2\u0084\u0086\7n\2\2"+
		"\u0085s\3\2\2\2\u0085u\3\2\2\2\u0086\n\3\2\2\2\u0087\u0088\7>\2\2\u0088"+
		"\u0099\7?\2\2\u0089\u008a\7N\2\2\u008a\u008b\7g\2\2\u008b\u008c\7u\2\2"+
		"\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e\u008f\7t\2\2\u008f\u0090"+
		"\7a\2\2\u0090\u0091\7q\2\2\u0091\u0092\7t\2\2\u0092\u0093\7a\2\2\u0093"+
		"\u0094\7g\2\2\u0094\u0095\7s\2\2\u0095\u0096\7w\2\2\u0096\u0097\7c\2\2"+
		"\u0097\u0099\7n\2\2\u0098\u0087\3\2\2\2\u0098\u0089\3\2\2\2\u0099\f\3"+
		"\2\2\2\u009a\u009b\7#\2\2\u009b\u00a9\7?\2\2\u009c\u009d\7K\2\2\u009d"+
		"\u009e\7u\2\2\u009e\u009f\7a\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7q\2\2"+
		"\u00a1\u00a2\7v\2\2\u00a2\u00a3\7a\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7s\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a9\7n\2\2\u00a8"+
		"\u009a\3\2\2\2\u00a8\u009c\3\2\2\2\u00a9\16\3\2\2\2\u00aa\u00ab\7r\2\2"+
		"\u00ab\u00ac\7t\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\20\3\2\2\2\u00b0\u00b1\7d\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7m\2\2\u00b5\22\3\2\2\2\u00b6\u00b7"+
		"\7k\2\2\u00b7\u00b8\7h\2\2\u00b8\24\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd\26\3\2\2\2\u00be\u00bf"+
		"\7-\2\2\u00bf\30\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1\32\3\2\2\2\u00c2\u00c3"+
		"\7,\2\2\u00c3\34\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\36\3\2\2\2\u00c6\u00c7"+
		"\7`\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7~\2\2\u00c9\u00ca\7~\2\2\u00ca\"\3"+
		"\2\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\u00cf\7r\2\2\u00cf$\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7q\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3&\3\2\2\2\u00d4\u00d5\7y\2\2\u00d5\u00d6\7j\2\2\u00d6"+
		"\u00d7\7k\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9(\3\2\2\2\u00da"+
		"\u00db\7h\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2"+
		"\u00de\u00df\7x\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7t\2\2\u00e1*\3\2\2"+
		"\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7t\2\2\u00e6\u00e7\7v\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7.\2\2\u00e9.\3"+
		"\2\2\2\u00ea\u00eb\7B\2\2\u00eb\60\3\2\2\2\u00ec\u00ed\7x\2\2\u00ed\u00ee"+
		"\7q\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7f\2\2\u00f0\62\3\2\2\2\u00f1\u00f2"+
		"\7*\2\2\u00f2\64\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4\66\3\2\2\2\u00f5\u00f6"+
		"\7}\2\2\u00f68\3\2\2\2\u00f7\u00f8\7\177\2\2\u00f8:\3\2\2\2\u00f9\u00fe"+
		"\5=\37\2\u00fa\u00fe\5? \2\u00fb\u00fe\5A!\2\u00fc\u00fe\5C\"\2\u00fd"+
		"\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2"+
		"\2\2\u00fe<\3\2\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102"+
		"\7v\2\2\u0102>\3\2\2\2\u0103\u0104\7f\2\2\u0104\u0105\7q\2\2\u0105\u0106"+
		"\7w\2\2\u0106\u0107\7d\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109"+
		"@\3\2\2\2\u010a\u010b\7v\2\2\u010b\u010c\7z\2\2\u010c\u010d\7v\2\2\u010d"+
		"B\3\2\2\2\u010e\u010f\7d\2\2\u010f\u0110\7q\2\2\u0110\u0111\7q\2\2\u0111"+
		"\u0112\7n\2\2\u0112D\3\2\2\2\u0113\u0114\7?\2\2\u0114F\3\2\2\2\u0115\u0118"+
		"\5I%\2\u0116\u0118\5M\'\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"H\3\2\2\2\u0119\u011b\t\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dJ\3\2\2\2\u011e\u011f\7"+
		"\60\2\2\u011fL\3\2\2\2\u0120\u0122\t\2\2\2\u0121\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\5K&\2\u0126\u0128\t\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2"+
		"\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aN\3\2\2\2\u012b\u012d"+
		"\t\3\2\2\u012c\u012e\t\4\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130P\3\2\2\2\u0131\u0134\5S*\2\u0132"+
		"\u0134\5U+\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134R\3\2\2\2\u0135"+
		"\u013b\7\63\2\2\u0136\u0137\7v\2\2\u0137\u0138\7t\2\2\u0138\u0139\7w\2"+
		"\2\u0139\u013b\7g\2\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013bT\3"+
		"\2\2\2\u013c\u0143\7\62\2\2\u013d\u013e\7h\2\2\u013e\u013f\7c\2\2\u013f"+
		"\u0140\7n\2\2\u0140\u0141\7u\2\2\u0141\u0143\7g\2\2\u0142\u013c\3\2\2"+
		"\2\u0142\u013d\3\2\2\2\u0143V\3\2\2\2\u0144\u0146\t\5\2\2\u0145\u0144"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\t\6\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014bX\3\2\2\2\u014c\u014e\t\7\2\2\u014d\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\b-\2\2\u0152Z\3\2\2\2\u0153\u0154\7\61\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0159\3\2\2\2\u0156\u0158\13\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3"+
		"\2\2\2\u0159\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015d\7,\2\2\u015d\u015e\7\61\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\b.\2\2\u0160\\\3\2\2\2\u0161\u0162\7\61\2\2\u0162\u0163"+
		"\7\61\2\2\u0163\u0167\3\2\2\2\u0164\u0166\n\b\2\2\u0165\u0164\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\b/\2\2\u016b^\3\2\2\2\26\2hq"+
		"\u0085\u0098\u00a8\u00fd\u0117\u011c\u0123\u0129\u012f\u0133\u013a\u0142"+
		"\u0145\u014a\u014f\u0159\u0167\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}