// Generated from ucsp\compiladores\analizadores\mini0lexer.g4 by ANTLR 4.7.2
package ucsp.compiladores.analizadores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mini0lexerParser}.
 */
public interface mini0lexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(mini0lexerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(mini0lexerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(mini0lexerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(mini0lexerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#newLine}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(mini0lexerParser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#newLine}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(mini0lexerParser.NewLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(mini0lexerParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(mini0lexerParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(mini0lexerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(mini0lexerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(mini0lexerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(mini0lexerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(mini0lexerParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(mini0lexerParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(mini0lexerParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(mini0lexerParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(mini0lexerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(mini0lexerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(mini0lexerParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(mini0lexerParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#declvar}.
	 * @param ctx the parse tree
	 */
	void enterDeclvar(mini0lexerParser.DeclvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#declvar}.
	 * @param ctx the parse tree
	 */
	void exitDeclvar(mini0lexerParser.DeclvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(mini0lexerParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(mini0lexerParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#commandIf}.
	 * @param ctx the parse tree
	 */
	void enterCommandIf(mini0lexerParser.CommandIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#commandIf}.
	 * @param ctx the parse tree
	 */
	void exitCommandIf(mini0lexerParser.CommandIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#commandWhile}.
	 * @param ctx the parse tree
	 */
	void enterCommandWhile(mini0lexerParser.CommandWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#commandWhile}.
	 * @param ctx the parse tree
	 */
	void exitCommandWhile(mini0lexerParser.CommandWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#commandAsign}.
	 * @param ctx the parse tree
	 */
	void enterCommandAsign(mini0lexerParser.CommandAsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#commandAsign}.
	 * @param ctx the parse tree
	 */
	void exitCommandAsign(mini0lexerParser.CommandAsignContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(mini0lexerParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(mini0lexerParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(mini0lexerParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(mini0lexerParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#commandReturn}.
	 * @param ctx the parse tree
	 */
	void enterCommandReturn(mini0lexerParser.CommandReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#commandReturn}.
	 * @param ctx the parse tree
	 */
	void exitCommandReturn(mini0lexerParser.CommandReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(mini0lexerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(mini0lexerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mini0lexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mini0lexerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mini0lexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mini0lexerParser.ExpressionContext ctx);
}