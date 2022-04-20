package AST;

import Visitors.Visitor;

import java.util.ArrayList;

public class Expression implements ASTNode<Object>{

    char Operator;

    @Override
    public Object accept(Visitor v) {
        return v.visit(this);
    }
    //ArrayList<String > Operators;
    //ASTNode Operand;
}
