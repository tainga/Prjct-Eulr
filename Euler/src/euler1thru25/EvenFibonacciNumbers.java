package euler1thru25;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {

		int[] numbers = new int[32];
		numbers[0] = 1;
		numbers[1] = 2;
		
		for (int i = 2; i < numbers.length; i++) {
			numbers[i] = numbers[i - 1] + numbers[i - 2];
			//System.out.println(i + " " + numbers[i]);
		}
		
		long sum = 0;
		
		for (int i = 1; i < numbers.length; i += 3) {
			sum += numbers[i];
		}
		
		System.out.println(sum);
	}

}
