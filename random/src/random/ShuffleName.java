package random;

import java.util.Scanner;

public class ShuffleName {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String arr[]=str.split(" ");
		
		String ans=arr[1]+" "+arr[0];
		
		System.out.println(ans);
		

	}

}
