package euler1thru25;

public class HighlyDivisibleTriangularNumber {

	public static void main(String[] args) {
		
		long theNumba = 0;
		int largest = 0;
		
		for (int i = 1; largest <= 600; i++) {
			theNumba = theNumba + i;			
			
			int counter = 2;
			for (int j = 2; j <= Math.sqrt(theNumba); j++) {
				if (theNumba % j == 0) counter += 2;	
			}
			if (Math.sqrt(theNumba) * Math.sqrt(theNumba) == theNumba) {counter--;} // if the number is a perfect square
		

			if (counter > largest) {
				largest = counter;
				System.out.println("i: " + i + ", numba: " + theNumba + ", divisors: " + counter);
			}
		}
			
		
	}

}
