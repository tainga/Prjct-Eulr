package euler76thru100;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Project96Sudoku {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner lines = new Scanner(new File("C:\\Users\\Anastasia\\Desktop\\sudoku.txt"));
		
		
		String data = "";
		String name = "";
		
		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				name = lines.nextLine();
			}
			else {
				data += lines.next();
			}
		}
		
		Sudoku puzzle = new Sudoku(name, data);
		puzzle.solvePuzzle();
		int[][]nums = puzzle.getPuzzle();
		 for (int i = 0; i < 9; i++) {
			 for (int j = 0; j < 9; j++) {
				 System.out.print(nums[i][j]);
			 }
			 System.out.println();
		 }
	}
}
