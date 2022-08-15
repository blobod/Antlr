//package grammar;
//
//import AstNodes.Integer;
//import AstNodes.*;
//import org.apache.commons.math3.util.Precision;
//
//import java.util.*;
//
//public class Interpreter {
//    List<AstNode> list;
//    public Map<String, Type> values;
//    int ForeverCheck = 0;
//
//    public Interpreter(List<AstNode> list) {
//        this.list = list;
//        values = new HashMap<>();
//    }
//
//    public List<String> getEvaluationResults() {
//        List<String> evaluations = new ArrayList<>();
//        for (AstNode e : list) {
//            if (e instanceof VariableDeclaration) {
//                String id = ((VariableDeclaration) e).id;
//                Integer value = new Integer(((VariableDeclaration) e).value);
//                values.put(id, value);
//                evaluations.add("Variable declaration id:  " + id + " value: " + value);
//
//            } else if (e instanceof VariableReDeclaration) {
//                String id = ((VariableReDeclaration) e).id;
//                AstNode astNode = ((VariableReDeclaration) e).astNode;
//                Type value = getEvalResult(astNode);
//                values.put(id, value);
//                evaluations.add("Variable redeclaration id:  " + id + " value: " + value);
//            } else if (e instanceof Forever_Loop) {
//                ForeverCheck = 1;
//                List<AstNode> body = ((Forever_Loop) e).body;
//                while (ForeverCheck == 1) {
//                    body = ((Forever_Loop) e).body;
//                    for (AstNode astNode : body) {
//                        getEvalResult(astNode);
//                    }
//                }
//                evaluations.add("Forever loop body: " + body);
//            } else if (e instanceof If) {
//                AstNode condition = ((If) e).condition;
//                Type check = getEvalResult(condition);
//                List<AstNode> body = ((If) e).body;
//                if (java.lang.Integer.parseInt(check.toString()) == 1) {
//                    body = ((If) e).body;
//                    for (AstNode astNode : body) {
//                        getEvalResult(astNode);
//                    }
//                }
//                evaluations.add("If statement condition: " + condition + " body: " + body);
//            } else if (e instanceof Print) {
//                AstNode body = ((Print) e).body;
//                System.out.println(getEvalResult(body));
//                evaluations.add(getEvalResult(body).toString());
//            } else if (e instanceof While) {
//                AstNode condition = ((While) e).condition;
//                Type check = getEvalResult(condition);
//                while (java.lang.Integer.parseInt(check.toString()) == 1) {
//                    List<AstNode> body = ((While) e).body;
//                    for (AstNode astNode : body) {
//                        getEvalResult(astNode);
//                    }
//                    check = getEvalResult(condition);
//                    evaluations.add("While : " + condition + " do: " + body);
//                }
//            } else if (e instanceof If_else) {
//                AstNode condition = ((If_else) e).condition;
//                Type check = getEvalResult(condition);
//                if (java.lang.Integer.parseInt(check.toString()) == 1) {
//                    List<AstNode> body = ((If_else) e).body;
//                    for (AstNode astNode : body) {
//                        getEvalResult(astNode);
//                    }
//                } else {
//                    List<AstNode> elseBody = ((If_else) e).Else;
//                    for (AstNode astNode : elseBody) {
//                        getEvalResult(astNode);
//                    }
//                }
//            } else if (e instanceof Input input) {
//                Scanner myObj = new Scanner(System.in);
//                System.out.println("Enter value: ");
//                String value = myObj.nextLine();
//                String type;
//                Type typeValue;
//                try {
//                    int x = java.lang.Integer.parseInt(value);
//                    typeValue = new Type(x);
//                    type = "int";
//                    VariableDeclaration scannerTest = new VariableDeclaration(input.toString(), type, typeValue);
//                    values.put(input.toString(), typeValue);
//                    getEvalResult(scannerTest);
//                } catch (NumberFormatException c) {
//                    try {
//                        double y = Float.parseFloat(value);
//                        y = Precision.round(y, 2);
//                        typeValue = new Type(y);
//                        type = "double";
//                        VariableDeclaration scannerTest = new VariableDeclaration(input.toString(), type, typeValue);
//                        values.put(input.toString(), typeValue);
//                        getEvalResult(scannerTest);
//                    } catch (NumberFormatException g) {
//                        typeValue = new Type(value);
//                        type = "txt";
//                        VariableDeclaration scannerTest = new VariableDeclaration(input.toString(), type, typeValue);
//                        values.put(input.toString(), typeValue);
//                        getEvalResult(scannerTest);
//                    }
//                }
//
//                System.out.print("TYPE DEF " + input + " " + type + " " + typeValue + "\n");
//            } else {
//                String input = e.toString();
//                Type result = getEvalResult(e);
//                evaluations.add(input + " is " + result);
//            }
//        }
//
//        return evaluations;
//
//    }
//
//    private Type getEvalResult(AstNode e) {
//        int result = 0;
//
//        if (e instanceof Integer num) {
//            return new Type(num.num);
//        } else if (e instanceof Variable var) {
//            try {
//                result = java.lang.Integer.parseInt(values.get(var.id).toString());
//            } catch (NumberFormatException c) {
//                try {
//                    float floatresult = Float.parseFloat(values.get(var.id).toString());
//                    return new Type(floatresult);
//                } catch (NumberFormatException z) {
//                    String txtresult = values.get(var.id).toString();
//                    return new Type(txtresult);
//                }
//            }
//        } else if (e instanceof Multiplication multi) {
//            int left = java.lang.Integer.parseInt(getEvalResult(multi.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(multi.right).toString());
//
//            result = left * right;
//        } else if (e instanceof Division div) {
//            int left = java.lang.Integer.parseInt(getEvalResult(div.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(div.right).toString());
//
//            result = left / right;
//        } else if (e instanceof Addition add) {
//            int left = java.lang.Integer.parseInt(getEvalResult(add.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(add.right).toString());
//            result = left + right;
//        } else if (e instanceof Substraktion sub) {
//            int left = java.lang.Integer.parseInt(getEvalResult(sub.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(sub.right).toString());
//
//            result = left - right;
//        } else if (e instanceof Power_Of pow) {
//            int left = java.lang.Integer.parseInt(getEvalResult(pow.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(pow.right).toString());
//
//            result = (int) Math.pow(left, right);
//        } else if (e instanceof GreaterThan great) {
//            int left = java.lang.Integer.parseInt(getEvalResult(great.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(great.right).toString());
//            if (left > right) {
//                return new Type("true");
//            }else{
//                return new Type("false");
//            }
//        } else if (e instanceof LesserThan lesser) {
//            int left = java.lang.Integer.parseInt(getEvalResult(lesser.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(lesser.right).toString());
//            if (left < right) {
//                return new Type("true");
//            }else{
//                return new Type("false");
//            }
//        } else if (e instanceof EqualWith equalWith) {
//            int left = java.lang.Integer.parseInt(getEvalResult(equalWith.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(equalWith.right).toString());
//            if (left == right) {
//                return new Type("true");
//            }else{
//                return new Type("false");
//            }
//        } else if (e instanceof GreaterorEqualThan greaterorequal) {
//            int left = java.lang.Integer.parseInt(getEvalResult(greaterorequal.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(greaterorequal.right).toString());
//            if (left >= right) {
//                return new Type("true");
//            }else{
//                return new Type("false");
//            }
//        } else if (e instanceof LesserorEqualThan lesserorequal) {
//            int left = java.lang.Integer.parseInt(getEvalResult(lesserorequal.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(lesserorequal.right).toString());
//            if (left <= right) {
//                return new Type("true");
//            }else{
//                return new Type("false");
//            }
//        } else if (e instanceof isNotEqualWith notequal) {
//            int left = java.lang.Integer.parseInt(getEvalResult(notequal.left).toString());
//            int right = java.lang.Integer.parseInt(getEvalResult(notequal.right).toString());
//            if (left != right) {
//                return new Type("true");
//            }else{
//                return new Type("false");
//            }
//        } else if (e instanceof Print print) {
//            System.out.println(getEvalResult(print.body));
//        } else if (e instanceof VariableReDeclaration) {
//            String id = ((VariableReDeclaration) e).id;
//            AstNode astNode = ((VariableReDeclaration) e).astNode;
//            Type value = new Type(getEvalResult(astNode));
//            values.put(id, value);
//        } else if (e instanceof If) {
//            AstNode condition = ((If) e).condition;
//            int check = java.lang.Integer.parseInt(getEvalResult(condition).toString());
//            if (check == 1) {
//                List<AstNode> body = ((If) e).body;
//                for (AstNode astNode : body) {
//                    getEvalResult(astNode);
//                }
//            }
//        } else if (e instanceof txt txt) {
//            return new Type(txt);
//        } else if (e instanceof If_else) {
//            AstNode condition = ((If_else) e).condition;
//            int check = java.lang.Integer.parseInt(getEvalResult(condition).toString());
//            if (check == 1) {
//                List<AstNode> body = ((If_else) e).body;
//                for (AstNode astNode : body) {
//                    getEvalResult(astNode);
//                }
//            } else {
//                List<AstNode> elseBody = ((If_else) e).Else;
//                for (AstNode astNode : elseBody) {
//                    getEvalResult(astNode);
//                }
//            }
//        } else if (e instanceof Break) {
//            ForeverCheck = 0;
//        }
//
//
//        return new Type(result);
//    }
//}
