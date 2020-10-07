package recusionANDbacktracking;

import java.util.Arrays;

public class MegerSort {

	public static void main(String[] args) {
		
		int arr[]= {5,6,3,4,9,0,2,1};
		int n=arr.length;
		int start=0;
		int end=n-1;
		
		sort(arr,n,start,end);
		
    System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr, int n,int s,int e) {
		//base case;
		if(s>=e) {
			return;
		}
		
		int mid=(s+e)/2;
		
		sort(arr,n,s,mid);
		sort(arr,n,mid+1,e);
		
		merge(arr,n,s,e);
	}

	private static void merge(int[] arr, int n, int s, int e) {
		
		int mid=(s+e)/2;
		int i=s;
		int j=mid+1;
		int k=s;
		
		int temp[]=new int[100];
		
		while(i<=mid && j<=e) {
			
			if(arr[i]>arr[j]) {
				
				temp[k]=arr[j];
				j++;
				k++;
				
			}
			else {
				temp[k]=arr[i];
				i++;
				k++;
			}
			
			
		}
		while(i<=mid) {
			temp[k]=arr[i];
			k++;
			i++;
		}
		while(j<=e) {
			temp[k]=arr[j];
			k++;
			j++;
		}
		
		//System.out.println(Arrays.toString(temp));
		for(int p=s;p<=e;p++) {
			arr[p]=temp[p];
		}
		
		
	}

}
