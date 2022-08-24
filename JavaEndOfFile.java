import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaEndOfFile {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while(true){
            String tst = "";
            try{
                tst = br.readLine();
                if(tst == null)break;
                System.out.println(i + " " + tst);
            }catch(IOException e){ }
            
            i++;
        }

	}

}
