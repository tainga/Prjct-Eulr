package euler1thru25;
import java.math.BigInteger;
import java.util.Scanner;


public class FactorialDigitSum {

	public static void main(String[] args) {
		
		BigInteger product = new BigInteger("1");
		for (int i = 1; i < 101; i++) {
			product = product.multiply(BigInteger.valueOf(i));
		}
		
		String str = product.toString();
		
		Scanner in = new Scanner(str);
		in.useDelimiter("");
		
		int result = 0;
		while (in.hasNext()) {
			result += Integer.parseInt(in.next());
		}
		
		System.out.println(result);
		in.close();
	}

}
