package random;

import java.util.*;

public class StringCombination {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		String[] arr=input.split(" ");
		
		List<String> list=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				String str="";
				str=arr[i]+arr[j];
				list.add(str);
			}
		}
		System.out.println(list);
		
		
	}

}
