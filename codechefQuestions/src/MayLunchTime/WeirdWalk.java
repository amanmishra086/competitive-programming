package MayLunchTime;

import java.util.Scanner;

public class WeirdWalk {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			int dist=0;
			int n=sc.nextInt();
			
			int a[]=new int[n];
			int b[]=new int[n];
			
			int apos[]=new int[n+1];
			int bpos[]=new int[n+1];
			
			apos[0]=0;
			bpos[0]=0;
			
			for(int i=0;i<n;i++) {
				
				a[i]=sc.nextInt();
			
				
			}
			for(int i=0;i<n;i++) {
				
				b[i]=sc.nextInt();
			}
			for(int i=1;i<apos.length;i++) {
				apos[i]=apos[i-1]+a[i-1];
				bpos[i]=bpos[i-1]+b[i-1];
			}
			
			for(int i=0;i<apos.length-1;i++) {
				if(apos[i+1]==bpos[i+1] && apos[i]==bpos[i]) {
					dist=dist+(apos[i+1]-apos[i]);
				}
			}
			System.out.println(dist);
			
			
			t--;
		}
		
		
	}

}
