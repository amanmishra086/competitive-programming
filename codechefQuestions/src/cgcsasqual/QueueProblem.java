package cgcsasqual;

import java.util.Scanner;

public class QueueProblem {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=0;
		if(sc.hasNextInt()) {
			n=sc.nextInt();
		}
		int arr[] =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
