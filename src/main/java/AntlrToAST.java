import AST.ASTNode;
import AST.Expression;
import AST.Plus;
import gen.*;
public class AntlrToAST extends languageBaseVisitor<ASTNode>{
    @Override public ASTNode visitLanguage(languageParser.LanguageContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitDeclaration(languageParser.DeclarationContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitStmts(languageParser.StmtsContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitStmt(languageParser.StmtContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitExpression(languageParser.ExpressionContext ctx) {
        Expression ny = new Expression();
        //Check that we are in a plus rule
       // return Plus(ctx.left().accept(this), ctx.right().accept(this));
        return visitChildren(ctx);


    }

    @Override public ASTNode visitConditional_statement(languageParser.Conditional_statementContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitIf_statement(languageParser.If_statementContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitIterative_statement(languageParser.Iterative_statementContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitFor_loop(languageParser.For_loopContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitWhile_loop(languageParser.While_loopContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitForever_loop(languageParser.Forever_loopContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitCondition(languageParser.ConditionContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitIdORvalue_condition(languageParser.IdORvalue_conditionContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitGreather(languageParser.GreatherContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitLesser(languageParser.LesserContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitEqual(languageParser.EqualContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitGreatherORequal(languageParser.GreatherORequalContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitLesserORequal(languageParser.LesserORequalContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitIsNOTequal(languageParser.IsNOTequalContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitType_definition(languageParser.Type_definitionContext ctx) { return visitChildren(ctx); }


    @Override public ASTNode visitData_type(languageParser.Data_typeContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitFunction_declaration(languageParser.Function_declarationContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitParam(languageParser.ParamContext ctx) { return visitChildren(ctx); }


    @Override public ASTNode visitType(languageParser.TypeContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitValue(languageParser.ValueContext ctx) { return visitChildren(ctx); }

    @Override public ASTNode visitIDorVALUE(languageParser.IDorVALUEContext ctx) { return visitChildren(ctx); }

}
