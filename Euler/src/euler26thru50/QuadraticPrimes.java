package euler26thru50;

import java.util.ArrayList;

public class QuadraticPrimes {

	public static void main(String[] args) {
		
		ArrayList<Integer> primes = new ArrayList<>();
		primes.add(1);
		for (int i = 2; i < 1000; i++) {
			if (isPrime(i)) {
				primes.add(i);
				primes.add(i * -1);
			}
		}
		
	
		int largest = 0;
		
		// b has to be prime
		// a has to be odd except when b = 2
		
		for (int a = -999; a < 1000; a += 2) {
			for (int i = 0; i < primes.size(); i++) {
				int b = primes.get(i);

					int counter = 0;
			
						int n = 0;
						
						int result = n * n + a * n + b;
						
						while (isPrime(Math.abs(result))) {							
							counter++;
							n++;
							result = n * n + a * n + b;
						}

					
					if (largest < counter) {
						largest = counter;
						System.out.println(largest + " " + a + " " + b + " answer: " + a*b);
					}
			}

			
		}
	}

	public static boolean isPrime (long num) {
		boolean isPrime = true;
		for (int j = 2; j <= Math.sqrt(num) && isPrime; j++) {
			if (num % j == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	
}

