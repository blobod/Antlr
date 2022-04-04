// Generated from C:/Users/thetr/IdeaProjects/Antlr/src/antlr\language.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link languageParser}.
 */
public interface languageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link languageParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(languageParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(languageParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(languageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(languageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(languageParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(languageParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(languageParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(languageParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(languageParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(languageParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(languageParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(languageParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#if_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_statment(languageParser.If_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#if_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_statment(languageParser.If_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#iterative_statement}.
	 * @param ctx the parse tree
	 */
	void enterIterative_statement(languageParser.Iterative_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#iterative_statement}.
	 * @param ctx the parse tree
	 */
	void exitIterative_statement(languageParser.Iterative_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(languageParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(languageParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(languageParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(languageParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#forever_loop}.
	 * @param ctx the parse tree
	 */
	void enterForever_loop(languageParser.Forever_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#forever_loop}.
	 * @param ctx the parse tree
	 */
	void exitForever_loop(languageParser.Forever_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(languageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(languageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#idORvalue_condition}.
	 * @param ctx the parse tree
	 */
	void enterIdORvalue_condition(languageParser.IdORvalue_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#idORvalue_condition}.
	 * @param ctx the parse tree
	 */
	void exitIdORvalue_condition(languageParser.IdORvalue_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#greather}.
	 * @param ctx the parse tree
	 */
	void enterGreather(languageParser.GreatherContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#greather}.
	 * @param ctx the parse tree
	 */
	void exitGreather(languageParser.GreatherContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#lesser}.
	 * @param ctx the parse tree
	 */
	void enterLesser(languageParser.LesserContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#lesser}.
	 * @param ctx the parse tree
	 */
	void exitLesser(languageParser.LesserContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(languageParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(languageParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#greatherORequal}.
	 * @param ctx the parse tree
	 */
	void enterGreatherORequal(languageParser.GreatherORequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#greatherORequal}.
	 * @param ctx the parse tree
	 */
	void exitGreatherORequal(languageParser.GreatherORequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#lesserORequal}.
	 * @param ctx the parse tree
	 */
	void enterLesserORequal(languageParser.LesserORequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#lesserORequal}.
	 * @param ctx the parse tree
	 */
	void exitLesserORequal(languageParser.LesserORequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#isNOTequal}.
	 * @param ctx the parse tree
	 */
	void enterIsNOTequal(languageParser.IsNOTequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#isNOTequal}.
	 * @param ctx the parse tree
	 */
	void exitIsNOTequal(languageParser.IsNOTequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(languageParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(languageParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(languageParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(languageParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(languageParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(languageParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#int_type}.
	 * @param ctx the parse tree
	 */
	void enterInt_type(languageParser.Int_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#int_type}.
	 * @param ctx the parse tree
	 */
	void exitInt_type(languageParser.Int_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#double_type}.
	 * @param ctx the parse tree
	 */
	void enterDouble_type(languageParser.Double_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#double_type}.
	 * @param ctx the parse tree
	 */
	void exitDouble_type(languageParser.Double_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#text_type}.
	 * @param ctx the parse tree
	 */
	void enterText_type(languageParser.Text_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#text_type}.
	 * @param ctx the parse tree
	 */
	void exitText_type(languageParser.Text_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#bool_type}.
	 * @param ctx the parse tree
	 */
	void enterBool_type(languageParser.Bool_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#bool_type}.
	 * @param ctx the parse tree
	 */
	void exitBool_type(languageParser.Bool_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(languageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(languageParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#iDorVALUE}.
	 * @param ctx the parse tree
	 */
	void enterIDorVALUE(languageParser.IDorVALUEContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#iDorVALUE}.
	 * @param ctx the parse tree
	 */
	void exitIDorVALUE(languageParser.IDorVALUEContext ctx);
}