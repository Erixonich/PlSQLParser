// Generated from com\cwms3000\plsqlparser\antlrlib\Pl.g4 by ANTLR 4.7
package com.cwms3000.plsqlparser.antlrlib;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		M_COMMENTS=1, S_COMMENTS=2, STRING=3, PROCEDURE=4, FUNCTION=5, END_F=6, 
		BEGIN=7, END_B=8, WORD=9, WS=10, ANY=11;
	public static final int
		RULE_package_body = 0, RULE_function = 1, RULE_procedure = 2, RULE_body = 3, 
		RULE_block = 4;
	public static final String[] ruleNames = {
		"package_body", "function", "procedure", "body", "block"
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

	@Override
	public String getGrammarFileName() { return "Pl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   int nesting = 0;

	public PlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Package_bodyContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(PlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PlParser.WORD, i);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlListener ) ((PlListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlListener ) ((PlListener)listener).exitPackage_body(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_package_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(10);
					match(WORD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(13); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(18);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROCEDURE:
					{
					setState(15);
					procedure();
					}
					break;
				case FUNCTION:
					{
					setState(16);
					function();
					}
					break;
				case WORD:
					{
					setState(17);
					match(WORD);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCEDURE) | (1L << FUNCTION) | (1L << WORD))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode FUNCTION() { return getToken(PlParser.FUNCTION, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> WORD() { return getTokens(PlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PlParser.WORD, i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlListener ) ((PlListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlListener ) ((PlListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(FUNCTION);
			setState(23);
			((FunctionContext)_localctx).name = match(WORD);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(27);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(24);
					match(WORD);
					}
					break;
				case FUNCTION:
					{
					setState(25);
					function();
					}
					break;
				case PROCEDURE:
					{
					setState(26);
					procedure();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCEDURE) | (1L << FUNCTION) | (1L << WORD))) != 0) );
			setState(31);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PROCEDURE() { return getToken(PlParser.PROCEDURE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> WORD() { return getTokens(PlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PlParser.WORD, i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlListener ) ((PlListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlListener ) ((PlListener)listener).exitProcedure(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(PROCEDURE);
			setState(34);
			((ProcedureContext)_localctx).name = match(WORD);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(35);
					match(WORD);
					}
					break;
				case FUNCTION:
					{
					setState(36);
					function();
					}
					break;
				case PROCEDURE:
					{
					setState(37);
					procedure();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCEDURE) | (1L << FUNCTION) | (1L << WORD))) != 0) );
			setState(42);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PlParser.BEGIN, 0); }
		public TerminalNode END_F() { return getToken(PlParser.END_F, 0); }
		public List<TerminalNode> WORD() { return getTokens(PlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PlParser.WORD, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlListener ) ((PlListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlListener ) ((PlListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(BEGIN);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(45);
					match(WORD);
					}
					break;
				case BEGIN:
					{
					setState(46);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BEGIN || _la==WORD );
			setState(51);
			match(END_F);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PlParser.BEGIN, 0); }
		public TerminalNode END_B() { return getToken(PlParser.END_B, 0); }
		public List<TerminalNode> WORD() { return getTokens(PlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PlParser.WORD, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlListener ) ((PlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlListener ) ((PlListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(53);
			match(BEGIN);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(54);
					match(WORD);
					}
					break;
				case BEGIN:
					{
					setState(55);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BEGIN || _la==WORD );
			setState(60);
			match(END_B);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rA\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\2\6\2"+
		"\25\n\2\r\2\16\2\26\3\3\3\3\3\3\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\6\4)\n\4\r\4\16\4*\3\4\3\4\3\5\3\5\3\5\6\5\62\n\5"+
		"\r\5\16\5\63\3\5\3\5\3\6\3\6\3\6\6\6;\n\6\r\6\16\6<\3\6\3\6\3\6\2\2\7"+
		"\2\4\6\b\n\2\2\2I\2\r\3\2\2\2\4\30\3\2\2\2\6#\3\2\2\2\b.\3\2\2\2\n\67"+
		"\3\2\2\2\f\16\7\13\2\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3"+
		"\2\2\2\20\24\3\2\2\2\21\25\5\6\4\2\22\25\5\4\3\2\23\25\7\13\2\2\24\21"+
		"\3\2\2\2\24\22\3\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27"+
		"\3\2\2\2\27\3\3\2\2\2\30\31\7\7\2\2\31\35\7\13\2\2\32\36\7\13\2\2\33\36"+
		"\5\4\3\2\34\36\5\6\4\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\37"+
		"\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\5\b\5\2\"\5\3\2\2\2#$"+
		"\7\6\2\2$(\7\13\2\2%)\7\13\2\2&)\5\4\3\2\')\5\6\4\2(%\3\2\2\2(&\3\2\2"+
		"\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\5\b\5\2-\7\3\2"+
		"\2\2.\61\7\t\2\2/\62\7\13\2\2\60\62\5\n\6\2\61/\3\2\2\2\61\60\3\2\2\2"+
		"\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\b\2\2"+
		"\66\t\3\2\2\2\67:\7\t\2\28;\7\13\2\29;\5\n\6\2:8\3\2\2\2:9\3\2\2\2;<\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\n\2\2?\13\3\2\2\2\r\17\24\26"+
		"\35\37(*\61\63:<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}