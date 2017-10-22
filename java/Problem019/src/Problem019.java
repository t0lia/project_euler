import java.util.GregorianCalendar;
import java.util.Calendar;

public class Problem019 {
	public static void main(String args[]) {
		GregorianCalendar calendar = new GregorianCalendar();

		calendar.set(Calendar.YEAR, 1901);
		calendar.set(Calendar.MONTH, 0); 
		calendar.set(Calendar.DAY_OF_MONTH, 1); 
		
		int sum = 0;
		while (true) {
			int year       = calendar.get(Calendar.YEAR); 
			int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 

			if (calendar.get(Calendar.DAY_OF_WEEK) == 1) { 
				if (dayOfMonth == 1){
					sum++;
				}
			}
			
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			if (year == 2001)
				break;
		}
		StdOut.printf("%d%n", sum);		
	}
}