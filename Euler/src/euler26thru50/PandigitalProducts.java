package euler26thru50;

import java.util.ArrayList;

public class PandigitalProducts {

	public static void main(String[] args) {

		ArrayList<Integer> products = new ArrayList<>();
		long total = 0;

		for (int a = 1; a < 100; a++) {
			for (int b = a; b < 10000; b++) {
				int product = a * b;
				if(pandigital(a, b, product) && !products.contains(product)) {
						products.add(product);
						total += product;
				}
			}
		}
		System.out.println(total);
		

	}
	
	public static boolean pandigital(int multiplicand, int multiplier, int product) {

		ArrayList<Integer> numbers = new ArrayList<>();
		String str = multiplicand + "" + multiplier + "" + product;
		if (str.length() != 9) return false;
		for (int i = 1; i <= 9; i++) {
			if (Integer.parseInt(str.substring(i-1, i)) == 0) return false;
			if (!numbers.contains(Integer.parseInt(str.substring(i-1, i)))) {
				numbers.add(Integer.parseInt(str.substring(i-1, i)));
			}
		}
		//if (numbers.size() == 9) System.out.println(str + " " + product);
		return numbers.size() == 9;
	}

}
