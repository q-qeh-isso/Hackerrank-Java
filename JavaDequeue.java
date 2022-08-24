import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class JavaDequeue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            arr[i] = num;
        }
        in.close();
        
        Iterator<Integer> it = deque.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        	//System.out.println(obj.toString());
        }

	}

}
