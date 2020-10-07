package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int n=5;
		int temp;
		int arr[]=new int[n];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n-1;j++) {
			boolean sorted=true;
			
		for(int i=0;i<n-1-j;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
				sorted=false;
			}
		}
		if(sorted) break;
		
		}
		for(int item: arr) {
			System.out.println(item);
		}
		
		
		
	}

}
