package euler1thru25;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		
		long number = 600851475143L;
		for (int i = 3; i < number; i +=2) {
			if (number % i == 0 && isPrime(number / i)) {
				System.out.println((number / i));
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
