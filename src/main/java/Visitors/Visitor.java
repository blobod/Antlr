package Visitors;

import AST.Expression;
import AST.Minus;
import AST.Plus;

public interface Visitor<Object> {

    Object visit(Expression n);
    Object visit(Plus n);
    Object visit(Minus n);

}
