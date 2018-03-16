package languagePack;

import java.util.List;
import org.languagetool.JLanguageTool;
import org.languagetool.language.BritishEnglish;
import org.languagetool.rules.RuleMatch;


public class LangPackMain {

	public static void main(String[] args) {
		
		JLanguageTool langTool = new JLanguageTool(new BritishEnglish());
		
		try{
			String text = TextLoader.fileReader();
			List<RuleMatch> matches = langTool.check(text);
			System.out.println(text);
			
			for (RuleMatch match : matches){
			  System.out.println("Potential error at line " +
			      match.getLine() + ", column " +
			      match.getColumn() + ": " + match.getMessage());
			  System.out.println("Suggested correction: " +
			      match.getSuggestedReplacements());
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}