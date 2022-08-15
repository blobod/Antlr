import AstNodes.*;
import AstNodes.Addition;
import dAstNodes.*;

public class ContextualDecorator extends DecoratedAbstractSyntaxTreeVisitor {


    public dAstNode decorate(AstNode ast){
        dAstNode dast = visitAST(ast);
        return dast;
    }




}
