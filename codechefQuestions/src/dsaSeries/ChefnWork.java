package dsaSeries;

import java.util.Scanner;

public class ChefnWork {

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
			int count = 0;
			int sum=0;
			int flag=0;
			for(int i=0;i<n;i++) {
				
				if(arr[i]>k) {
					flag=1;
					break;
				}
				else {
				sum+=arr[i];
				if( sum>k) {
					
					sum=0;
					i--;
					count++;
					
				}
				else if(i==n-1 && sum<=k) {
					count++;
				}
				
			}
			}
			
			if(flag==1) {
				System.out.println("-1");
			}else {
			System.out.println(count);
			}
			
		}
		
	}

}
