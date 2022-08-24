import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        
        //System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
		/*NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US: " + nf.format(payment));
		Locale indiaLocal = new Locale("en", "IN");
		nf = NumberFormat.getCurrencyInstance(indiaLocal);
		System.out.println("India: " + nf.format(payment));
		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("China: " + nf.format(payment));
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("France: " + nf.format(payment));*/
        Locale.setDefault(Locale.US);
        String us = NumberFormat.getCurrencyInstance().format(payment);
        
		Locale indiaLocal = new Locale("en", "IN");
		Locale.setDefault(indiaLocal);
		String india = NumberFormat.getCurrencyInstance().format(payment);
		
		Locale.setDefault(Locale.CHINA);
		String china = NumberFormat.getCurrencyInstance().format(payment);
		
		Locale.setDefault(Locale.FRANCE);
		String france = NumberFormat.getCurrencyInstance().format(payment);
		
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}

}
