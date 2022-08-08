package dAstNodes;
import AstNodes.AstNode;
import AstNodes.SyntaxAnalysis;

import java.util.List;


public class ContextualAnalysis {
        public List<AstNode> dAstList;
        public SyntaxAnalysis AstNodes;


        public ContextualAnalysis(){
            this.AstNodes = new SyntaxAnalysis();
        }

    public void addDAst(AstNode e){
        dAstList.add(e);
    }
}
