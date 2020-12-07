package divideAndConquer;

import java.util.Arrays;

public class FirstAndLastOccur {

	public static void main(String[] args) {
		
		int arr[]= {1,3,8,8,8,9,9,12,23,55,55};
		int key=8;
		
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(firstOccur(arr,key));
		System.out.println(lastOccur(arr, key));
		
		
		
		

	}

	private static int firstOccur(int[] arr, int key) {
	
		int ans=-1;
		int s=0;
		int e=arr.length-1;
		int mid=0;
		while(s<=e) {
			 mid=(s+e)/2;
			
			if(arr[mid]==key) {
				ans=mid;
				e=mid-1;
			}else if(arr[mid]<key) {
				s=mid+1;
			}else {
				e=mid-1;
			}
			
		}
		
		return ans;
	}
	private static int lastOccur(int[] arr, int key) {
		
		int ans=-1;
		int s=0;
		int e=arr.length-1;
		int mid=0;
		while(s<=e) {
			 mid=(s+e)/2;
			
			if(arr[mid]==key) {
				ans=mid;
				s=mid+1;
			}else if(arr[mid]<key) {
				s=mid+1;
			}else {
				e=mid-1;
			}
			
		}
		
		return ans;
		
		// if you want to return the next greater value if the value is not present then return s ;
	}

	
	
}
