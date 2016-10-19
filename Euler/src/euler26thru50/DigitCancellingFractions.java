package euler26thru50;

public class DigitCancellingFractions {

	public static void main(String[] args) {
		
		for (int a = 11; a < 100; a++) {
			for (int b = a + 1; b < 100; b++) {
				if (a % 10 == 0 || b % 10 == 0) continue;
				if ((double) a / b == cancel(a, b)) {
					System.out.println(a + " " + b + " " +cancel(a, b));
				}
			}
		}

	}	
	

	
	public static double cancel(int a, int b) {
		int ax = a / 10;
		int ay = a % 10;
		int bx = b / 10;
		int by = b % 10;
		double result =0;
		if (ax == bx) result = (double) (a % 10) / (b % 10);
		else if (ay == by) result = (double) (a / 10) / (b / 10);
		else if (ax == by) result = (double) (a % 10) / (b / 10);
		else if (ay == bx) result = (double) (a / 10) / (b % 10);
		return result;
	}
}
