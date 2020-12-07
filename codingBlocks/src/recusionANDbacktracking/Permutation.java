package recusionANDbacktracking;

import java.util.*;
import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char arr[]=new char[100];
		
		String str=sc.next();
		arr=str.toCharArray();
		
		HashSet<String> set=new HashSet<>();
		
		//System.out.println(Arrays.toString(arr));
		permute(arr,0,set);
		
		for(String s:set) {
			System.out.println(s);
		}
	
	}
//	static void swap(char[] array, int i, int j) {
//		  char temp = array[i];
//		  array[i] = array[j];
//		  array[j] = temp;
//		}

	private static void permute(char[] arr, int i,HashSet<String> set) {
		
		if(i>=arr.length) {
		
			set.add(new String(arr));
			
			
			return;
		}
		
		for(int j=i;j<arr.length;j++) {
			
			
			char temp = arr[i];
			  arr[i] = arr[j];
			  arr[j] = temp;
			  
			permute(arr,i+1, set);
			
			char temp1 = arr[i];
			arr[i] = arr[j];
			arr[j] = temp1;
			
			
		}
		
		
		
	}

}
