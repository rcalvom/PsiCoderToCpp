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
	 * Enter a parse tree produced by {@link PsiCoderParser#sentencia_estructura}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_estructura(PsiCoderParser.Sentencia_estructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#sentencia_estructura}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_estructura(PsiCoderParser.Sentencia_estructuraContext ctx);
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
	 * Enter a parse tree produced by {@link PsiCoderParser#llamado_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamado_funcion(PsiCoderParser.Llamado_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#llamado_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamado_funcion(PsiCoderParser.Llamado_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#operador_binario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_binario(PsiCoderParser.Operador_binarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#operador_binario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_binario(PsiCoderParser.Operador_binarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsiCoderParser#operador_unitario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_unitario(PsiCoderParser.Operador_unitarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsiCoderParser#operador_unitario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_unitario(PsiCoderParser.Operador_unitarioContext ctx);
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