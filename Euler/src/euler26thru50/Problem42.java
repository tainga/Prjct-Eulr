package euler26thru50;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem42 {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Integer> triNums = new ArrayList<>();	
		 
		 for (int i = 1; i < 1000; i++) {triNums.add(i * (i + 1) / 2);}
		 
		 
			ArrayList<String> words = new ArrayList<>();
			Scanner in = new Scanner(new File("C:\\Users\\Anastasia\\Desktop\\words.txt"));

			String[] temp = in.next().split(",");
			for (String word : temp) {
				words.add(word.replace("\"", ""));
			}
			
			in.close();
			
			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int total = 0;
			
			for (int j = 0; j < words.size(); j++) {
			
				String word = words.get(j); 
				int sum = 0;
				for (int i = 0; i < word.length(); i++) {
					sum += alphabet.indexOf(word.charAt(i)) + 1;
				}
				if (triNums.contains(sum)) total++;
			}
			
			System.out.println(total);
	}

}
