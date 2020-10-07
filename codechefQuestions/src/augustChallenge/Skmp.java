package augustChallenge;

import java.util.Scanner;

public class Skmp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			//sc.nextLine();
			String s=sc.next();
			String p=sc.next();
			
			String str="";
			
			int st[]=new int[256];
			int pt[]=new int[256];
			
			for(int i=0;i<s.length();i++) {
				st[s.charAt(i)]++;
			}
			for(int i=0;i<p.length();i++) {
				pt[p.charAt(i)]++;
			}
			
			//int zz[]=new int[256];
			
			for(int i=0;i<st.length;i++) {
				
				st[i] = st[i] - pt[i];
				
			}
			
			int index =(int) p.charAt(0);
			
			for(int i=97;i<=122;i++) {
				
				 if(st[i]>0) {
						
						while(st[i]>0) {
							str+=(char)i;
							st[i]--;	
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
