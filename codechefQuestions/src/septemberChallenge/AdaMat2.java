package septemberChallenge;

import java.util.Scanner;

public class AdaMat2 {
	
	private static void transpose(int arr[][],int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			  
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			int arr[][]=new int[n][n];
			int count=0;
			
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<n;j++) {
					
						int p=sc.nextInt();
						
						arr[i][j]=p;
						
				}
				
			}
			
			for(int i=n-1;i>=0;i--) {
				
				if(arr[0][i]!= i+1){
					
					transpose(arr,i);
					count++;
					
				}
				
				
			}
			
		System.out.println(count);
		
		}
	}

}
