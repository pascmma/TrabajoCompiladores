// Generated from ucsp\compiladores\analizadores\mini0lexer.g4 by ANTLR 4.7.2
package ucsp.compiladores.analizadores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mini0lexerParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_newLine = 2, RULE_global = 3, 
		RULE_function = 4, RULE_block = 5, RULE_parameters = 6, RULE_parameter = 7, 
		RULE_type = 8, RULE_baseType = 9, RULE_declvar = 10, RULE_command = 11, 
		RULE_commandIf = 12, RULE_commandWhile = 13, RULE_commandAsign = 14, RULE_call = 15, 
		RULE_expressionList = 16, RULE_commandReturn = 17, RULE_variable = 18, 
		RULE_expression = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "newLine", "global", "function", "block", "parameters", 
			"parameter", "type", "baseType", "declvar", "command", "commandIf", "commandWhile", 
			"commandAsign", "call", "expressionList", "commandReturn", "variable", 
			"expression"
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

	@Override
	public String getGrammarFileName() { return "mini0lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mini0lexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(mini0lexerParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(mini0lexerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(mini0lexerParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(40);
				match(NEWLINE);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			declaration();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==IDENTIFIER) {
				{
				{
				setState(47);
				declaration();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(EOF);
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

	public static class DeclarationContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				function();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				global();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NewLineContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(mini0lexerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(mini0lexerParser.NEWLINE, i);
		}
		public NewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_newLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(NEWLINE);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(60);
				match(NEWLINE);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class GlobalContext extends ParserRuleContext {
		public DeclvarContext declvar() {
			return getRuleContext(DeclvarContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			declvar();
			setState(67);
			newLine();
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
		public Token IDENTIFIER;
		public TypeContext type;
		public TerminalNode IDENTIFIER() { return getToken(mini0lexerParser.IDENTIFIER, 0); }
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(mini0lexerParser.NEWLINE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__0);
			setState(70);
			((FunctionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(71);
			match(T__1);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(72);
				parameters();
				}
			}

			setState(75);
			match(T__2);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(76);
				match(T__3);
				setState(77);
				((FunctionContext)_localctx).type = type();
				}
			}

			setState(80);
			newLine();
			 System.out.println("Funcion:\n\tNombre="+(((FunctionContext)_localctx).IDENTIFIER!=null?((FunctionContext)_localctx).IDENTIFIER.getText():null)+", Tipo="+(((FunctionContext)_localctx).type!=null?_input.getText(((FunctionContext)_localctx).type.start,((FunctionContext)_localctx).type.stop):null)); 
			setState(82);
			block();
			setState(83);
			match(T__4);
			setState(84);
			match(NEWLINE);
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
		public CommandContext cmd;
		public List<DeclvarContext> declvar() {
			return getRuleContexts(DeclvarContext.class);
		}
		public DeclvarContext declvar(int i) {
			return getRuleContext(DeclvarContext.class,i);
		}
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					declvar();
					setState(87);
					newLine();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(94);
				((BlockContext)_localctx).cmd = command();
				 System.out.println("Tipo de comando:\n\t"+((BlockContext)_localctx).cmd.X); 
				setState(96);
				newLine();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			parameter();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(104);
				match(T__5);
				setState(105);
				parameter();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(mini0lexerParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IDENTIFIER);
			setState(112);
			match(T__3);
			setState(113);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				baseType();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__6);
				setState(117);
				match(T__7);
				setState(118);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BaseTypeContext extends ParserRuleContext {
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DeclvarContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TypeContext type;
		public TerminalNode IDENTIFIER() { return getToken(mini0lexerParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterDeclvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitDeclvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitDeclvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclvarContext declvar() throws RecognitionException {
		DeclvarContext _localctx = new DeclvarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((DeclvarContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(124);
			match(T__3);
			setState(125);
			((DeclvarContext)_localctx).type = type();
			 System.out.println("Declaracion:\n\tNombre="+(((DeclvarContext)_localctx).IDENTIFIER!=null?((DeclvarContext)_localctx).IDENTIFIER.getText():null)+", Tipo="+(((DeclvarContext)_localctx).type!=null?_input.getText(((DeclvarContext)_localctx).type.start,((DeclvarContext)_localctx).type.stop):null)); 
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

	public static class CommandContext extends ParserRuleContext {
		public String X;
		public CommandIfContext commandIf() {
			return getRuleContext(CommandIfContext.class,0);
		}
		public CommandWhileContext commandWhile() {
			return getRuleContext(CommandWhileContext.class,0);
		}
		public CommandAsignContext commandAsign() {
			return getRuleContext(CommandAsignContext.class,0);
		}
		public CommandReturnContext commandReturn() {
			return getRuleContext(CommandReturnContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_command);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				commandIf();
				 ((CommandContext)_localctx).X =  "if"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				commandWhile();
				 ((CommandContext)_localctx).X =  "while"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				commandAsign();
				 ((CommandContext)_localctx).X =  "asign"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				commandReturn();
				 ((CommandContext)_localctx).X =  "return"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				call();
				 ((CommandContext)_localctx).X =  "call"; 
				}
				break;
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

	public static class CommandIfContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NewLineContext> newLine() {
			return getRuleContexts(NewLineContext.class);
		}
		public NewLineContext newLine(int i) {
			return getRuleContext(NewLineContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CommandIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterCommandIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitCommandIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitCommandIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandIfContext commandIf() throws RecognitionException {
		CommandIfContext _localctx = new CommandIfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commandIf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__12);
			setState(146);
			expression(0);
			setState(147);
			newLine();
			setState(148);
			block();
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					match(T__13);
					setState(150);
					match(T__12);
					setState(151);
					expression(0);
					setState(152);
					newLine();
					setState(153);
					block();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(160);
				match(T__13);
				setState(161);
				newLine();
				setState(162);
				block();
				}
			}

			setState(166);
			match(T__4);
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

	public static class CommandWhileContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CommandWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterCommandWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitCommandWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitCommandWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandWhileContext commandWhile() throws RecognitionException {
		CommandWhileContext _localctx = new CommandWhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_commandWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__14);
			setState(169);
			expression(0);
			setState(170);
			newLine();
			setState(171);
			block();
			setState(172);
			match(T__15);
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

	public static class CommandAsignContext extends ParserRuleContext {
		public VariableContext variable;
		public ExpressionContext expression;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandAsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandAsign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterCommandAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitCommandAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitCommandAsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandAsignContext commandAsign() throws RecognitionException {
		CommandAsignContext _localctx = new CommandAsignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_commandAsign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((CommandAsignContext)_localctx).variable = variable(0);
			setState(175);
			match(T__16);
			setState(176);
			((CommandAsignContext)_localctx).expression = expression(0);
			 System.out.println("Variable:\n\t"+(((CommandAsignContext)_localctx).variable!=null?_input.getText(((CommandAsignContext)_localctx).variable.start,((CommandAsignContext)_localctx).variable.stop):null)+" = "+(((CommandAsignContext)_localctx).expression!=null?_input.getText(((CommandAsignContext)_localctx).expression.start,((CommandAsignContext)_localctx).expression.stop):null)); 
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(mini0lexerParser.IDENTIFIER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(IDENTIFIER);
			setState(180);
			match(T__1);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__30) | (1L << TRUE) | (1L << FALSE) | (1L << NUMERICLITERAL) | (1L << IDENTIFIER) | (1L << STRINGLITERAL))) != 0)) {
				{
				setState(181);
				expressionList();
				}
			}

			setState(184);
			match(T__2);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			expression(0);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(187);
				match(T__5);
				setState(188);
				expression(0);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CommandReturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterCommandReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitCommandReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitCommandReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandReturnContext commandReturn() throws RecognitionException {
		CommandReturnContext _localctx = new CommandReturnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_commandReturn);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__17);
				setState(195);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(T__17);
				}
				break;
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(mini0lexerParser.IDENTIFIER, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		return variable(0);
	}

	private VariableContext variable(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableContext _localctx = new VariableContext(_ctx, _parentState);
		VariableContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_variable, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(200);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variable);
					setState(202);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(203);
					match(T__6);
					setState(204);
					expression(0);
					setState(205);
					match(T__7);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NUMERICLITERAL() { return getToken(mini0lexerParser.NUMERICLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(mini0lexerParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(mini0lexerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(mini0lexerParser.FALSE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mini0lexerListener ) ((mini0lexerListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mini0lexerVisitor ) return ((mini0lexerVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(213);
				match(NUMERICLITERAL);
				}
				break;
			case 2:
				{
				setState(214);
				match(STRINGLITERAL);
				}
				break;
			case 3:
				{
				setState(215);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(216);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(217);
				variable(0);
				}
				break;
			case 6:
				{
				setState(218);
				match(T__18);
				setState(219);
				match(T__6);
				setState(220);
				expression(0);
				setState(221);
				match(T__7);
				setState(222);
				type();
				}
				break;
			case 7:
				{
				setState(224);
				match(T__1);
				setState(225);
				expression(0);
				setState(226);
				match(T__2);
				}
				break;
			case 8:
				{
				setState(228);
				call();
				}
				break;
			case 9:
				{
				setState(229);
				match(T__30);
				setState(230);
				expression(2);
				}
				break;
			case 10:
				{
				setState(231);
				match(T__20);
				setState(232);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(236);
						match(T__19);
						setState(237);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(239);
						match(T__20);
						setState(240);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(242);
						match(T__21);
						setState(243);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(245);
						match(T__22);
						setState(246);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(248);
						match(T__23);
						setState(249);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(251);
						match(T__24);
						setState(252);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(254);
						match(T__25);
						setState(255);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(257);
						match(T__26);
						setState(258);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(260);
						match(T__16);
						setState(261);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(263);
						match(T__27);
						setState(264);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(266);
						match(T__28);
						setState(267);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(269);
						match(T__29);
						setState(270);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return variable_sempred((VariableContext)_localctx, predIndex);
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean variable_sempred(VariableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\3\3\3\5\3<\n\3\3\4\3\4\7\4@\n\4\f\4"+
		"\16\4C\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6L\n\6\3\6\3\6\3\6\5\6Q\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7"+
		"\3\7\3\7\7\7e\n\7\f\7\16\7h\13\7\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nz\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0092"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u009e\n\16"+
		"\f\16\16\16\u00a1\13\16\3\16\3\16\3\16\3\16\5\16\u00a7\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\5\21\u00b9\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u00c0\n\22\f\22\16\22\u00c3"+
		"\13\22\3\23\3\23\3\23\5\23\u00c8\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u00d2\n\24\f\24\16\24\u00d5\13\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u00ec\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0112\n\25\f\25\16\25\u0115\13\25\3\25\2\4&(\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\3\3\2\13\16\2\u012b\2-\3\2\2\2\4;\3\2\2"+
		"\2\6=\3\2\2\2\bD\3\2\2\2\nG\3\2\2\2\f]\3\2\2\2\16i\3\2\2\2\20q\3\2\2\2"+
		"\22y\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\u0091\3\2\2\2\32\u0093\3\2\2\2"+
		"\34\u00aa\3\2\2\2\36\u00b0\3\2\2\2 \u00b5\3\2\2\2\"\u00bc\3\2\2\2$\u00c7"+
		"\3\2\2\2&\u00c9\3\2\2\2(\u00eb\3\2\2\2*,\7*\2\2+*\3\2\2\2,/\3\2\2\2-+"+
		"\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\64\5\4\3\2\61\63\5\4\3\2\62"+
		"\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66"+
		"\64\3\2\2\2\678\7\2\2\38\3\3\2\2\29<\5\n\6\2:<\5\b\5\2;9\3\2\2\2;:\3\2"+
		"\2\2<\5\3\2\2\2=A\7*\2\2>@\7*\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2B\7\3\2\2\2CA\3\2\2\2DE\5\26\f\2EF\5\6\4\2F\t\3\2\2\2GH\7\3\2\2HI"+
		"\7&\2\2IK\7\4\2\2JL\5\16\b\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MP\7\5\2\2N"+
		"O\7\6\2\2OQ\5\22\n\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\5\6\4\2ST\b\6\1\2"+
		"TU\5\f\7\2UV\7\7\2\2VW\7*\2\2W\13\3\2\2\2XY\5\26\f\2YZ\5\6\4\2Z\\\3\2"+
		"\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^f\3\2\2\2_]\3\2\2\2`a\5"+
		"\30\r\2ab\b\7\1\2bc\5\6\4\2ce\3\2\2\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg"+
		"\3\2\2\2g\r\3\2\2\2hf\3\2\2\2in\5\20\t\2jk\7\b\2\2km\5\20\t\2lj\3\2\2"+
		"\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\17\3\2\2\2pn\3\2\2\2qr\7&\2\2rs\7\6"+
		"\2\2st\5\22\n\2t\21\3\2\2\2uz\5\24\13\2vw\7\t\2\2wx\7\n\2\2xz\5\22\n\2"+
		"yu\3\2\2\2yv\3\2\2\2z\23\3\2\2\2{|\t\2\2\2|\25\3\2\2\2}~\7&\2\2~\177\7"+
		"\6\2\2\177\u0080\5\22\n\2\u0080\u0081\b\f\1\2\u0081\27\3\2\2\2\u0082\u0083"+
		"\5\32\16\2\u0083\u0084\b\r\1\2\u0084\u0092\3\2\2\2\u0085\u0086\5\34\17"+
		"\2\u0086\u0087\b\r\1\2\u0087\u0092\3\2\2\2\u0088\u0089\5\36\20\2\u0089"+
		"\u008a\b\r\1\2\u008a\u0092\3\2\2\2\u008b\u008c\5$\23\2\u008c\u008d\b\r"+
		"\1\2\u008d\u0092\3\2\2\2\u008e\u008f\5 \21\2\u008f\u0090\b\r\1\2\u0090"+
		"\u0092\3\2\2\2\u0091\u0082\3\2\2\2\u0091\u0085\3\2\2\2\u0091\u0088\3\2"+
		"\2\2\u0091\u008b\3\2\2\2\u0091\u008e\3\2\2\2\u0092\31\3\2\2\2\u0093\u0094"+
		"\7\17\2\2\u0094\u0095\5(\25\2\u0095\u0096\5\6\4\2\u0096\u009f\5\f\7\2"+
		"\u0097\u0098\7\20\2\2\u0098\u0099\7\17\2\2\u0099\u009a\5(\25\2\u009a\u009b"+
		"\5\6\4\2\u009b\u009c\5\f\7\2\u009c\u009e\3\2\2\2\u009d\u0097\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a6\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a4\5\6\4\2\u00a4"+
		"\u00a5\5\f\7\2\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\7\2\2\u00a9\33\3\2\2\2\u00aa\u00ab"+
		"\7\21\2\2\u00ab\u00ac\5(\25\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae\5\f\7\2"+
		"\u00ae\u00af\7\22\2\2\u00af\35\3\2\2\2\u00b0\u00b1\5&\24\2\u00b1\u00b2"+
		"\7\23\2\2\u00b2\u00b3\5(\25\2\u00b3\u00b4\b\20\1\2\u00b4\37\3\2\2\2\u00b5"+
		"\u00b6\7&\2\2\u00b6\u00b8\7\4\2\2\u00b7\u00b9\5\"\22\2\u00b8\u00b7\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\5\2\2\u00bb"+
		"!\3\2\2\2\u00bc\u00c1\5(\25\2\u00bd\u00be\7\b\2\2\u00be\u00c0\5(\25\2"+
		"\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2#\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\24\2\2\u00c5"+
		"\u00c8\5(\25\2\u00c6\u00c8\7\24\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c6\3"+
		"\2\2\2\u00c8%\3\2\2\2\u00c9\u00ca\b\24\1\2\u00ca\u00cb\7&\2\2\u00cb\u00d3"+
		"\3\2\2\2\u00cc\u00cd\f\3\2\2\u00cd\u00ce\7\t\2\2\u00ce\u00cf\5(\25\2\u00cf"+
		"\u00d0\7\n\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2\u00d5\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d7\b\25\1\2\u00d7\u00ec\7%\2\2\u00d8\u00ec\7\'\2\2\u00d9"+
		"\u00ec\7\"\2\2\u00da\u00ec\7#\2\2\u00db\u00ec\5&\24\2\u00dc\u00dd\7\25"+
		"\2\2\u00dd\u00de\7\t\2\2\u00de\u00df\5(\25\2\u00df\u00e0\7\n\2\2\u00e0"+
		"\u00e1\5\22\n\2\u00e1\u00ec\3\2\2\2\u00e2\u00e3\7\4\2\2\u00e3\u00e4\5"+
		"(\25\2\u00e4\u00e5\7\5\2\2\u00e5\u00ec\3\2\2\2\u00e6\u00ec\5 \21\2\u00e7"+
		"\u00e8\7!\2\2\u00e8\u00ec\5(\25\4\u00e9\u00ea\7\27\2\2\u00ea\u00ec\5("+
		"\25\3\u00eb\u00d6\3\2\2\2\u00eb\u00d8\3\2\2\2\u00eb\u00d9\3\2\2\2\u00eb"+
		"\u00da\3\2\2\2\u00eb\u00db\3\2\2\2\u00eb\u00dc\3\2\2\2\u00eb\u00e2\3\2"+
		"\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u0113\3\2\2\2\u00ed\u00ee\f\20\2\2\u00ee\u00ef\7\26\2\2\u00ef\u0112\5"+
		"(\25\21\u00f0\u00f1\f\17\2\2\u00f1\u00f2\7\27\2\2\u00f2\u0112\5(\25\20"+
		"\u00f3\u00f4\f\16\2\2\u00f4\u00f5\7\30\2\2\u00f5\u0112\5(\25\17\u00f6"+
		"\u00f7\f\r\2\2\u00f7\u00f8\7\31\2\2\u00f8\u0112\5(\25\16\u00f9\u00fa\f"+
		"\f\2\2\u00fa\u00fb\7\32\2\2\u00fb\u0112\5(\25\r\u00fc\u00fd\f\13\2\2\u00fd"+
		"\u00fe\7\33\2\2\u00fe\u0112\5(\25\f\u00ff\u0100\f\n\2\2\u0100\u0101\7"+
		"\34\2\2\u0101\u0112\5(\25\13\u0102\u0103\f\t\2\2\u0103\u0104\7\35\2\2"+
		"\u0104\u0112\5(\25\n\u0105\u0106\f\b\2\2\u0106\u0107\7\23\2\2\u0107\u0112"+
		"\5(\25\t\u0108\u0109\f\7\2\2\u0109\u010a\7\36\2\2\u010a\u0112\5(\25\b"+
		"\u010b\u010c\f\6\2\2\u010c\u010d\7\37\2\2\u010d\u0112\5(\25\7\u010e\u010f"+
		"\f\5\2\2\u010f\u0110\7 \2\2\u0110\u0112\5(\25\6\u0111\u00ed\3\2\2\2\u0111"+
		"\u00f0\3\2\2\2\u0111\u00f3\3\2\2\2\u0111\u00f6\3\2\2\2\u0111\u00f9\3\2"+
		"\2\2\u0111\u00fc\3\2\2\2\u0111\u00ff\3\2\2\2\u0111\u0102\3\2\2\2\u0111"+
		"\u0105\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010e\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		")\3\2\2\2\u0115\u0113\3\2\2\2\26-\64;AKP]fny\u0091\u009f\u00a6\u00b8\u00c1"+
		"\u00c7\u00d3\u00eb\u0111\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}