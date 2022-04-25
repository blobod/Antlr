package AST;

import AST.Visitor;
import antlr.languageParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class Plus extends Expression {
    public Plus(ASTNode left, ASTNode right) {
        super(left, right);
    }

    @Override
    public void accept(Visitor v) {
       v.VisitPlus(this);
    }


}
