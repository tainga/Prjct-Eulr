package euler1thru25;
import java.math.BigInteger;

public class ThousandDigitFibonacciNumber {

	public static void main(String[] args) {
		
		BigInteger a1 = BigInteger.valueOf(1);
		BigInteger a2 = BigInteger.valueOf(1);
		
		for (int i = 3; i < 10000; i++) {
			BigInteger a3 = a1.add(a2);
			
			if (a3.toString().length() == 1000) {
				System.out.println("i: " + i + " n: " + a3);
				break;
			}
			a1 = a2;
			a2 = a3;
			
		}
		
		
	}

}
