package novemberLongChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class AdaAndDishes2 {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			int ans=solve(n,arr);
			
			System.out.println(ans);
		
		}

	}

	private static int solve(int n,int[] arr) {
		
	    if(n==1) {
	    	return arr[0];
	    }else if(n==2) {
	    	return Math.max(arr[0], arr[1]);
	    }else if(n==3) {
	    	
	    	Arrays.sort(arr);
	    	
	    	int count=0;
	    	
	    	count=Math.min(arr[2], arr[1]) + Math.max(Math.abs(arr[2]-arr[1]), arr[0]);
	    	return count;
	    }
	    Arrays.sort(arr);
	    
	    int count=0;
	    
	    count=Math.min(arr[3], arr[2]) + Math.min(Math.abs(arr[3]-arr[2]), arr[1])+Math.max(Math.abs(Math.abs(arr[3]-arr[2])-arr[1]), arr[0]); 
	    
		
		return count;
	}

}
