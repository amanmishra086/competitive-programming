package JuneLongChallenge;

import java.util.Scanner;

public class PriceOn {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			int isum=0;
			int arr[]=new int[n];
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				isum=isum+arr[i];
				
			}
			int fsum=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>k) {
					arr[i]=k;
				}
				fsum=fsum+arr[i];
			}
			int loss=0;
			loss=isum-fsum;
			System.out.println(loss);
			
			
			
			
			t--;	
			
		}
		
		
	}

}
