package euler26thru50;

import java.util.ArrayList;

public class Problem47 {

	public static void main(String[] args) {
		
		for (int i = 1000; i < 1000000; i++) {
			if (numberOfFactors(i) == 4 && numberOfFactors(i + 1) == 4 && numberOfFactors(i + 2) == 4 && numberOfFactors(i + 3) == 4) {
				System.out.println(i);
				break;
			}
		}		 
		
	}
	
	public static int numberOfFactors(int x) {
		
		ArrayList<Integer> factors = new ArrayList<>();
	    int n = x;

	    for (int i = 2; i <= n / i; i++) {
	      while (n % i == 0) {
	        if (!factors.contains(i)) factors.add(i);
	        n /= i;
	      }
	    }
	    if (n > 1) {
	        factors.add(n);
	    }
		return factors.size();
	}
}
