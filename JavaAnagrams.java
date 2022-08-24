import java.util.Arrays;

public class JavaAnagrams {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "hello";

		if(a.length() != b.length()) {
			System.out.println("len diferente");
		}
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		char[] aArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		char[] check = new char[aArr.length];
		int checkIdx = 0;
		boolean isAnagram = true;

		int i = 0;
		while(i < aArr.length) {
			char letter = aArr[i];
			int countSame = 0;
			boolean alreadyChecked = false;
			for(int u = 0; u < check.length; u++) {
				if(check[u] == letter) {
					alreadyChecked = true;
					i++;
					break;
				}
			}

			if(alreadyChecked) continue;
			for (int j = i; j < aArr.length; j++) {
				if(aArr[j] == letter) {
					countSame++;
				}
			}
			int countBSame = 0;
			for (int j = 0; j < bArr.length; j++) {
				if(bArr[j] == letter) {
					countBSame++;
				}
			}
			if(countSame != countBSame) {
				isAnagram = false;
				break;
				//return false;
			}
			
			if(countSame == countBSame && countSame > 0) {
				check[checkIdx] = letter;
				checkIdx++;
			}
			
			i++;
		}
		
		//return true;
		if(isAnagram) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}

	}

}
