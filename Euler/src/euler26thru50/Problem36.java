package euler26thru50;

public class Problem36 {

	public static void main(String[] args) {
		
		long sum = 0;
		
		for (int i = 1; i < 1000000; i++) {
			if (palindromic(i) && palindromic(Integer.toBinaryString(i))) {
				//System.out.println(i + " " + Integer.toBinaryString(i));
				sum += i;
			}
		}
		
		System.out.println(sum);

	}

	
	
	public static boolean palindromic(int number) {
		
		String num = Integer.toString(number);
		for (int i = 0; i <= num.length() / 2; i++) {
			if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
				return false;
			}
		}
		return true;		
	}
	
	public static boolean palindromic(String num) {

		for (int i = 0; i <= num.length() / 2; i++) {
			if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
				return false;
			}
		}
		return true;		
	}
}
