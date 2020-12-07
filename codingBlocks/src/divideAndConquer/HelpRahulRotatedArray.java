package divideAndConquer;

public class HelpRahulRotatedArray {

	public static void main(String[] args) {
		
		int arr[]= {4,5,1,2,3};
		
		System.out.println(search(arr, 0, arr.length-1, 1));
		
		
	}
	
private static int search(int[] arr, int s, int e,int num) {
		
		
		// using recursion the space complexity will be O(n);
		
		int mid=(s+e)/2;
		if(arr[mid]==num) {
			return mid;
		}
		else if(arr[mid] < num  ) {
			
			if(num <= arr[e]) {
				
				return search(arr, mid+1, e, num);
				
		     }else {
				
				return search(arr, s, mid-1, num); 			
			}
			
			
		}else {
			if(num >=arr[s]) {
				return search(arr, s, mid-1, num);
			}else {
				return search(arr, mid+1, e, num);
			}
			
		}
	}

}
