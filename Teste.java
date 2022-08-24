import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		//int test = -4 + -4;
		//System.out.println(test);
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> arrRowItems = new ArrayList<>(Arrays.asList(-1, -1, 0, -9, -2, -2));
		arr.add(arrRowItems);
		
		arrRowItems = new ArrayList<>(Arrays.asList(-2, -1, -6, -8, -2, -5));
		arr.add(arrRowItems);
		
		arrRowItems = new ArrayList<>(Arrays.asList(-1, -1, -1, -2, -3, -4));
		arr.add(arrRowItems);
		
		arrRowItems = new ArrayList<>(Arrays.asList(-1, -9, -2, -4, -4, -5));
		arr.add(arrRowItems);
		
		arrRowItems = new ArrayList<>(Arrays.asList(-7, -3, -3, -2, -9, -9));
		arr.add(arrRowItems);
		
		arrRowItems = new ArrayList<>(Arrays.asList(-1, -3, -1, -2, -4, -5));
		arr.add(arrRowItems);
		for(int k = 0; k < 6; k++){
            for(int m = 0; m < 6; m++){
            	System.out.printf("%02d ", arr.get(k).get(m));
            }
            System.out.println();
        }
		
		
		int res = (int) Math.pow(-2, 31);
        for(int k = 0; k < 4; k++){
            for(int m = 0; m < 4; m++){
                int top = arr.get(k).get(m) + arr.get(k).get(m+1) + arr.get(k).get(m+2);
                int mid = arr.get(k+1).get(m+1);
                int bott = arr.get(k+2).get(m) + arr.get(k+2).get(m+1) + arr.get(k+2).get(m+2);
                
                int sum = top+mid+bott;
                //System.out.println(sum);
                if(sum > res) {res = sum;}
            }
        }
        /*if(res == 0){
            for(int i = 0; i < 4; i++){
                for(int j = 4; j < arr.size(); j++){
                    int top
                }
            }
        }*/
        System.out.println((-2 + -1 + -1 + -1 + -1));
        System.out.println(res);

	}

}
