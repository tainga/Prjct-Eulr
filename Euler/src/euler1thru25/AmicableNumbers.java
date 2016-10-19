package euler1thru25;

public class AmicableNumbers {

	public static void main(String[] args) {

		long total = 0;
		
		for (int i = 2; i < 10000; i++) {
			if (i == amicableSum(amicableSum(i)) && i != amicableSum(i)) {
				total += amicableSum(i);
			}
		}
		System.out.println(total);

	}
	
	public static int amicableSum(int number) {
		int sum = 1; // because every number is divisible by 1, so below we start with 2
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				sum += i;
				if (number / i != i) sum += number / i;
			}
		}
		return sum;
	}

}
