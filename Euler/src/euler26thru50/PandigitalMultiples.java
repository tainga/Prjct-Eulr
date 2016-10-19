package euler26thru50;

import java.util.ArrayList;

public class PandigitalMultiples {

	public static void main(String[] args) {
		
		int largest = 0;
		for (int i = 0; i < 1000000; i++) {
			int a = concatenate(i);
			if (a > largest && pandigital(a)) {
				largest = a;
			}
		}
		System.out.println(largest);

	}

	public static boolean pandigital(int x) {

		ArrayList<Integer> numbers = new ArrayList<>();
		String str = Integer.toString(x);
		if (str.length() != 9) return false;
		for (int i = 1; i <= 9; i++) {
			if (Integer.parseInt(str.substring(i-1, i)) == 0) return false;
			if (!numbers.contains(Integer.parseInt(str.substring(i-1, i)))) {
				numbers.add(Integer.parseInt(str.substring(i-1, i)));
			}
		}
		return numbers.size() == 9;
	}
	
	public static int concatenate(int x) {
		if (x > 999999999) return -1;
		String result = Integer.toString(x);
		int n = 2;
		while (result.length() < 9) {
			String a = Integer.toString(x * n);
			result += a;
			n++;
		}
		if (result.length() == 9) return Integer.parseInt(result);
		return 0;
	}
}
