package grammar;
import AstNodes.*;
import org.apache.commons.math3.util.BigReal;

import java.util.*;

public class Interpreter {
    public Map<String, AstNode> values;
    public int breakCheck = 0;
    public Interpreter() {
        values = new HashMap<>();
    }

    public AstNode visitAst(AstNode astNode) throws Exception {

        if (astNode instanceof Addition) {
            AstNode left = ((Addition) astNode).left;
            AstNode right = ((Addition) astNode).right;
            if (((Addition) astNode).left instanceof Variable){
                left = visitAst(((Addition) astNode).left);
            }
            if (((Addition) astNode).right instanceof Variable){
                right = visitAst(((Addition) astNode).right);
            }
            if (left instanceof IntType) {
                return new IntType(Integer.parseInt(left.toString()) + Integer.parseInt(right.toString()));
            } else if (left instanceof DoubleType) {
                return new DoubleType(Double.parseDouble(left.toString()) + Double.parseDouble(right.toString()));
            }
        } else if (astNode instanceof Substraktion) {
            AstNode left = ((Substraktion) astNode).left;
            AstNode right = ((Substraktion) astNode).right;
            if (((Substraktion) astNode).left instanceof Variable){
                left = visitAst(((Substraktion) astNode).left);
            }
            if (((Substraktion) astNode).right instanceof Variable){
                right = visitAst(((Substraktion) astNode).right);
            }
            if (left instanceof IntType) {
                return new IntType(Integer.parseInt(left.toString()) - Integer.parseInt(right.toString()));
            } else if (left instanceof DoubleType) {
                return new DoubleType(Double.parseDouble(left.toString()) - Double.parseDouble(right.toString()));
            }
        } else if (astNode instanceof Multiplication) {
            AstNode left = ((Multiplication) astNode).left;
            AstNode right = ((Multiplication) astNode).right;
            if (((Multiplication) astNode).left instanceof Variable){
                left = visitAst(((Multiplication) astNode).left);
            }
            if (((Multiplication) astNode).right instanceof Variable){
                right = visitAst(((Multiplication) astNode).right);
            }
            if (left instanceof IntType) {
                return new IntType(Integer.parseInt(left.toString()) * Integer.parseInt(right.toString()));
            } else if (left instanceof DoubleType) {
                return new DoubleType(Double.parseDouble(left.toString()) * Double.parseDouble(right.toString()));
            }
        } else if (astNode instanceof Division) {
            AstNode left = ((Division) astNode).left;
            AstNode right = ((Division) astNode).right;
            if (((Division) astNode).left instanceof Variable){
                left = visitAst(((Division) astNode).left);
            }
            if (((Division) astNode).right instanceof Variable){
                right = visitAst(((Division) astNode).right);
            }
            if (left instanceof IntType) {
                return new IntType(Integer.parseInt(left.toString()) * Integer.parseInt(right.toString()));
            } else if (left instanceof DoubleType) {
                return new DoubleType(Double.parseDouble(left.toString()) * Double.parseDouble(right.toString()));
            }
        } else if (astNode instanceof GreaterThan) {
            if (((GreaterThan) astNode).left instanceof Variable){
                if (Integer.parseInt(visitAst(((GreaterThan) astNode).left).toString()) > Integer.parseInt(visitAst(((GreaterThan) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((GreaterThan) astNode).right instanceof Variable){
                if (Integer.parseInt(visitAst(((GreaterThan) astNode).left).toString()) > Integer.parseInt(visitAst(((GreaterThan) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((GreaterThan) astNode).left instanceof IntType) {
                if (Integer.parseInt(((GreaterThan) astNode).left.toString()) > Integer.parseInt(((GreaterThan) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            } else if (((GreaterThan) astNode).left instanceof DoubleType) {
                if (Double.parseDouble(((GreaterThan) astNode).left.toString()) > Double.parseDouble(((GreaterThan) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof LesserThan) {
            if (((LesserThan) astNode).left instanceof Variable && visitAst(((LesserThan) astNode).left) instanceof IntType){
                System.out.println("sup3 " + (visitAst(((LesserThan) astNode).left) + " " + ((LesserThan) astNode).right));
                if (Integer.parseInt(visitAst(((LesserThan) astNode).left).toString()) < Integer.parseInt(visitAst(((LesserThan) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }else if (((LesserThan) astNode).left instanceof Variable && visitAst(((LesserThan) astNode).left) instanceof DoubleType){
                if (Double.parseDouble(visitAst(((LesserThan) astNode).left).toString()) < Double.parseDouble(visitAst(((LesserThan) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((LesserThan) astNode).right instanceof Variable){
                if (Integer.parseInt(visitAst(((LesserThan) astNode).left).toString()) < Integer.parseInt(visitAst(((LesserThan) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((LesserThan) astNode).left instanceof IntType) {
                if (Integer.parseInt(visitAst(((LesserThan) astNode).left).toString()) < Integer.parseInt(visitAst(((LesserThan) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            } else if (((LesserThan) astNode).left instanceof DoubleType) {
                if (Double.parseDouble(((LesserThan) astNode).left.toString()) < Double.parseDouble(((LesserThan) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof GreaterorEqualThan) {
            if (((GreaterorEqualThan) astNode).left instanceof Variable){
                if (Integer.parseInt(visitAst(((GreaterorEqualThan) astNode).left).toString()) >= Integer.parseInt(visitAst(((GreaterorEqualThan) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((GreaterorEqualThan) astNode).right instanceof Variable){
                if (Integer.parseInt(visitAst(((GreaterorEqualThan) astNode).left).toString()) >= Integer.parseInt(visitAst(((GreaterorEqualThan) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((GreaterorEqualThan) astNode).left instanceof IntType) {
                if (Integer.parseInt(((GreaterorEqualThan) astNode).left.toString()) >= Integer.parseInt(((GreaterorEqualThan) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            } else if (((GreaterorEqualThan) astNode).left instanceof DoubleType) {
                if (Double.parseDouble(((GreaterorEqualThan) astNode).left.toString()) >= Double.parseDouble(((GreaterorEqualThan) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof LesserorEqualThan) {
            if (((LesserorEqualThan) astNode).left instanceof Variable){
                if (Integer.parseInt(visitAst(((LesserorEqualThan) astNode).left).toString()) <= Integer.parseInt(visitAst(((LesserorEqualThan) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((LesserorEqualThan) astNode).right instanceof Variable){
                if (Integer.parseInt(visitAst(((LesserorEqualThan) astNode).left).toString()) <= Integer.parseInt(visitAst(((LesserorEqualThan) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((LesserorEqualThan) astNode).left instanceof IntType) {
                if (Integer.parseInt(((LesserorEqualThan) astNode).left.toString()) <= Integer.parseInt(((LesserorEqualThan) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            } else if (((LesserorEqualThan) astNode).left instanceof DoubleType) {
                if (Double.parseDouble(((LesserorEqualThan) astNode).left.toString()) <= Double.parseDouble(((LesserorEqualThan) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof EqualWith) {
            if (((EqualWith) astNode).left instanceof Variable){
                if (Integer.parseInt(visitAst(((EqualWith) astNode).left).toString()) == Integer.parseInt(visitAst(((EqualWith) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((EqualWith) astNode).right instanceof Variable){
                if (Integer.parseInt(visitAst(((EqualWith) astNode).left).toString()) == Integer.parseInt(visitAst(((EqualWith) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((EqualWith) astNode).left instanceof IntType) {
                if (Integer.parseInt(((EqualWith) astNode).left.toString()) == Integer.parseInt(((EqualWith) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            } else if (((EqualWith) astNode).left instanceof DoubleType) {
                if (Double.parseDouble(((EqualWith) astNode).left.toString()) == Double.parseDouble(((EqualWith) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof isNotEqualWith) {
            if (((isNotEqualWith) astNode).left instanceof Variable){
                if (Integer.parseInt(visitAst(((isNotEqualWith) astNode).left).toString()) != Integer.parseInt(visitAst(((isNotEqualWith) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((isNotEqualWith) astNode).right instanceof Variable){
                if (Integer.parseInt(visitAst(((isNotEqualWith) astNode).left).toString()) != Integer.parseInt(visitAst(((isNotEqualWith) astNode).right).toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
            if (((isNotEqualWith) astNode).left instanceof IntType) {
                if (Integer.parseInt(((isNotEqualWith) astNode).left.toString()) != Integer.parseInt(((isNotEqualWith) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            } else if (((isNotEqualWith) astNode).left instanceof DoubleType) {
                if (Double.parseDouble(((isNotEqualWith) astNode).left.toString()) != Double.parseDouble(((isNotEqualWith) astNode).right.toString())){
                    return new BooleanType(true);
                }else{
                    return new BooleanType(false);
                }
            }
        } else if (astNode instanceof VariableDeclarationWithValue) {
            values.put(((VariableDeclarationWithValue) astNode).id, ((VariableDeclarationWithValue) astNode).value);
            return new VariableDeclarationWithValue(((VariableDeclarationWithValue) astNode).type, ((VariableDeclarationWithValue) astNode).id, ((VariableDeclarationWithValue) astNode).value, true);
        } else if (astNode instanceof VariableReDeclaration) {
            System.out.println("hello");
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
            }
            breakCheck = 0;
            return new Language(((Language) astNode).body);

        } else if (astNode instanceof Functions) {
            int i = 0, x = 0;
            while (i < ((Functions) astNode).parameter.size()) {
                visitAst(((Functions) astNode).parameter.get(i));
                i++;
            }
            while (x < ((Functions) astNode).body.size()) {
                visitAst(((Functions) astNode).body.get(x));
                x++;
            }

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
            try{
                return visitAst(values.get(((Variable) astNode).id));
            }catch (NullPointerException e){
                throw new Exception("Undeclared variable");
            }
        }
        return null;
    }
}