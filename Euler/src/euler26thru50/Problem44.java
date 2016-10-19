package euler26thru50;

import java.util.ArrayList;

public class Problem44 {

	public static void main(String[] args) {

		ArrayList<Long> pNums = new ArrayList<>();
		for (int i = 1; i < 10000; i++) {
			pNums.add((long) (i * (3 * i - 1) / 2));
		}

		for (int i = 0; i < pNums.size(); i++) {
			for (int j = i-1; j > 0; j--) {
				long sum = pNums.get(i) + pNums.get(j);
				long diff = Math.abs(pNums.get(i) - pNums.get(j));
				if (isPentagonal(sum) && isPentagonal(diff)) { 										// had to write isPentagonal method bc .contains is too slow
					System.out.println(diff);
					
				}
			}
		}		
		
	}

	private static boolean isPentagonal(long x) {
	    double a = (Math.sqrt(1 + 24 * x) + 1.0) / 6.0; // inverse function
	    return a == ((int) a); // checks if the number is an integer
	}
}
