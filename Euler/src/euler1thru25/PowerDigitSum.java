package euler1thru25;
import java.math.BigInteger;
import java.util.Scanner;


public class PowerDigitSum {

	public static void main(String[] args) {
		
		BigInteger number = BigInteger.valueOf(2);
		for (int i = 0; i < 999; i++) {
			number = number.multiply(BigInteger.valueOf(2));
		}
		
		System.out.println(number);
		
		Scanner in = new Scanner(number.toString());
		in.useDelimiter("");
		long sum = 0;
		
		while (in.hasNextInt()) {
			sum += in.nextInt();
		}
		
		System.out.println(sum);
		in.close();
	}

}
