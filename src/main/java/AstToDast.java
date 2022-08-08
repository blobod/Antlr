import AstNodes.SyntaxAnalysis;

public class AstToDast {

    public ContextualAnalysis visitAST(SyntaxAnalysis astNodes){
        ContextualAnalysis dastnodes = new ContextualAnalysis();

        Decorator decorate = new Decorator();

        for (int i = 0; i < astNodes.getSize() ; i++){
            dastnodes.addDast(decorate.visit(astNodes.astNodes.get(i)));
        }

        return dastnodes;
    }


}
