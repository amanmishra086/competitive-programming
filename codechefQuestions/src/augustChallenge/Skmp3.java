package augustChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Skmp3 {

	public static void main(String[] args) {

		
		// corner case if s= zzzety and p=ze;
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			sc.nextLine();
			String s=sc.next();
			String p=sc.next();
			
			
			String str="";
			String str2="";
			
			int arr[]=new int[256];
			int arr2[]=new int[256];
			
			Arrays.fill(arr, 0);
			
			for(int i=0;i<s.length();i++) {
				
				arr[s.charAt(i)]++;
				
			}
			for(int i=0;i<p.length();i++) {
				
				arr[p.charAt(i)]--;
			}
			
			for(int i=0;i<arr.length;i++) {
				arr2[i]=arr[i];
			}
			
			
			int index=(int)p.charAt(0);
			
					
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
			int i=0;
			while(i<index) {
				
				if(arr2[i]>0) {
					while(arr2[i]>0) {
						str2+=(char)i;
						arr2[i]--;
					}
				}	
				i++;
				
			}
			str2+=p;
			for(int j=0;j<arr2.length;j++) {
				if(arr2[j]>0) {
					while(arr2[j]>0) {
						str2+=(char)j;
						arr2[j]--;
					}
				}	
			}
			
			
			
//			System.out.println(str);
//			System.out.println(str2);
			String ans="";
			if(str.compareTo(str2)>=0) {
				ans=str2;
			}else {
				ans=str;
			}
			System.out.println(ans);
//			
//			System.out.println(str2);
//			
//		System.out.println(str);
		}
		
		
		
	}

}
