package euler26thru50;

public class DigitFactorials {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 10; i < 10000000; i++) {
			if (factorialSum(i) == i) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("sum: " + sum);
			

	}
	
	public static int factorial(int x) {
		if (x < 2) return 1;
		int result = 1;
		for (int i = 2; i <= x; i++) {
			result *= i;
		}
		return result;
	}
	
	public static int factorialSum(int a) {
		int k;
		int sum = 0;
		while (a > 0) {
			k = a % 10;
			sum += factorial(k);
			a /= 10;
		}
		return sum;
	}

}
