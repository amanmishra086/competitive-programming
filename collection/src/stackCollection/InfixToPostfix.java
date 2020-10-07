package stackCollection;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
	
	static boolean isOperand(char c) {
		return (c>='a' && c<='z') || (c>='A' && c<='Z');
	}
	
	static int precedance(char c) {
		if(c=='+' || c=='-') {
			return 1;
		}
		if(c=='*' || c=='/') {
			return 2;
		}
		if(c=='^') {
			return 3;
		}
		
		return -1;
	}
	

	public static void main(String[] args) {

		 
		 Scanner sc=new Scanner(System.in);
		 
		 Stack<Character> stack=new Stack<>();
		
		 String str=sc.next();
		 char[] arr=str.toCharArray();
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 if(isOperand(arr[i])) {
				 System.out.print(arr[i]);
			 }
			 
			 else if(stack.isEmpty() && precedance(arr[i])>-1) {
				 stack.push(arr[i]);
			 }
			 else if(arr[i]=='(') {
				 stack.push(arr[i]);
			 }else if(arr[i]==')') {
				 while(!stack.isEmpty() && stack.peek()!='(') {
					 System.out.print(stack.pop());	
				 }
				 stack.pop();
			 }
			 else if(!stack.isEmpty() && precedance(arr[i]) > precedance(stack.peek()) ){
					 stack.push(arr[i]);
			 }else if( !stack.isEmpty() && precedance(arr[i]) <= precedance(stack.peek()) ) {
					 while(!stack.isEmpty() && precedance(arr[i]) <= precedance(stack.peek())) {
						 System.out.print(stack.pop());
					 }
					 stack.push(arr[i]);
				 }
			
			 
			 
		 }
		 while(!stack.isEmpty()) {
			 System.out.print(stack.pop());
		 }
		 
		
		
	}

}
