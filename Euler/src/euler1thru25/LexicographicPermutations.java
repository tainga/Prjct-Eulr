package euler1thru25;
import java.util.ArrayList;


public class LexicographicPermutations {
	
	static ArrayList<String> p = new ArrayList<>();

	public static void main(String[] args) {
		permutation("0123456789");
		System.out.println(p.get(999999));
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
