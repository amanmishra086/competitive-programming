package numberTheory;

import java.util.Scanner;

public class AlmostPrime {

	public static void main(String[] args) {

		// find almost prime between n;
		// using prime sieve;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n+1];
		
		for(int i=2;i<=n;i++) {
			
			if(arr[i]==0) {
				for(int j=i;j<=n;j+=i) {
					arr[j]++;
				}
			}
			
		}
		int ans=0;
		for(int i=0;i<=n;i++) {
			if(arr[i]==2) {
				ans++;
			}
		}
		System.out.println(ans);
		
	}

}
