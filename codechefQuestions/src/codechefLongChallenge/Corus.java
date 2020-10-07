package codechefLongChallenge;

import java.util.Scanner;

public class Corus {
	
	
	// finally successfully executed

	public static void main(String[] args) {	
       int t=0;
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt())
		 t=sc.nextInt();
		while(t!=0) {			
			
			int n=sc.nextInt();
			int q=sc.nextInt();
			sc.nextLine();
			
			String str=sc.nextLine();
			String str2=str.substring(0, n);
			String s=str2.toLowerCase();
			int c[]=new int[q];
			for(int i=0;i<q;i++) {
				
				c[i]=sc.nextInt();
				
			}
			int arr[]=new int[256];
			
			for(char ch:s.toCharArray()) {
				
				   int index=(int) ch;
				   arr[index]++;	
				}
			
			
			for(int i=0;i<q;i++) {
				long count=0;
				
				//int c=sc.nextInt();
				
				
				
				for(int j=0;j<256;j++) {
					if(arr[j]-c[i] > 0  && arr[j]!=0) {
						count =count+ (arr[j]-c[i]);
					}
				}
				System.out.println(count);
				//System.out.println();
				
			}
			
				
			t--;
		}
		
		
	}

}
