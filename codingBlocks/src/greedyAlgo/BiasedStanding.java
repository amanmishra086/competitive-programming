package greedyAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class BiasedStanding {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
				
		
		int count[]=new int[n+1];
		Arrays.fill(count, 0);
		
		System.out.println(count);
		
		for(int i=0;i<n;i++) {
			int p=sc.nextInt(); 
			count[p]++;
		}
		
		//Counting sort to get ans in 0(n)
		
		System.out.println(count);
		

		int ans=0;
		
		int k=1;
		for(int i=1;i<n+1;i++) {
			
			while(count[i]>0) {
				
				ans+=k-i;
				k++;
				count[i]--;
				
			}
			
			
		}
	
		System.out.println(ans);
		
	}

}
