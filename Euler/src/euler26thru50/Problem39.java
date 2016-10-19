package euler26thru50;

public class Problem39 {

	public static void main(String[] args) {
		
		int largest = 0;
		
		for (int limit = 3; limit <= 1000; limit++) {
			
		
			int counter = 0;
			for (int a = 1; a < limit; a++) {
				for (int b = a; b < limit - a; b ++) {
					int c = limit - a - b;
					if (c == Math.sqrt(a * a + b * b)) {
						counter++;
					}
				}
			}
			if (counter > largest) {
				largest = counter;
				System.out.println(limit + " " + largest);
			}
		}
	}

}
