import AST2.Expression;
import AST2.Number;
import AST2.VariableDeclaration;
import grammar.languageBaseVisitor;
import grammar.languageParser;
import grammar.languageVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import grammar.*;
import java.util.List;

public class AntlrToExpression extends languageBaseVisitor<Expression> {
    private List<String> vars; //Stores all variables that are declared in the program
    private List<String> semanticErrors; //Duplicate declaration, Reference to undeclared
    @Override public Expression visitLanguage(languageParser.LanguageContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitEntrypoint(languageParser.EntrypointContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitDeclaration(languageParser.DeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitStmts(languageParser.StmtsContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitStmt(languageParser.StmtContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitAddition(languageParser.AdditionContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitSubstraktion(languageParser.SubstraktionContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitMultiplication(languageParser.MultiplicationContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitDivision(languageParser.DivisionContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitPower_of(languageParser.Power_ofContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitParanthesis_more(languageParser.Paranthesis_moreContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitParanthesis(languageParser.ParanthesisContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitNumber(languageParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        System.out.println(num);
        return new Number(num);
    }

    @Override public Expression visitConditional_statement(languageParser.Conditional_statementContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitIf_statement(languageParser.If_statementContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitIterative_statement(languageParser.Iterative_statementContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitFor_loop(languageParser.For_loopContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitWhile_loop(languageParser.While_loopContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitForever_loop(languageParser.Forever_loopContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitCondition(languageParser.ConditionContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitIdORvalue_condition(languageParser.IdORvalue_conditionContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitGreather(languageParser.GreatherContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitLesser(languageParser.LesserContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitEqual(languageParser.EqualContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitGreatherORequal(languageParser.GreatherORequalContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitLesserORequal(languageParser.LesserORequalContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitIsNOTequal(languageParser.IsNOTequalContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitType_definition(languageParser.Type_definitionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Expression visitData_type(languageParser.Data_typeContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitFunction_declaration(languageParser.Function_declarationContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitParam(languageParser.ParamContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitType(languageParser.TypeContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitValue(languageParser.ValueContext ctx) { return visitChildren(ctx); }

    @Override public Expression visitIDorVALUE(languageParser.IDorVALUEContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String id = ctx.getChild(0).getText();
        if(vars.contains(id)){
            semanticErrors.add("Error: Variable " + id + " already declared in: line: " + line + " and column:" + column);
        }else{
            vars.add(id);
        }
        String type = ctx.getChild(2).getText();
        int value = Integer.parseInt(ctx.value().getText());
        return new VariableDeclaration(id, type, value);
    }
}
