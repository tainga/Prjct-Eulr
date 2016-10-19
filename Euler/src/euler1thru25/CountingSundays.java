package euler1thru25;

public class CountingSundays {

	public static void main(String[] args) {
		
		long days = 2;
		int sundays = 0;
		
		for (int year = 1901; year < 2000; year++) {
			//int sundays = 0;
			if (year % 4 != 0) {
				if ( days % 7 == 4) sundays += 3;
				else if (days % 7 == 0 || days % 7 == 1 || days % 7 == 2) sundays += 2;
				else if (days % 7 == 5 || days % 7 == 6 || days % 7 == 3) sundays += 1;
				
				days = (days + 365) % 7;
			}
			
			//leap years:
			else {
				if ( days % 7 == 0) sundays += 3;
				else if (days % 7 == 3 || days % 7 == 1 || days % 7 == 4) sundays += 2;
				else if (days % 7 == 5 || days % 7 == 6 || days % 7 == 2) sundays += 1;
				
				days = (days + 366) % 7;
			}
			System.out.println("year: " + year + ", days: " + days + ", sundays: " + sundays);
		}
		
		// for 2000:
		sundays++;
		System.out.println(sundays);

	}
	
// if Jan is Sunday: 2 S, 1 M, 1 T, 3 W, 1 Th, 2 F, 2 Sa

}
