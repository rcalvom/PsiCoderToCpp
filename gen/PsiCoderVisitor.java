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
	 * Visit a parse tree produced by {@link PsiCoderParser#sentencia_estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_estructura(PsiCoderParser.Sentencia_estructuraContext ctx);
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
	 * Visit a parse tree produced by {@link PsiCoderParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(PsiCoderParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(PsiCoderParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(PsiCoderParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#si_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi_no(PsiCoderParser.Si_noContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#seleccionar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccionar(PsiCoderParser.SeleccionarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(PsiCoderParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#hacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacer(PsiCoderParser.HacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(PsiCoderParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(PsiCoderParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#romper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRomper(PsiCoderParser.RomperContext ctx);
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
	 * Visit a parse tree produced by {@link PsiCoderParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(PsiCoderParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#llamado_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamado_funcion(PsiCoderParser.Llamado_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_binario(PsiCoderParser.Operador_binarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#operador_unitario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_unitario(PsiCoderParser.Operador_unitarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsiCoderParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(PsiCoderParser.IdContext ctx);
}