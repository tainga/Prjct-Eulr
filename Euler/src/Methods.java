import java.math.BigInteger;


public class Methods {



	public static boolean palindrome(int number) {
		String num = Integer.toString(number);
		for (int i = 0; i <= num.length() / 2; i++) {
			if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
				return false;
			}
		}
		return true;		
	}
	
	
	public static boolean isPrime (long num) {
		if (num == 1) return false;
		for (int j = 2; j <= Math.sqrt(num); j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int reverse(int x) {
		String number = Integer.toString(x);
		String newNumber = "";
		
		for (int i = number.length() - 1; i >= 0; i--) {
			number.length();
			newNumber += number.charAt(i);
		}
		return Integer.parseInt(newNumber);
	}
	
	
	public static int digitSum(String x) {
		int sum = 0;
		for (int i = 0; i < x.length(); i++) {
			sum += Integer.parseInt(x.substring(i, i + 1));
		}
		return sum;
	}
	
	public static BigInteger power(int a, int b) {
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 0; i < b; i ++) {
			result = result.multiply(BigInteger.valueOf(a));
		}
		return result;
	}
	
	public static int numberOfDigits(int x) {
		return Integer.toString(x).length();
	}
}