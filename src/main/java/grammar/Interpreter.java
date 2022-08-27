package grammar;
import AstNodes.*;

import java.util.*;

public class Interpreter {
    public Map<String, AstNode> values;
    public Map<String, List<AstNode>> functionsBody;
    public Map<String, List<AstNode>> functionsParameters;
    public int breakCheck = 0;
    public Interpreter() {
        values = new HashMap<>();
        functionsBody = new HashMap<>();
        functionsParameters = new HashMap<>();
    }

    public AstNode visitAst(AstNode astNode){
        if (astNode instanceof Addition) {
            AstNode left = visitAst(((Addition) astNode).left);
            AstNode right = visitAst(((Addition) astNode).right);
            if (left instanceof IntType) {
                return new IntType(Integer.parseInt(left.toString()) + Integer.parseInt(right.toString()));
            } else if (left instanceof DoubleType) {
                return new DoubleType(Double.parseDouble(left.toString()) + Double.parseDouble(right.toString()));
            }
        } else if (astNode instanceof Substraktion) {
            AstNode left = visitAst(((Substraktion) astNode).left);
            AstNode right = visitAst(((Substraktion) astNode).right);
            if (left instanceof IntType) {
                return new IntType(Integer.parseInt(left.toString()) - Integer.parseInt(right.toString()));
            } else if (left instanceof DoubleType) {
                return new DoubleType(Double.parseDouble(left.toString()) - Double.parseDouble(right.toString()));
            }
        } else if (astNode instanceof Multiplication) {
            AstNode left = visitAst(((Multiplication) astNode).left);
            AstNode right = visitAst(((Multiplication) astNode).right);
            if (left instanceof IntType) {
                return new IntType(Integer.parseInt(left.toString()) * Integer.parseInt(right.toString()));
            } else if (left instanceof DoubleType) {
                return new DoubleType(Double.parseDouble(left.toString()) * Double.parseDouble(right.toString()));
            }
        } else if (astNode instanceof Division) {
            AstNode left = visitAst(((Division) astNode).left);
            AstNode right = visitAst(((Division) astNode).right);
            if (left instanceof IntType) {
                return new IntType(Integer.parseInt(left.toString()) * Integer.parseInt(right.toString()));
            } else if (left instanceof DoubleType) {
                return new DoubleType(Double.parseDouble(left.toString()) * Double.parseDouble(right.toString()));
            }
        } else if (astNode instanceof GreaterThan) {
            AstNode left = visitAst(((GreaterThan) astNode).left);
            AstNode right = visitAst(((GreaterThan) astNode).right);
            if (left instanceof IntType){
                if (Integer.parseInt(left.toString()) > Integer.parseInt(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }else if(left instanceof DoubleType){
                if (Double.parseDouble(left.toString()) > Double.parseDouble(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof LesserThan) {
            AstNode left = visitAst(((LesserThan) astNode).left);
            AstNode right = visitAst(((LesserThan) astNode).right);
            if (left instanceof IntType){
                if (Integer.parseInt(left.toString()) < Integer.parseInt(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }else if(left instanceof DoubleType){
                if (Double.parseDouble(left.toString()) < Double.parseDouble(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof GreaterorEqualThan) {
            AstNode left = visitAst(((GreaterorEqualThan) astNode).left);
            AstNode right = visitAst(((GreaterorEqualThan) astNode).right);
            if (left instanceof IntType){
                if (Integer.parseInt(left.toString()) >= Integer.parseInt(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }else if(left instanceof DoubleType){
                if (Double.parseDouble(left.toString()) >= Double.parseDouble(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof LesserorEqualThan) {
            AstNode left = visitAst(((LesserorEqualThan) astNode).left);
            AstNode right = visitAst(((LesserorEqualThan) astNode).right);
            if (left instanceof IntType){
                if (Integer.parseInt(left.toString()) <= Integer.parseInt(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }else if(left instanceof DoubleType){
                if (Double.parseDouble(left.toString()) <= Double.parseDouble(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof EqualWith) {
            AstNode left = visitAst(((EqualWith) astNode).left);
            AstNode right = visitAst(((EqualWith) astNode).right);
            if (left instanceof IntType){
                if (Integer.parseInt(left.toString()) == Integer.parseInt(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }else if(left instanceof DoubleType){
                if (Double.parseDouble(left.toString()) == Double.parseDouble(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof isNotEqualWith) {
            AstNode left = visitAst(((isNotEqualWith) astNode).left);
            AstNode right = visitAst(((isNotEqualWith) astNode).right);
            if (left instanceof IntType){
                if (Integer.parseInt(left.toString()) != Integer.parseInt(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }else if(left instanceof DoubleType){
                if (Double.parseDouble(left.toString()) != Double.parseDouble(right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof VariableDeclarationWithValue) {
            values.put(((VariableDeclarationWithValue) astNode).id, ((VariableDeclarationWithValue) astNode).value);
            return new VariableDeclarationWithValue(((VariableDeclarationWithValue) astNode).type, ((VariableDeclarationWithValue) astNode).id, ((VariableDeclarationWithValue) astNode).value, true);
        }else if (astNode instanceof VariableDeclarationNoValue) {
            if (!values.containsKey(((VariableDeclarationNoValue) astNode).id) && ((VariableDeclarationNoValue) astNode).type.equals("int")){
                values.put(((VariableDeclarationNoValue) astNode).id, new IntType(0));
                return new VariableDeclarationWithValue(((VariableDeclarationNoValue) astNode).type, ((VariableDeclarationNoValue) astNode).id, new IntType(0), true);
            }else if (!values.containsKey(((VariableDeclarationNoValue) astNode).id) && ((VariableDeclarationNoValue) astNode).type.equals("double")){
                values.put(((VariableDeclarationNoValue) astNode).id, new DoubleType(0.0));
                return new VariableDeclarationWithValue(((VariableDeclarationNoValue) astNode).type, ((VariableDeclarationNoValue) astNode).id, new DoubleType(0.0), true);
            }else{
                return new TxtType(((VariableDeclarationNoValue) astNode).id);
            }
        }
        else if (astNode instanceof VariableReDeclaration) {
            values.put(((VariableReDeclaration) astNode).id, visitAst(((VariableReDeclaration) astNode).value));
            return new VariableReDeclaration(((VariableReDeclaration) astNode).id, ((VariableReDeclaration) astNode).value, true);
        } else if (astNode instanceof If) {
            int i = 0;
            if(Boolean.parseBoolean(visitAst(((If) astNode).condition).toString())){
            while (i < ((If) astNode).body.size()) {
                visitAst(((If) astNode).body.get(i));
                i++;
            }}
            return new If(((If) astNode).condition, ((If) astNode).body);
        } else if (astNode instanceof If_else) {
            int i = 0;
            if (Boolean.parseBoolean(visitAst(((If_else) astNode).condition).toString()) && breakCheck== 0){
            while (i < ((If_else) astNode).body.size()) {
                visitAst(((If_else) astNode).body.get(i));
                i++;
            }}else{
            while (i < ((If_else) astNode).Else.size() && breakCheck== 0) {
                visitAst(((If_else) astNode).Else.get(i));
                i++;
            }}
            breakCheck = 0;
            return new If_else(((If_else) astNode).condition, ((If_else) astNode).body, ((If_else) astNode).Else);
        } else if (astNode instanceof Forever_Loop) {
            int i = 0;
            while(breakCheck == 0) {
                while (i < ((Forever_Loop) astNode).body.size()) {
                    visitAst(((Forever_Loop) astNode).body.get(i));
                    i++;
                }
                i = 0;
            }
            breakCheck = 0;
        } else if (astNode instanceof Print) {
            System.out.print(visitAst(((Print) astNode).body).toString() + " ");
            return new Print(((Print) astNode).body);
        } else if (astNode instanceof Println) {
            System.out.println(visitAst(((Println) astNode).body).toString() + " ");
            return new Print(((Println) astNode).body);
        } else if (astNode instanceof While) {
            int i = 0;
            while (Boolean.parseBoolean(visitAst(((While) astNode).condition).toString()) && breakCheck== 0){
            while (i < ((While) astNode).body.size()) {
                visitAst(((While) astNode).body.get(i));
                i++;
            }
                i = 0;
            }
            return new While(((While) astNode).condition, ((While) astNode).body);
        } else if (astNode instanceof Language) {
            int i = 0;
            while (i < ((Language) astNode).body.size()) {
                visitAst(((Language) astNode).body.get(i));
                i++;

                breakCheck = 1;
            }
            return new Language(((Language) astNode).body);

        } else if (astNode instanceof FunctionsWithReturn) {
            values.put(((FunctionsWithReturn) astNode).FunctionId, ((FunctionsWithReturn) astNode).returnValue);
            int i = 0;
            while (i < ((FunctionsWithReturn) astNode).parameter.size()){
                visitAst(((FunctionsWithReturn) astNode).parameter.get(i));
                i++;
            }
                functionsParameters.put(((FunctionsWithReturn) astNode).FunctionId, ((FunctionsWithReturn) astNode).parameter);

                functionsBody.put(((FunctionsWithReturn) astNode).FunctionId, ((FunctionsWithReturn) astNode).body);

        }else if (astNode instanceof FunctionsWithoutReturn) {
            int i = 0;
            while (i < ((FunctionsWithoutReturn) astNode).parameter.size()){
                visitAst(((FunctionsWithoutReturn) astNode).parameter.get(i));
                i++;
            }
            values.put(((FunctionsWithoutReturn) astNode).FunctionId, null);
            functionsParameters.put(((FunctionsWithoutReturn) astNode).FunctionId, ((FunctionsWithoutReturn) astNode).parameter);
            functionsBody.put(((FunctionsWithoutReturn) astNode).FunctionId, ((FunctionsWithoutReturn) astNode).body);
        }else if (astNode instanceof FunctionCall) {
            int x = 0;
            while (x < (functionsParameters.get(((FunctionCall) astNode).functionID).size()) ){
                AstNode id = visitAst(functionsParameters.get(((FunctionCall) astNode).functionID).get(x));
                values.put(visitAst(id).toString(), ((FunctionCall) astNode).parameter.get(x));
                x++;
            }
            int i = 0;
            while(i < functionsBody.get(((FunctionCall) astNode).functionID).size()) {
                visitAst(functionsBody.get(((FunctionCall) astNode).functionID).get(i));
                i++;
            }
            int z = 0;
            while(z < ((FunctionCall) astNode).parameter.size()){
                visitAst(((FunctionCall) astNode).parameter.get(z));
                if (((FunctionCall) astNode).parameter.get(z) != null){
                }
                z++;
            }
            return visitAst(values.get(((FunctionCall) astNode).functionID));
        } else if (astNode instanceof ForLoop) {
            int i = 0;
            visitAst(((ForLoop) astNode).initialization);
            while(Boolean.parseBoolean(visitAst(((ForLoop) astNode).condition).toString()) && breakCheck== 0) {
            visitAst(((ForLoop) astNode).expression);
                while (i < ((ForLoop) astNode).body.size()) {
                    visitAst(((ForLoop) astNode).body.get(i));
                    i++;
                }
                i = 0;
            }
            breakCheck = 0;
            return new ForLoop(((ForLoop) astNode).condition, ((ForLoop) astNode).initialization, ((ForLoop) astNode).expression, ((ForLoop) astNode).body);
        }
        else if(astNode instanceof Break){
            breakCheck = 1;
        }
        else if(astNode instanceof Stop){
            System.exit(0);
        }
        else if(astNode instanceof IntType){
            return new IntType(((IntType) astNode).num);
        }else if(astNode instanceof DoubleType){
            return new DoubleType(((DoubleType) astNode).doub);
        }else if(astNode instanceof TxtType){
            return new TxtType(((TxtType) astNode).string);
        }else if(astNode instanceof BooleanType){
            return new BooleanType(((BooleanType) astNode).bool);
        }else if(astNode instanceof  Variable){
                return values.get(((Variable) astNode).id);

        }
        return null;
    }
}