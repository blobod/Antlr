package AST;

import Visitors.Visitor;

public class IntegerNode implements ASTNode{


    public Double value;

    public IntegerNode(Double value) {
        this.value = value;
    }

    @Override
    public Object accept(Visitor v) {
        return value.floatValue();
    }


}
