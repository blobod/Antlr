import Expression.Language;
import grammar.ExpressionProcessor;
import grammar.languageLexer;
import grammar.languageParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class UnitTestInterpreter {

    public ExpressionProcessor txtToInterpreter(String txt) {
        try {
            CharStream cs = fromFileName(txt);
            languageLexer lexer = new languageLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            languageParser parser = new languageParser(token);
            ParseTree tree = parser.language();

            AntlrToLanguage visitor = new AntlrToLanguage();
            Language lang = visitor.visit(tree);

            if (visitor.semanticErrors.isEmpty() && visitor.typeErrors.isEmpty()) {
                ExpressionProcessor ep = new ExpressionProcessor(lang.expressions);
                return ep;
            } else {
                for (String err : visitor.semanticErrors) {
                    System.out.println(err);
                }
                for (String err : visitor.typeErrors) {
                    System.out.println(err);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }



    @Test
    public void ExpressionTest(){
        ExpressionProcessor ep = txtToInterpreter("ExpressionTest.txt");
        Assertions.assertEquals(33, Integer.parseInt(ep.getEvaluationResults().get(0)));
        Assertions.assertEquals(10, Integer.parseInt(ep.getEvaluationResults().get(1)));
        Assertions.assertEquals(6, Integer.parseInt(ep.getEvaluationResults().get(2)));
    }

    @Test
    public void ConditionTest(){
        ExpressionProcessor ep = txtToInterpreter("ConditionTest.txt");
        Assertions.assertTrue(Boolean.parseBoolean(ep.getEvaluationResults().get(0)));
    }

}

