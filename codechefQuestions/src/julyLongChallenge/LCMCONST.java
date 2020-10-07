package julyLongChallenge;

import java.util.Scanner;

public class LCMCONST {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			
			int n=sc.nextInt();
			int m=sc.nextInt();
			sc.nextLine();
			String[] arr=new String[m]; 
			for(int i=0;i<m;i++) {
				arr[i]=sc.nextLine();
			}
		   for(int i=0;i<m;i++) {
			   String[] str=arr[i].split(" ");
			   int r=Integer.parseInt(str[2]);
			 //  if(r==0)
			   
			   
		   }
			
			
			
			
			
			t--;
		}
		
		
	}

}
