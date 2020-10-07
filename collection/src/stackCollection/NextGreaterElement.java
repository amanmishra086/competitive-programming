package stackCollection;

import java.util.*;

public class NextGreaterElement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		Stack<Integer> s=new Stack<Integer>();
		
		s.push(arr[0]);
		
		for(int i=1;i<n;i++) {
			
			int element=arr[i];
			if(element>s.peek()) {
				while(!s.empty()&&element>s.peek()) {
				int p=s.pop();
				System.out.println(p+"---->"+element);
				
				}
				s.push(element);
			}else {
				s.push(element);
			}
			
		}
		
		while(s.empty()==false) {
			int ele=s.pop();
			System.out.println(ele+"---->"+"-1");
		}
		
		
	}

}
