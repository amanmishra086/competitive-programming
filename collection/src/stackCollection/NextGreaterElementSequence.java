package stackCollection;

import java.util.*;

public class NextGreaterElementSequence {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		int arr2[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(arr[n-1]);
		
		for(int i=n-1;i>=0;i--) { 
			
			int element=arr[i];
					
			while( !s.empty()&&element >= s.peek()) {
				
				s.pop();		
			}
			
			if(s.empty()==true) {
				arr2[i]=-1;
			}
			
			
			if( !s.empty()&&element < s.peek()) {
				arr2[i]=s.peek();
				//s.push(element);
			}
			
			s.push(element);
		}
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
