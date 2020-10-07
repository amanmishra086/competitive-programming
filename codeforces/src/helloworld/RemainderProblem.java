package helloworld;

import java.util.Scanner;

public class RemainderProblem {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	
		int t=sc.nextInt();
		while(t!=0) {
			
			long x=sc.nextLong();
			long y=sc.nextLong();
			long n=sc.nextLong();
			
			long k=0;
			
//			for(long i=n;i>=0;i--) {
//				if(i%x==y) {
//					k=i;
//					break;
//				}
//			}
			
			for(long i=n;i>=0;i--) {
				
				if(i%x==0) {
					k=i+y;
					if(k>n) {
						continue;
					}else {
						break;
					}
					
				}
				
			}
			
			
			System.out.println(k);
			
			
			t--;
		}
		
		
		
		
	}

}
