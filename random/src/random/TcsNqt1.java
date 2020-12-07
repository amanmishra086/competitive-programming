package random;

import java.util.Scanner;

public class TcsNqt1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		
		float y2=y;
		float max=x*0.8f;
		

		
		System.out.println(max/y);
		
		int count=0;
		
		
		while(y<max) {
			
			y=y+y2;
	
			count++;
			
			
		}
		count++;
		
		System.out.println(count);

	}

}
