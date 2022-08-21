package dAstNodes;

import AstNodes.AstNode;

import java.util.List;

public class FunctionDefinition extends dAstNode{
    public String FuncType;
    public String FuncId;
    public List <AstNode> parameters;
    public List <AstNode> body;
    public AstNode returnValue;
    public FunctionDefinition(String FuncType, String FuncId, List<AstNode> parameters, List <AstNode> body, AstNode returnValue){
        this.FuncType = FuncType;
        this.FuncId = FuncId;
        this.parameters = parameters;
        this.body = body;
        this.returnValue = returnValue;
    }

}
