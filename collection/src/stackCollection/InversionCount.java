package stackCollection;

import java.util.Arrays;
import java.util.Stack;

public class InversionCount {

	public static void main(String[] args) {
		
		int arr[]= {1,5,2,6,3,0};
		int count=0;
		Stack<Integer> s=new Stack<>();
		
		int arr2[]=new int[6];
		
		for(int i=0;i<arr.length;i++) {
			
			if(s.isEmpty() || arr[s.peek()] < arr[i]) {
				s.push(i);
			}
			
			else if(!s.isEmpty() && arr[s.peek()] > arr[i]) {
				
				while(!s.isEmpty() && arr[s.peek()]>arr[i]) {
					
					s.pop();
					arr2[i]++;
					
				}
				if(!s.isEmpty() && arr2[s.peek()]>0) {
					arr2[i]+=arr2[s.peek()];
				}
				
				s.push(i);
				
			}
			
		}
System.out.println(Arrays.toString(arr2));
	}

}
