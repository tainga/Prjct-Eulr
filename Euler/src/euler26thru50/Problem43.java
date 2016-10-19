package euler26thru50;

import java.util.ArrayList;


public class Problem43 {

	static ArrayList<String> p = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int[] primes = {2, 3, 5, 7, 11, 13, 17};
		
		permutation("0123456789");
		
		long sum = 0;

		for (int i = 0; i < p.size(); i++) {
			if (p.get(i).charAt(0) == '0') continue;
			boolean goodOne = true;
			int[] substrings = split(p.get(i));
			for (int j = 0; j < 7 && goodOne; j++) {
				if (!((substrings[j] % primes[j]) == 0)) {
					goodOne = false;
				}
			}
			if (goodOne) sum += Long.parseLong(p.get(i));
		}
		
		System.out.println(sum);
		
	}
	
	
	
	public static int[] split(String s) {
		
		int[] result = new int[7];
		for (int i = 0; i < 7; i++) {
			result[i] = Integer.parseInt(s.substring(i + 1, i + 4));
		}
		return result;
	}
	
	public static void permutation(String str) { 
	    permutation("", str);
	}

	private static void permutation(String beginning, String end) {
	    int n = end.length();
	    if (n == 0) p.add(beginning);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(beginning + end.charAt(i), end.substring(0, i) + end.substring(i+1, n));
	    }
	}

}
