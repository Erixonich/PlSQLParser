// Generated from com\cwms3000\plsqlparser\antlrlib\Pl.g4 by ANTLR 4.7
package com.cwms3000.plsqlparser.antlrlib;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		M_COMMENTS=1, S_COMMENTS=2, STRING=3, PROCEDURE=4, FUNCTION=5, END_F=6, 
		BEGIN=7, END_B=8, WORD=9, WS=10, ANY=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"M_COMMENTS", "S_COMMENTS", "STRING", "PROCEDURE", "FUNCTION", "END_F", 
		"BEGIN", "END_B", "END", "IF", "CASE", "LOOP", "SEMICOLON", "WORD", "WS", 
		"ANY"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'PROCEDURE'", "'FUNCTION'", null, "'BEGIN'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "M_COMMENTS", "S_COMMENTS", "STRING", "PROCEDURE", "FUNCTION", "END_F", 
		"BEGIN", "END_B", "WORD", "WS", "ANY"
	};
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


	   int nesting = 0;


	public PlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pl.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5:
			END_F_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			BEGIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			END_B_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void END_F_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			nesting--;
			break;
		}
	}
	private void BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			nesting++;
			break;
		}
	}
	private void END_B_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			nesting--;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return END_F_sempred((RuleContext)_localctx, predIndex);
		case 7:
			return END_B_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean END_F_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return nesting == 1
		&& !(getText().matches(".*\\s+IF\\s*;.*")
		   ||getText().matches(".*\\s+CASE\\s*;.*")
		   ||getText().matches(".*\\s+LOOP\\s*;.*"));
		}
		return true;
	}
	private boolean END_B_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return nesting > 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u009a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7_\n\7\3\7\5\7b\n\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\tr\n\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\6\17\u008c\n\17\r\17\16\17\u008d\3\20\6\20\u0091\n\20\r"+
		"\20\16\20\u0092\3\20\3\20\3\21\3\21\3\21\3\21\4)@\2\22\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\2\35\13\37\f!\r\3\2\5\4\2\f"+
		"\f\17\17\7\2%&\60\60\62;C\\aa\5\2\13\f\17\17\"\"\2\u009c\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5\61\3"+
		"\2\2\2\7<\3\2\2\2\tG\3\2\2\2\13Q\3\2\2\2\rZ\3\2\2\2\17g\3\2\2\2\21o\3"+
		"\2\2\2\23w\3\2\2\2\25{\3\2\2\2\27~\3\2\2\2\31\u0083\3\2\2\2\33\u0088\3"+
		"\2\2\2\35\u008b\3\2\2\2\37\u0090\3\2\2\2!\u0096\3\2\2\2#$\7\61\2\2$%\7"+
		",\2\2%)\3\2\2\2&(\13\2\2\2\'&\3\2\2\2(+\3\2\2\2)*\3\2\2\2)\'\3\2\2\2*"+
		",\3\2\2\2+)\3\2\2\2,-\7,\2\2-.\7\61\2\2./\3\2\2\2/\60\b\2\2\2\60\4\3\2"+
		"\2\2\61\62\7/\2\2\62\63\7/\2\2\63\67\3\2\2\2\64\66\n\2\2\2\65\64\3\2\2"+
		"\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\b\3\2"+
		"\2;\6\3\2\2\2<@\7)\2\2=?\13\2\2\2>=\3\2\2\2?B\3\2\2\2@A\3\2\2\2@>\3\2"+
		"\2\2AC\3\2\2\2B@\3\2\2\2CD\7)\2\2DE\3\2\2\2EF\b\4\2\2F\b\3\2\2\2GH\7R"+
		"\2\2HI\7T\2\2IJ\7Q\2\2JK\7E\2\2KL\7G\2\2LM\7F\2\2MN\7W\2\2NO\7T\2\2OP"+
		"\7G\2\2P\n\3\2\2\2QR\7H\2\2RS\7W\2\2ST\7P\2\2TU\7E\2\2UV\7V\2\2VW\7K\2"+
		"\2WX\7Q\2\2XY\7P\2\2Y\f\3\2\2\2Z^\5\23\n\2[\\\5\37\20\2\\]\5\35\17\2]"+
		"_\3\2\2\2^[\3\2\2\2^_\3\2\2\2_a\3\2\2\2`b\5\37\20\2a`\3\2\2\2ab\3\2\2"+
		"\2bc\3\2\2\2cd\5\33\16\2de\6\7\2\2ef\b\7\3\2f\16\3\2\2\2gh\7D\2\2hi\7"+
		"G\2\2ij\7I\2\2jk\7K\2\2kl\7P\2\2lm\3\2\2\2mn\b\b\4\2n\20\3\2\2\2oq\5\23"+
		"\n\2pr\5\37\20\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\5\33\16\2tu\6\t\3\2u"+
		"v\b\t\5\2v\22\3\2\2\2wx\7G\2\2xy\7P\2\2yz\7F\2\2z\24\3\2\2\2{|\7K\2\2"+
		"|}\7H\2\2}\26\3\2\2\2~\177\7E\2\2\177\u0080\7C\2\2\u0080\u0081\7U\2\2"+
		"\u0081\u0082\7G\2\2\u0082\30\3\2\2\2\u0083\u0084\7N\2\2\u0084\u0085\7"+
		"Q\2\2\u0085\u0086\7Q\2\2\u0086\u0087\7R\2\2\u0087\32\3\2\2\2\u0088\u0089"+
		"\7=\2\2\u0089\34\3\2\2\2\u008a\u008c\t\3\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\36\3\2\2"+
		"\2\u008f\u0091\t\4\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\20\2\2"+
		"\u0095 \3\2\2\2\u0096\u0097\13\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b"+
		"\21\2\2\u0099\"\3\2\2\2\f\2)\67@^aq\u008b\u008d\u0092\6\b\2\2\3\7\2\3"+
		"\b\3\3\t\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}