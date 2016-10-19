package euler26thru50;

import java.util.ArrayList;
import java.util.Collections;

public class PandigitalPrime {

	public static void main(String[] args) {
		
		// trick to reduce upper limit:
		// all pandigital numbers except 4- and 7- digit ones are divisible by 3,
		// bc the sum of their digits is divisible by 3
		// e.g. 3-digit: 1+2+3 = 6, 5-digit: 1+2+3+4+5+6 = 21;
		// so i = 99999999
		for (int i = 10000000; i > 0; i--) {
			if (pandigital(i)) {
				System.out.println(i);;
				break;
			}
		}
	}
	
	
	
	public static boolean pandigital(int x) {
		if (!isPrime(x)) return false;
		
		ArrayList<Integer> numbers = new ArrayList<>();
		String str = Integer.toString(x);
		int n = str.length();
		
		for (int i = 1; i <= n; i++) {
			
			if (Integer.parseInt(str.substring(i-1, i)) == 0) return false;
			
			if (!numbers.contains(Integer.parseInt(str.substring(i-1, i)))) {
				numbers.add(Integer.parseInt(str.substring(i-1, i)));
			}
		}
		Collections.sort(numbers);
		return numbers.size() == n && numbers.get(numbers.size() - 1) == n;
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
