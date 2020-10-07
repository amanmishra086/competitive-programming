package recusionANDbacktracking;

import java.util.LinkedList;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5,7,8,9,5,7,8,7};
      LinkedList<Integer> list=new LinkedList<>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		
		int n=list.size();    
		
		int element=7;
		
		
		
		//System.out.println(search(list,n,element));
		
		//System.out.println(lastOccur(list,n,element));
		
		allOccur(list,0,n,element);
		

	}

	private static void allOccur(LinkedList<Integer> list, int i, int n, int element) {
		
		if(i==n) {
			return;
		}
		
		if(list.get(i)==element) {
			System.out.println(i);
		}
		
		allOccur(list,i+1,n,element);
		
		
	}

	private static int lastOccur(LinkedList<Integer> list, int n, int element) {
		int ans=-1;
		
		if(list.size()==0)
			return -1;
		
		if(list.get(list.size()-1)==element)
			return list.size();
		
		list.remove(list.size()-1);
		
		ans=lastOccur(list,n,element);
		
		
		
		return ans;
	}

	private static int search(LinkedList<Integer> list, int n,int element) {
		
		if(list.size()==0) {
			return -1;
		}
		if(list.get(0)==element) {
			return n-list.size();
		}
		
		list.remove(0);
		int ans=-1;
		 ans=search(list,n,element);
		
		return ans;
	}

}
