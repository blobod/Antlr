// Generated from C:/Users/thetr/Desktop/Antlr/src/main/java/antlr\language.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, T__11=12, IF=13, ELSE=14, PLUS=15, MINUS=16, MULTIPLIKATION=17, 
		DIVISION=18, POWER_OF=19, OR=20, STOP=21, FOR=22, WHILE=23, FOREVER=24, 
		START=25, COMMA=26, AT_SIGN=27, VOID=28, LPAR=29, RPAR=30, LCBRAC=31, 
		RCBRAC=32, INT_TYPE=33, DOUBLE_TYPE=34, TXT_TYPE=35, BOOL_TYPE=36, ASSIGN=37, 
		INT=38, DOT=39, DOUBLE=40, TXT=41, BOOL=42, TRUE=43, FALSE=44, ID=45, 
		WS=46, COMMENT=47, LINE_COMMENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLIKATION", 
			"DIVISION", "POWER_OF", "OR", "STOP", "FOR", "WHILE", "FOREVER", "START", 
			"COMMA", "AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "INT_TYPE", 
			"DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", "INT", "DOT", "DOUBLE", 
			"TXT", "BOOL", "TRUE", "FALSE", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u016c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3\'\6\'\u0113\n\'\r\'\16\'\u0114\3(\3"+
		"(\3)\6)\u011a\n)\r)\16)\u011b\3)\3)\6)\u0120\n)\r)\16)\u0121\3*\3*\6*"+
		"\u0126\n*\r*\16*\u0127\3+\6+\u012b\n+\r+\16+\u012c\3+\6+\u0130\n+\r+\16"+
		"+\u0131\5+\u0134\n+\3,\3,\3,\3,\3,\5,\u013b\n,\3-\3-\3-\3-\3-\3-\5-\u0143"+
		"\n-\3.\5.\u0146\n.\3.\6.\u0149\n.\r.\16.\u014a\3/\6/\u014e\n/\r/\16/\u014f"+
		"\3/\3/\3\60\3\60\3\60\3\60\7\60\u0158\n\60\f\60\16\60\u015b\13\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0166\n\61\f\61\16\61\u0169"+
		"\13\61\3\61\3\61\3\u0159\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62\3\2\t\3\2\62;\3\2c|\3\2C\\\4\2aac|\6\2\62;C\\aac|\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\2\u0179\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7n\3\2\2\2\tp\3\2"+
		"\2\2\13w\3\2\2\2\rz\3\2\2\2\17\u0080\3\2\2\2\21\u0083\3\2\2\2\23\u0095"+
		"\3\2\2\2\25\u0098\3\2\2\2\27\u00a8\3\2\2\2\31\u00ab\3\2\2\2\33\u00b8\3"+
		"\2\2\2\35\u00bb\3\2\2\2\37\u00c0\3\2\2\2!\u00c2\3\2\2\2#\u00c4\3\2\2\2"+
		"%\u00c6\3\2\2\2\'\u00c8\3\2\2\2)\u00ca\3\2\2\2+\u00cd\3\2\2\2-\u00d2\3"+
		"\2\2\2/\u00d6\3\2\2\2\61\u00dc\3\2\2\2\63\u00e4\3\2\2\2\65\u00ea\3\2\2"+
		"\2\67\u00ec\3\2\2\29\u00ee\3\2\2\2;\u00f3\3\2\2\2=\u00f5\3\2\2\2?\u00f7"+
		"\3\2\2\2A\u00f9\3\2\2\2C\u00fb\3\2\2\2E\u00ff\3\2\2\2G\u0106\3\2\2\2I"+
		"\u010a\3\2\2\2K\u010f\3\2\2\2M\u0112\3\2\2\2O\u0116\3\2\2\2Q\u0119\3\2"+
		"\2\2S\u0123\3\2\2\2U\u0133\3\2\2\2W\u013a\3\2\2\2Y\u0142\3\2\2\2[\u0145"+
		"\3\2\2\2]\u014d\3\2\2\2_\u0153\3\2\2\2a\u0161\3\2\2\2cd\7@\2\2d\4\3\2"+
		"\2\2ef\7I\2\2fg\7t\2\2gh\7g\2\2hi\7c\2\2ij\7v\2\2jk\7j\2\2kl\7g\2\2lm"+
		"\7t\2\2m\6\3\2\2\2no\7>\2\2o\b\3\2\2\2pq\7N\2\2qr\7g\2\2rs\7u\2\2st\7"+
		"u\2\2tu\7g\2\2uv\7t\2\2v\n\3\2\2\2wx\7?\2\2xy\7?\2\2y\f\3\2\2\2z{\7G\2"+
		"\2{|\7s\2\2|}\7w\2\2}~\7c\2\2~\177\7n\2\2\177\16\3\2\2\2\u0080\u0081\7"+
		"@\2\2\u0081\u0082\7?\2\2\u0082\20\3\2\2\2\u0083\u0084\7I\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088"+
		"\u0089\7j\2\2\u0089\u008a\7g\2\2\u008a\u008b\7t\2\2\u008b\u008c\7a\2\2"+
		"\u008c\u008d\7q\2\2\u008d\u008e\7t\2\2\u008e\u008f\7a\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7s\2\2\u0091\u0092\7w\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7n\2\2\u0094\22\3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7?\2\2\u0097"+
		"\24\3\2\2\2\u0098\u0099\7N\2\2\u0099\u009a\7g\2\2\u009a\u009b\7u\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d\u009e\7t\2\2\u009e\u009f\7a\2\2"+
		"\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7a\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7s\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7c\2\2\u00a6"+
		"\u00a7\7n\2\2\u00a7\26\3\2\2\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\7?\2\2\u00aa"+
		"\30\3\2\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7a\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7a\2\2"+
		"\u00b2\u00b3\7g\2\2\u00b3\u00b4\7s\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6"+
		"\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7h\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be"+
		"\7u\2\2\u00be\u00bf\7g\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1 "+
		"\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5$"+
		"\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7`\2\2\u00c9"+
		"(\3\2\2\2\u00ca\u00cb\7~\2\2\u00cb\u00cc\7~\2\2\u00cc*\3\2\2\2\u00cd\u00ce"+
		"\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7r\2\2\u00d1"+
		",\3\2\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2\u00d5"+
		".\3\2\2\2\u00d6\u00d7\7y\2\2\u00d7\u00d8\7j\2\2\u00d8\u00d9\7k\2\2\u00d9"+
		"\u00da\7n\2\2\u00da\u00db\7g\2\2\u00db\60\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd"+
		"\u00de\7q\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7x\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\u00e3\7t\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7"+
		"u\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9"+
		"\7v\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7.\2\2\u00eb\66\3\2\2\2\u00ec\u00ed"+
		"\7B\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7x\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1"+
		"\7k\2\2\u00f1\u00f2\7f\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4<\3"+
		"\2\2\2\u00f5\u00f6\7+\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7}\2\2\u00f8@\3\2"+
		"\2\2\u00f9\u00fa\7\177\2\2\u00faB\3\2\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd"+
		"\7p\2\2\u00fd\u00fe\7v\2\2\u00feD\3\2\2\2\u00ff\u0100\7f\2\2\u0100\u0101"+
		"\7q\2\2\u0101\u0102\7w\2\2\u0102\u0103\7d\2\2\u0103\u0104\7n\2\2\u0104"+
		"\u0105\7g\2\2\u0105F\3\2\2\2\u0106\u0107\7v\2\2\u0107\u0108\7z\2\2\u0108"+
		"\u0109\7v\2\2\u0109H\3\2\2\2\u010a\u010b\7d\2\2\u010b\u010c\7q\2\2\u010c"+
		"\u010d\7q\2\2\u010d\u010e\7n\2\2\u010eJ\3\2\2\2\u010f\u0110\7?\2\2\u0110"+
		"L\3\2\2\2\u0111\u0113\t\2\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115N\3\2\2\2\u0116\u0117\7"+
		"\60\2\2\u0117P\3\2\2\2\u0118\u011a\t\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\5O(\2\u011e\u0120\t\2\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2"+
		"\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122R\3\2\2\2\u0123\u0125"+
		"\t\3\2\2\u0124\u0126\t\4\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128T\3\2\2\2\u0129\u012b\5W,\2\u012a"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u0134\3\2\2\2\u012e\u0130\5Y-\2\u012f\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u012a\3\2\2\2\u0133\u012f\3\2\2\2\u0134V\3\2\2\2\u0135\u013b\7\63\2\2"+
		"\u0136\u0137\7v\2\2\u0137\u0138\7t\2\2\u0138\u0139\7w\2\2\u0139\u013b"+
		"\7g\2\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013bX\3\2\2\2\u013c\u0143"+
		"\7\62\2\2\u013d\u013e\7h\2\2\u013e\u013f\7c\2\2\u013f\u0140\7n\2\2\u0140"+
		"\u0141\7u\2\2\u0141\u0143\7g\2\2\u0142\u013c\3\2\2\2\u0142\u013d\3\2\2"+
		"\2\u0143Z\3\2\2\2\u0144\u0146\t\5\2\2\u0145\u0144\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\t\6\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\\\3\2\2\2"+
		"\u014c\u014e\t\7\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b/\2\2\u0152"+
		"^\3\2\2\2\u0153\u0154\7\61\2\2\u0154\u0155\7,\2\2\u0155\u0159\3\2\2\2"+
		"\u0156\u0158\13\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\7,\2\2\u015d\u015e\7\61\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\60"+
		"\2\2\u0160`\3\2\2\2\u0161\u0162\7\61\2\2\u0162\u0163\7\61\2\2\u0163\u0167"+
		"\3\2\2\2\u0164\u0166\n\b\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u016a\u016b\b\61\2\2\u016bb\3\2\2\2\21\2\u0114\u011b\u0121\u0127"+
		"\u012c\u0131\u0133\u013a\u0142\u0145\u014a\u014f\u0159\u0167\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}