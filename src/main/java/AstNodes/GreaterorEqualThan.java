package AstNodes;

public class GreaterorEqualThan extends AstNode {
    public AstNode left;
    public AstNode right;

    public GreaterorEqualThan(AstNode left, AstNode right) {
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}
