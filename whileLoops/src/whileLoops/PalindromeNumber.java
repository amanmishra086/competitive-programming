package whileLoops;

import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int numver=n;
		int revNum=0,x=0,y=0;
		
		while(n!=0) {
			
		     x=n%10;
			revNum=revNum*10+x;
			//revNum=x;
			n=n/10;
		
		}
		//System.out.println(revNum);
		if(numver==revNum) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not Palindrome");
		}
		
		
		
		
	}

}
