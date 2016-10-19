package euler1thru25;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NamesScores {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> names = new ArrayList<>();
		Scanner in = new Scanner(new File("C:\\Users\\Anastasia\\Desktop\\names.txt"));
		
		// bc names were separated by commas and quotes w/o spaces:
		String[] temp = in.next().split(",");
		for (String name : temp) {
			names.add(name.replace("\"", ""));
		}
		
		in.close();
		Collections.sort(names);
		
		// cool trick:
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		long total = 0;
		
		for (int j = 0; j < names.size(); j++) {
		
			String name = names.get(j); 
			int sum = 0;
			for (int i = 0; i < name.length(); i++) {
				sum += alphabet.indexOf(name.charAt(i)) + 1;
			}
			int position = j + 1;
			total += (sum * position);
		}
		System.out.println(total);
	}

}
