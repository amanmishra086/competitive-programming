package cgcsasqual;

import java.util.*;

public class StackProblem {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String str="";
		if(sc.hasNext()) {
			str=sc.nextLine();
		}
		boolean reult=true;
		LinkedList<Character> list=new LinkedList<>();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' ) {
				list.add(str.charAt(i));
			}else if(str.charAt(i)==')'  ) {
				if(str.charAt(i-1)=='(') {
					if(list.size()>0) {
					list.remove(i-1);
					i--;
					}
				}
			}else if(str.charAt(i)=='}'  ) {
				if(str.charAt(i-1)=='{') {
					if(list.size()>0) {
						list.remove(i-1);
						i--;
						}
				}
			}else if(str.charAt(i)==']'  ) {
				if(str.charAt(i-1)=='[') {
					if(list.size()>0) {
						list.remove(i-1);
						i--;
						}
				}
			}
		}
		
		System.out.println(list);
		
	}

}
