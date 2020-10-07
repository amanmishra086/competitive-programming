package random;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int a1[]=new int[n1];
			int a2[]=new int[n2];
			for(int i=0;i<n1;i++) {
				a1[i]=sc.nextInt();
			}
			for(int i=0;i<n2;i++) {
				a2[i]=sc.nextInt();
			}
			
			int arr[]=new int[n1+n2];
			
			int i=0,j=0,k=0;
			
			while(i<n1 && j<n2) {
				
				if(a1[i]>a2[j]) {
					
					arr[k]=a2[j];
					j++;
					k++;
					
				}
				else {
					arr[k]=a1[i];
					i++;
					k++;
				}
				
				
			}
			while(i<n1) {
				arr[k]=a1[i];
				k++;
				i++;
			}
			while(j<n2) {
				arr[k]=a2[j];
				k++;
				j++;
			}
			System.out.println(Arrays.toString(arr));
			
		}
		
		
	}

}
