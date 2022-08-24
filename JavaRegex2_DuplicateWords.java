import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2_DuplicateWords {

	public static void main(String[] args) {
		// \\b(\\w+)(?:\\W+\\1\\b)+
		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        String[] sentences = new String[5];
        sentences[0] = "Goodbye bye bye world world world";
        sentences[1] = "Sam went went to to to his business";
        sentences[2] = "Reya is is the the best player in eye eye game";
        sentences[3] = "in inthe";
        sentences[4] = "Hello hello Ab aB";
	    
        int i = 0;
        while (i < sentences.length) {
            String input = sentences[i];
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
            i++;
        }

	}

}
