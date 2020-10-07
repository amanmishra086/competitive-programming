package stackCollection;

import java.util.Scanner;
import java.util.Stack;

public class LongestParenthesisSubstring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			String str=sc.next();
//			String str4=")()()())()()(";
//			String str5="((()() ()(()";
			
			Stack<Integer> stack=new Stack<>();   
			int max=0;
			int count=0;
			stack.push(-1);
			
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='(' ) {
				stack.push(i);
			}else {
				stack.pop();
				if(!stack.isEmpty()) {
					
					
					count = i-stack.peek();
					max=maximum(max,count);
					
					
					
					
				}else {
					stack.push(i);
				}
				
				
			
			
		}
				
		
		
		}
		//System.out.println(count);
		System.out.println(max);
		}

	}

	private static int maximum(int max, int count) {
		
		if(max>=count) {
			return max;
		}
		return count;
	}

}
