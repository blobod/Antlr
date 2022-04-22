package AST;

import Visitors.Visitor;

public class IntegerNode implements ASTNode{


    public Integer value;

    public IntegerNode(Integer value) {
        this.value = value;
    }

    @Override
    public Object accept(Visitor v) {
        return value.floatValue();
    }
}
