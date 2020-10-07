package recusionANDbacktracking;

import java.util.Arrays;

public class InversionCount {

public static void main(String[] args) {
	
	int arr[]= {1,5,2,6,3,0};
		int n=arr.length;
		int start=0;
		int end=n-1;
		
		
		
		System.out.println(sort(arr,n,start,end));
		
   // System.out.println(Arrays.toString(arr));
	}

	private static int sort(int[] arr, int n,int s,int e) {
		//base case;
		if(s>=e) {
			return 0;
		}
		
		int mid=(s+e)/2;
		
		int x=sort(arr,n,s,mid);
		int y=sort(arr,n,mid+1,e);
		
		int z=merge(arr,n,s,e);
		return x+y+z;
	}

	private static int merge(int[] arr, int n, int s, int e) {
		
		int mid=(s+e)/2;
		int i=s;
		int j=mid+1;
		int k=s;
		
		int count=0;
		
		int temp[]=new int[100];
		
		while(i<=mid && j<=e) {
			
			if(arr[i]>arr[j]) {
				
				temp[k]=arr[j];
				j++;
				k++;
				
				count+=mid-i+1;
				
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
		
		return count;
	}


}
