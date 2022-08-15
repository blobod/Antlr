package dAstNodes;

import AstNodes.AstNode;

import java.util.List;

public class FunctionDefinition extends dAstNode{
    public String FuncType;
    public String FuncId;
    public List <AstNode> parameters;
    public List <AstNode> body;

    public FunctionDefinition(String FuncType, String FuncId, List<AstNode> parameters, List <AstNode> body){
        this.FuncType = FuncType;
        this.FuncId = FuncId;
        this.parameters = parameters;
        this.body = body;
    }

}
