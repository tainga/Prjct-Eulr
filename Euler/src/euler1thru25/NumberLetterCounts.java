package euler1thru25;

public class NumberLetterCounts {

	public static void main(String[] args) {
	
		// 1 - 99:
		int oneTO99 = "onetwothreefourfivesixseveneightnine".length() * 9 +
				"twentythirtyfortyfiftysixtyseventyeightyninety".length() * 10 +
				"teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen".length();

		//100 - 999:
		int hundredTO999 = "hundredand".length() * 9 * 99 + "hundred".length() * 9 + oneTO99 * 9 + 
				"onetwothreefourfivesixseveneightnine".length() * 100;
				
		int total = oneTO99 + hundredTO999 +  + "onethousand".length();
		
		System.out.println(total);
		


	}

}
