package augustLunchtime;

import java.util.Arrays;
import java.util.Scanner;

public class ArrGame2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			int hash[]=new int[300000];
			int count=0;
			for(int i=0;i<n;i++) {
				
				if(arr[i]!=0) {
					hash[count]++;
					count=0;
					
				}else {
					count++;
				}
				
			}
			int max=0;
			for(int i=0;i<hash.length;i++) {
				
				if(hash[i]>0 && i%2 !=0 && i> max) {
					max=i;
				}
				
			}
			if(max==0) {
				System.out.println("No");
			}else {
				hash[max]--;
				
				boolean win=true;
				int check=max/2;
				
				for(int i=check+1;i<hash.length;i++) {
					
					if(hash[i]>0) {
						win = false;
						break;
					}
					
				}
				if(win) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
			
			
			
			
			
			
		
		}
	}

}
