package stackCollection;

import java.util.Arrays;
import java.util.Stack;

public class BalanceParenthesis {

	public static void main(String[] args) {

		String str="(){}[]";
		String str2="[()]{}";
		String str3="{{])";
		
		Stack<Character> stack=new Stack<>();   
		
		
	for(int i=0;i<str2.length();i++) {
		char c=str2.charAt(i);
		if(c=='(' || c=='{' || c=='[') {
			stack.push(c);
		}else {
			if( c==')' ) {
				if(stack.peek()=='(') {
					stack.pop();
				}else {
					break;
				}
			}
			else if( c=='}' ) {
				if(stack.peek()=='{') {
					stack.pop();
				}else {
					break;
				}
			}
			else if( c==']' ) {
				if(stack.peek()=='[') {
					stack.pop();
				}else {
					break;
				}
			}
		}
		
		
	}
		if(stack.isEmpty()) {
			System.out.println("Balanced");
		}else {
			System.out.println("not balanaced");
		}
		
		
	}

}
