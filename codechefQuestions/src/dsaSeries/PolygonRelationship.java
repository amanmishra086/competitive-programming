package dsaSeries;

import java.util.Scanner;

public class PolygonRelationship {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				int a=sc.nextInt();
				int b=sc.nextInt();
			}
			int total=0;
			if(n>=6) {
				total=n;
				while(n>=6) {
					n=n/2;
					total+=n;
				}
				
				
			}else {
				total=n;
			}
			
			
			System.out.println(total);
		}
		
		
		
	}

}
