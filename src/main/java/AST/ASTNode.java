package AST;

import AST.Visitor;

public interface ASTNode<Object> {

   void accept(Visitor v);
}
