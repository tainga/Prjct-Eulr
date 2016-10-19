package euler51thru75;

import java.math.BigInteger;

public class Problem56PowerfulDigitSum {

	public static void main(String[] args) {
		
		int max = 0;
		for (int a = 2; a < 100; a++) {
			for (int b = 2; b < 100; b++) {
				int s = digitSum(power(a, b).toString());
				if (max < s) {
					max = s;
				}
			}
		}
		System.out.println(max);
		
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

}
