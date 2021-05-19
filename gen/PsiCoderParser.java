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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		ESPACIADO=53, COMENTARIO_LINEA=54, COMENTARIO_BLOQUE=55, ID=56, ENTERO=57, 
		REAL=58, CARACTER=59, CADENA=60;
	public static final int
		RULE_s = 0, RULE_funcion = 1, RULE_param_funcion = 2, RULE_estructura = 3, 
		RULE_atributo = 4, RULE_principal = 5, RULE_sentencia = 6, RULE_imprimir = 7, 
		RULE_caso = 8, RULE_tipo = 9, RULE_dec_variable = 10, RULE_asignacion = 11, 
		RULE_expresion = 12, RULE_operador = 13, RULE_valor = 14, RULE_numero_palabra = 15, 
		RULE_idcall = 16, RULE_call = 17, RULE_idestructura = 18, RULE_id = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "funcion", "param_funcion", "estructura", "atributo", "principal", 
			"sentencia", "imprimir", "caso", "tipo", "dec_variable", "asignacion", 
			"expresion", "operador", "valor", "numero_palabra", "idcall", "call", 
			"idestructura", "id"
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
			"'%'", "'/'", "'!'", "'verdadero'", "'falso'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ESPACIADO", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", 
			"ID", "ENTERO", "REAL", "CARACTER", "CADENA"
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
			principal();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__6) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(48);
					funcion();
					}
					break;
				case T__6:
					{
					setState(49);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
			setState(57);
			match(T__0);
			setState(58);
			tipo();
			setState(59);
			match(ID);
			setState(60);
			match(T__1);
			setState(61);
			param_funcion();
			setState(62);
			match(T__2);
			setState(63);
			match(T__3);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
				{
				{
				setState(64);
				sentencia();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
				{
				setState(72);
				tipo();
				setState(73);
				match(ID);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(74);
					match(T__5);
					setState(75);
					tipo();
					setState(76);
					match(ID);
					}
					}
					setState(82);
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
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
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
			setState(85);
			match(T__6);
			setState(86);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
				{
				{
				setState(87);
				atributo();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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

	public static class AtributoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_variableContext dec_variable() {
			return getRuleContext(Dec_variableContext.class,0);
		}
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			tipo();
			setState(96);
			dec_variable();
			setState(97);
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
			setState(99);
			match(T__9);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				sentencia();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0) );
			setState(105);
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
		public IdcallContext idcall() {
			return getRuleContext(IdcallContext.class,0);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__11);
				setState(108);
				match(T__1);
				setState(109);
				expresion();
				setState(110);
				match(T__2);
				setState(111);
				match(T__12);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(112);
					sentencia();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(118);
					match(T__13);
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
						{
						{
						setState(119);
						sentencia();
						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(127);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__15);
				setState(130);
				match(T__1);
				setState(131);
				expresion();
				setState(132);
				match(T__2);
				setState(133);
				match(T__16);
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					caso();
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__27 || _la==T__29 );
				setState(139);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(T__18);
				setState(142);
				match(T__1);
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(143);
					tipo();
					}
					break;
				}
				setState(146);
				id();
				setState(147);
				match(T__19);
				setState(148);
				expresion();
				setState(149);
				match(T__8);
				setState(150);
				expresion();
				setState(151);
				match(T__8);
				setState(152);
				expresion();
				setState(153);
				match(T__2);
				setState(154);
				match(T__3);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(155);
					sentencia();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(T__3);
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(164);
						sentencia();
						}
						} 
					}
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(170);
				match(T__21);
				setState(171);
				match(T__1);
				setState(172);
				expresion();
				setState(173);
				match(T__2);
				setState(174);
				match(T__8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				match(T__21);
				setState(177);
				match(T__1);
				setState(178);
				expresion();
				setState(179);
				match(T__2);
				setState(180);
				match(T__3);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(181);
					sentencia();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(T__22);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(T__23);
				setState(190);
				match(T__1);
				setState(191);
				id();
				setState(192);
				match(T__2);
				setState(193);
				match(T__8);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				imprimir();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(196);
				match(T__24);
				setState(197);
				expresion();
				setState(198);
				match(T__8);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				tipo();
				setState(201);
				id();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(202);
					match(T__19);
					setState(203);
					expresion();
					}
				}

				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(206);
					match(T__5);
					setState(207);
					id();
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__19) {
						{
						setState(208);
						match(T__19);
						setState(209);
						expresion();
						}
					}

					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(T__8);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(219);
				id();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(220);
					match(T__19);
					setState(221);
					expresion();
					}
				}

				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(224);
					match(T__5);
					setState(225);
					id();
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__19) {
						{
						setState(226);
						match(T__19);
						setState(227);
						expresion();
						}
					}

					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(T__8);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(237);
				match(T__25);
				setState(238);
				match(T__8);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(239);
				idcall();
				setState(240);
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
			setState(244);
			match(T__26);
			setState(245);
			match(T__1);
			setState(246);
			expresion();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(247);
				match(T__5);
				setState(248);
				expresion();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(T__2);
			setState(255);
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
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(T__27);
				setState(258);
				expresion();
				setState(259);
				match(T__28);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(260);
					sentencia();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(T__29);
				setState(267);
				match(T__28);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
					{
					{
					setState(268);
					sentencia();
					}
					}
					setState(273);
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
		public List<TerminalNode> ID() { return getTokens(PsiCoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsiCoderParser.ID, i);
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
			int _alt;
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(ID);
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(277);
						matchWildcard();
						setState(278);
						match(ID);
						}
						} 
					}
					setState(283);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 6);
				{
				setState(288);
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

	public static class Dec_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<Dec_variableContext> dec_variable() {
			return getRuleContexts(Dec_variableContext.class);
		}
		public Dec_variableContext dec_variable(int i) {
			return getRuleContext(Dec_variableContext.class,i);
		}
		public Dec_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterDec_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitDec_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitDec_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_variableContext dec_variable() throws RecognitionException {
		Dec_variableContext _localctx = new Dec_variableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dec_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ID);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(292);
				asignacion();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					match(T__5);
					setState(299);
					dec_variable();
					}
					} 
				}
				setState(304);
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
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__19);
			setState(306);
			expresion();
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
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
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
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expresion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			valor();
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					operador();
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315);
					expresion();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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

	public static class ValorContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public IdcallContext idcall() {
			return getRuleContext(IdcallContext.class,0);
		}
		public Numero_palabraContext numero_palabra() {
			return getRuleContext(Numero_palabraContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valor);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(T__1);
				setState(324);
				expresion();
				setState(325);
				match(T__2);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(T__44);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				match(T__50);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(331);
				idcall();
				}
				break;
			case ENTERO:
			case REAL:
			case CARACTER:
			case CADENA:
				enterOuterAlt(_localctx, 7);
				{
				setState(332);
				numero_palabra();
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

	public static class Numero_palabraContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(PsiCoderParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(PsiCoderParser.REAL, 0); }
		public TerminalNode CARACTER() { return getToken(PsiCoderParser.CARACTER, 0); }
		public TerminalNode CADENA() { return getToken(PsiCoderParser.CADENA, 0); }
		public Numero_palabraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_palabra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterNumero_palabra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitNumero_palabra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitNumero_palabra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_palabraContext numero_palabra() throws RecognitionException {
		Numero_palabraContext _localctx = new Numero_palabraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numero_palabra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA))) != 0)) ) {
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

	public static class IdcallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsiCoderParser.ID, 0); }
		public IdestructuraContext idestructura() {
			return getRuleContext(IdestructuraContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public IdcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterIdcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitIdcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitIdcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdcallContext idcall() throws RecognitionException {
		IdcallContext _localctx = new IdcallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ID);
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(338);
				idestructura();
				}
				break;
			case 2:
				{
				setState(339);
				call();
				}
				break;
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

	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PsiCoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsiCoderParser.ID, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsiCoderListener ) ((PsiCoderListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsiCoderVisitor ) return ((PsiCoderVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__1);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(343);
				match(ID);
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(344);
						matchWildcard();
						setState(345);
						match(ID);
						}
						} 
					}
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(351);
					match(T__5);
					setState(352);
					match(ID);
					setState(357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(353);
							matchWildcard();
							setState(354);
							match(ID);
							}
							} 
						}
						setState(359);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
					}
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(367);
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
		enterRule(_localctx, 36, RULE_idestructura);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__51);
			setState(370);
			match(ID);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(371);
					match(T__51);
					setState(372);
					idestructura();
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 38, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(ID);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__51) {
				{
				{
				setState(379);
				match(T__51);
				setState(380);
				match(ID);
				}
				}
				setState(385);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0185\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f"+
		"\4\16\4T\13\4\5\4V\n\4\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\6\7h\n\7\r\7\16\7i\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bt\n\b\f\b\16\bw\13\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\5\b\u0080\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u008a\n\b\r\b\16\b\u008b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u0093\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u009f\n\b\f\b\16\b\u00a2\13\b\3\b\3\b\3\b\3\b\7\b\u00a8\n\b\f\b\16"+
		"\b\u00ab\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b9"+
		"\n\b\f\b\16\b\u00bc\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cf\n\b\3\b\3\b\3\b\3\b\5\b\u00d5\n\b\7\b"+
		"\u00d7\n\b\f\b\16\b\u00da\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e1\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00e7\n\b\7\b\u00e9\n\b\f\b\16\b\u00ec\13\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00f5\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00fc\n\t\f\t\16"+
		"\t\u00ff\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0108\n\n\f\n\16\n\u010b"+
		"\13\n\3\n\3\n\3\n\7\n\u0110\n\n\f\n\16\n\u0113\13\n\5\n\u0115\n\n\3\13"+
		"\3\13\3\13\7\13\u011a\n\13\f\13\16\13\u011d\13\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0124\n\13\3\f\3\f\7\f\u0128\n\f\f\f\16\f\u012b\13\f\3\f\3"+
		"\f\7\f\u012f\n\f\f\f\16\f\u0132\13\f\3\r\3\r\3\r\3\16\3\16\7\16\u0139"+
		"\n\16\f\16\16\16\u013c\13\16\3\16\7\16\u013f\n\16\f\16\16\16\u0142\13"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0150"+
		"\n\20\3\21\3\21\3\22\3\22\3\22\5\22\u0157\n\22\3\23\3\23\3\23\3\23\7\23"+
		"\u015d\n\23\f\23\16\23\u0160\13\23\3\23\3\23\3\23\3\23\7\23\u0166\n\23"+
		"\f\23\16\23\u0169\13\23\7\23\u016b\n\23\f\23\16\23\u016e\13\23\5\23\u0170"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0178\n\24\f\24\16\24\u017b\13"+
		"\24\3\25\3\25\3\25\7\25\u0180\n\25\f\25\16\25\u0183\13\25\3\25\2\2\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2&\62\3\2;>\2\u01ae"+
		"\2.\3\2\2\2\4;\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2\na\3\2\2\2\fe\3\2\2\2\16"+
		"\u00f4\3\2\2\2\20\u00f6\3\2\2\2\22\u0114\3\2\2\2\24\u0123\3\2\2\2\26\u0125"+
		"\3\2\2\2\30\u0133\3\2\2\2\32\u0136\3\2\2\2\34\u0143\3\2\2\2\36\u014f\3"+
		"\2\2\2 \u0151\3\2\2\2\"\u0153\3\2\2\2$\u0158\3\2\2\2&\u0173\3\2\2\2(\u017c"+
		"\3\2\2\2*-\5\4\3\2+-\5\b\5\2,*\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2"+
		"./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\66\5\f\7\2\62\65\5\4\3\2\63\65\5"+
		"\b\5\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2"+
		"\2\2\679\3\2\2\28\66\3\2\2\29:\7\2\2\3:\3\3\2\2\2;<\7\3\2\2<=\5\24\13"+
		"\2=>\7:\2\2>?\7\4\2\2?@\5\6\4\2@A\7\5\2\2AE\7\6\2\2BD\5\16\b\2CB\3\2\2"+
		"\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\7\2\2I\5\3\2"+
		"\2\2JK\5\24\13\2KR\7:\2\2LM\7\b\2\2MN\5\24\13\2NO\7:\2\2OQ\3\2\2\2PL\3"+
		"\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UJ\3\2\2\2UV\3"+
		"\2\2\2V\7\3\2\2\2WX\7\t\2\2X\\\7:\2\2Y[\5\n\6\2ZY\3\2\2\2[^\3\2\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\n\2\2`\t\3\2\2\2ab\5\24"+
		"\13\2bc\5\26\f\2cd\7\13\2\2d\13\3\2\2\2eg\7\f\2\2fh\5\16\b\2gf\3\2\2\2"+
		"hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\r\2\2l\r\3\2\2\2mn\7\16\2"+
		"\2no\7\4\2\2op\5\32\16\2pq\7\5\2\2qu\7\17\2\2rt\5\16\b\2sr\3\2\2\2tw\3"+
		"\2\2\2us\3\2\2\2uv\3\2\2\2v\177\3\2\2\2wu\3\2\2\2x|\7\20\2\2y{\5\16\b"+
		"\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177"+
		"x\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\21\2\2\u0082"+
		"\u00f5\3\2\2\2\u0083\u0084\7\22\2\2\u0084\u0085\7\4\2\2\u0085\u0086\5"+
		"\32\16\2\u0086\u0087\7\5\2\2\u0087\u0089\7\23\2\2\u0088\u008a\5\22\n\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\24\2\2\u008e\u00f5\3\2\2\2"+
		"\u008f\u0090\7\25\2\2\u0090\u0092\7\4\2\2\u0091\u0093\5\24\13\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5("+
		"\25\2\u0095\u0096\7\26\2\2\u0096\u0097\5\32\16\2\u0097\u0098\7\13\2\2"+
		"\u0098\u0099\5\32\16\2\u0099\u009a\7\13\2\2\u009a\u009b\5\32\16\2\u009b"+
		"\u009c\7\5\2\2\u009c\u00a0\7\6\2\2\u009d\u009f\5\16\b\2\u009e\u009d\3"+
		"\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00f5\3"+
		"\2\2\2\u00a5\u00a9\7\6\2\2\u00a6\u00a8\5\16\b\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\30\2\2\u00ad\u00ae\7\4\2\2\u00ae"+
		"\u00af\5\32\16\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\7\13\2\2\u00b1\u00f5"+
		"\3\2\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5\5\32\16"+
		"\2\u00b5\u00b6\7\5\2\2\u00b6\u00ba\7\6\2\2\u00b7\u00b9\5\16\b\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\31\2\2\u00be"+
		"\u00f5\3\2\2\2\u00bf\u00c0\7\32\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\5"+
		"(\25\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\7\13\2\2\u00c4\u00f5\3\2\2\2\u00c5"+
		"\u00f5\5\20\t\2\u00c6\u00c7\7\33\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9"+
		"\7\13\2\2\u00c9\u00f5\3\2\2\2\u00ca\u00cb\5\24\13\2\u00cb\u00ce\5(\25"+
		"\2\u00cc\u00cd\7\26\2\2\u00cd\u00cf\5\32\16\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d8\3\2\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d4\5("+
		"\25\2\u00d2\u00d3\7\26\2\2\u00d3\u00d5\5\32\16\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dc\7\13\2\2\u00dc\u00f5\3\2\2\2\u00dd\u00e0\5"+
		"(\25\2\u00de\u00df\7\26\2\2\u00df\u00e1\5\32\16\2\u00e0\u00de\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00ea\3\2\2\2\u00e2\u00e3\7\b\2\2\u00e3\u00e6"+
		"\5(\25\2\u00e4\u00e5\7\26\2\2\u00e5\u00e7\5\32\16\2\u00e6\u00e4\3\2\2"+
		"\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00f5\3\2\2\2\u00ef\u00f0\7"+
		"\34\2\2\u00f0\u00f5\7\13\2\2\u00f1\u00f2\5\"\22\2\u00f2\u00f3\7\13\2\2"+
		"\u00f3\u00f5\3\2\2\2\u00f4m\3\2\2\2\u00f4\u0083\3\2\2\2\u00f4\u008f\3"+
		"\2\2\2\u00f4\u00a5\3\2\2\2\u00f4\u00b2\3\2\2\2\u00f4\u00bf\3\2\2\2\u00f4"+
		"\u00c5\3\2\2\2\u00f4\u00c6\3\2\2\2\u00f4\u00ca\3\2\2\2\u00f4\u00dd\3\2"+
		"\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\17\3\2\2\2\u00f6\u00f7"+
		"\7\35\2\2\u00f7\u00f8\7\4\2\2\u00f8\u00fd\5\32\16\2\u00f9\u00fa\7\b\2"+
		"\2\u00fa\u00fc\5\32\16\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0101\7\5\2\2\u0101\u0102\7\13\2\2\u0102\21\3\2\2\2\u0103\u0104"+
		"\7\36\2\2\u0104\u0105\5\32\16\2\u0105\u0109\7\37\2\2\u0106\u0108\5\16"+
		"\b\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0115\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7 "+
		"\2\2\u010d\u0111\7\37\2\2\u010e\u0110\5\16\b\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0114\u0103\3\2\2\2\u0114\u010c\3\2\2\2\u0115"+
		"\23\3\2\2\2\u0116\u011b\7:\2\2\u0117\u0118\13\2\2\2\u0118\u011a\7:\2\2"+
		"\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u0124\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0124\7!\2\2\u011f"+
		"\u0124\7\"\2\2\u0120\u0124\7#\2\2\u0121\u0124\7$\2\2\u0122\u0124\7%\2"+
		"\2\u0123\u0116\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\25\3\2\2\2\u0125"+
		"\u0129\7:\2\2\u0126\u0128\5\30\r\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0130\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\7\b\2\2\u012d\u012f\5\26\f\2\u012e\u012c\3"+
		"\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\27\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\26\2\2\u0134\u0135\5\32"+
		"\16\2\u0135\31\3\2\2\2\u0136\u013a\5\36\20\2\u0137\u0139\5\34\17\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u0140\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013f\5\32\16\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\33\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\t\2\2\2\u0144\35"+
		"\3\2\2\2\u0145\u0146\7\4\2\2\u0146\u0147\5\32\16\2\u0147\u0148\7\5\2\2"+
		"\u0148\u0150\3\2\2\2\u0149\u0150\7/\2\2\u014a\u0150\7\63\2\2\u014b\u0150"+
		"\7\64\2\2\u014c\u0150\7\65\2\2\u014d\u0150\5\"\22\2\u014e\u0150\5 \21"+
		"\2\u014f\u0145\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b"+
		"\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\37\3\2\2\2\u0151\u0152\t\3\2\2\u0152!\3\2\2\2\u0153\u0156\7:\2\2\u0154"+
		"\u0157\5&\24\2\u0155\u0157\5$\23\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157#\3\2\2\2\u0158\u016f\7\4\2\2\u0159\u015e"+
		"\7:\2\2\u015a\u015b\13\2\2\2\u015b\u015d\7:\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u016c\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\b\2\2\u0162\u0167\7:\2\2\u0163"+
		"\u0164\13\2\2\2\u0164\u0166\7:\2\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u016a\u0161\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0159\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7\5"+
		"\2\2\u0172%\3\2\2\2\u0173\u0174\7\66\2\2\u0174\u0179\7:\2\2\u0175\u0176"+
		"\7\66\2\2\u0176\u0178\5&\24\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2"+
		"\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\'\3\2\2\2\u017b\u0179\3"+
		"\2\2\2\u017c\u0181\7:\2\2\u017d\u017e\7\66\2\2\u017e\u0180\7:\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182)\3\2\2\2\u0183\u0181\3\2\2\2,,.\64\66ERU\\iu|\177\u008b\u0092"+
		"\u00a0\u00a9\u00ba\u00ce\u00d4\u00d8\u00e0\u00e6\u00ea\u00f4\u00fd\u0109"+
		"\u0111\u0114\u011b\u0123\u0129\u0130\u013a\u0140\u014f\u0156\u015e\u0167"+
		"\u016c\u016f\u0179\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}