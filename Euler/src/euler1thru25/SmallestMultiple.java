package euler1thru25;

public class SmallestMultiple {

	public static void main(String[] args) {

		boolean numIsFound = false;
		int currentNum = 2520;
		while (!numIsFound) {
			
			boolean divisible = true;
				for (int i = 20; i > 1 && divisible; i--) {
					if (currentNum % i != 0) {divisible = false;}
				}
			if (divisible) numIsFound = true;
			else currentNum += 20;
		}
		System.out.println(currentNum);

	}

}
