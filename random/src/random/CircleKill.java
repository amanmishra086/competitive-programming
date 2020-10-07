package random;

import java.util.*;

public class CircleKill {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		LinkedList<Integer> list=new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			list.add(i+1);
		}
		//System.out.println(list.size());
		
		int j=k;
		int z;
		while(list.size()!=1) {
			z=j%n;
			list.remove(z);
			j=j+k;
		}
		
//		for(int i=k;i<20;i=i+k) {
//			list.remove(i%n);
//			i=i%n;
//		}
		
//		boolean arr[]=new boolean[n];
//		
//		for(int i=k;i<20;i=i+k) {
//			
//			arr[k]=true;
//			
//			i=i%n;
//		}
		for(int i=0;i<n;i++) {
			System.out.println(list);
		}
		
		
		
		
		
		
	}

}
