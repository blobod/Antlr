package AstNodes;

public class GreaterThan extends AstNode {

    public AstNode left;
    public AstNode right;
    public boolean typeChecking;
    public GreaterThan(AstNode left, AstNode right, boolean typeChecking) {
        this.left = left;
        this.right = right;
        this.typeChecking = typeChecking;
    }

    public String toString(){
        return left.toString() + " > " + right.toString();
    }
}

