package AstNodes;

import java.util.List;

public class Functions extends AstNode {
    public String FunctionType;
    public String FunctionId;
    public List<AstNode> parameter;
    public List<AstNode> body;


    public Functions(String FunctionType , String FunctionId, List<AstNode> parameter, List<AstNode> body){
        this.FunctionType =  FunctionType;
        this.FunctionId = FunctionId;
        this.parameter= parameter;
        this.body = body;

    }

    @Override
    public String toString(){
        return "func" +FunctionType + " " + FunctionId + " " + parameter+ "  " + body;
    }
}
