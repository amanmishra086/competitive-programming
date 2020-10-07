package MayLunchTime;

import java.util.Scanner;

public class WeirdWalk2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n+1];
		int b[]=new int[n+1];
		a[0]=0;
		b[0]=0;
		int pos1=0;
		int pos2=0;
		int dist=0;
		for(int i=1;i<n+1;i++) {
			a[i]=sc.nextInt();
			a[i]=a[i-1]+a[i];
		}
		for(int i=1;i<n+1;i++) {
			b[i]=sc.nextInt();
			b[i]=b[i-1]+b[i];
		}
		
		for(int i=1;i<n+1;i++) {
			pos1=pos1+a[i-1];
			pos2=pos2+b[i-1];
			if(a[i]==b[i] && pos1==pos2) {
				
				dist=dist+a[i];
				
			}
		}
		System.out.println(dist);
	}

}
