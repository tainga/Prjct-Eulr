package euler26thru50;

import java.util.ArrayList;

public class ReciprocalCycles {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		int longest = 0;
		int answer = -1;
			
		for (int d = 1000; d > 0; d--) {
		
			ArrayList<Integer> remainders = new ArrayList<>();
			int rem = 1;
			for (int i = 0; i < d; i++) {
				rem = (rem * 10) % d;
	
				if (remainders.contains(rem)) {
					if (longest < remainders.size()) {
						longest = remainders.size();
						answer = d;
					}
					break;
				}
				else {
					remainders.add(rem);
				}
			}
		}
		long elapsedTime = (System.nanoTime() - startTime);
		double seconds = (double)elapsedTime / 1000000000.0;
		System.out.println(longest + " " + answer + " " + seconds);
	}
}
