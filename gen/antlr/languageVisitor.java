// Generated from C:/Users/thetr/IdeaProjects/Antlr/src/antlr\language.g4 by ANTLR 4.9.2
package antlr;
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
	 * Visit a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(languageParser.DeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link languageParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(languageParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(languageParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#if_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statment(languageParser.If_statmentContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link languageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(languageParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#idORvalue_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdORvalue_condition(languageParser.IdORvalue_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#greather}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreather(languageParser.GreatherContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#lesser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesser(languageParser.LesserContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(languageParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#greatherORequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreatherORequal(languageParser.GreatherORequalContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#lesserORequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserORequal(languageParser.LesserORequalContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#isNOTequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNOTequal(languageParser.IsNOTequalContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(languageParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(languageParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(languageParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#int_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_type(languageParser.Int_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#double_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_type(languageParser.Double_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#text_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_type(languageParser.Text_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#bool_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_type(languageParser.Bool_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(languageParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#iDorVALUE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDorVALUE(languageParser.IDorVALUEContext ctx);
}