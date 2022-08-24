import java.util.Iterator;

public class JavaStringTokens {

	public static void main(String[] args) {
		String s = "                        ";
		System.out.println(s);
		
		//String[] arr = s.split("[\\x20\\x27\\x2C\\x2E\\x40\\x5F\\x21\\x3F]+");
		String[] arr = s.trim().split("[ !,?._'@]+");
		
		if(arr.length >= 1 && !arr[0].isEmpty() ) {
			System.out.println(arr.length);
			for(String tmp : arr) {
				System.out.println(tmp);
			}
		} else {
			System.out.println(0);
		}
		

	}

}
