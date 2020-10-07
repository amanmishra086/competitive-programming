package augustChallenge;

import java.util.Scanner;

public class Skmp4 {

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
			String str2="";
			
			long arr[]=new long[26];
			long arr2[]=new long[26];
			
		//	Arrays.fill(arr, 0);
			
			for(int i=0;i<s.length();i++) {
				
				arr[s.charAt(i)-'a']++;
				
			}
			for(int i=0;i<p.length();i++) {
				
				arr[p.charAt(i)-'a']--;
			}
			
			for(int i=0;i<arr.length;i++) {
				arr2[i]=arr[i];
			}
			
			
			int index=(int)p.charAt(0);
			
			boolean b=false;
			if(arr[index-'a']==0){
			    b=true;
			}
		   
		
			
			for(int i=0;i<=(index-'a');i++) {
				
			
					while(arr[i]>0) {
						str+=(char)(i+97);
						arr[i]--;
					}
					
				
				
			}
			str+=p;
			for(int j=(index-'a'+1);j<arr.length;j++) {
			
					while(arr[j]>0) {
						str+=(char)(j+97);
						arr[j]--;
				
				}	
			}
			
			if(b) {
				   System.out.println(str);
			   }else {
				   for(int i=0;i<index-'a';i++) {
						
						
						while(arr2[i]>0) {
							str2+=(char)(i+97);
							arr2[i]--;
						}
						
					
					
				}
				str2+=p;
				for(int j=(index-'a');j<arr2.length;j++) {
				
						while(arr2[j]>0) {
							str2+=(char)(j+97);
							arr2[j]--;
					
					}	
				}
//System.out.println(str);
//System.out.println(str2);
				char[] cstr=str.toCharArray();
				char[] cstr2=str2.toCharArray();
				
				boolean ans=false;
				
				for(int i=0;i<cstr.length;i++) {
					if((int)cstr[i] > (int)cstr2[i]) {
						System.out.println(str2);
						break;
					}else {
						System.out.println(str);
						break;
					}
				}
				//System.out.println(str>str2);
		
		    	//System.out.println(str2);

//				if(str.compareTo(str2) >=0) {
//					//ans=str2;
//					System.out.println(str2);
//				}else {
//					//ans=str;
//					System.out.println(str);
//				}
		
			}
			   }
			
		
			
		
		
		
		
		
	}

}
