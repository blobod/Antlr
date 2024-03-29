// Generated from C:/Users/thetr/OneDrive/Dokumenter/GitHub/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link languageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface languageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link languageParser#language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(languageParser.LanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(languageParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(languageParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#stop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop(languageParser.StopContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(languageParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(languageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(languageParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var_dec_with_value}
	 * labeled alternative in {@link languageParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec_with_value(languageParser.Var_dec_with_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var_dec_no_value}
	 * labeled alternative in {@link languageParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec_no_value(languageParser.Var_dec_no_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#type_reassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_reassign(languageParser.Type_reassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncWithReturn}
	 * labeled alternative in {@link languageParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncWithReturn(languageParser.FuncWithReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncVoid}
	 * labeled alternative in {@link languageParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncVoid(languageParser.FuncVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(languageParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(languageParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#return_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_func(languageParser.Return_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#function_call_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_param(languageParser.Function_call_paramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(languageParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(languageParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(languageParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis(languageParser.ParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Substraktion}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstraktion(languageParser.SubstraktionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bigger_expression}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigger_expression(languageParser.Bigger_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer_NUM}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_NUM(languageParser.Integer_NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualWith}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualWith(languageParser.EqualWithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(languageParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LesserorEqualThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserorEqualThan(languageParser.LesserorEqualThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNotEqualWith}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotEqualWith(languageParser.IsNotEqualWithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Func_Call}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_Call(languageParser.Func_CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LesserThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserThan(languageParser.LesserThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(languageParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(languageParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double_NUM}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_NUM(languageParser.Double_NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(languageParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterorEqualThan}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterorEqualThan(languageParser.GreaterorEqualThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(languageParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(languageParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Else}
	 * labeled alternative in {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(languageParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(languageParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#iterative_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterative_statement(languageParser.Iterative_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(languageParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(languageParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#forever_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForever_loop(languageParser.Forever_loopContext ctx);
}