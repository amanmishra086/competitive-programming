package recusionANDbacktracking;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int arr[]= {4,6,8,1,3,2,0,5};
		int s=0;
		int e=arr.length-1;
		sort(arr,s,e);

		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr, int s, int e) {
		
		// base case 
		
		if(s>=e) {
			return;
		}
		
		int pivot=arr[e];
		
		int i=s-1; // initially at -1;
		int j=s;
		
		while(j<=e-1) {
			if(arr[j]<=pivot) {
			    i=i+1;
			    //swap(arr[i],arr[j]);
			    int temp=arr[i];
			    arr[i]=arr[j];
			    arr[j]=temp;
			}
			j=j+1;
		}
		//swap(arr[i+1],arr[e]);
		int temp2=arr[i+1];
		arr[i+1]=arr[e];
		arr[e]=temp2;
		
		int p=i+1;
		
		sort(arr,s,p-1);
		sort(arr,p+1,e);
		
	}

	private static void swap(int i, int j) {
		
		int temp=i;
		i=j;
		j=i;
		
	}

}
