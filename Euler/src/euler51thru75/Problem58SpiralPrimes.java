package euler51thru75;

public class Problem58SpiralPrimes {

	public static void main(String[] args) {
		
		double ratio = 100;
		
		for (int k = 7; ratio >= 10; k++) {
		
				int[] numbers = new int[k * k];
				
				int i = 0;
				while (i < numbers.length) {
					numbers[i] = i;
					i++;
				}
				
				ratio = diagonalPrimeRatio(numbers);
		System.out.println(k  + " " + ratio);
		}
		
		
		
		
	}
	
	public static boolean isPrime (long num) {
		if (num == 1) return false;
		for (int j = 2; j <= Math.sqrt(num); j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static double diagonalPrimeRatio (int[] numbers) {
		int numberOfPrimes = 0;
		int totalNumber = 0;
		
		int jump = 0;
		int counter = 0;
		for (int j = 1; j < numbers.length; j+=jump) {
			if (counter % 4 == 0) {jump += 2;}
			if (isPrime(numbers[j])) {numberOfPrimes++;}
			totalNumber++;
			counter++;
			//System.out.println(j + " " + jump);
		}
		totalNumber++;
		if (isPrime(numbers.length - 1)) numberOfPrimes++;
		
		return ((double)numberOfPrimes / totalNumber) * 100;
	}

}
