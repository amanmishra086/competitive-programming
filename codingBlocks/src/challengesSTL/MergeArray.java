package challengesSTL;

import java.util.*;

public class MergeArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<2*n;i++) {
			int a=sc.nextInt();
			list.add(a);
		}
		Collections.sort(list);
		
		
		int m=list.size()+1;
		m=m/2;
		System.out.println(list.get(m-1));
		
	}

}
