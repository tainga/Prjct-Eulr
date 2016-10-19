package euler51thru75;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem54 {

	public static void main(String[] args) throws FileNotFoundException {
		
		int counter1 = 0;
		int counter2 = 0;
		int tie = 0;
		
		int lineNumber = 0;

		Scanner lines = new Scanner(new File("C:\\Users\\Anastasia\\Desktop\\poker.txt"));
		
		/*
		String testString = "5H 5C 6S 7S KD 2C 3S 8S 8D TD \n" +
		"5D 8C 9S JS AC 2C 5C 7D 8S QH \n" +
		"2D 9C AS AH AC 3D 6D 7D TD QD \n" +
		"4D 6S 9H QH QC 3D 6D 7H QD QS \n" +
		"2H 2D 4C 4D 4S 3C 3D 3S 9S 9D \n";
		
		
		Scanner lines = new Scanner(testString);
		*/
		
		while (lines.hasNextLine()) {
			String line = lines.nextLine();
			
			Scanner cards = new Scanner(line);
			
			Card player1[] = new Card[5];
			Card player2[] = new Card[5];
			int i = 0;
			
			while (cards.hasNext()) {
				Card c = new Card(cards.next());
				if (i < 5) {player1[i] = c;}
				else {player2[i - 5] = c;}
				i++;

			}

			
			Hand p1 = new Hand(player1);
			Hand p2 = new Hand(player2);
			
			if (p1.compareTo(p2) > 0) {
				//System.out.println("P1 wins");
				counter1++;
			}
			else if (p1.compareTo(p2) < 0) {
				//System.out.println("P1 wins");
				counter2++;
			}
			else if (p1.compareTo(p2) == 0) {
				//System.out.println(p1.compareTo(p2));
				System.out.println(lineNumber + " |   " + line + " " + p1.name() + " " + p2.name() + " " + p1.compareTo(p2));
				tie++;
			}
			cards.close();
			lineNumber++;
			//System.out.println(lineNumber + " |   " + line + " " + p1.name() + " " + p2.name() + " " + p1.compareTo(p2));
		}
		lines.close();
		System.out.println(counter1 + " " + counter2 + " " + tie);
	}

}
