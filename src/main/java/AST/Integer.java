package AST;

import Visitors.Visitor;

public class Integer implements ASTNode{


    public int value;

    public Integer(int value) {
        this.value = value;
    }

    @Override
    public Object accept(Visitor v) {
        return v.visit(this);
    }
}
