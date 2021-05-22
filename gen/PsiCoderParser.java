// Generated from /home/ricardo/Documents/Proyectos/PsiCoderTranslater/grammar/PsiCoder.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsiCoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, ESPACIADO=51, COMENTARIO_LINEA=52, 
		COMENTARIO_BLOQUE=53, BOOLEANO=54, ID=55, ENTERO=56, REAL=57, CARACTER=58, 
		CADENA=59;
	public static final int
		RULE_s = 0, RULE_funcion = 1, RULE_param_funcion = 2, RULE_estructura = 3, 
		RULE_sentencia_estructura = 4, RULE_principal = 5, RULE_sentencia = 6, 
		RULE_imprimir = 7, RULE_caso = 8, RULE_tipo = 9, RULE_expresion = 10, 
		RULE_llamado_funcion = 11, RULE_operador_binario = 12, RULE_operador_unitario = 13, 
		RULE_idestructura = 14, RULE_id = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "funcion", "param_funcion", "estructura", "sentencia_estructura", 
			"principal", "sentencia", "imprimir", "caso", "tipo", "expresion", "llamado_funcion", 
			"operador_binario", "operador_unitario", "idestructura", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'('", "')'", "'hacer'", "'fin_funcion'", "','", "'estructura'", 
			"'fin_estructura'", "';'", "'funcion_principal'", "'fin_principal'", 
			"'si'", "'entonces'", "'si_no'", "'fin_si'", "'seleccionar'", "'entre'", 
			"'fin_seleccionar'", "'para'", "'='", "'fin_para'", "'mientras'", "'fin_mientras'", 
			"'leer'", "'retorno'", "'romper'", "'imprimir'", "'caso'", "':'", "'defecto'", 
			"'entero'", "'booleano'", "'caracter'", "'real'", "'cadena'", "'&&'", 
			"'||'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", 
			"'%'", "'/'", "'!'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ESPACIADO", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", 
			"BOOLEANO", "ID", "ENTERO", "REAL", "CARACTER", "CADENA"
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
	public String getGrammarFileName() { return "PsiCoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PsiCoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PsiCoderParser.EOF, 0); }
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public List<EstructuraContext> estructura() {
			return getRuleContexts(EstructuraContext.class);
		}
		public EstructuraContext estructura(int i) {
			return getRuleContext(EstructuraContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__6) {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(32);
					funcion();
					}
					break;
				case T__6:
					{
					setState(33);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			principal();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__6) {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(40);
					funcion();
					}
					break;
				case T__6:
					{
					setState(41);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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

	public static class FuncionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public Param_funcionContext param_funcion() {
			return getRuleContext(Param_funcionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			tipo();
			setState(51);
			match(ID);
			setState(52);
			match(T__1);
			setState(53);
			param_funcion();
			setState(54);
			match(T__2);
			setState(55);
			match(T__3);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
				{
				{
				setState(56);
				sentencia();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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

	public static class Param_funcionContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PsiCoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsiCoderParser.ID, i);
		}
		public Param_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterParam_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitParam_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitParam_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_funcionContext param_funcion() throws RecognitionException {
		Param_funcionContext _localctx = new Param_funcionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
				{
				setState(64);
				tipo();
				setState(65);
				match(ID);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(66);
					match(T__5);
					setState(67);
					tipo();
					setState(68);
					match(ID);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class EstructuraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public List<Sentencia_estructuraContext> sentencia_estructura() {
			return getRuleContexts(Sentencia_estructuraContext.class);
		}
		public Sentencia_estructuraContext sentencia_estructura(int i) {
			return getRuleContext(Sentencia_estructuraContext.class,i);
		}
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__6);
			setState(78);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
				{
				{
				setState(79);
				sentencia_estructura();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__7);
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

	public static class Sentencia_estructuraContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PsiCoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsiCoderParser.ID, i);
		}
		public Sentencia_estructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterSentencia_estructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitSentencia_estructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitSentencia_estructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_estructuraContext sentencia_estructura() throws RecognitionException {
		Sentencia_estructuraContext _localctx = new Sentencia_estructuraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			tipo();
			setState(88);
			match(ID);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(89);
				match(T__5);
				setState(90);
				match(ID);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__8);
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

	public static class PrincipalContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__9);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				sentencia();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0) );
			setState(104);
			match(T__10);
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

	public static class SentenciaContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencia);
		int _la;
		try {
			int _alt;
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__11);
				setState(107);
				match(T__1);
				setState(108);
				expresion(0);
				setState(109);
				match(T__2);
				setState(110);
				match(T__12);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(111);
					sentencia();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(117);
					match(T__13);
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
						{
						{
						setState(118);
						sentencia();
						}
						}
						setState(123);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(126);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__15);
				setState(129);
				match(T__1);
				setState(130);
				expresion(0);
				setState(131);
				match(T__2);
				setState(132);
				match(T__16);
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133);
					caso();
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__27 || _la==T__29 );
				setState(138);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__18);
				setState(141);
				match(T__1);
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(142);
					tipo();
					}
					break;
				}
				setState(145);
				id();
				setState(146);
				match(T__19);
				setState(147);
				expresion(0);
				setState(148);
				match(T__8);
				setState(149);
				expresion(0);
				setState(150);
				match(T__8);
				setState(151);
				expresion(0);
				setState(152);
				match(T__2);
				setState(153);
				match(T__3);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(154);
					sentencia();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(T__3);
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(163);
						sentencia();
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(169);
				match(T__21);
				setState(170);
				match(T__1);
				setState(171);
				expresion(0);
				setState(172);
				match(T__2);
				setState(173);
				match(T__8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(T__21);
				setState(176);
				match(T__1);
				setState(177);
				expresion(0);
				setState(178);
				match(T__2);
				setState(179);
				match(T__3);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(180);
					sentencia();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(T__22);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(T__23);
				setState(189);
				match(T__1);
				setState(190);
				id();
				setState(191);
				match(T__2);
				setState(192);
				match(T__8);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				imprimir();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
				match(T__24);
				setState(196);
				expresion(0);
				setState(197);
				match(T__8);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				tipo();
				setState(200);
				id();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(201);
					match(T__19);
					setState(202);
					expresion(0);
					}
				}

				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(205);
					match(T__5);
					setState(206);
					id();
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__19) {
						{
						setState(207);
						match(T__19);
						setState(208);
						expresion(0);
						}
					}

					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(T__8);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(218);
				id();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(219);
					match(T__19);
					setState(220);
					expresion(0);
					}
				}

				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(223);
					match(T__5);
					setState(224);
					id();
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__19) {
						{
						setState(225);
						match(T__19);
						setState(226);
						expresion(0);
						}
					}

					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(T__8);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(236);
				match(T__25);
				setState(237);
				match(T__8);
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

	public static class ImprimirContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__26);
			setState(241);
			match(T__1);
			setState(242);
			expresion(0);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(243);
				match(T__5);
				setState(244);
				expresion(0);
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(T__2);
			setState(251);
			match(T__8);
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

	public static class CasoContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_caso);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__27);
				setState(254);
				expresion(0);
				setState(255);
				match(T__28);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(256);
					sentencia();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__29);
				setState(263);
				match(T__28);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(264);
					sentencia();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TipoContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				id();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				match(T__34);
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(PsiCoderParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(PsiCoderParser.REAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(PsiCoderParser.BOOLEANO, 0); }
		public TerminalNode CADENA() { return getToken(PsiCoderParser.CADENA, 0); }
		public TerminalNode CARACTER() { return getToken(PsiCoderParser.CARACTER, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Llamado_funcionContext llamado_funcion() {
			return getRuleContext(Llamado_funcionContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Operador_unitarioContext operador_unitario() {
			return getRuleContext(Operador_unitarioContext.class,0);
		}
		public Operador_binarioContext operador_binario() {
			return getRuleContext(Operador_binarioContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(281);
				match(ENTERO);
				}
				break;
			case 2:
				{
				setState(282);
				match(REAL);
				}
				break;
			case 3:
				{
				setState(283);
				match(BOOLEANO);
				}
				break;
			case 4:
				{
				setState(284);
				match(CADENA);
				}
				break;
			case 5:
				{
				setState(285);
				match(CARACTER);
				}
				break;
			case 6:
				{
				setState(286);
				id();
				}
				break;
			case 7:
				{
				setState(287);
				llamado_funcion();
				}
				break;
			case 8:
				{
				setState(288);
				match(T__1);
				setState(289);
				expresion(0);
				setState(290);
				match(T__2);
				}
				break;
			case 9:
				{
				setState(292);
				operador_unitario();
				setState(293);
				expresion(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(297);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(298);
					operador_binario();
					setState(299);
					expresion(3);
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Llamado_funcionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Llamado_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamado_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterLlamado_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitLlamado_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitLlamado_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamado_funcionContext llamado_funcion() throws RecognitionException {
		Llamado_funcionContext _localctx = new Llamado_funcionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_llamado_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			id();
			setState(307);
			match(T__1);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__44) | (1L << T__48) | (1L << BOOLEANO) | (1L << ID) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA))) != 0)) {
				{
				setState(308);
				expresion(0);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(309);
					match(T__5);
					setState(310);
					expresion(0);
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(318);
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

	public static class Operador_binarioContext extends ParserRuleContext {
		public Operador_binarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_binario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterOperador_binario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitOperador_binario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitOperador_binario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_binarioContext operador_binario() throws RecognitionException {
		Operador_binarioContext _localctx = new Operador_binarioContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operador_binario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
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

	public static class Operador_unitarioContext extends ParserRuleContext {
		public Operador_unitarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_unitario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterOperador_unitario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitOperador_unitario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitOperador_unitario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_unitarioContext operador_unitario() throws RecognitionException {
		Operador_unitarioContext _localctx = new Operador_unitarioContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operador_unitario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__48) ) {
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

	public static class IdestructuraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public List<IdestructuraContext> idestructura() {
			return getRuleContexts(IdestructuraContext.class);
		}
		public IdestructuraContext idestructura(int i) {
			return getRuleContext(IdestructuraContext.class,i);
		}
		public IdestructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idestructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterIdestructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitIdestructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitIdestructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdestructuraContext idestructura() throws RecognitionException {
		IdestructuraContext _localctx = new IdestructuraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_idestructura);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__49);
			setState(325);
			match(ID);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					match(T__49);
					setState(327);
					idestructura();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PsiCoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsiCoderParser.ID, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ID);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(334);
					match(T__49);
					setState(335);
					match(ID);
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\5\4N\n\4\3\5\3\5\3\5\7\5S\n\5"+
		"\f\5\16\5V\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\3"+
		"\6\3\7\3\7\6\7g\n\7\r\7\16\7h\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bs\n\b"+
		"\f\b\16\bv\13\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\5\b\177\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\6\b\u0089\n\b\r\b\16\b\u008a\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0092\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009e\n\b"+
		"\f\b\16\b\u00a1\13\b\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b8\n\b\f\b\16"+
		"\b\u00bb\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00ce\n\b\3\b\3\b\3\b\3\b\5\b\u00d4\n\b\7\b\u00d6\n\b"+
		"\f\b\16\b\u00d9\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e0\n\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00e6\n\b\7\b\u00e8\n\b\f\b\16\b\u00eb\13\b\3\b\3\b\3\b\3\b\5\b\u00f1"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00f8\n\t\f\t\16\t\u00fb\13\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\7\n\u0104\n\n\f\n\16\n\u0107\13\n\3\n\3\n\3\n\7\n\u010c"+
		"\n\n\f\n\16\n\u010f\13\n\5\n\u0111\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0119\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u012a\n\f\3\f\3\f\3\f\3\f\7\f\u0130\n\f\f\f\16\f\u0133\13\f\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u013a\n\r\f\r\16\r\u013d\13\r\5\r\u013f\n\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u014b\n\20\f\20\16\20"+
		"\u014e\13\20\3\21\3\21\3\21\7\21\u0153\n\21\f\21\16\21\u0156\13\21\3\21"+
		"\2\3\26\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2&\62\4\2//\63"+
		"\63\2\u017f\2&\3\2\2\2\4\63\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\nY\3\2\2\2\f"+
		"d\3\2\2\2\16\u00f0\3\2\2\2\20\u00f2\3\2\2\2\22\u0110\3\2\2\2\24\u0118"+
		"\3\2\2\2\26\u0129\3\2\2\2\30\u0134\3\2\2\2\32\u0142\3\2\2\2\34\u0144\3"+
		"\2\2\2\36\u0146\3\2\2\2 \u014f\3\2\2\2\"%\5\4\3\2#%\5\b\5\2$\"\3\2\2\2"+
		"$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2).\5\f\7"+
		"\2*-\5\4\3\2+-\5\b\5\2,*\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2"+
		"\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\2\2\3\62\3\3\2\2\2\63\64\7\3\2\2"+
		"\64\65\5\24\13\2\65\66\79\2\2\66\67\7\4\2\2\678\5\6\4\289\7\5\2\29=\7"+
		"\6\2\2:<\5\16\b\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?="+
		"\3\2\2\2@A\7\7\2\2A\5\3\2\2\2BC\5\24\13\2CJ\79\2\2DE\7\b\2\2EF\5\24\13"+
		"\2FG\79\2\2GI\3\2\2\2HD\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2"+
		"\2LJ\3\2\2\2MB\3\2\2\2MN\3\2\2\2N\7\3\2\2\2OP\7\t\2\2PT\79\2\2QS\5\n\6"+
		"\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\n\2"+
		"\2X\t\3\2\2\2YZ\5\24\13\2Z_\79\2\2[\\\7\b\2\2\\^\79\2\2][\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\13\2\2c\13\3\2\2\2"+
		"df\7\f\2\2eg\5\16\b\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2"+
		"\2jk\7\r\2\2k\r\3\2\2\2lm\7\16\2\2mn\7\4\2\2no\5\26\f\2op\7\5\2\2pt\7"+
		"\17\2\2qs\5\16\b\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u~\3\2\2\2v"+
		"t\3\2\2\2w{\7\20\2\2xz\5\16\b\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|\177\3\2\2\2}{\3\2\2\2~w\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\7\21\2\2\u0081\u00f1\3\2\2\2\u0082\u0083\7\22\2\2\u0083\u0084\7"+
		"\4\2\2\u0084\u0085\5\26\f\2\u0085\u0086\7\5\2\2\u0086\u0088\7\23\2\2\u0087"+
		"\u0089\5\22\n\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\24\2\2\u008d"+
		"\u00f1\3\2\2\2\u008e\u008f\7\25\2\2\u008f\u0091\7\4\2\2\u0090\u0092\5"+
		"\24\13\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\5 \21\2\u0094\u0095\7\26\2\2\u0095\u0096\5\26\f\2\u0096\u0097\7"+
		"\13\2\2\u0097\u0098\5\26\f\2\u0098\u0099\7\13\2\2\u0099\u009a\5\26\f\2"+
		"\u009a\u009b\7\5\2\2\u009b\u009f\7\6\2\2\u009c\u009e\5\16\b\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00f1\3"+
		"\2\2\2\u00a4\u00a8\7\6\2\2\u00a5\u00a7\5\16\b\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\7\4\2\2\u00ad"+
		"\u00ae\5\26\f\2\u00ae\u00af\7\5\2\2\u00af\u00b0\7\13\2\2\u00b0\u00f1\3"+
		"\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\5\26\f\2\u00b4"+
		"\u00b5\7\5\2\2\u00b5\u00b9\7\6\2\2\u00b6\u00b8\5\16\b\2\u00b7\u00b6\3"+
		"\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\31\2\2\u00bd\u00f1\3"+
		"\2\2\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1\5 \21\2\u00c1"+
		"\u00c2\7\5\2\2\u00c2\u00c3\7\13\2\2\u00c3\u00f1\3\2\2\2\u00c4\u00f1\5"+
		"\20\t\2\u00c5\u00c6\7\33\2\2\u00c6\u00c7\5\26\f\2\u00c7\u00c8\7\13\2\2"+
		"\u00c8\u00f1\3\2\2\2\u00c9\u00ca\5\24\13\2\u00ca\u00cd\5 \21\2\u00cb\u00cc"+
		"\7\26\2\2\u00cc\u00ce\5\26\f\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2"+
		"\u00ce\u00d7\3\2\2\2\u00cf\u00d0\7\b\2\2\u00d0\u00d3\5 \21\2\u00d1\u00d2"+
		"\7\26\2\2\u00d2\u00d4\5\26\f\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d6\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\7\13\2\2\u00db\u00f1\3\2\2\2\u00dc\u00df\5 \21\2\u00dd\u00de\7"+
		"\26\2\2\u00de\u00e0\5\26\f\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e9\3\2\2\2\u00e1\u00e2\7\b\2\2\u00e2\u00e5\5 \21\2\u00e3\u00e4\7\26"+
		"\2\2\u00e4\u00e6\5\26\f\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ed\7\13\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00ef\7\34\2\2\u00ef\u00f1\7"+
		"\13\2\2\u00f0l\3\2\2\2\u00f0\u0082\3\2\2\2\u00f0\u008e\3\2\2\2\u00f0\u00a4"+
		"\3\2\2\2\u00f0\u00b1\3\2\2\2\u00f0\u00be\3\2\2\2\u00f0\u00c4\3\2\2\2\u00f0"+
		"\u00c5\3\2\2\2\u00f0\u00c9\3\2\2\2\u00f0\u00dc\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\17\3\2\2\2\u00f2\u00f3\7\35\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f9"+
		"\5\26\f\2\u00f5\u00f6\7\b\2\2\u00f6\u00f8\5\26\f\2\u00f7\u00f5\3\2\2\2"+
		"\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\5\2\2\u00fd\u00fe\7\13\2\2"+
		"\u00fe\21\3\2\2\2\u00ff\u0100\7\36\2\2\u0100\u0101\5\26\f\2\u0101\u0105"+
		"\7\37\2\2\u0102\u0104\5\16\b\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0111\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u0109\7 \2\2\u0109\u010d\7\37\2\2\u010a\u010c\5\16\b\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u00ff\3\2\2\2\u0110"+
		"\u0108\3\2\2\2\u0111\23\3\2\2\2\u0112\u0119\5 \21\2\u0113\u0119\7!\2\2"+
		"\u0114\u0119\7\"\2\2\u0115\u0119\7#\2\2\u0116\u0119\7$\2\2\u0117\u0119"+
		"\7%\2\2\u0118\u0112\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0118"+
		"\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\25\3\2\2"+
		"\2\u011a\u011b\b\f\1\2\u011b\u012a\7:\2\2\u011c\u012a\7;\2\2\u011d\u012a"+
		"\78\2\2\u011e\u012a\7=\2\2\u011f\u012a\7<\2\2\u0120\u012a\5 \21\2\u0121"+
		"\u012a\5\30\r\2\u0122\u0123\7\4\2\2\u0123\u0124\5\26\f\2\u0124\u0125\7"+
		"\5\2\2\u0125\u012a\3\2\2\2\u0126\u0127\5\34\17\2\u0127\u0128\5\26\f\3"+
		"\u0128\u012a\3\2\2\2\u0129\u011a\3\2\2\2\u0129\u011c\3\2\2\2\u0129\u011d"+
		"\3\2\2\2\u0129\u011e\3\2\2\2\u0129\u011f\3\2\2\2\u0129\u0120\3\2\2\2\u0129"+
		"\u0121\3\2\2\2\u0129\u0122\3\2\2\2\u0129\u0126\3\2\2\2\u012a\u0131\3\2"+
		"\2\2\u012b\u012c\f\4\2\2\u012c\u012d\5\32\16\2\u012d\u012e\5\26\f\5\u012e"+
		"\u0130\3\2\2\2\u012f\u012b\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\27\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135"+
		"\5 \21\2\u0135\u013e\7\4\2\2\u0136\u013b\5\26\f\2\u0137\u0138\7\b\2\2"+
		"\u0138\u013a\5\26\f\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0136\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\5"+
		"\2\2\u0141\31\3\2\2\2\u0142\u0143\t\2\2\2\u0143\33\3\2\2\2\u0144\u0145"+
		"\t\3\2\2\u0145\35\3\2\2\2\u0146\u0147\7\64\2\2\u0147\u014c\79\2\2\u0148"+
		"\u0149\7\64\2\2\u0149\u014b\5\36\20\2\u014a\u0148\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\37\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0154\79\2\2\u0150\u0151\7\64\2\2\u0151\u0153\79"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155!\3\2\2\2\u0156\u0154\3\2\2\2&$&,.=JMT_ht{~\u008a"+
		"\u0091\u009f\u00a8\u00b9\u00cd\u00d3\u00d7\u00df\u00e5\u00e9\u00f0\u00f9"+
		"\u0105\u010d\u0110\u0118\u0129\u0131\u013b\u013e\u014c\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}