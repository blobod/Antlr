package Expression;
import java.util.ArrayList;
import java.util.List;

public class typeChecking extends Expression {
    Expression left;
    Expression right;
    public String err;
    public typeChecking(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public Boolean expChecker(Expression left, Expression right){
        boolean leftCheck = false;
        try{
            Integer.parseInt(left.toString());
            leftCheck = true;
            Integer.parseInt(right.toString());
            return false;
        }catch (NumberFormatException e){
            try {
                if (leftCheck){
                    return true;
                }
                Double.parseDouble(left.toString());
                Double.parseDouble(right.toString());
                return false;
            }catch (NumberFormatException r){
                return true;
            }

        }
    }

    public Boolean defChecker(String type, Type value){
        boolean check = false;
        if (type.equals("int")){
            try{
                int x = Integer.parseInt(value.toString());
                System.out.println(x);
            }catch (NumberFormatException e){
                check = true;
            }

        }
        return check;
    }
}
