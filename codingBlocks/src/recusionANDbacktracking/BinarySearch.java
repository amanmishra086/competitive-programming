package recusionANDbacktracking;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {1,2,5,10,40,50,60};
		int element=40;
		int start=0;
		int end=arr.length-1;
		
		int index=search(arr,start,end,element);
		System.out.println(index);
		
	}

	private static int search(int[] arr, int start, int end, int element) {
		
		int mid=(start+end)/2;
		
		if(element==arr[mid])
			return mid;
		else if(element > arr[mid]) {
			return search(arr,mid+1,end,element);
		}else {
		return	search(arr,start,mid-1,element);
		}
	}
	

}
