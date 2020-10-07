package augustLunchtime;

import java.util.Scanner;

public class ArrGame {

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
			int count=0;
			for(int i=0;i<n;i++) {
				if(arr[i]==0) {
					count++;
				}
			}
			if(count%2==0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
			
			
		}
		
		
	}

}
