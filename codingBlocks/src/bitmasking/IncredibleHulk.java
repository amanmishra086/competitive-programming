package bitmasking;

import java.util.*;

public class IncredibleHulk {

	public static void main(String[] args) {

		// this problem hust require to count set bits;
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			
			int count=0;
			
//			while(n>0) {
//				
//				if((n&1)==1) {
//					count++;
//				}
//				
//				
//				n=n>>1;
//			}
//			System.out.println(count);
			
			while(n>0) {
				count++;
				n=(n & (n-1));
			}
			System.out.println(count);
			
			
			
		}
		
		
	}

}
