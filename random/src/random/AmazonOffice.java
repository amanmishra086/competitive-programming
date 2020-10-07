package random;

import java.util.ArrayList;
import java.util.Scanner;

public class AmazonOffice {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			int n=sc.nextInt();
			int point[]=new int[n];
			
			for(int i=0;i<n;i++) {
				point[i]=sc.nextInt();
			}
			int l=point[n-1];
			
			int cost1=0;
			ArrayList<Integer> list =new ArrayList<>();
			for(int i=0;i<n;i++) {
				int left=point[i]-1;
				int right=l-point[i];
				int cost=(x*left)+(y*right);
				list.add(cost);
				cost1+=cost;
			}
			int avg=cost1/n;
			
			
			System.out.println(cost1);
			System.out.println(list);
			
		}
		
		
	}

}
