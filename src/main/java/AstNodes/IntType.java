package AstNodes;

public class Integer extends AstNode {
    public int num;

    public Integer(int num){
        this.num = num;
    }


    public String toString(int num){
        System.out.println(num);
        return java.lang.Integer.toString(num);
    }




}
