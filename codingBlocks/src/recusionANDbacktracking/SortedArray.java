package recusionANDbacktracking;

import java.util.*;

public class SortedArray {

	public static void main(String[] args) {
		
		//check whether a array is sorted or not using recursion
		
		
		int arr[]= {1,2,3,4,9};
		LinkedList<Integer> list=new LinkedList<>();
		
		for(int i=0;i<5;i++) {
			list.add(arr[i]);
		}
		
		int n=list.size();
		
		boolean sorted=sort(list,n);
		
		System.out.println(sorted);
		

	}

	private static boolean sort(LinkedList<Integer> list, int n) {
		
		  if(n==0 || n==1) {
			  return true;
		  }
		  if(list.get(0)<list.get(1)) {
			  
			  list.remove(0); 
			  if(sort(list,n-1)) {
				  return true;
			  }
			  
		  }
		
		
		
		return false;
	}

}
