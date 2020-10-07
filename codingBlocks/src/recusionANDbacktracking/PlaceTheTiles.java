package recusionANDbacktracking;

public class PlaceTheTiles {

	public static void main(String[] args) {
		
		//number of ways to place the tiles of size 1,4 and 4,1 for a wall of size 4*n;
		
		int n=10;
		System.out.println(ways(n));	

	}

	private static int ways(int n) {
		
		if(n<=3) {
			return 1;
		}	
		return ways(n-1)+ways(n-4);
	}

}
