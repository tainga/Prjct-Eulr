package euler1thru25;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class CountingSundaysWithCalendar {
	
	public static void main(String[] args) {
	
		Calendar calendar = new GregorianCalendar();
		int total = 0;
	 
	for (int year = 1901; year <= 2000; year++) {
		int sundays = 0;
	    for (int month = 0; month < 12; month++) {
	    	calendar.set(Calendar.YEAR, year);
	    	calendar.set(Calendar.MONTH, month);
	    	calendar.set(Calendar.DAY_OF_MONTH, 1);
	        if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
	            sundays++;
	        }
	    }
	    total += sundays;
	    System.out.println(year + " " + sundays + " " + total);
	}
	System.out.println(total);
}}
