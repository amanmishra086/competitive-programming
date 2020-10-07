package cgcsasqual;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			
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
			for(int i=0;i<n;i++) {
				if(count>0) {
					arr[i]=0;
					count--;
				}else {
					arr[i]=1;
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
			
			t--;
		}
		
		
	}

}
