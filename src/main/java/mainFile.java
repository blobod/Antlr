import AstNodes.Addition;
import AstNodes.AstNode;
import AstNodes.Language;
import AstNodes.SyntaxAnalysis;
import dAstNodes.dAstNode;
//import grammar.Interpreter;
import grammar.Interpreter;
import grammar.languageLexer;
import grammar.languageParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class mainFile {
    public static void main(String[] args) {
        try {
            String source = "test.txt";
            CharStream cs = fromFileName(source);
            languageLexer lexer = new languageLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            languageParser parser = new languageParser(token);
            ParseTree tree = parser.language();

            CstToAst visitor = new CstToAst();
            AstNode ast = visitor.visit(tree);

            ContextualAnalysis decorator = new ContextualAnalysis();

            AstNode dast = decorator.visitAST(ast);

            Interpreter ep = new Interpreter();
            ep.visitAst(dast);
            } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
