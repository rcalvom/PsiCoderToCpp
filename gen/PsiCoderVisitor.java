// Generated from /home/ricardo/Documents/Proyectos/PsiCoderTranslater/grammar/PsiCoder.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PsiCoderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PsiCoderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(PsiCoderParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(PsiCoderParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#param_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_funcion(PsiCoderParser.Param_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura(PsiCoderParser.EstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#atributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributo(PsiCoderParser.AtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(PsiCoderParser.PrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(PsiCoderParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(PsiCoderParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(PsiCoderParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(PsiCoderParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#dec_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_variable(PsiCoderParser.Dec_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PsiCoderParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(PsiCoderParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(PsiCoderParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(PsiCoderParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#numero_palabra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_palabra(PsiCoderParser.Numero_palabraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#idcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdcall(PsiCoderParser.IdcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(PsiCoderParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#idestructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdestructura(PsiCoderParser.IdestructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(PsiCoderParser.IdContext ctx);
}