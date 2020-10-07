package stackCollection;

import java.util.Stack;

public class FirstClass {

	public static void main(String[] args) {

		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<5;i++) {
			stack.push(i+1);
		}
		System.out.println(stack);
		System.out.println(stack.search(4));
		stack.add(100);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}

}
