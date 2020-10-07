package augustChallenge;

import java.util.Scanner;

public class CRDgame3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int pc=sc.nextInt();
			int pr=sc.nextInt();
			int countpc=0;
			int countpr=0;
			
			
			if(pc % 9 == 0) {
				countpc=pc/9;
			}else {
				countpc=(pc/9)+1;
			}
			
			if(pr % 9 == 0) {
				countpr=pr/9;
			}else {
				countpr=(pr/9)+1;
			}
			
			
			if(countpc < countpr) {
				System.out.print("0"+" "+countpc);
			}else if(countpc > countpr) {
				System.out.println("1"+" "+countpr);
			}else {
				System.out.println("1"+" "+countpr);
			}
			
			
		}
		
		
	}

}
