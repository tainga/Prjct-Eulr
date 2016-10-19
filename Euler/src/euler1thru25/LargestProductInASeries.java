package euler1thru25;
import java.util.Scanner;


public class LargestProductInASeries {

	public static void main(String[] args) {

		System.out.println("Enter numbers");
		Scanner in = new Scanner(System.in);
		String str = "";
		while (str.length() < 1000) {
			str += in.next();
		}
		System.out.println(str);
		in.close();
		
		Scanner in1 = new Scanner(str);
		in1.useDelimiter("");
		int[] numbers = new int[1000];
		for (int i = 0; i < 1000; i++) {
			numbers[i] = Integer.parseInt(in1.next());
		}
		in1.close();
		
		long largest = 0;
		
		for (int i = 0; i < 1000 - 13; i++) {
			long prod13 = 1;
			for (int j = i; j < i + 13; j++) {
				prod13 *= numbers[j];
			}
			if (prod13 > largest) {largest = prod13;}
		}
		
		System.out.println("largest: " + largest);
		
	}

}
