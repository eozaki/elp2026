// Generated from /Users/erick/IdeaProjects/elp2026/src/main/kotlin/Semana02/JavaLexer.g4 by ANTLR 4.13.2
package Semana02;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD=1, PRIMITIVE=2, ID=3, NUMBER=4, STRING=5, OPENCURL=6, CLOSECURL=7, 
		OPENPAREN=8, CLOSEPAREN=9, TERM=10, DOT=11, EQUAL=12, SPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KEYWORD", "PRIMITIVE", "ID", "NUMBER", "STRING", "OPENCURL", "CLOSECURL", 
			"OPENPAREN", "CLOSEPAREN", "TERM", "DOT", "EQUAL", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'{'", "'}'", "'('", "')'", "';'", 
			"'.'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD", "PRIMITIVE", "ID", "NUMBER", "STRING", "OPENCURL", "CLOSECURL", 
			"OPENPAREN", "CLOSEPAREN", "TERM", "DOT", "EQUAL", "SPACE"
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


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaLexer.g4"; }

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
		"\u0004\u0000\r\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000H\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001T\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002X\b\u0002\n\u0002\f\u0002[\t"+
		"\u0002\u0001\u0003\u0004\u0003^\b\u0003\u000b\u0003\f\u0003_\u0001\u0004"+
		"\u0001\u0004\u0005\u0004d\b\u0004\n\u0004\f\u0004g\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0004\fz\b\f\u000b\f\f\f{\u0001\f\u0001\f\u0000\u0000"+
		"\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000"+
		"\u0005\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u0002\u0000\n"+
		"\n\"\"\u0003\u0000\t\n\r\r  \u008a\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001G\u0001"+
		"\u0000\u0000\u0000\u0003S\u0001\u0000\u0000\u0000\u0005U\u0001\u0000\u0000"+
		"\u0000\u0007]\u0001\u0000\u0000\u0000\ta\u0001\u0000\u0000\u0000\u000b"+
		"j\u0001\u0000\u0000\u0000\rl\u0001\u0000\u0000\u0000\u000fn\u0001\u0000"+
		"\u0000\u0000\u0011p\u0001\u0000\u0000\u0000\u0013r\u0001\u0000\u0000\u0000"+
		"\u0015t\u0001\u0000\u0000\u0000\u0017v\u0001\u0000\u0000\u0000\u0019y"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005c\u0000\u0000\u001c\u001d\u0005"+
		"l\u0000\u0000\u001d\u001e\u0005a\u0000\u0000\u001e\u001f\u0005s\u0000"+
		"\u0000\u001fH\u0005s\u0000\u0000 !\u0005s\u0000\u0000!\"\u0005t\u0000"+
		"\u0000\"#\u0005a\u0000\u0000#$\u0005t\u0000\u0000$%\u0005i\u0000\u0000"+
		"%H\u0005c\u0000\u0000&\'\u0005f\u0000\u0000\'(\u0005i\u0000\u0000()\u0005"+
		"n\u0000\u0000)*\u0005a\u0000\u0000*H\u0005l\u0000\u0000+,\u0005p\u0000"+
		"\u0000,-\u0005u\u0000\u0000-.\u0005b\u0000\u0000./\u0005l\u0000\u0000"+
		"/0\u0005i\u0000\u00000H\u0005c\u0000\u000012\u0005p\u0000\u000023\u0005"+
		"r\u0000\u000034\u0005i\u0000\u000045\u0005v\u0000\u000056\u0005a\u0000"+
		"\u000067\u0005t\u0000\u00007H\u0005e\u0000\u000089\u0005t\u0000\u0000"+
		"9:\u0005r\u0000\u0000:;\u0005u\u0000\u0000;H\u0005e\u0000\u0000<=\u0005"+
		"f\u0000\u0000=>\u0005a\u0000\u0000>?\u0005l\u0000\u0000?@\u0005s\u0000"+
		"\u0000@H\u0005e\u0000\u0000AB\u0005r\u0000\u0000BC\u0005e\u0000\u0000"+
		"CD\u0005t\u0000\u0000DE\u0005u\u0000\u0000EF\u0005r\u0000\u0000FH\u0005"+
		"n\u0000\u0000G\u001b\u0001\u0000\u0000\u0000G \u0001\u0000\u0000\u0000"+
		"G&\u0001\u0000\u0000\u0000G+\u0001\u0000\u0000\u0000G1\u0001\u0000\u0000"+
		"\u0000G8\u0001\u0000\u0000\u0000G<\u0001\u0000\u0000\u0000GA\u0001\u0000"+
		"\u0000\u0000H\u0002\u0001\u0000\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005"+
		"n\u0000\u0000KT\u0005t\u0000\u0000LM\u0005b\u0000\u0000MN\u0005o\u0000"+
		"\u0000NO\u0005o\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005e\u0000\u0000"+
		"QR\u0005a\u0000\u0000RT\u0005n\u0000\u0000SI\u0001\u0000\u0000\u0000S"+
		"L\u0001\u0000\u0000\u0000T\u0004\u0001\u0000\u0000\u0000UY\u0007\u0000"+
		"\u0000\u0000VX\u0007\u0001\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\u0006\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\^\u0007\u0002"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\b\u0001\u0000\u0000\u0000"+
		"ae\u0005\"\u0000\u0000bd\b\u0003\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005\"\u0000"+
		"\u0000i\n\u0001\u0000\u0000\u0000jk\u0005{\u0000\u0000k\f\u0001\u0000"+
		"\u0000\u0000lm\u0005}\u0000\u0000m\u000e\u0001\u0000\u0000\u0000no\u0005"+
		"(\u0000\u0000o\u0010\u0001\u0000\u0000\u0000pq\u0005)\u0000\u0000q\u0012"+
		"\u0001\u0000\u0000\u0000rs\u0005;\u0000\u0000s\u0014\u0001\u0000\u0000"+
		"\u0000tu\u0005.\u0000\u0000u\u0016\u0001\u0000\u0000\u0000vw\u0005=\u0000"+
		"\u0000w\u0018\u0001\u0000\u0000\u0000xz\u0007\u0004\u0000\u0000yx\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0006\f\u0000\u0000"+
		"~\u001a\u0001\u0000\u0000\u0000\u0007\u0000GSY_e{\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}