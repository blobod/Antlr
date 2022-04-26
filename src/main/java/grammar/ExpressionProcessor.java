package grammar;

import AST2.*;
import AST2.Number;

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

            }else
            {
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
        }else{
            Division div = (Division) e;
            int left = getEvalResult(div.left);
            int right = getEvalResult(div.right);

            result = left / right;
        }
        return result;
    }
}
