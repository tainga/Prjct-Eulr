package euler26thru50;

public class NumberSpiralDiagonals {

	public static void main(String[] args) {
		
		int[] numbers = new int[1002002];
		
		int i = 0;
		while (i < numbers.length) {
			numbers[i] = i;
			i++;
		}
		
		long sum = 0;
		
		int jump = 0;
		int counter = 0;
		for (int j = 1; j < numbers.length; j+=jump) {
			if (counter % 4 == 0) {jump += 2;}
			sum += numbers[j];
			counter++;
		}
		
		System.out.println(sum);

	}

}
