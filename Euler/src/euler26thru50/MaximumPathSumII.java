package euler26thru50;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MaximumPathSumII {

	public static void main(String[] args) throws FileNotFoundException {
		
		int[][] numbers = new int [100] [100];
		
		Scanner in = new Scanner(new File("C:\\Users\\Anastasia\\Desktop\\triangle.txt"));

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j <= i; j++) {
				numbers[i][j] = in.nextInt();
			}
		}
		
		for (int i = 98; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				numbers[i][j] += Math.max(numbers[i + 1][j], numbers[i + 1][j + 1]);
			}
		} 
		
		/*
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		*/
		in.close();
		System.out.println(numbers[0][0]);
	}

}
