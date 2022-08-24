import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class JavaHashSet {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        /*for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }*/
        /*for (int i = 0; i < pair_left.length; i++) {
			System.out.println(pair_left[i]);
		}
        for (int i = 0; i < pair_right.length; i++) {
			System.out.println(pair_right[i]);
		}*/
        pair_left[0] = "john";
        pair_right[0] = "tom";
        pair_left[1] = "john";
        pair_right[1] = "mary";
        pair_left[2] = "john";
        pair_right[2] = "tom";
        pair_left[3] = "mary";
        pair_right[3] = "anna";
        pair_left[4] = "mary";
        pair_right[4] = "anna";
        
        Set set =  new HashSet();
        for (int i =0 ; i<t ;i++){
            set.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(set.size());
        }
        /*for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }*/
        
        /*Set<String[]> hsleft = new HashSet<String[]>();
        Set<String[]> hsright = new HashSet<String[]>();
        hsleft.add(pair_left);
        hsright.add(pair_right);
        Iterator hsleftIt = hsleft.iterator();
        while(hsleftIt.hasNext()) {
        	String temp = hsleftIt.next().toString();
        	System.out.println(temp);
        }*/
        
        /*for(Iterator<String[]> iter = hs.iterator(){
            while(iter.hasNext()) {
            	String str_left = iter.next();
            }
        }*/
        //Write your code here

    }
}
