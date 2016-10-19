package euler26thru50;

public class Problem45 {

	public static void main(String[] args) {
		
		boolean found = false;
		int i = 146;  // bc H145 = 40755;

		while (!found) {
			
			// since all hexagonal numbers are also triangular, we just generate hexagonal numbers
			long t = i * (2 * i - 1);
			if (isPentagonal(t)) {
				System.out.println(t + " " + i);
				found = true;
			}
			i++;
		}
		
	}
	
	private static boolean isPentagonal(long x) {
	    double a = (Math.sqrt(1 + 24 * x) + 1.0) / 6.0; 
	    return a == ((int) a); 
	}

}
