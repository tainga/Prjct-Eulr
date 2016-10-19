package euler51thru75;
import java.math.BigInteger;

//import org.apache.commons.math3.fraction.BigFraction;

public class Problem57SquareRootConvergents {

	public static void main(String[] args) {
		
		
		BigInteger numerator = BigInteger.valueOf(1);
		BigInteger denominator  = BigInteger.valueOf(1);
		BigInteger representsOne;
		
		int i = 1;
		int counter = 0;
		
		while (i <= 1000) {
			representsOne = denominator;
			denominator = numerator.add(denominator);
			numerator = denominator.add(representsOne);
			if (numberOfDigits(numerator) > numberOfDigits(denominator)) {
				counter++;
			}
			i++;
		}
		System.out.println(counter);
		
		/* // this early solution gave the right answer, but was too brute force
		BigFraction previous = new BigFraction(1, 2);
		BigFraction number;
		
		int i = 2;
		int counter = 0;
		while (i <= 1000) {
			previous = previous.add(2);
			previous = previous.reciprocal();
			number = previous.add(1);
			if (numberOfDigits(number.getNumerator()) > numberOfDigits(number.getDenominator())) {
				counter++;
				//System.out.println(number);
			}
			
			i++;
		}
		System.out.println(counter);
		*/
	}
	
	
	public static int numberOfDigits(BigInteger x) {
		return x.toString().length();
	}
	
	public static int numberOfDigits(long x) {
		return Long.toString(x).length();
	}

}
