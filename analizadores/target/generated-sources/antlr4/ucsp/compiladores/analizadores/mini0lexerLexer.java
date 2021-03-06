// Generated from ucsp\compiladores\analizadores\mini0lexer.g4 by ANTLR 4.7.2
package ucsp.compiladores.analizadores;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mini0lexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		TRUE=32, FALSE=33, RESERVEDWORDS=34, NUMERICLITERAL=35, IDENTIFIER=36, 
		STRINGLITERAL=37, COMMENTBLOCK=38, COMMENTLINE=39, NEWLINE=40, WHITESPACE=41, 
		RELATIONALOP=42, ARITHMETICOP=43, PUNCTUATION=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "TRUE", "FALSE", 
			"RESERVEDWORDS", "NUMERICLITERAL", "IDENTIFIER", "STRINGLITERAL", "COMMENTBLOCK", 
			"COMMENTLINE", "NEWLINE", "WHITESPACE", "RELATIONALOP", "ARITHMETICOP", 
			"PUNCTUATION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'('", "')'", "':'", "'end'", "','", "'['", "']'", "'int'", 
			"'bool'", "'char'", "'string'", "'if'", "'else'", "'while'", "'loop'", 
			"'='", "'return'", "'new'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
			"'>='", "'<='", "'<>'", "'and'", "'or'", "'not'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "TRUE", "FALSE", "RESERVEDWORDS", 
			"NUMERICLITERAL", "IDENTIFIER", "STRINGLITERAL", "COMMENTBLOCK", "COMMENTLINE", 
			"NEWLINE", "WHITESPACE", "RELATIONALOP", "ARITHMETICOP", "PUNCTUATION"
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


	public mini0lexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mini0lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0165\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u0109\n#\3$\5$\u010c\n$\3$\3$\3$\3$\3$\6$\u0113\n$\r$\16$\u0114"+
		"\6$\u0117\n$\r$\16$\u0118\3%\3%\7%\u011d\n%\f%\16%\u0120\13%\3&\3&\3&"+
		"\7&\u0125\n&\f&\16&\u0128\13&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0130\n\'\f\'"+
		"\16\'\u0133\13\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u0140\n(\f"+
		"(\16(\u0143\13(\3(\5(\u0146\n(\3(\3(\3(\3(\3)\6)\u014d\n)\r)\16)\u014e"+
		"\3*\3*\5*\u0153\n*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0160\n+\3,\3,"+
		"\3-\3-\3\u0131\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\f\4\2--//\5\2\62"+
		";CHch\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17^^\3\2))\4\2\f\f\17\17\5"+
		"\2\13\13\17\17\"\"\5\2,-//\61\61\7\2*+..<<]]__\2\u0185\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\3[\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3\2\2"+
		"\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23o\3\2\2\2\25s\3\2\2\2\27x\3\2"+
		"\2\2\31}\3\2\2\2\33\u0084\3\2\2\2\35\u0087\3\2\2\2\37\u008c\3\2\2\2!\u0092"+
		"\3\2\2\2#\u0097\3\2\2\2%\u0099\3\2\2\2\'\u00a0\3\2\2\2)\u00a4\3\2\2\2"+
		"+\u00a6\3\2\2\2-\u00a8\3\2\2\2/\u00aa\3\2\2\2\61\u00ac\3\2\2\2\63\u00ae"+
		"\3\2\2\2\65\u00b0\3\2\2\2\67\u00b3\3\2\2\29\u00b6\3\2\2\2;\u00b9\3\2\2"+
		"\2=\u00bd\3\2\2\2?\u00c0\3\2\2\2A\u00c4\3\2\2\2C\u00c9\3\2\2\2E\u0108"+
		"\3\2\2\2G\u0116\3\2\2\2I\u011a\3\2\2\2K\u0121\3\2\2\2M\u012b\3\2\2\2O"+
		"\u013b\3\2\2\2Q\u014c\3\2\2\2S\u0152\3\2\2\2U\u015f\3\2\2\2W\u0161\3\2"+
		"\2\2Y\u0163\3\2\2\2[\\\7h\2\2\\]\7w\2\2]^\7p\2\2^\4\3\2\2\2_`\7*\2\2`"+
		"\6\3\2\2\2ab\7+\2\2b\b\3\2\2\2cd\7<\2\2d\n\3\2\2\2ef\7g\2\2fg\7p\2\2g"+
		"h\7f\2\2h\f\3\2\2\2ij\7.\2\2j\16\3\2\2\2kl\7]\2\2l\20\3\2\2\2mn\7_\2\2"+
		"n\22\3\2\2\2op\7k\2\2pq\7p\2\2qr\7v\2\2r\24\3\2\2\2st\7d\2\2tu\7q\2\2"+
		"uv\7q\2\2vw\7n\2\2w\26\3\2\2\2xy\7e\2\2yz\7j\2\2z{\7c\2\2{|\7t\2\2|\30"+
		"\3\2\2\2}~\7u\2\2~\177\7v\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7p\2\2\u0082\u0083\7i\2\2\u0083\32\3\2\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7h\2\2\u0086\34\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7n\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b\36\3\2\2\2\u008c\u008d\7y\2\2\u008d"+
		"\u008e\7j\2\2\u008e\u008f\7k\2\2\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2"+
		"\u0091 \3\2\2\2\u0092\u0093\7n\2\2\u0093\u0094\7q\2\2\u0094\u0095\7q\2"+
		"\2\u0095\u0096\7r\2\2\u0096\"\3\2\2\2\u0097\u0098\7?\2\2\u0098$\3\2\2"+
		"\2\u0099\u009a\7t\2\2\u009a\u009b\7g\2\2\u009b\u009c\7v\2\2\u009c\u009d"+
		"\7w\2\2\u009d\u009e\7t\2\2\u009e\u009f\7p\2\2\u009f&\3\2\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7y\2\2\u00a3(\3\2\2\2\u00a4\u00a5"+
		"\7-\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7,\3\2\2\2\u00a8\u00a9\7"+
		",\2\2\u00a9.\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab\60\3\2\2\2\u00ac\u00ad"+
		"\7@\2\2\u00ad\62\3\2\2\2\u00ae\u00af\7>\2\2\u00af\64\3\2\2\2\u00b0\u00b1"+
		"\7@\2\2\u00b1\u00b2\7?\2\2\u00b2\66\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b5"+
		"\7?\2\2\u00b58\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8\7@\2\2\u00b8:\3"+
		"\2\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7f\2\2\u00bc"+
		"<\3\2\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf>\3\2\2\2\u00c0\u00c1"+
		"\7p\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7v\2\2\u00c3@\3\2\2\2\u00c4\u00c5"+
		"\7v\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"B\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ceD\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0"+
		"\u0109\7h\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7u\2\2"+
		"\u00d4\u0109\7g\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7p\2\2\u00d7\u0109"+
		"\7f\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7n\2\2\u00dc\u0109\7g\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7q\2\2"+
		"\u00df\u00e0\7q\2\2\u00e0\u0109\7r\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3"+
		"\7w\2\2\u00e3\u0109\7p\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00e7\7v\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7t\2\2\u00e9\u0109\7p\2\2"+
		"\u00ea\u00eb\7p\2\2\u00eb\u00ec\7g\2\2\u00ec\u0109\7y\2\2\u00ed\u00ee"+
		"\7u\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7k\2\2\u00f1"+
		"\u00f2\7p\2\2\u00f2\u0109\7i\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2"+
		"\u00f5\u0109\7v\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7j\2\2\u00f8\u00f9"+
		"\7c\2\2\u00f9\u0109\7t\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc\7q\2\2\u00fc"+
		"\u00fd\7q\2\2\u00fd\u0109\7n\2\2\u00fe\u0109\5A!\2\u00ff\u0109\5C\"\2"+
		"\u0100\u0101\7c\2\2\u0101\u0102\7p\2\2\u0102\u0109\7f\2\2\u0103\u0104"+
		"\7q\2\2\u0104\u0109\7t\2\2\u0105\u0106\7p\2\2\u0106\u0107\7q\2\2\u0107"+
		"\u0109\7v\2\2\u0108\u00cf\3\2\2\2\u0108\u00d1\3\2\2\2\u0108\u00d5\3\2"+
		"\2\2\u0108\u00d8\3\2\2\2\u0108\u00dd\3\2\2\2\u0108\u00e1\3\2\2\2\u0108"+
		"\u00e4\3\2\2\2\u0108\u00ea\3\2\2\2\u0108\u00ed\3\2\2\2\u0108\u00f3\3\2"+
		"\2\2\u0108\u00f6\3\2\2\2\u0108\u00fa\3\2\2\2\u0108\u00fe\3\2\2\2\u0108"+
		"\u00ff\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0103\3\2\2\2\u0108\u0105\3\2"+
		"\2\2\u0109F\3\2\2\2\u010a\u010c\t\2\2\2\u010b\u010a\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0117\4\62;\2\u010e\u010f\7\62\2\2"+
		"\u010f\u0110\7z\2\2\u0110\u0112\3\2\2\2\u0111\u0113\t\3\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u010b\3\2\2\2\u0116\u010e\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119H\3\2\2\2\u011a\u011e"+
		"\t\4\2\2\u011b\u011d\t\5\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011fJ\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0121\u0126\7$\2\2\u0122\u0125\t\6\2\2\u0123\u0125\n\7\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7$"+
		"\2\2\u012aL\3\2\2\2\u012b\u012c\7\61\2\2\u012c\u012d\7,\2\2\u012d\u0131"+
		"\3\2\2\2\u012e\u0130\13\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0135\7,\2\2\u0135\u0136\7\61\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\5S*\2\u0138\u0139\3\2\2\2\u0139\u013a\b\'\2\2\u013aN\3\2\2\2\u013b"+
		"\u013c\7\61\2\2\u013c\u013d\7\61\2\2\u013d\u0141\3\2\2\2\u013e\u0140\n"+
		"\b\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\7\17"+
		"\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\7\f\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b(\2\2\u014aP\3\2\2\2\u014b"+
		"\u014d\7\f\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014fR\3\2\2\2\u0150\u0153\t\t\2\2\u0151\u0153"+
		"\5Q)\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\b*\2\2\u0155T\3\2\2\2\u0156\u0160\7@\2\2\u0157\u0158\7@\2\2\u0158"+
		"\u0160\7?\2\2\u0159\u0160\7>\2\2\u015a\u015b\7>\2\2\u015b\u0160\7?\2\2"+
		"\u015c\u0160\7?\2\2\u015d\u015e\7>\2\2\u015e\u0160\7@\2\2\u015f\u0156"+
		"\3\2\2\2\u015f\u0157\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u015a\3\2\2\2\u015f"+
		"\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u0160V\3\2\2\2\u0161\u0162\t\n\2\2"+
		"\u0162X\3\2\2\2\u0163\u0164\t\13\2\2\u0164Z\3\2\2\2\21\2\u0108\u010b\u0114"+
		"\u0116\u0118\u011e\u0124\u0126\u0131\u0141\u0145\u014e\u0152\u015f\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}