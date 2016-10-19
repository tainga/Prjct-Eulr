package euler51thru75;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem51PrimeDigitReplacements {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> primes = new ArrayList<>();
		
		for (int i = 10000; i < 1000000; i++) {
			if (isPrime(i)) {primes.add(i);}
		}
		
		for (int i = 0; i < primes.size(); i++) {
			
			replaceDigits(primes.get(i));
		}

		
	}
	
	
	
	public static void replaceDigits(int x) {
		
		char[] num = Integer.toString(x).toCharArray();
		
		for (int i = 0; i < num.length - 1; i++) {
			replace(x, i);
		}	
		
	}
	
	
	
	public static void replace(int x, int i) {
		char[] num = Integer.toString(x).toCharArray();
		String toReplace = "0123456789";
		ArrayList<Integer> indexes = new ArrayList<>();
		char[] newNum = new char[0];
		int counter = 1;
		
		
			char ch = num[i];
			newNum = num.clone();
			for (int j = i + 1; j < num.length; j++) {
				if (ch == num[j]) {
					if (!indexes.contains(i)) indexes.add(i);
					indexes.add(j);
				}
				
			}
		
				for (int d = 0; d < 10; d++) {
					for (int f = 0; f < indexes.size(); f++) {
					newNum[indexes.get(f)] = toReplace.charAt(d);
					
					}
					if (!Arrays.equals(num, newNum)) {
						int numberWithReplacedDigits = Integer.parseInt(new String(newNum));
						
						if (num.length != Integer.toString(numberWithReplacedDigits).length()) {
							continue;
						} else {
								if (isPrime(numberWithReplacedDigits)) {
									counter++;
									if (counter == 8) System.out.println(x + " bingo");
								}
						}
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

}
