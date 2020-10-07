package septemberChallenge;

import java.util.Scanner;

public class CHFNSWAP {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			double ans=0;
			long n=sc.nextLong();
			long sum=n*(n+1)/2;
			long half=sum/2;
			
			double subhalf=0;
			subhalf=  Math.sqrt(1+(4*1*(2*half)));
			subhalf=(subhalf-1)/2;
			
			//System.out.println(subhalf);
			
			
			if(n==0 || n==1 || n==2) {
				ans=0;
				
			}else if(sum %2 !=0) {
				
				ans=0;
				
			}else if(subhalf==Math.floor(subhalf)) {
				
				double sub2=n-subhalf;
				ans=Math.min(subhalf, sub2)+(subhalf* (subhalf-1)/2)+(sub2*(sub2-1)/2);
				
			}
			
			
			else {
//				long half=sum/2;
				if(sum %2 == 0 && n != 0 && n!=1 && n!=2) {
					
					ans=Math.abs(n - Math.floor(subhalf));

				}
				
			}	
			
		System.out.println((long)ans);
		}
	}

}
