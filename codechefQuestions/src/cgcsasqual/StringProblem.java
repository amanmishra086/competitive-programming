package cgcsasqual;

import java.util.*;

public class StringProblem {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		LinkedList<Character> list=new LinkedList<>();
		
		for(int i=0;i<str.length();i++) {
			
			list.add(str.charAt(i));
			
		}
		
		for(int i=0;i<list.size()-1;i++) {
			char c=list.get(i);
			if(list.get(i+1)==c) {
				list.remove(i+1);
				i--;
			}
		}
		String a="";
		for(int i=0;i<list.size();i++) {
			a=a+list.get(i);
		}
		System.out.println(a);
	}

}
