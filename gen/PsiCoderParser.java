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
		T__45=46, T__46=47, T__47=48, ESPACIADO=49, COMENTARIO_LINEA=50, COMENTARIO_BLOQUE=51, 
		BOOLEANO=52, ID=53, ENTERO=54, REAL=55, CARACTER=56, CADENA=57;
	public static final int
		RULE_s = 0, RULE_funcion = 1, RULE_param_funcion = 2, RULE_principal = 3, 
		RULE_sentencia = 4, RULE_imprimir = 5, RULE_caso = 6, RULE_tipo = 7, RULE_expresion = 8, 
		RULE_llamado_funcion = 9, RULE_operador_binario = 10, RULE_operador_unitario = 11, 
		RULE_idestructura = 12, RULE_id = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "funcion", "param_funcion", "principal", "sentencia", "imprimir", 
			"caso", "tipo", "expresion", "llamado_funcion", "operador_binario", "operador_unitario", 
			"idestructura", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'funcion'", "'('", "')'", "'hacer'", "'fin_funcion'", "','", "'funcion_principal'", 
			"'fin_principal'", "'si'", "'entonces'", "'si_no'", "'fin_si'", "'seleccionar'", 
			"'entre'", "'fin_seleccionar'", "'para'", "'='", "';'", "'fin_para'", 
			"'mientras'", "'fin_mientras'", "'leer'", "'retorno'", "'romper'", "'imprimir'", 
			"'caso'", "':'", "'defecto'", "'entero'", "'booleano'", "'caracter'", 
			"'real'", "'cadena'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'<='", 
			"'>='", "'+'", "'-'", "'*'", "'%'", "'/'", "'!'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ESPACIADO", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "BOOLEANO", 
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(28);
				funcion();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			principal();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(35);
				funcion();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
			setState(43);
			match(T__0);
			setState(44);
			tipo();
			setState(45);
			match(ID);
			setState(46);
			match(T__1);
			setState(47);
			param_funcion();
			setState(48);
			match(T__2);
			setState(49);
			match(T__3);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				sentencia();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0)) {
				{
				setState(58);
				tipo();
				setState(59);
				match(ID);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(60);
					match(T__5);
					setState(61);
					tipo();
					setState(62);
					match(ID);
					}
					}
					setState(68);
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
		enterRule(_localctx, 6, RULE_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__6);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				sentencia();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0) );
			setState(77);
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
		enterRule(_localctx, 8, RULE_sentencia);
		int _la;
		try {
			int _alt;
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__8);
				setState(80);
				match(T__1);
				setState(81);
				expresion(0);
				setState(82);
				match(T__2);
				setState(83);
				match(T__9);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(84);
					sentencia();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(90);
					match(T__10);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0)) {
						{
						{
						setState(91);
						sentencia();
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(99);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__12);
				setState(102);
				match(T__1);
				setState(103);
				expresion(0);
				setState(104);
				match(T__2);
				setState(105);
				match(T__13);
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					caso();
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__25 || _la==T__27 );
				setState(111);
				match(T__14);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(T__15);
				setState(114);
				match(T__1);
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(115);
					tipo();
					}
					break;
				}
				setState(118);
				id();
				setState(119);
				match(T__16);
				setState(120);
				expresion(0);
				setState(121);
				match(T__17);
				setState(122);
				expresion(0);
				setState(123);
				match(T__17);
				setState(124);
				expresion(0);
				setState(125);
				match(T__2);
				setState(126);
				match(T__3);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(127);
					sentencia();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(T__18);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(T__3);
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(136);
						sentencia();
						}
						} 
					}
					setState(141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(142);
				match(T__19);
				setState(143);
				match(T__1);
				setState(144);
				expresion(0);
				setState(145);
				match(T__2);
				setState(146);
				match(T__17);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(T__19);
				setState(149);
				match(T__1);
				setState(150);
				expresion(0);
				setState(151);
				match(T__2);
				setState(152);
				match(T__3);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(153);
					sentencia();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__20);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(T__21);
				setState(162);
				match(T__1);
				setState(163);
				id();
				setState(164);
				match(T__2);
				setState(165);
				match(T__17);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				imprimir();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				match(T__22);
				setState(169);
				expresion(0);
				setState(170);
				match(T__17);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(172);
				tipo();
				setState(173);
				id();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(174);
					match(T__16);
					setState(175);
					expresion(0);
					}
				}

				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(178);
					match(T__5);
					setState(179);
					id();
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__16) {
						{
						setState(180);
						match(T__16);
						setState(181);
						expresion(0);
						}
					}

					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__17);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(191);
				id();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(192);
					match(T__16);
					setState(193);
					expresion(0);
					}
				}

				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(196);
					match(T__5);
					setState(197);
					id();
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__16) {
						{
						setState(198);
						match(T__16);
						setState(199);
						expresion(0);
						}
					}

					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(T__17);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(209);
				match(T__23);
				setState(210);
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
		enterRule(_localctx, 10, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__24);
			setState(214);
			match(T__1);
			setState(215);
			expresion(0);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(216);
				match(T__5);
				setState(217);
				expresion(0);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(T__2);
			setState(224);
			match(T__17);
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
		enterRule(_localctx, 12, RULE_caso);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(T__25);
				setState(227);
				expresion(0);
				setState(228);
				match(T__26);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(229);
					sentencia();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(T__27);
				setState(236);
				match(T__26);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(237);
					sentencia();
					}
					}
					setState(242);
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
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				id();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				match(T__32);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(254);
				match(ENTERO);
				}
				break;
			case 2:
				{
				setState(255);
				match(REAL);
				}
				break;
			case 3:
				{
				setState(256);
				match(BOOLEANO);
				}
				break;
			case 4:
				{
				setState(257);
				match(CADENA);
				}
				break;
			case 5:
				{
				setState(258);
				match(CARACTER);
				}
				break;
			case 6:
				{
				setState(259);
				id();
				}
				break;
			case 7:
				{
				setState(260);
				llamado_funcion();
				}
				break;
			case 8:
				{
				setState(261);
				match(T__1);
				setState(262);
				expresion(0);
				setState(263);
				match(T__2);
				}
				break;
			case 9:
				{
				setState(265);
				operador_unitario();
				setState(266);
				expresion(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(270);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(271);
					operador_binario();
					setState(272);
					expresion(3);
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 18, RULE_llamado_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			id();
			setState(280);
			match(T__1);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__42) | (1L << T__46) | (1L << BOOLEANO) | (1L << ID) | (1L << ENTERO) | (1L << REAL) | (1L << CARACTER) | (1L << CADENA))) != 0)) {
				{
				setState(281);
				expresion(0);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(282);
					match(T__5);
					setState(283);
					expresion(0);
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(291);
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
		enterRule(_localctx, 20, RULE_operador_binario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_operador_unitario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__46) ) {
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
		enterRule(_localctx, 24, RULE_idestructura);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__47);
			setState(298);
			match(ID);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					match(T__47);
					setState(300);
					idestructura();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 26, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(ID);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(T__47);
					setState(308);
					match(ID);
					}
					} 
				}
				setState(313);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4"+
		"\f\4\16\4F\13\4\5\4H\n\4\3\5\3\5\6\5L\n\5\r\5\16\5M\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6"+
		"\5\6d\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6n\n\6\r\6\16\6o\3\6\3\6\3"+
		"\6\3\6\3\6\5\6w\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0083"+
		"\n\6\f\6\16\6\u0086\13\6\3\6\3\6\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009d\n\6\f"+
		"\6\16\6\u00a0\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u00b3\n\6\3\6\3\6\3\6\3\6\5\6\u00b9\n\6\7\6\u00bb"+
		"\n\6\f\6\16\6\u00be\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c5\n\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00cb\n\6\7\6\u00cd\n\6\f\6\16\6\u00d0\13\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00d6\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u00dd\n\7\f\7\16\7\u00e0\13\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00e9\n\b\f\b\16\b\u00ec\13\b\3\b\3\b\3\b"+
		"\7\b\u00f1\n\b\f\b\16\b\u00f4\13\b\5\b\u00f6\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00fe\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u010f\n\n\3\n\3\n\3\n\3\n\7\n\u0115\n\n\f\n\16\n\u0118\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u011f\n\13\f\13\16\13\u0122\13\13\5\13"+
		"\u0124\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0130\n"+
		"\16\f\16\16\16\u0133\13\16\3\17\3\17\3\17\7\17\u0138\n\17\f\17\16\17\u013b"+
		"\13\17\3\17\2\3\22\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2$\60"+
		"\4\2--\61\61\2\u0162\2!\3\2\2\2\4-\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2\n\u00d5"+
		"\3\2\2\2\f\u00d7\3\2\2\2\16\u00f5\3\2\2\2\20\u00fd\3\2\2\2\22\u010e\3"+
		"\2\2\2\24\u0119\3\2\2\2\26\u0127\3\2\2\2\30\u0129\3\2\2\2\32\u012b\3\2"+
		"\2\2\34\u0134\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2"+
		"!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$(\5\b\5\2%\'\5\4\3\2&%\3\2\2\2\'*\3\2"+
		"\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\2\2\3,\3\3\2\2\2-.\7"+
		"\3\2\2./\5\20\t\2/\60\7\67\2\2\60\61\7\4\2\2\61\62\5\6\4\2\62\63\7\5\2"+
		"\2\63\67\7\6\2\2\64\66\5\n\6\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2"+
		"\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\7\2\2;\5\3\2\2\2<=\5\20\t\2=D\7"+
		"\67\2\2>?\7\b\2\2?@\5\20\t\2@A\7\67\2\2AC\3\2\2\2B>\3\2\2\2CF\3\2\2\2"+
		"DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2G<\3\2\2\2GH\3\2\2\2H\7\3\2\2"+
		"\2IK\7\t\2\2JL\5\n\6\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2"+
		"\2OP\7\n\2\2P\t\3\2\2\2QR\7\13\2\2RS\7\4\2\2ST\5\22\n\2TU\7\5\2\2UY\7"+
		"\f\2\2VX\5\n\6\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Zc\3\2\2\2[Y\3"+
		"\2\2\2\\`\7\r\2\2]_\5\n\6\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad"+
		"\3\2\2\2b`\3\2\2\2c\\\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\16\2\2f\u00d6\3"+
		"\2\2\2gh\7\17\2\2hi\7\4\2\2ij\5\22\n\2jk\7\5\2\2km\7\20\2\2ln\5\16\b\2"+
		"ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\21\2\2r\u00d6\3"+
		"\2\2\2st\7\22\2\2tv\7\4\2\2uw\5\20\t\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2x"+
		"y\5\34\17\2yz\7\23\2\2z{\5\22\n\2{|\7\24\2\2|}\5\22\n\2}~\7\24\2\2~\177"+
		"\5\22\n\2\177\u0080\7\5\2\2\u0080\u0084\7\6\2\2\u0081\u0083\5\n\6\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\25\2\2\u0088"+
		"\u00d6\3\2\2\2\u0089\u008d\7\6\2\2\u008a\u008c\5\n\6\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\26\2\2\u0091\u0092\7"+
		"\4\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7\5\2\2\u0094\u0095\7\24\2\2\u0095"+
		"\u00d6\3\2\2\2\u0096\u0097\7\26\2\2\u0097\u0098\7\4\2\2\u0098\u0099\5"+
		"\22\n\2\u0099\u009a\7\5\2\2\u009a\u009e\7\6\2\2\u009b\u009d\5\n\6\2\u009c"+
		"\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\27\2\2\u00a2"+
		"\u00d6\3\2\2\2\u00a3\u00a4\7\30\2\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6\5"+
		"\34\17\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8\7\24\2\2\u00a8\u00d6\3\2\2\2"+
		"\u00a9\u00d6\5\f\7\2\u00aa\u00ab\7\31\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad"+
		"\7\24\2\2\u00ad\u00d6\3\2\2\2\u00ae\u00af\5\20\t\2\u00af\u00b2\5\34\17"+
		"\2\u00b0\u00b1\7\23\2\2\u00b1\u00b3\5\22\n\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00bc\3\2\2\2\u00b4\u00b5\7\b\2\2\u00b5\u00b8\5\34"+
		"\17\2\u00b6\u00b7\7\23\2\2\u00b7\u00b9\5\22\n\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b4\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\7\24\2\2\u00c0\u00d6\3\2\2\2\u00c1\u00c4\5"+
		"\34\17\2\u00c2\u00c3\7\23\2\2\u00c3\u00c5\5\22\n\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00ce\3\2\2\2\u00c6\u00c7\7\b\2\2\u00c7\u00ca"+
		"\5\34\17\2\u00c8\u00c9\7\23\2\2\u00c9\u00cb\5\22\n\2\u00ca\u00c8\3\2\2"+
		"\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cd\u00d0"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d4\7"+
		"\32\2\2\u00d4\u00d6\7\24\2\2\u00d5Q\3\2\2\2\u00d5g\3\2\2\2\u00d5s\3\2"+
		"\2\2\u00d5\u0089\3\2\2\2\u00d5\u0096\3\2\2\2\u00d5\u00a3\3\2\2\2\u00d5"+
		"\u00a9\3\2\2\2\u00d5\u00aa\3\2\2\2\u00d5\u00ae\3\2\2\2\u00d5\u00c1\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\13\3\2\2\2\u00d7\u00d8\7\33\2\2\u00d8\u00d9"+
		"\7\4\2\2\u00d9\u00de\5\22\n\2\u00da\u00db\7\b\2\2\u00db\u00dd\5\22\n\2"+
		"\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\5\2\2\u00e2"+
		"\u00e3\7\24\2\2\u00e3\r\3\2\2\2\u00e4\u00e5\7\34\2\2\u00e5\u00e6\5\22"+
		"\n\2\u00e6\u00ea\7\35\2\2\u00e7\u00e9\5\n\6\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f6\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\36\2\2\u00ee\u00f2\7\35\2\2\u00ef"+
		"\u00f1\5\n\6\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00e4\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f6\17\3\2\2\2\u00f7\u00fe\5\34\17"+
		"\2\u00f8\u00fe\7\37\2\2\u00f9\u00fe\7 \2\2\u00fa\u00fe\7!\2\2\u00fb\u00fe"+
		"\7\"\2\2\u00fc\u00fe\7#\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd"+
		"\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2"+
		"\2\2\u00fe\21\3\2\2\2\u00ff\u0100\b\n\1\2\u0100\u010f\78\2\2\u0101\u010f"+
		"\79\2\2\u0102\u010f\7\66\2\2\u0103\u010f\7;\2\2\u0104\u010f\7:\2\2\u0105"+
		"\u010f\5\34\17\2\u0106\u010f\5\24\13\2\u0107\u0108\7\4\2\2\u0108\u0109"+
		"\5\22\n\2\u0109\u010a\7\5\2\2\u010a\u010f\3\2\2\2\u010b\u010c\5\30\r\2"+
		"\u010c\u010d\5\22\n\3\u010d\u010f\3\2\2\2\u010e\u00ff\3\2\2\2\u010e\u0101"+
		"\3\2\2\2\u010e\u0102\3\2\2\2\u010e\u0103\3\2\2\2\u010e\u0104\3\2\2\2\u010e"+
		"\u0105\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u010b\3\2"+
		"\2\2\u010f\u0116\3\2\2\2\u0110\u0111\f\4\2\2\u0111\u0112\5\26\f\2\u0112"+
		"\u0113\5\22\n\5\u0113\u0115\3\2\2\2\u0114\u0110\3\2\2\2\u0115\u0118\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\23\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011a\5\34\17\2\u011a\u0123\7\4\2\2\u011b\u0120\5"+
		"\22\n\2\u011c\u011d\7\b\2\2\u011d\u011f\5\22\n\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\7\5\2\2\u0126\25\3\2\2\2\u0127\u0128\t\2\2"+
		"\2\u0128\27\3\2\2\2\u0129\u012a\t\3\2\2\u012a\31\3\2\2\2\u012b\u012c\7"+
		"\62\2\2\u012c\u0131\7\67\2\2\u012d\u012e\7\62\2\2\u012e\u0130\5\32\16"+
		"\2\u012f\u012d\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\33\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0139\7\67\2\2\u0135"+
		"\u0136\7\62\2\2\u0136\u0138\7\67\2\2\u0137\u0135\3\2\2\2\u0138\u013b\3"+
		"\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\35\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\"!(\67DGMY`cov\u0084\u008d\u009e\u00b2\u00b8\u00bc\u00c4"+
		"\u00ca\u00ce\u00d5\u00de\u00ea\u00f2\u00f5\u00fd\u010e\u0116\u0120\u0123"+
		"\u0131\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}