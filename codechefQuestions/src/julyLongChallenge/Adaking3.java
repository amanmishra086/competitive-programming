package julyLongChallenge;

import java.util.Scanner;

public class Adaking3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			
			int k=sc.nextInt();
			
			for(int i=1;i<=8;i++) {
				for(int j=1;j<=8;j++) {
					if(i==1 && j==1) {
						System.out.print("O");
					}
					else if(k>1) {
						System.out.print(".");
						k--;
					}else {
						System.out.print("X");
					}
				}
				System.out.println();
			}
			
			
			
			
			t--;
		}
		
		
	}

}
