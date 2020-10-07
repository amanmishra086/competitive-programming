package julyLongChallenge;
import java.util.*;
public class Adaking2 {
	
		static void floodFillUtil(String screen[][], int x, int y,  
	            String prevC, String newC, int count) 
		{ 
		// Base cases 
		if (x < 0 || x >= 8 || y < 0 || y >= 8) 
		return; 
		if (screen[x][y] != prevC) 
		return; 
		if(count<=0)
		return;
		// Replace the color at (x, y) 
		screen[x][y] = newC; 
		count--;
		// Recur for north, east, south and west 
		if(count>0) {
		floodFillUtil(screen, x+1, y, prevC, newC,count); 
		floodFillUtil(screen, x-1, y, prevC, newC,count); 
		floodFillUtil(screen, x, y+1, prevC, newC,count); 
		floodFillUtil(screen, x, y-1, prevC, newC,count); 
		  } 
		} 
		
		static void floodFill(String screen[][], int x, int y, String newC,int count) 
		{ 
		String prevC = screen[x][y]; 
		floodFillUtil(screen, x, y, prevC, newC,count); 
		} 

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			
			int k=sc.nextInt();
			
			String screen[][] = {{"X", "X", "X", "X", "X", "X", "X", "X"}, 
			                     {"X", "X", "X", "X", "X", "X", "X", "X"}, 
			                     {"X", "X", "X", "X", "X", "X", "X", "X"}, 
			                     {"X", "X", "X", "X", "X", "X", "X", "X"}, 
			                     {"X", "X", "X", "X", "X", "X", "X", "X"}, 
			                     {"X", "X", "X", "X", "X", "X", "X", "X"}, 
			                     {"X", "X", "X", "X", "X", "X", "X", "X"}, 
			                     {"X", "X", "X", "X", "X", "X", "X", "X"}, 
                    }; 
			
			 int x = 3, y = 3; 
			 String newC=".";
			   floodFill(screen, x, y, newC,k); 
			   
			   for (int i = 0; i < 8; i++) 
			    { 
			        for (int j = 0; j < 8; j++) 
			        System.out.print(screen[i][j] + " "); 
			        System.out.println(); 
			    } 

			
			
			
			
			t--;
		}
		
		
	}

}
