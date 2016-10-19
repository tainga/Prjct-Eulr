package euler51thru75;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem62CubicPermutations {

	public static void main(String[] args) {
		
		int n = 0;
		int limit = 10000;
		boolean found = false;
		BigInteger[] keys = new BigInteger[limit];
		BigInteger[] cubes = new BigInteger[limit];
		
		while (n < limit) {
			BigInteger g = BigInteger.valueOf(n);
			g = g.pow(3);
			cubes[n] = g;
			keys[n] = largestPermutation(g);
			n++;
		}
		
		ArrayList<BigInteger> fiveCubes = new ArrayList<>();

		for (int i = 345; i < limit && !found; i++) {
			fiveCubes = new ArrayList<>();
			int count = 1;
			fiveCubes.add(cubes[i]);
			for (int j = i + 1; j < limit && !found; j++) {
				if (keys[j].equals(keys[i])) {
					count++;
					fiveCubes.add(cubes[j]);
				}
				if (count == 5) {
					found = true;
					System.out.println(keys[i]);
					System.out.println(cubes[i]);
				}
			}
		}
		System.out.println(fiveCubes);
		double answer = Math.cbrt(fiveCubes.get(0).doubleValue());
		System.out.println("final answer: " + answer);
		
	}
	
	public static BigInteger largestPermutation(BigInteger x) {

		if (x.compareTo(BigInteger.valueOf(0)) < 0) System.out.println(x);
		String v = x.toString();
		String result = "";
		int[] digits = new int[10];
		
		for (int i = 0; i < v.length(); i++) {
			int a = v.charAt(i) - 48;
			digits[a]++;
		}

		for (int i = 9; i >= 0; i --) {
			for (int j = 0; j < digits[i]; j++) {
				result += i;
			}
		}

		return new BigInteger(result);
	}

}

