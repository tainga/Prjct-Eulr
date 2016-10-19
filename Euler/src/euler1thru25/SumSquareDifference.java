package euler1thru25;

public class SumSquareDifference {

	public static void main(String[] args) {
		
		int limit = 100;
		
		int sumOfSquares = 0;
		int squareOfSum = 0;
		for (int i = 1; i <= limit; i++) {
			squareOfSum += i;
			sumOfSquares += i * i;
		}
		squareOfSum *= squareOfSum;
		
		System.out.println(squareOfSum - sumOfSquares);
		
	}

}
