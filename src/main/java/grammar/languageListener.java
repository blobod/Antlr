<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageListener.java
>>>>>>> Stashed changes
<<<<<<< Updated upstream:src/antlr/languageListener.java
// Generated from /Users/abdallahziadalnaif/Desktop/Antlr-main/src/main/java/antlr/language.g4 by ANTLR 4.9.2
package antlr;
=======
<<<<<<< Updated upstream
<<<<<<< Updated upstream:src/main/java/gen/languageListener.java
// Generated from /Users/abdallahziadalnaif/Desktop/Antlr-main/src/antlr/language.g4 by ANTLR 4.9.2
package gen;
>>>>>>> Stashed changes
=======
// Generated from C:/Users/thetr/OneDrive/Dokumenter/GitHub/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
>>>>>>> Stashed changes:src/main/java/grammar/languageListener.java
>>>>>>> Stashed changes
=======
// Generated from C:/Users/thetr/OneDrive/Dokumenter/GitHub/Antlr/src/main/java/grammar\language.g4 by ANTLR 4.9.2
package grammar;
>>>>>>> Stashed changes:src/main/java/grammar/languageListener.java
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
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link languageParser#expression}.
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream:src/antlr/languageListener.java
>>>>>>> Stashed changes
	 * @param ctx the parse tree
	 */
	void enterAddition(languageParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(languageParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Substraktion}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubstraktion(languageParser.SubstraktionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Substraktion}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubstraktion(languageParser.SubstraktionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(languageParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(languageParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(languageParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(languageParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power_of}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPower_of(languageParser.Power_ofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power_of}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPower_of(languageParser.Power_ofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paranthesis_more}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis_more(languageParser.Paranthesis_moreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paranthesis_more}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis_more(languageParser.Paranthesis_moreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(languageParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(languageParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(languageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
<<<<<<< Updated upstream
=======
=======
	 * @param ctx the parse tree
	 */
	void enterAddition(languageParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(languageParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Substraktion}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubstraktion(languageParser.SubstraktionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Substraktion}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubstraktion(languageParser.SubstraktionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(languageParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(languageParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(languageParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(languageParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power_of}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPower_of(languageParser.Power_ofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power_of}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPower_of(languageParser.Power_ofContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paranthesis_more}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis_more(languageParser.Paranthesis_moreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paranthesis_more}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis_more(languageParser.Paranthesis_moreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(languageParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(languageParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(languageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
>>>>>>> Stashed changes:src/main/java/grammar/languageListener.java
>>>>>>> Stashed changes
	void exitNumber(languageParser.NumberContext ctx);
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
	 * Enter a parse tree produced by {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(languageParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(languageParser.If_statementContext ctx);
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
	 * Enter a parse tree produced by {@link languageParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(languageParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(languageParser.Data_typeContext ctx);
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
	 * Enter a parse tree produced by {@link languageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(languageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(languageParser.TypeContext ctx);
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