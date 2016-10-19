package euler1thru25;

public class prime10001 {

	public static void main(String[] args) {

		int i = 2;
		int index = 0;
		
		while (index < 10001) {
			
			boolean isPrime = true;
			for (int j = 2; j < i && isPrime; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {index++;}
			if (index == 10001) System.out.println(i);
			i++;
			
		}

	}

}
