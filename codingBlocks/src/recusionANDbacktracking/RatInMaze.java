package recusionANDbacktracking;

import java.util.*;

public class RatInMaze {
 
	public static void main(String[] args) {
		
		String maze[]= { "0000",
						 "00X0",
						 "000X",
						 "0X00" };
		
		
   	     int sol[][]=new int[4][4];
   	  
   	     int m=4;
   	     int n=4;
   	     
   	     //boolean ans=mazefunction(maze,sol,0,0,m-1,n-1);
   	     
   	     ArrayList<Integer> list=new ArrayList<>();
   	     list.add(2);
   	     list.add(3);
   	     list.add(5);
   	     
   	     int arr[]= {1,2,3};
   	     
   	     System.out.println(Arrays.toString(arr));
   	     
   	     System.out.println(list);
 

   	 
	}

	static boolean mazefunction(String maze[],int sol[][],int i,int j,int m,int n) {
		
		
		
	   if(i==m && j==n) {
		   sol[i][j]=1;
		   for(int x=0;x<=m;x++) {    
		   		 for(int y=0;y<=n;y++) {
		   			 System.out.print(sol[x][y]+" ");
		   		 }
		   		 System.out.println();
		   	 }
		   System.out.println();
		   
		   
		   return true;
	   }
	   
	   
	   if(i>m || j>n) {
		   return false;
	   }
	   
	   if(maze[i].charAt(j)=='X') {
		   return false;
	   }
	   
	   //asssume the soln exist
	   
	   sol[i][j]=1;
	   
	   boolean right=mazefunction(maze, sol, i, j+1, m, n);
	   boolean down=mazefunction(maze, sol, i+1, j, m, n);
	  
	   sol[i][j]=0;
	   
	   if(right == true && down==true) {
		   
		   return true;
		   
	   }
	 
		return false;
	}
	
	
}
