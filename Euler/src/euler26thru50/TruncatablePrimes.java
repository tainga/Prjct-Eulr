package euler26thru50;

public class TruncatablePrimes {

	public static void main(String[] args) {
		
		int counter = 0;
		int sum = 0;
		for (int i = 11; i < 1000000; i++) {
			if (truncatablePrime(i)) {
				//System.out.println(i);
				counter++;
				sum += i;
				if (counter == 11) break;
			}
		}
		
		System.out.println("Found " + counter + " such primes, their sum is " + sum);
	
	}
	
	public static boolean truncatablePrime(int a) {
		
		if (!isPrime(a)) return false;
		
		String x = Integer.toString(a);
		while (x.length() >= 2) {
			x = x.substring(1);
			if (!isPrime(Integer.parseInt(x))) {
				return false;
			}
		}
		
		int y = a;
		while (y > 0) {
			y /= 10;
			if (!isPrime(y)) {
				return false;
			}
		}

		return true;
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
