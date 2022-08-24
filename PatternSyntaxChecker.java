import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		String a = "([A-Z])(.+)";
		String b = "[AZ[a-z](a-z)";
		String c = "batcatpat(nat";
		
		try {
			Pattern pt = Pattern.compile(c);
			System.out.println("Valid");
		}catch (PatternSyntaxException e) {
			System.out.println("Invalid");
		}
		
		

	}

}
