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
            if (e instanceof VariableDeclaration){
                String id = ((VariableDeclaration) e ).id;
                int value = ((VariableDeclaration) e).value;
                values.put(id, value);

            }else if(e instanceof VariableReDeclaration){
                String id = ((VariableReDeclaration) e).id;
                Expression expression = ( (VariableReDeclaration) e).expression;
                int value = getEvalResult(expression);
                values.put(id, value);
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
            }
            else if(e instanceof Print){
                Expression body = ((Print) e).body;
            }else if(e instanceof While){
                Expression condition = ((While) e).condition;
                int check = getEvalResult(condition);
                while (check == 1){
                    List<Expression> body = ((While) e).body;
                    for (Expression expression : body) {
                        getEvalResult(expression);
                    }
                    check = getEvalResult(condition);
                }
            }
            else{
                String input = e.toString();
                int result = getEvalResult(e);
                evaluations.add(input + " is " + result);
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
            if (left > right) {
                result = 1;
            } else result = 0;
        }else if(e instanceof Print print){
            System.out.println(getEvalResult(print.body));
        }else if(e instanceof VariableReDeclaration){
            String id = ((VariableReDeclaration) e).id;
            Expression expression = ( (VariableReDeclaration) e).expression;
            int value = getEvalResult(expression);
            values.put(id, value);
        }else if(e instanceof If){
            Expression condition = ((If) e).condition;
            int check = getEvalResult(condition);
            if (check == 1){
                Expression body = ((If) e).body;
                getEvalResult(body);
            }
        }



        return result;
    }
}
