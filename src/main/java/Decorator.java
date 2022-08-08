import AstNodes.Addition;
import AstNodes.AstNode;
import AstNodes.Print;
import dAstNodes.*;
public class Decorator {

    public dAstNode visit(AstNode e){
        if (e instanceof AstNodes.Addition){
            visitAddition(((Addition) e).getLeft(), ((Addition) e).right);
        }else if(e instanceof AstNodes.Print){
            visit(((Print) e).body);
        }else{
            System.out.println("None matched");
        }
        return null;
    }

    public dAstNode visitAddition(AstNode left, AstNode right){
        System.out.println("vi er her " + left + " and " + right);
            return new dAstNodes.Addition(left, right);
    }
}
