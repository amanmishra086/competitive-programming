package octoberChallenge;

import java.util.Scanner;

public class PositiveAnd3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) { 
			 
			int n=sc.nextInt();
			
			if(n==1) {
				System.out.println(1);
				continue;
			}
			else if(n==3) {
				System.out.println(1+" "+3+" "+2);
				continue;
			}
			else if(n==5) {
				System.out.println(2+" "+3+" "+1+" "+5+" "+4);
				continue;
			}
			else if((n&(n-1))==0) {
				System.out.println(-1);
				continue;
			}
			else {
				System.out.print(2+" "+3+" "+1+" "+5+" "+4+" ");
				
				int i=6;
				while(i<=n) {
				   if((i&(i-1))==0) {
					   System.out.print(i+1+" "+i+" ");
					   i=i+2;
				   }else {
					   System.out.print(i+" ");
					   i=i+1;
				   }
				}
				System.out.println();
				
			}
			System.out.flush();
		}
	}

}
