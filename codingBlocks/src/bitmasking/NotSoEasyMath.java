package bitmasking;

import java.util.Arrays;
import java.util.Scanner;

public class NotSoEasyMath {

	public static void main(String[] args) {

		// inclusion exclusion principle;
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		long primes[]= {2,3,5,7,11,13,17,19};
		
		while(t-->0) {
			
			int n=sc.nextInt();
			
			int subsets=(1<<8)-1;
			long ans=0;
			
			for(int i=1;i<=subsets;i++) {
				
				int setbit=Integer.bitCount(i);
			    //int setbit=0;
				long denom=1;
				int x=i;
				int j=0;
				while(x>0) {
					if((x&1) == 1) {
					denom*=primes[j];
					}
					j++;
					x=x>>1;
					
					
					
				}
				
				
				if((setbit % 2)==0) {
					
					ans = ans-(n/denom);
					
				}else {
					ans = ans+(n/denom);
				}
				
			}
			
			
			
			System.out.println(ans);
			
			
			
		}

		
		
		
		
	}

}
