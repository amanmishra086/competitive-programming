package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=5,temp,k=0;
		int i,j;
		int arr[]=new int[n];
		for( i=0;i<n;i++) {
			 arr[i]= sc.nextInt();
		}
		
		for( i=0;i<n-1;i++) {
			int small=i;
			for( j=i ;j<n;j++) {
				if(arr[j] < arr[small]) {
					small=j;			
					}
			
				}
			temp=arr[i];
			arr[i]=arr[small];
			arr[small]=temp;
			
		}
		
		for(int item : arr) {
			System.out.print(item+"  ");
		}
		
	}

}
