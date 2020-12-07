package novemberLongChallenge;

import java.util.Scanner;

public class FRCTNS {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
			
			int count=0;
			int n=sc.nextInt();
			double ans=0;
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=n;j++) {
					
					int p=i*(j+1);
					int q=(i+1)*j;
					
				    int a=gcd(p,q);
				    p=p/a;
				    q=q/a;
				    
				    if(p+1 == q) {
				    	count++;
				    }
					
				}
			}
			
			System.out.println(count);
			
		}

	private static int gcd(int a, int b) {
		return b==0 ? a :gcd(b,a%b) ;
	}
	

}
