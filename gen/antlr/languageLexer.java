// Generated from C:/Users/thetr/IdeaProjects/Antlr/src/antlr\language.g4 by ANTLR 4.9.2
package antlr;
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
		LPAR=25, RPAR=26, LCBRAC=27, RCBRAC=28, TYPE=29, INT_TYPE=30, DOUBLE_TYPE=31, 
		TXT_TYPE=32, BOOL_TYPE=33, ASSIGN=34, INT=35, DOT=36, DOUBLE=37, TXT=38, 
		BOOL=39, TRUE=40, FALSE=41, ID=42, WS=43, COMMENT=44, LINE_COMMENT=45;
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
			"LCBRAC", "RCBRAC", "TYPE", "INT_TYPE", "DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", 
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
			"'start'", "','", "'@'", "'void'", "'('", "')'", "'{'", "'}'", null, 
			"'int'", "'double'", "'txt'", "'bool'", "'='", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IF", "ELSE", "EXPRESSION", "OR", "STOP", "FOR", "WHILE", "FOREVER", 
			"START", "COMMA", "AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", 
			"TYPE", "INT_TYPE", "DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0164\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u00f2"+
		"\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3$\6$\u010b\n$\r$\16$\u010c\3%\3%\3&\6&\u0112\n&\r&\16"+
		"&\u0113\3&\3&\6&\u0118\n&\r&\16&\u0119\3\'\3\'\6\'\u011e\n\'\r\'\16\'"+
		"\u011f\3(\6(\u0123\n(\r(\16(\u0124\3(\6(\u0128\n(\r(\16(\u0129\5(\u012c"+
		"\n(\3)\3)\3)\3)\3)\5)\u0133\n)\3*\3*\3*\3*\3*\3*\5*\u013b\n*\3+\5+\u013e"+
		"\n+\3+\6+\u0141\n+\r+\16+\u0142\3,\6,\u0146\n,\r,\16,\u0147\3,\3,\3-\3"+
		"-\3-\3-\7-\u0150\n-\f-\16-\u0153\13-\3-\3-\3-\3-\3-\3.\3.\3.\3.\7.\u015e"+
		"\n.\f.\16.\u0161\13.\3.\3.\3\u0151\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/\3\2\n\6\2,-//\61\61``\3\2\62;\3\2c|\3\2C\\\4\2aac|\6\2\62;C\\aac|\5"+
		"\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0174\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13q\3\2\2\2"+
		"\rt\3\2\2\2\17z\3\2\2\2\21}\3\2\2\2\23\u008f\3\2\2\2\25\u0092\3\2\2\2"+
		"\27\u00a2\3\2\2\2\31\u00a5\3\2\2\2\33\u00b2\3\2\2\2\35\u00b5\3\2\2\2\37"+
		"\u00ba\3\2\2\2!\u00bc\3\2\2\2#\u00bf\3\2\2\2%\u00c4\3\2\2\2\'\u00c8\3"+
		"\2\2\2)\u00ce\3\2\2\2+\u00d6\3\2\2\2-\u00dc\3\2\2\2/\u00de\3\2\2\2\61"+
		"\u00e0\3\2\2\2\63\u00e5\3\2\2\2\65\u00e7\3\2\2\2\67\u00e9\3\2\2\29\u00eb"+
		"\3\2\2\2;\u00f1\3\2\2\2=\u00f3\3\2\2\2?\u00f7\3\2\2\2A\u00fe\3\2\2\2C"+
		"\u0102\3\2\2\2E\u0107\3\2\2\2G\u010a\3\2\2\2I\u010e\3\2\2\2K\u0111\3\2"+
		"\2\2M\u011b\3\2\2\2O\u012b\3\2\2\2Q\u0132\3\2\2\2S\u013a\3\2\2\2U\u013d"+
		"\3\2\2\2W\u0145\3\2\2\2Y\u014b\3\2\2\2[\u0159\3\2\2\2]^\7@\2\2^\4\3\2"+
		"\2\2_`\7I\2\2`a\7t\2\2ab\7g\2\2bc\7c\2\2cd\7v\2\2de\7j\2\2ef\7g\2\2fg"+
		"\7t\2\2g\6\3\2\2\2hi\7>\2\2i\b\3\2\2\2jk\7N\2\2kl\7g\2\2lm\7u\2\2mn\7"+
		"u\2\2no\7g\2\2op\7t\2\2p\n\3\2\2\2qr\7?\2\2rs\7?\2\2s\f\3\2\2\2tu\7G\2"+
		"\2uv\7s\2\2vw\7w\2\2wx\7c\2\2xy\7n\2\2y\16\3\2\2\2z{\7@\2\2{|\7?\2\2|"+
		"\20\3\2\2\2}~\7I\2\2~\177\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7c\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7j\2\2\u0083\u0084\7g\2\2\u0084\u0085\7t\2\2"+
		"\u0085\u0086\7a\2\2\u0086\u0087\7q\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7a\2\2\u0089\u008a\7g\2\2\u008a\u008b\7s\2\2\u008b\u008c\7w\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\22\3\2\2\2\u008f\u0090\7>\2\2\u0090"+
		"\u0091\7?\2\2\u0091\24\3\2\2\2\u0092\u0093\7N\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\u0098\7t\2\2"+
		"\u0098\u0099\7a\2\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b\u009c"+
		"\7a\2\2\u009c\u009d\7g\2\2\u009d\u009e\7s\2\2\u009e\u009f\7w\2\2\u009f"+
		"\u00a0\7c\2\2\u00a0\u00a1\7n\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3"+
		"\u00a4\7?\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7K\2\2\u00a6\u00a7\7u\2\2\u00a7"+
		"\u00a8\7a\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7v\2\2"+
		"\u00ab\u00ac\7a\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7s\2\2\u00ae\u00af"+
		"\7w\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\32\3\2\2\2\u00b2\u00b3"+
		"\7k\2\2\u00b3\u00b4\7h\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9\36\3\2\2\2\u00ba\u00bb"+
		"\t\2\2\2\u00bb \3\2\2\2\u00bc\u00bd\7~\2\2\u00bd\u00be\7~\2\2\u00be\""+
		"\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7r\2\2\u00c3$\3\2\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7q\2\2\u00c6"+
		"\u00c7\7t\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7j\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd(\3\2\2\2\u00ce"+
		"\u00cf\7h\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7g\2\2"+
		"\u00d2\u00d3\7x\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7t\2\2\u00d5*\3\2\2"+
		"\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da"+
		"\7t\2\2\u00da\u00db\7v\2\2\u00db,\3\2\2\2\u00dc\u00dd\7.\2\2\u00dd.\3"+
		"\2\2\2\u00de\u00df\7B\2\2\u00df\60\3\2\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2"+
		"\7q\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7f\2\2\u00e4\62\3\2\2\2\u00e5\u00e6"+
		"\7*\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8\66\3\2\2\2\u00e9\u00ea"+
		"\7}\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7\177\2\2\u00ec:\3\2\2\2\u00ed\u00f2"+
		"\5=\37\2\u00ee\u00f2\5? \2\u00ef\u00f2\5A!\2\u00f0\u00f2\5C\"\2\u00f1"+
		"\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6"+
		"\7v\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa"+
		"\7w\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7g\2\2\u00fd"+
		"@\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7z\2\2\u0100\u0101\7v\2\2\u0101"+
		"B\3\2\2\2\u0102\u0103\7d\2\2\u0103\u0104\7q\2\2\u0104\u0105\7q\2\2\u0105"+
		"\u0106\7n\2\2\u0106D\3\2\2\2\u0107\u0108\7?\2\2\u0108F\3\2\2\2\u0109\u010b"+
		"\t\3\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010dH\3\2\2\2\u010e\u010f\7\60\2\2\u010fJ\3\2\2\2\u0110"+
		"\u0112\t\3\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\5I%\2\u0116\u0118"+
		"\t\3\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011aL\3\2\2\2\u011b\u011d\t\4\2\2\u011c\u011e\t\5\2\2"+
		"\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120N\3\2\2\2\u0121\u0123\5Q)\2\u0122\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012c\3\2\2\2\u0126"+
		"\u0128\5S*\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2"+
		"\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0127"+
		"\3\2\2\2\u012cP\3\2\2\2\u012d\u0133\7\63\2\2\u012e\u012f\7v\2\2\u012f"+
		"\u0130\7t\2\2\u0130\u0131\7w\2\2\u0131\u0133\7g\2\2\u0132\u012d\3\2\2"+
		"\2\u0132\u012e\3\2\2\2\u0133R\3\2\2\2\u0134\u013b\7\62\2\2\u0135\u0136"+
		"\7h\2\2\u0136\u0137\7c\2\2\u0137\u0138\7n\2\2\u0138\u0139\7u\2\2\u0139"+
		"\u013b\7g\2\2\u013a\u0134\3\2\2\2\u013a\u0135\3\2\2\2\u013bT\3\2\2\2\u013c"+
		"\u013e\t\6\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2"+
		"\2\2\u013f\u0141\t\7\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143V\3\2\2\2\u0144\u0146\t\b\2\2"+
		"\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b,\2\2\u014aX\3\2\2\2\u014b\u014c"+
		"\7\61\2\2\u014c\u014d\7,\2\2\u014d\u0151\3\2\2\2\u014e\u0150\13\2\2\2"+
		"\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0156\7\61\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b-\2\2\u0158Z\3\2\2\2"+
		"\u0159\u015a\7\61\2\2\u015a\u015b\7\61\2\2\u015b\u015f\3\2\2\2\u015c\u015e"+
		"\n\t\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\b."+
		"\2\2\u0163\\\3\2\2\2\22\2\u00f1\u010c\u0113\u0119\u011f\u0124\u0129\u012b"+
		"\u0132\u013a\u013d\u0142\u0147\u0151\u015f\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}