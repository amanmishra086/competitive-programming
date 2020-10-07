package dsaSeries;

import java.util.*;

public class Reverse {

	public static void main(String[] args) {

		int t=0;
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			
			int n=sc.nextInt();
	        
			String s=""+n;
			String s1="";
			
			for(int i=s.length()-1;i>=0;i--) {
				s1=s1+s.charAt(i);
			}
		n=Integer.valueOf(s1);
			System.out.println(n);
			
			
			
			t--;
		}
		
	}

}
