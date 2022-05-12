package grammar;

import Expression.*;
import Expression.Number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor {
    List<Expression> list;
    public Map<String, Integer> values;

    public ExpressionProcessor(List<Expression> list){
        this.list = list;
        values = new HashMap<>();
    }

    public List<String> getEvaluationResults(){
        List<String> evaluations = new ArrayList<>();
        for (Expression e: list){
            if (e instanceof VariableDeclaration decl){
                values.put(decl.id, decl.value);
            }else if(e instanceof VariableReDeclaration redecl){
                values.put(redecl.id, redecl.value);
            }
            else if (e instanceof Forever_Loop)
            {
                int result = 0;
                String input = e.toString();
                for (int i = 0; i < ((Forever_Loop) e).block.size(); i++) {
                    result = getEvalResult(((Forever_Loop) e).block.get(i));
                    evaluations.add(input + " is " + result);
                }
            }else if(e instanceof If){
                Expression condition = ((If) e).condition;
                int check = getEvalResult(condition);
                if (check == 1){
                    Expression body = ((If) e).body;
                    getEvalResult(body);
                }

                System.out.println(((If) e).condition.toString());
            }
            else if(e instanceof Print){
                Expression body = ((Print) e).body;

                System.out.println("we are in print processor");
                System.out.println(getEvalResult(body));
            }
        }

        return evaluations;

    }

    private int getEvalResult(Expression e){
        int result = 0;

        if (e instanceof Number num){
            result = num.num;
        }else if(e instanceof Variable var){
            result = values.get(var.id);
        } else if(e instanceof Multiplication multi){
            int left = getEvalResult(multi.left);
            int right = getEvalResult(multi.right);

            result = left * right;
        }else if (e instanceof Division div){
            int left = getEvalResult(div.left);
            int right = getEvalResult(div.right);

            result = left / right;
        } else if (e instanceof Addition add){
            int left = getEvalResult(add.left);
            int right = getEvalResult(add.right);

            result = left + right;
        } else if (e instanceof Substraktion sub){
            int left = getEvalResult(sub.left);
            int right = getEvalResult(sub.right);
            System.out.println("addition processor");

            result = left - right;
        }
        else if (e instanceof Power_Of pow ){
            int left = getEvalResult(pow.left);
            int right = getEvalResult(pow.right);

            result = (int) Math.pow(left, right);
        }
        else if (e instanceof  GreaterThan great) {
            int left = getEvalResult(great.left);
            int right = getEvalResult(great.right);
            System.out.println("greater processor");
            if (left > right) {
                result = 1;
            } else result = 0;
        }



        return result;
    }
}
