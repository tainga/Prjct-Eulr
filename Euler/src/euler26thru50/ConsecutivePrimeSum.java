package euler26thru50;

import java.util.ArrayList;


public class ConsecutivePrimeSum {

	public static void main(String[] args) {

		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 2; i < 1000000; i++) {
			if (isPrime(i)) primes.add(i);
		}
		
		int longestSum = 0; int mostTerms = 0;
		for (int j = 0; j < primes.size(); j++) {
			
			int sum = 0;
			int numberOfTerms = 0;
			
			for (int i = j; i < primes.size() && sum < 1000000; i++) {
				sum += primes.get(i);
				numberOfTerms++;
			
				if (isPrime(sum) && numberOfTerms > mostTerms) {
					longestSum = sum;
					mostTerms = numberOfTerms;
				}
			}
		}
		
		System.out.println(longestSum + " " + mostTerms);
		

	}

	public static boolean isPrime(long num) {
		if (num == 1) return false;
		boolean isPrime = true;
		for (int j = 2; j <= Math.sqrt(num) && isPrime; j++) {
			if (num % j == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}
