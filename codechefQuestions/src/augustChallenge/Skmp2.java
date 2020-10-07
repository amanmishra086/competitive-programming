package augustChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Skmp2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			sc.nextLine();
			String s=sc.next();
			String p=sc.next();
			
			String str="";
			
			int arr[]=new int[256];
			
			Arrays.fill(arr, 0);
			
			for(int i=0;i<s.length();i++) {
				
				arr[s.charAt(i)]++;
				
			}
			for(int i=0;i<p.length();i++) {
				
				arr[p.charAt(i)]--;
			}
			
//			for(int i=97;i<=122;i++) {
//				System.out.print(arr[i]+" ");
//			}
			System.out.println();
			
			int index=(int)p.charAt(0);
			
//			System.out.println(index);
//			
//			System.out.println(s);
//			System.out.println(p);
			
			for(int i=97;i<=122;i++) {
				
			      if(arr[i]>0) {
			    	  
			    	  while(arr[i]>0) {
			    		  str+=(char)i;
			    		  arr[i]--;
			    	  }
			    	  
			      }
				
			      if(i==index) {
			    	  str+=p;
			      }
			     
			}
			
			
			
			
		System.out.println(str);
		}
	}

}
