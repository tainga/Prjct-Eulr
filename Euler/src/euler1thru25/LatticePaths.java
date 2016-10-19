package euler1thru25;

public class LatticePaths {

	public static void main(String[] args) {
		
		int gridSize = 500;
		long[][] grid = new long [gridSize + 1] [gridSize + 1];
		
		for (int i = 0; i < gridSize; i++) {
			grid[gridSize][i] = 1;
			grid[i][gridSize] = 1;
		}
		
		
		for (int i = gridSize - 1; i >= 0; i--) {
		    for (int j = gridSize - 1; j >= 0; j--) {
		        grid[i][j] = grid[i+1][j] + grid[i][j+1];
		    }
		}
		
		System.out.println(grid[0][0]);


	}

}
