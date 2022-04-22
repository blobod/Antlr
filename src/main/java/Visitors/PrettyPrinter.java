<<<<<<< Updated upstream
package Visitors;

import AST.Expression;
import AST.Integer;
import AST.Plus;

public class PrettyPrinter implements Visitor{

    @Override
    public Object visit(Expression n) {
        return null;
    }

    @Override
    public Object visit(Plus n) {
        System.out.println("Plus");
        n.left.accept(this);
        n.right.accept(this);
        return null;
    }

    @Override
    public Object visit(Integer n) {
        System.out.println(n.value);
        return null;
    }
}
=======
>>>>>>> Stashed changes
