package euler76thru100;

import java.util.ArrayList;
import java.util.Arrays;

public class Sudoku {

	private int[][] solved;
	private int[][] original;
	private String name;
	
	public Sudoku(String name, String data) {
		this.name = name; 
		solved = new int[9][9];
		original = new int[9][9];
		int position = 0;
		 for (int i = 0; i < 9; i++) {
			 for (int j = 0; j < 9; j++) {
				 solved[i][j] = data.charAt(position) - 48;
				 original[i][j] = data.charAt(position) - 48;
				 position++;
			 }
		 }
	}
	
	public int[][] getPuzzle() {
		return solved;
	}
	
	public void solvePuzzle() {
		int counter = 0;
		while(!solved()) {
			 for (int i = 0; i < 9; i++) {
				 for (int j = 0; j < 9; j++) {
					 solveCell(i, j);
				 }
			 }
			 counter++;
			 if (counter > 6000) {
				 System.out.println("unsolvable");
				 break;
			 }
		}
		
	}
	
	public int getFirstThree() {
		String x = Integer.toString(solved[0][0]) + Integer.toString(solved[0][1]) + Integer.toString(solved[0][2]);
		return Integer.parseInt(x);
	}
	
	public boolean solved() {
		 for (int i = 0; i < 9; i++) {
			 for (int j = 0; j < 9; j++) {
				 if (solved[i][j] == 0) return false;
			 }
		 }
		 return true;
	}
	
	public int solveCell(int a, int b) {
		
		if (solved[a][b] != 0) {
			return solved[a][b];
		}
		
		boolean[] numsUsed = impossibleNumbers(a, b);
		
		int possibilities = numberOfPossibilities(a, b);

		int solution = 0;
		
		if (possibilities == 1) {
			for (int i = 1; i < 10; i++) {
				if (!numsUsed[i]) {
					solution = i;
					break;
				}
				
			}
		}
	
		solved[a][b] = solution;
		return solution;
	}
	
	
	public boolean[] numbersUsedinLine(int a, int b) {
		boolean[] numsUsed = new boolean[10];
		for (int i = 0; i < 9; i++) {
			if (solved[a][i] != 0) numsUsed[solved[a][i]] = true;	
		}
		return numsUsed;
	}
	
	public boolean[] numbersUsedinColumn(int a, int b) {
		boolean[] numsUsed = new boolean[10];
		for (int i = 0; i < 9; i++) {
			if (solved[i][b] != 0) numsUsed[solved[i][b]] = true;
		}
		return numsUsed;
	}
	
	public boolean[] numbersUsedinSection(int a, int b) {
		boolean[] numsUsed = new boolean[10];
		int sectorHor = a / 3;
		int sectorVer = b / 3;
		
		for (int i = sectorHor * 3; i < 3; i++) {
			if (solved[i][sectorVer * 3] != 0) {numsUsed[solved[i][sectorVer * 3]] = true;}
			if (solved[i][sectorVer * 3 + 1] != 0) {numsUsed[solved[i][sectorVer * 3 + 1]] = true;}
			if (solved[i][sectorVer * 3 + 2] != 0) {numsUsed[solved[i][sectorVer * 3 + 2]] = true;}
		}
		return numsUsed;
	}
	
	public boolean[] impossibleNumbers(int a, int b) {
		
		boolean[] numsUsedHorizontally = numbersUsedinLine(a, b);
		boolean[] numsUsedVertically = numbersUsedinColumn(a, b);
		boolean[] numsUsedinSection = numbersUsedinSection(a, b);
		
		boolean[] numsUsed = new boolean[10];
		
		for (int i = 1; i < 10; i++) {
			if (numsUsedHorizontally[i] == true || numsUsedVertically[i] == true || numsUsedinSection[i] == true) {
				numsUsed[i] = true;
			}
		}
		
		return numsUsed;
	}
	
	public int numberOfPossibilities(int a, int b) {
		int possibilities = 0;
		boolean[] NU = impossibleNumbers(a, b);
		for (int i = 1; i < 10; i++) {
			if (!NU[i]) possibilities++;
		}
		return possibilities;
	}
	
	public void solveSection(int a, int b) {

		int numberOfUnsolved = 0;
		int sectorHor = a / 3;
		int sectorVer = b / 3;
		
		for (int i = sectorHor * 3; i < 3; i++) {
			if (solved[i][sectorVer * 3] == 0) {numberOfUnsolved++;}
			if (solved[i][sectorVer * 3 + 1] == 0) {numberOfUnsolved++;}
			if (solved[i][sectorVer * 3 + 2] == 0) {numberOfUnsolved++;}
		}
		
		if (numberOfUnsolved == 1) {
			int horInd = -1;
			int verInd = -1;
			for (int i = sectorHor * 3; i < 3; i++) {
				if (solved[i][sectorVer * 3] == 0) {horInd = i; verInd = sectorVer * 3; break;}
				if (solved[i][sectorVer * 3 + 1] == 0) {horInd = i; verInd = sectorVer * 3 + 1; break;}
				if (solved[i][sectorVer * 3 + 2] == 0) {horInd = i; verInd = sectorVer * 3 + 2; break;}
			}
			solveCell(horInd, verInd);
		}
		
		else if (numberOfUnsolved == 2) {
			
		}
		
		
	}
	
	
	
}
