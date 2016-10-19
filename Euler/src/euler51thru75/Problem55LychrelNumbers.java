package euler51thru75;

import java.math.BigInteger;

public class Problem55LychrelNumbers {

	public static void main(String[] args) {
		
		int counter = 0;
		for (int i = 1; i < 10000; i++) {
			if (lychrel(i)) counter++;
		}
		System.out.println(counter);

		System.out.println(lychrel(10677));
	}
	
	
	
	public static boolean palindrome(BigInteger number) {
		String num = number.toString();
		for (int i = 0; i <= num.length() / 2; i++) {
			if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
				return false;
			}
		}
		return true;		
	}
	
	
	public static BigInteger reverse(BigInteger x) {
		String number = x.toString();
		String newNumber = "";
		
		for (int i = number.length() - 1; i >= 0; i--) {
			number.length();
			newNumber += number.charAt(i);
		}
		return new BigInteger(newNumber);
	}
	
	public static boolean lychrel(int x) {
		
		BigInteger sum = BigInteger.valueOf(x);
		for (int i = 0; i < 50; i++) {
			sum = sum.add(reverse(sum));
			if (palindrome(sum)) return false;
		}
		return true;
		
	}
	
	
	
	
	
	
	

}
