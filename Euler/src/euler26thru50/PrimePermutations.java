package euler26thru50;
import java.util.ArrayList;


public class PrimePermutations {

	public static void main(String[] args) {
		
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 1000; i < 10000; i++) {
			if (isPrime(i)) {primes.add(i);}
		}
		
		for (int i = 0; i < primes.size(); i++) {
			int currentPrime = primes.get(i);
			int nextPrime = currentPrime + 3330;
			int lastPrime = nextPrime + 3330;
			if (primes.contains(nextPrime)  && primes.contains(lastPrime) && isPermutation(currentPrime, nextPrime) && isPermutation(currentPrime, lastPrime)) {
				System.out.println(currentPrime + " " + nextPrime + " " + lastPrime);
			}
		}
	}
	
	public static boolean isPermutation(int a, int b) {
		boolean result = true;
		String x = Integer.toString(a);
		String y = Integer.toString(b);
		for (int i = 0; i < x.length(); i++) {
			if (y.indexOf(x.substring(i, i+1)) < 0) {
				result = false;
			}
		}
		return result;
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
