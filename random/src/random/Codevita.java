package random;

import java.util.ArrayList;
import java.util.*;

public class Codevita {

	public static void main(String[] args) {
		
		int arr[]= {2,3,5,7,11,13,17,19,23,29,31,37};
		Set<Integer> list=new TreeSet<>();
		
		for(int i=0;i<arr.length-1 ;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				int a=Integer.parseInt(String.valueOf(arr[i])+String.valueOf(arr[j]));
				int b=Integer.parseInt(String.valueOf(arr[j])+String.valueOf(arr[i]));
				boolean primea=findprime(a);
				if(primea) {
					list.add(a);
				}
				boolean primeb=findprime(b);
				if(primeb) {
					list.add(b);
				}
			}
			
			
		}
		
		int min=0;
		int max=0;
		
		
		
		
		System.out.println(list);
		
		System.out.println(list.size());

	}

	private static boolean findprime(int n) {
		
		for(int i=2;i*i<=n;i++) {
			
			if(n%i==0) {
				return false;
			}
			
		}
		
		
		
		return true;
	}

}
