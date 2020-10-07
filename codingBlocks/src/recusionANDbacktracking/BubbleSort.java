package recusionANDbacktracking;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]= {5,0,7,1,2};
		int n=5;
		
		//sort(arr,n);
		withoutForLoop(arr,0,n);
		
		System.out.println(Arrays.toString(arr));

	}

	private static void withoutForLoop(int[] arr,int i, int n) {
		
		if(n==1) {
			return;
		}
		
		
		if(i == n-1) {
			 withoutForLoop(arr,0,n-1);
			 return;
		}
		
		
		if(arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
		withoutForLoop(arr,i+1,n);
		
		
	}

	private static void sort(int[] arr, int n) {
		
		if(n==1) {
			return;
		}
		
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]>arr[i+1]) {
				
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
			
		}
		sort(arr,n-1);
		
		
	}

}
