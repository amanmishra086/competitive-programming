package stackCollection;

import java.util.*;

class StackClass{
	
	Queue<Integer> q=new LinkedList<>();
	int size;
	
	StackClass(){
		
	}
	
	void push(int n) {
		
		
		q.add(n);
		size=q.size();
		for(int i=0;i<size-1;i++) {
			int a=q.poll();
			q.add(a);
		}
		
	}
	int pop() {
		
		if(size==0) {
			return -1;
		}
		
		size--;

		return q.poll();
		
	}
	
	int top() {
	  if(size==0) {
		  return -1;
	  }
		
	    return q.peek();
	}
	
	int size() {
		return size;
	}
	
	
}

public class StackUsingQueue {
	

	public static void main(String[] args) {
		
		
		StackClass s = new StackClass(); 
		
		
		
        s.push(1); 
        s.push(2); 
        s.push(3); 
        s.push(4); 
        s.push(5); 
        s.push(6); 
        
        
        System.out.println("current size: " + s.size()); 
        System.out.println(s.top()); 
        s.pop(); 
        System.out.println(s.top()); 
        s.pop(); 
        System.out.println(s.top()); 
  
        System.out.println("current size: " + s.size()); 
		
       
	}
	
	

}
