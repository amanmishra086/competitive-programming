package codechefLongChallenge;

import java.util.Scanner;

public class trplsort {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t!=0) {
			int number[]=new int[3];
			int n=sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int j=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=i) {
					number[j]=arr[i];
					number[j+1]=arr[arr[i]];
					number[j+2]=i;
					break;
				}
			}
			for(int i=0;i<number.length;i++) {
				int temp=number[1];
				int temp1=number[0];
				number[0]=number[2];
				number[1]=temp1;
				number[2]=temp;
				}
			
				
			
			
			
			
			
			
			t--;
		}
		
		
		
	}

}
