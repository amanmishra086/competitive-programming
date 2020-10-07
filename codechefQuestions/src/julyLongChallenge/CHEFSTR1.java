package julyLongChallenge;

import java.util.Scanner;

public class CHEFSTR1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			int sum=0;
			int d=0;
			int n=sc.nextInt();
			int[] s=new int[n];
			for(int i=0;i<n;i++) {
				s[i]=sc.nextInt();
			}
			for(int i=0;i<n-1;i++) {
				
					d=s[i+1]-s[i];
					if(d>0) {
						d=d-1;
					}else {
						d=d*(-1)-1;
						
					}
				
				 
				sum=sum+d;
			}
			System.out.println(sum);
			
			
			
			
			
			t--;
		}
		
		
	}

}
