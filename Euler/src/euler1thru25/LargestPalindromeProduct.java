package euler1thru25;

public class LargestPalindromeProduct {

	public static void main(String[] args) {

		int product;
		int largestProduct = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				product = i * j;
				if (isPal(product) && product > largestProduct) {largestProduct = product;}
			}
		}
		System.out.println(largestProduct);

	}
	
	public static boolean isPal(int number) {
		boolean isP = true;
		String num = Integer.toString(number);
		for (int i = 0; i <= num.length() / 2; i++) {
			if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
				isP = false;
			}
		}
		return isP;		
	}
}
