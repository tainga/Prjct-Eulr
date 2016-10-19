package euler1thru25;

public class NonAbundandSums {

	public static void main(String[] args) {

		// start with sum of 1 to 23:
		long sum = 276;
		
		for (int i = 24; i <= 28123; i++) {
			boolean canBeWrittenAsASum = false;
			for (int j = 12; j <= i - j && !canBeWrittenAsASum; j++) {
				if (abundant(j) && abundant(i - j)) {
					canBeWrittenAsASum = true;
				}
			}
			if (!canBeWrittenAsASum) sum += i;
		}
		System.out.println(sum);
	}
	
	public static boolean abundant(int number) {
			if (number < 12) return false;
			int sum = 1; // because every number is divisible by 1, so below we start with 2
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					sum += i;
					if (number / i != i) sum += number / i;
				}
			}
			if (sum > number) return true;
			return false;
		
	}
}
