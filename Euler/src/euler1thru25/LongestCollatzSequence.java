package euler1thru25;

public class LongestCollatzSequence {

	public static void main(String[] args) {
		
		int answer = 0;
		long current = 0;
		long longest = 0;
		long counter = 1;
		
		for (int i = 3; i < 1000000; i++) {
			current = i; counter = 1;
			while (current > 1) {
				if (current % 2 == 0) {current = current / 2;}
				else {current = current * 3 + 1;}
				counter++;
			}
			if (longest < counter) {
				longest = counter;
				answer = i;
			}
		}
		System.out.println(longest + " " + answer);
	}

}
