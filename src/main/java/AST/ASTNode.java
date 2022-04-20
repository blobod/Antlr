package AST;

import Visitors.Visitor;

public interface ASTNode<Object> {

    Object accept(Visitor v);
}
