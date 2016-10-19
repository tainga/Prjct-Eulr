package euler26thru50;

public class DigitFifthPowers {

	public static void main(String[] args) {
		
		int total = 0;
		
		for (int i = 1000; i < 10000000; i++) {
			
			int sum = 0;

			String number = Integer.toString(i);
			
			for (int j = 0; j < number.length(); j++) {
				int x = Integer.parseInt(number.substring(j, j+1));
				sum += Math.pow(x, 5);
				if (sum > i) break;
			}
			
			if (sum == i) {
				System.out.println(i);
				total += sum;
			}

		}
		System.out.println("answer: " + total);

	}

}
