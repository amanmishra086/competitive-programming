package octoberChallenge;

import java.util.Scanner;

public class CovidRun {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			int arr[]=new int[n];
			
		    int i=x;
		    while(arr[i]!=1) {
		    	
		    	if(arr[i]==0) {
		    		
		    		arr[i]=1;
		    		
		    	}
		    	
		    	i+=k;
		    	i=i%n;
		    }
			if(arr[y]==1) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
		
		
	}

}