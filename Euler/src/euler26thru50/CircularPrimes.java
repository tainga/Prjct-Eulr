package euler26thru50;

public class CircularPrimes {

	public static void main(String[] args) {
		
		int counter = 0;
		for (int i = 2; i < 1000000; i++) {
			if (isCircularPrime(i)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
	
	public static boolean isCircularPrime(int a) {
		String x = Integer.toString(a);
		for (int i = 0; i < x.length(); i++) {
			if (!isPrime(Integer.parseInt(x))) {
				return false;
			}
			String firstDigit = x.substring(0, 1);
			x = x.substring(1) + firstDigit;
		}
		return true;
	}
	
	public static boolean isPrime(long num) {
		boolean isPrime = true;
		for (int j = 2; j <= Math.sqrt(num) && isPrime; j++) {
			if (num % j == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

}
