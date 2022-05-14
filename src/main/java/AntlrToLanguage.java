import Expression.Language;
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
       for (int i = 0; i < ctx.getChild(0).getChildCount(); i++){
            if (i == ctx.getChild(0).getChildCount()){
                System.out.println("\n EOF");
            }
            else{
                language.addExpression(exprVisitor.visit(ctx.getChild(0).getChild(i)));
            }

        }

       return language;
    }
}
