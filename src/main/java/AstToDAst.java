import AstNodes.SyntaxAnalysis;
import dAstNodes.ContextualAnalysis;
import dAstNodes.dAstNode;

public class AstToDAst {
    public dAstNode VisitAST(SyntaxAnalysis astNodes){
        dAstNode dastnodes = new dAstNode();

        for (int i = 0; i < astNodes.getSize(); i++){

            dastnodes.addDAst(    astNodes.astNodes.get(i));

        }

        return dastnodes;
    }
}
