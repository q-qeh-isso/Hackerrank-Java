public class JavaStringReverse {

	public static void main(String[] args) {
		String s = "madam";
		
		//System.out.println(s.substring(-1));
		String sReverse = "";
		for (int i = s.length()-1; i >= 0; i--) {
			sReverse += s.charAt(i);
		}
		System.out.println(sReverse);
		if(s.equals(sReverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
