package pattern;

import java.util.Scanner;

public class LastSum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
    	int k=n;
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				if(j==i) {
					System.out.print(k+" ");
				}
				else {
					System.out.print(j+" ");
				}
				
			}
			k+=i-1;
			System.out.println();
		}
		
		
		
		
	}

}
