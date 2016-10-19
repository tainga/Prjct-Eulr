package euler51thru75;

import java.math.BigInteger;

public class Problem53CombinatoricSelections {

	public static void main(String[] args) {
		
		/*  */
		int counter = 0;
		for (int n = 23; n <= 100; n++) {
			for (int r = n; r > 0; r--) {
				if (nCr(n, r).compareTo(BigInteger.valueOf(1000000)) > 0) {
					counter++;
				}
			}
		}
		System.out.println(counter);
		   
		//System.out.println(nCr(2, 2).compareTo(BigInteger.valueOf(1000000)) > 0);
	}
	


				   

		 public static BigInteger factorial (int n) {
			 
			if (n == 0) return BigInteger.valueOf(1);
			BigInteger result = BigInteger.valueOf(1);
			for (int i = n; i > 0; i--) {
				result = result.multiply(BigInteger.valueOf(i));
			}
			return result;
		  }
		 
		 
		 public static BigInteger nCr (int n, int r) {
			 if (r > n) System.out.println("invalid input");
			 //System.out.println(n + " " + r + " " + (factorial(n)) + " " + factorial(r) + " " + factorial(n - r));
			 BigInteger denominator = factorial(r).multiply(factorial(n - r));
			 return factorial(n).divide(denominator);
			 
		 }
	





}
