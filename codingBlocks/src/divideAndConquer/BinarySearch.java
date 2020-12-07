package divideAndConquer;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {


		int[] arr= {1,3,5,6,7,9,12,15,18,20};
		
		int key=12;
		
		int s=0;
		int e=arr.length-1;
		
		while(s<=e) {
			int mid=(s+e)/2;
			
			if(arr[mid]==key) {
				System.out.println(mid);
				break;
			}
			else if(arr[mid] > key) {
				e=mid-1;
			}else {
				s=mid+1;
			}
			
		}
		
	
		System.out.println(Arrays.binarySearch(arr, 12));

		 System.out.println(search(arr,0,arr.length-1,12));
		
		
	}

	private static int search(int[] arr, int s, int e,int num) {
		
		
		// using recursion the space complexity will be O(n);
		
		int mid=(s+e)/2;
		if(arr[mid]==num) {
			return mid;
		}
		
		else if(num > arr[mid]) {
			return search(arr, mid+1, e, num);
		}else {
			return search(arr,s,mid-1,num);
		}
		
		
		
	}

}
