package bitmasking;

import java.util.Scanner;

public class PlayWithBits {

	static int countBits(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=(n & (n-1));
		}
		return count;
	}
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int q=0;
		if(sc.hasNextInt())
			q=sc.nextInt();
		
		while(q-->0) {
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			int count=0;
			
			for(int i=a;i<=b;i++) {
				
				count+=countBits(i);
				
			}
			System.out.println(count);
			
			
			
		}
			
		
		
	}

}
