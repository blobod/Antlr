package AstNodes;

public class Addition extends AstNode {
    public AstNode left;
    public AstNode right;

    public Addition(AstNode left, AstNode right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        System.out.println("vi er i ast addition");
        return left.toString() + " + " + right.toString();
    }


    public AstNode getLeft(){return left;}
    public AstNode getRight(){return right;}

}
