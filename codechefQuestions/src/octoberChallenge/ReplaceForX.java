package octoberChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceForX {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			long x=sc.nextLong();
			int p=sc.nextInt();
			int k=sc.nextInt(); 
			
			long arr[]=new long[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			Arrays.sort(arr);
			long count=0;
		
			
			if(arr[p-1]==x) {
				count=0;
			}
			else if(k>p && arr[p-1] < x) {
				count=-1;
			}else if(k>=p && arr[p-1] > x) {
				int index=0;
				for(int i=p-1;i>=0;i--) {
					if(arr[i]==x || arr[i] < x) {
						index=i;
						break;
					}
					index=-1;
				}
				count=p-1-index;
				
			}
			else if(k<p && arr[p-1] > x) {
				count =-1;
			}else if(k<=p && arr[p-1] < x) {
				int index=0;
				for(int i=p-1;i<n;i++) {
					if(arr[i]==x || arr[i] > x) {
						index=i;
						break;
					}
					index=n;
				}
				
				count=index-(p-1);
			}
			System.out.println(count);
		}
		

	}

}
