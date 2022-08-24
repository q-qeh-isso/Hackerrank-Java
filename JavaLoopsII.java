public class JavaLoopsII {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		int n = 10;
		
		int curr = (int) (a + Math.pow(2,0) * b);
		String res = new String();
		res += String.valueOf(curr);
		for (int i = 1; i < n; i++) {
			int tmp = (int) (Math.pow(2,i) * b);
			curr += tmp;
			res += " " + String.valueOf(curr);
		}
		System.out.println(res);

	}

}
