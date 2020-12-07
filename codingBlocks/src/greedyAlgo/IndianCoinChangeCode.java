package greedyAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class IndianCoinChangeCode {

	public static void main(String[] args) {
		
		int coins[]= {1,2,5,10,20,50,100,500,2000};
		
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int n=39;
		// min number of coins needed for change of n rupee;
		int ans=0;
		int index=0;

		
		while(n>0) {
			int existOrNot=Arrays.binarySearch(coins, n);
			if(existOrNot<0) index=Math.abs(existOrNot)-2;
			else index=existOrNot;
			
			System.out.print(""+coins[index]+" + ");
			n=n-coins[index];
			
			ans++;
			
		}
		System.out.println();
		System.out.println(ans);
		
	}

	

}
