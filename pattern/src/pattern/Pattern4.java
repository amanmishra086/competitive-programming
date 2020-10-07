package pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,k;
		
		for(i=n;i>=1;i--) {
			
			for(k=0;k<n-i;k++) {
				System.out.print("  ");
			}
			
			for(j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			
			System.out.println();
		}
		
	}

}
