package septemberChallenge;

import java.util.Scanner;

public class ChefNswap2 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			long ans=0;
			long n=sc.nextLong();
			long sum=n*(n+1)/2;
			
			
			if(n==0 || n==1 || n==2) {
				ans=0;
				
			}else if(sum %2 !=0) {
				
				ans=0;
				
			}
			
			
			else {
				long half=sum/2;
				
				//System.out.println(half);
				
				long subhalf=0;
				subhalf=  (long) Math.sqrt(1+(4*1*(2*half)));
				subhalf=(subhalf-1)/2;
				
				//System.out.println(subhalf);
				
				long subsum=subhalf*(subhalf+1)/2;
				
				//System.out.println(subsum);
				
				if(subsum==half) {
					long sub2=n-subhalf;
					ans=Math.min(subhalf, sub2)+(subhalf* (subhalf-1)/2)+(sub2*(sub2-1)/2);
				}else {
					ans=(n -subhalf);
				}
//				long half=sum/2;
				
				
			}	
			
		System.out.println(ans);
		}
	}


	}


