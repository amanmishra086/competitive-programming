package random;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String arr[]=str.split(" ");
		
		int a=Integer.parseInt(arr[0]);
		int b=Integer.parseInt(arr[1]);
		
		boolean ans=Math.sqrt(a)==Math.cbrt(b);
		
		if(ans)
			System.out.println("1");
		else
			System.out.println("0");
		

	}

}
