package euler26thru50;

import java.math.BigInteger;

public class SelfPowers {

	public static void main(String[] args) {
		
		BigInteger sum = BigInteger.valueOf(0);
		
		for (int i = 1; i <= 1000; i++) {
			sum = sum.add(power(i));
		}
		System.out.println(sum);
	}
	
	public static BigInteger power(int a) {
		
		BigInteger result = BigInteger.valueOf(a);
		for (int i = 1; i < a; i++) {
			result = result.multiply(BigInteger.valueOf(a));
		}
		return result;
	}

}
