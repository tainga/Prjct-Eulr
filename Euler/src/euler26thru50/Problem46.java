package euler26thru50;

import java.util.ArrayList;

public class Problem46 {

	public static void main(String[] args) {
		
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 2; i < 10000; i++) {
			if (isPrime(i)) {primes.add(i);}
		}
		
		for (int i = 0; i < 10000; i++) {
			if (isPrime(i) || i % 2 == 0) continue;
			boolean found = true;
			for (int j = 0; primes.get(j) < i; j++) {
				int remainder = i - primes.get(j);
				if (isSquare(remainder / 2)) {
					found = false;
				}
			}
			if (found) {
				System.out.println(i);
				break;
			}
			
		}
		

	}
	
	public static boolean isPrime(long num) {
		for (int j = 2; j <= Math.sqrt(num); j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSquare(int x) {
		int a = (int)Math.sqrt(x);
		return a == Math.sqrt(x);
	}

}
