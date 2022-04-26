import AST2.Language;
import grammar.languageBaseVisitor;
import grammar.languageParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToLanguage extends languageBaseVisitor<Language> {
    public List<String> semanticErrors;

    @Override public Language visitLanguage(languageParser.LanguageContext ctx) {
       Language language = new Language();
       semanticErrors = new ArrayList<>();

       AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
       for (int i = 0; i < ctx.getChildCount(); i++){
            if (i == ctx.getChildCount() - 1){
                System.out.println("\n EOF");
            }else{
                language.addExpression(exprVisitor.visit(ctx.getChild(i)));
            }

        }

       return language;
    }
}
