// Generated from ucsp\compiladores\analizadores\mini0lexer.g4 by ANTLR 4.7.2
package ucsp.compiladores.analizadores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mini0lexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mini0lexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(mini0lexerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(mini0lexerParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(mini0lexerParser.NewLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(mini0lexerParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(mini0lexerParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(mini0lexerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(mini0lexerParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(mini0lexerParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(mini0lexerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(mini0lexerParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#declvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclvar(mini0lexerParser.DeclvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(mini0lexerParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#commandIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandIf(mini0lexerParser.CommandIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#commandWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandWhile(mini0lexerParser.CommandWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#commandAsign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandAsign(mini0lexerParser.CommandAsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(mini0lexerParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(mini0lexerParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#commandReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandReturn(mini0lexerParser.CommandReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(mini0lexerParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link mini0lexerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(mini0lexerParser.ExpressionContext ctx);
}