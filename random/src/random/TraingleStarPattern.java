package random;

import java.util.Scanner;

public class TraingleStarPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
    	int midSpace=1;

		for(int i=1;i<=n-1;i++) {
			
			for(int j=1;j<=n-1-i;j++) {	
				
				System.out.print(" ");	
				
			}
			System.out.print("*");
			
			if(i>1) {
				
				int midSpaceflag=midSpace;
				
				while(midSpaceflag>0) {
					System.out.print(" ");
					midSpaceflag--;
				}
				
				System.out.print("*");
				
				midSpace+=2;

			}
		
			System.out.println();
		}
		
		for(int i=0;i<midSpace;i++) {
			System.out.print("*");
		}
		

	}

}
