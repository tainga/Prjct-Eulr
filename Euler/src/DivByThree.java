
public class DivByThree {
	
	public static boolean isDivisibleByThree(int num) {
		
		// take the absolute value of the number in case it's negative
		int number = Math.abs(num);
		
		int sum = 0;
		if (number < 10) {
			if (number == 0 || number == 3 || number == 6 || number == 9) {
				return true;
			}
			return false;
		}
		
		else {
			
			// convert to string
			
			String numStr = Integer.toString(number);
			// go through each digit left to right
			
			for (int i = 0; i < numStr.length(); i++) {
				
				// take a single digit from the number
				String a = numStr.substring(i, i + 1);
				
				// convert it to an integer
				int b = Integer.parseInt(a);
				
				// add it to the sum
				sum += b;
			}
		}
		// recursion!
		return isDivisibleByThree(sum);
	}


}
