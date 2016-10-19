package euler1thru25;
import java.math.BigInteger;
import java.util.Scanner;


public class largeSum {

	public static void main(String[] args) {
		
		System.out.println("Enter numbers");
		Scanner in = new Scanner(System.in);

		BigInteger sum = new BigInteger("0");
		
		for (int i = 0; i < 100; i++) {
			sum = sum.add(new BigInteger(in.nextLine()));
		}
		
		System.out.println(sum);
		in.close();

	}

}
