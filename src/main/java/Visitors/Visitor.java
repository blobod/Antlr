package Visitors;

import AST.Expression;
<<<<<<< Updated upstream
import AST.Integer;
=======
import AST.Minus;
>>>>>>> Stashed changes
import AST.Plus;

public interface Visitor<Object> {

    Object visit(Expression n);
    Object visit(Plus n);
<<<<<<< Updated upstream
    Object visit(Integer n);
=======
    Object visit(Minus n);
>>>>>>> Stashed changes
}
