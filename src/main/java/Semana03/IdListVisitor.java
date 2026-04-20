// Generated from /Users/erick/IdeaProjects/elp2026/src/main/kotlin/Semana03/IdList.g4 by ANTLR 4.13.2
package Semana03;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IdListParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IdListVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IdListParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(IdListParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdListParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(IdListParser.ElementContext ctx);
}