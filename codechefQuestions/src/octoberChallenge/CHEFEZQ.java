package octoberChallenge;

import java.util.Scanner;

public class CHEFEZQ {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) { 
			 
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			int freeday=0;
			
			for(int i=0;i<n;i++) {
				
				if(i==n-1 && arr[i]>k) {
					freeday=i+(arr[i]/k)+1;
					break;
				}
				
				else if(i==n-1 && arr[i]==k) {
					freeday=i+1;
					break;
				}
				
				else if(arr[i]<k) {
					freeday=i+1;
					break;
				}else {
					arr[i+1]+=(arr[i]-k);
					continue;
				}
				
			}
			
			System.out.println(freeday);
			
		}

	}

}
