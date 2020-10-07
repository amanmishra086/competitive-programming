package sorting;

import java.util.Set;
import java.util.TreeSet;

public class SortArrayOfString {

	public static void main(String[] args) {

		String[] arr= {"1","2","5","3","0","3"};
		 Set<Integer> set = new TreeSet<Integer>();
	       // Arrays.sort(arr);
	        for(String s:arr){
	            System.out.print(s+" ");
	            set.add(Integer.parseInt(s));
	        }
	        for (int i:set) {
	        	System.out.println(i);
	        }
		
	}

}
