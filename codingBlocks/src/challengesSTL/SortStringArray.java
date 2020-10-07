package challengesSTL;


import java.util.Arrays; 
import java.util.Comparator;
import java.util.Scanner;


public class SortStringArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		
		for(int i=0;i<n;i++) { 
			arr[i]=sc.nextLine();
		}
		
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() > o2.length() && o1.substring(0,o2.length()).equals(o2)) {
					return -1;
					
				}else if(o2.length() > o1.length() && o2.substring(0, o1.length()).equals(o1)){
					return 1;
				}
				else {
					return o1.compareTo(o2);
				}
				
//				if(o1.contains(o2) && o1.length()>o2.length()) {
//					return -1;
//				}else {
//					return o1.compareTo(o2);
//				}
				
			}
			
		});
		
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	

	

}
