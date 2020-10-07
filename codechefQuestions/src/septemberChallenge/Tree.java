package septemberChallenge;

import java.util.*;

public class Tree {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			Set<Integer> set=new HashSet<>();
			for(int i=0;i<n;i++) {
				if(arr[i]!=0)
					set.add(arr[i]);
			}
			
			System.out.println(set.size());
			
			
			
			
		}
	}

}
