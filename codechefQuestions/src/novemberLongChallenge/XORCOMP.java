package novemberLongChallenge;

import java.util.Scanner;

public class XORCOMP {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int x=sc.nextInt();
			int y=sc.nextInt();
			int n=sc.nextInt();
			
			int count=0;
			
			for(int i=0;i<=n;i++) {
				
				int p=(x^i);
				int q=(y^i);
				
				if(p<q) {
					System.out.print(i+" ");
					count++;
				}
				
			}
			
			System.out.println(count);
			
		}
	}

}
