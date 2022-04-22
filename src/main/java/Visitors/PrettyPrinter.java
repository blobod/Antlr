package Visitors;

import AST.Expression;
import AST.IntegerNode;
import AST.Minus;
import AST.Plus;

public class PrettyPrinter implements Visitor{

    @Override
    public Object visit(Expression n) {
        return null;
    }

    @Override
    public Object visit(Plus n) {
        System.out.println("Plus");
        System.out.println(n.accept(this));
        return null;
    }

    @Override
    public Object visit(Minus n) {
        System.out.println("Minus");
        System.out.println(n.accept(this));
        return null;

    }

    @Override
    public Object visit(IntegerNode n) {
        System.out.println(n.value);
        return null;
    }
}
