import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "<h1>Nayeem loves counseling</h1>";
		input[1] = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
		input[2] = "<Amee>safat codes like a ninja</amee>";
		input[3] = "<SA premium>Imtiaz has a secret crush</SA premium>";
		
		
		//String regex = "[<](\\p{Print})*[>]";
		//String regex = "(?<=\\<\\p{Print}*\\>)(\\s*.*\\s*)(?=\\<\\/\\p{Print}*\\>)";
		//String regex = "<(.+)>([^<>]+)</\\1>";
		String regex = "\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";
		Pattern p = Pattern.compile(regex);

		int i = 0;
		while(i < input.length){
			String line = input[i];
			Matcher m = p.matcher(line);
			
			boolean gFound = false;
			while(m.find()) {
				System.out.println(m.group(2));
				gFound = true;
			}
			
			if(!gFound) System.out.println("None");
				
			i++;
		}
		
				

	}

}
