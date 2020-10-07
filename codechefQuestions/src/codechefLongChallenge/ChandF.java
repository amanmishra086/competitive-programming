package codechefLongChallenge;

import java.util.Scanner;

public class ChandF {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=1;//sc.nextInt();
		while(t!=0) {
			
			int x=7;
			int y=12;
			int l=0;
			int r=40;
			int a=x*y;
		
			int result=0;
			for(int i=l;i<=r;i++) {	
				if((x&i)*(y&i)==a) {
					result=i;
					break;
				}else {
					continue;
				}
				
				
			}
			System.out.println(result);
			
			
			
			

			t--;
		}

	}
}
