// Generated from /home/ricardo/Documents/Proyectos/PsiCoderTranslater/grammar/PsiCoder.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PsiCoderParser}.
 */
public interface PsiCoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(PsiCoderParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(PsiCoderParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(PsiCoderParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(PsiCoderParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#param_funcion}.
	 * @param ctx the parse tree
	 */
	void enterParam_funcion(PsiCoderParser.Param_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#param_funcion}.
	 * @param ctx the parse tree
	 */
	void exitParam_funcion(PsiCoderParser.Param_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#estructura}.
	 * @param ctx the parse tree
	 */
	void enterEstructura(PsiCoderParser.EstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#estructura}.
	 * @param ctx the parse tree
	 */
	void exitEstructura(PsiCoderParser.EstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(PsiCoderParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(PsiCoderParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(PsiCoderParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(PsiCoderParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(PsiCoderParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(PsiCoderParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(PsiCoderParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(PsiCoderParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(PsiCoderParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(PsiCoderParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PsiCoderParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PsiCoderParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#dec_variable}.
	 * @param ctx the parse tree
	 */
	void enterDec_variable(PsiCoderParser.Dec_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#dec_variable}.
	 * @param ctx the parse tree
	 */
	void exitDec_variable(PsiCoderParser.Dec_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PsiCoderParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PsiCoderParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(PsiCoderParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(PsiCoderParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(PsiCoderParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(PsiCoderParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(PsiCoderParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(PsiCoderParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#numero_palabra}.
	 * @param ctx the parse tree
	 */
	void enterNumero_palabra(PsiCoderParser.Numero_palabraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#numero_palabra}.
	 * @param ctx the parse tree
	 */
	void exitNumero_palabra(PsiCoderParser.Numero_palabraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#idcall}.
	 * @param ctx the parse tree
	 */
	void enterIdcall(PsiCoderParser.IdcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#idcall}.
	 * @param ctx the parse tree
	 */
	void exitIdcall(PsiCoderParser.IdcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(PsiCoderParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(PsiCoderParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#idestructura}.
	 * @param ctx the parse tree
	 */
	void enterIdestructura(PsiCoderParser.IdestructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#idestructura}.
	 * @param ctx the parse tree
	 */
	void exitIdestructura(PsiCoderParser.IdestructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(PsiCoderParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(PsiCoderParser.IdContext ctx);
}