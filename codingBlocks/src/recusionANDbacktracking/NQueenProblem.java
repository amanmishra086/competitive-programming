package recusionANDbacktracking;

import java.util.*;

public class NQueenProblem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		
	    queen(arr,n,0);
		
		

	}
	
	
	private static boolean isSafe(int i,int j,int n,int[][] arr) {
		
		if(i>=n && j>=n) {
			return false;
		}
		
		// checking if any queen is there in the same col or not
		
		for(int row=0;row<i;row++) {
			
			if(arr[row][j]==1) {
				return false;
			}
			
		}
		
		// check left diagonal
		
		int x=i-1;
		int y=j-1;
		
		while(x>=0 && y>=0) {
			
			if(arr[x][y]==1) {
				return false;
			}
			x--;
			y--;
			
		}
		
		//check right diagonal
		
	    x=i-1;
		y=j+1;
		
		while(x>=0 && y<n) {
			
			if(arr[x][y]==1) {
				return false;
			}
			
			x--;
			y++;
		}
		
		
		return true;
	}
		

	private static boolean queen(int[][] arr, int n, int i) {
		
		if(i>=n) {
			
			
			//print array

			for(int a=0;a<n;a++) {
				for(int b=0;b<n;b++) {
					
					System.out.print(arr[a][b]+" ");
					
				}
				System.out.println();
			}
			
			return true;
			
		}
		
		for(int j=0;j<n;j++) {
			
			if(isSafe(i,j,n,arr)) {
				
				arr[i][j]=1;
				
				boolean subAns=queen(arr,n,i+1);
				
				if(subAns) {
					return true;
				}
				
				arr[i][j]=0;
				
			}
			
			
		}
		
		return false;
		
	}

	
		
		
		
	
		
		
		
		
		
		
	}


