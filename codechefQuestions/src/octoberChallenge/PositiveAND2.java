package octoberChallenge;

import java.util.Scanner;

public class PositiveAND2 {

	public static void main(String[] args) {
		

		int arr2[]=new int[100001];
		arr2[1]= 1;
		arr2[2]= 3;
		arr2[3]= 5;
		arr2[4]= 4;
		arr2[5]= 6;
		arr2[6]= 2;
		arr2[7]= 7;
		
		for(int i=8;i<arr2.length;i++) {
			if(Integer.bitCount(i)==1) {
				arr2[i+1]=i;
				arr2[i]=i+1;
				i=i+1;
			}else {
				arr2[i]=i;
			}
		}
		
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) { 
			 
			int n=sc.nextInt();
			int arr[]=new int[n+1];
			if(Integer.bitCount(n)==1) {
				System.out.println("-1");
				continue;
			}
			if(n==1) {
				arr[1]=1;
				
			}else if(n==3) {
				arr[1]=1;
				arr[2]=3;
				arr[3]=2;
			}else if(n==5) {
				arr[1]= 2;
				arr[2]= 3;
				arr[3]= 1;
				arr[4]= 5;
				arr[5]= 4;
			}
//			else if(n==6) {
//				arr[1]= 1;
//				arr[2]= 3;
//				arr[3]= 5;
//				arr[4]= 4;
//				arr[5]= 6;
//				arr[6]= 2;
//			}else if(n==7) {
//				arr[1]= 1;
//				arr[2]= 3;
//				arr[3]= 5;
//				arr[4]= 4;
//				arr[5]= 6;
//				arr[6]= 2;
//				arr[7]= 7;
//			}
			
			else if(n>=6){
				for(int i=1;i<arr.length;i++) {
					arr[i]=arr2[i];
				}
			}
			for(int i=1;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

}
