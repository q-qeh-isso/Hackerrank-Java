import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class JavaDateAndTime {

	public static void main(String[] args) {
		int month = 10;
		int day = 14;
		int year = 2021;
		
		Calendar cal = new GregorianCalendar(year, month, day);
		//Calendar cal = Calendar.getInstance();
		//cal.set(year, month, day);
		String dayName = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
		
		//System.out.println(cal.getTime());
		System.out.println(dayName);
		//System.out.println(cal.getFirstDayOfWeek());

	}

}
