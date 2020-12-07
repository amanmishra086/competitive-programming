package greedyAlgo;

import java.util.*;

public class KingdomDefenceConcept {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int n=sc.nextInt();
		
		int height[]=new int[n];
		int weight[]=new int[n];
		
		Arrays.fill(height, 0);
		
		for(int i=0;i<n;i++) {
			
			height[i]=sc.nextInt();
			weight[i]=sc.nextInt();
			
		}
		System.out.println(height);
		
		Arrays.sort(height);
		Arrays.sort(weight);
	
		int deltax[]=new int[n+1];
		int deltay[]=new int[n+1];
		
		deltax[0]=height[0]-0-1;
		deltay[0]=weight[0]-0-1;		
		
		for(int i=1;i<n-1;i++) {
			
			deltax[i]=height[i+1]-height[i];
			
		}
		deltax[n]=h-height[n-1];
		deltay[n]=w-weight[n-1];
		
//		System.out.println(height);
//		System.out.println(deltax);
		
		

	}

}
