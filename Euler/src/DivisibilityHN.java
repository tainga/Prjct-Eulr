import java.util.*;

public class DivisibilityHN {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = in.nextInt();
		
		int sum = 0;
		
		while (number >= 3)
		{
			number -= 3;
		}
			if (number == sum)
			{
				System.out.println("Number entered is divisible by 3");
			}
		else
		{
			System.out.println("Number entered is not divisible by 3");
		}
	}

}
