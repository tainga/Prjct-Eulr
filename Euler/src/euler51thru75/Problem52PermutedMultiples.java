package euler51thru75;

public class Problem52PermutedMultiples {

	public static void main(String[] args) {
		
		for (int i = 11; i < 10000000; i++) {
			if (isPermutation(i, 2 * i) && isPermutation(i, 3 * i) && isPermutation(i, 4 * i) && isPermutation(i, 5 * i) && isPermutation(i, 6 * i)) {
				System.out.println(i);
				break;
			}
		}
		
		
	}
	
	public static boolean isPermutation(int a, int b) {
		
		String x = Integer.toString(a);
		String y = Integer.toString(b);
		if (x.length() != y.length()) return false;
		for (int i = 0; i < x.length(); i++) {
			if (y.indexOf(x.substring(i, i+1)) < 0) {
				return false;
			}
			if (x.indexOf(y.substring(i, i+1)) < 0) {
				return false;
			}
		}
		return true;
	}

}
