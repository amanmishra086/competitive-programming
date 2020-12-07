package recusionANDbacktracking;

public class SudokuSolver {

	public static void main(String[] args) {
		
		
		int [][] grid =    { {3, 0, 6, 5, 0, 8, 4, 0, 0},  
					         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
					         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
					         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
					         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
					         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
					         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
					         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
					         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
		
		
		int n=9;
		
		boolean ans=solveTheSudoku(grid,0,0,n);
		
    //System.out.println(ans);
	}

	private static boolean solveTheSudoku(int[][] grid, int i, int j, int n) {

		//base case
		if(i==n) {
			
			//print the grid
			
			for(int x=0;x<n;x++) {
				for(int y=0;y<n;y++) {
					System.out.print(grid[x][y]+" ");
				}
				System.out.println();
			}
			
			return true;
		}
		
		if(j==n) {
			return solveTheSudoku(grid, i+1, 0, n);
		}
		
		
		if(grid[i][j]!=0) {
			return solveTheSudoku(grid, i, j+1, n);
		}
		//rec case
		
		for(int num=1;num<=9;num++) {
			
			if(ifSafe(grid,i,j,n,num)) {
				
				grid[i][j]=num;
				
				boolean next=solveTheSudoku(grid, i, j+1, n);
				
				if(next) {
					return true;
				}
				
				
			}
			
			grid[i][j]=0;
			
			
			
		}
		
		
		
		
		return false;
	}

	private static boolean ifSafe(int[][] grid, int i, int j, int n, int num) {

		//number should not be in the same row and col
		
		for(int k=0;k<n;k++) {
			
			if(grid[i][k] == num || grid[k][j] == num) {
				return false;
			}
			
		}
		
		//check whether the number is present in the same subgrid or not; 
		
		int ci=(int) ((i/Math.sqrt(n))*Math.sqrt(n));
		int cj=(int) ((j/Math.sqrt(n))*Math.sqrt(n));
		
		for(int m=ci;m<i;m++) {
			for(int p=cj;p<(cj+Math.sqrt(n));p++) {
				if(grid[m][n]==num) {
					return false;
				}
			}
			
		}
		
		return true;
	}

}
