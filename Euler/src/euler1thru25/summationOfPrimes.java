package euler1thru25;
import java.util.ArrayList;


public class summationOfPrimes {

	public static void main(String[] args) {

		int i = 3;

		ArrayList<Integer> primes = new ArrayList<>();
		primes.add(2);
		
		
		while (i < 2000000) {
			
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i) && isPrime; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {primes.add(i);}

			i+=2;
			
		}
		System.out.println(primes);
		
		long sum = 0;
		
		for (int k = 0; k < primes.size(); k++) {
			sum += primes.get(k);
		}
		System.out.println(sum);
	}

}
