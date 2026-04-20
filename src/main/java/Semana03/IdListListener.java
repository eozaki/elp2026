// Generated from /Users/erick/IdeaProjects/elp2026/src/main/kotlin/Semana03/IdList.g4 by ANTLR 4.13.2
package Semana03;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IdListParser}.
 */
public interface IdListListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IdListParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(IdListParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdListParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(IdListParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdListParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(IdListParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdListParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(IdListParser.ElementContext ctx);
}