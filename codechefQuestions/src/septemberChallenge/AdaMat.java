package septemberChallenge;

import java.util.*;

public class AdaMat {
	
	private static void transpose(int arr[][],int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			  
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				
			}
		}
		
		
	}

	private static int isSorted(int[][] arr,int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
					if(arr[i][j]!=(i*n)+j+1) {
						return 0;
					}
					
			}
			
		}
		
		
		return 1;
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
			
			if(isSorted(arr,n)==0) {
				
//				transpose(arr,n);
//				System.out.println("hello");
//				count++;
				
				for(int i=0;i<n;i++) {
					
					for(int j=0;j<n;j++) {
						
						if((arr[i][j]!=(i*n)+j+1) && (j+1<n) && (arr[i][j+1]==(i*n)+j+2 )) {
							//System.out.println("world");
							transpose(arr,j+1);
							count++;
							
						}else if((arr[i][j]!=(i*n)+j+1) && (j==n-1) && (arr[i][j+1]!=(i*n)+j+2 )) {
							
							transpose(arr,n);
						//	System.out.println("hello");
							count++;
						}
							
					}
					
				}
				
				
				
			}
			
			
			System.out.println(count);
			
			
//			for(int i=0;i<n;i++) {
//				
//				for(int j=0;j<n;j++) {
//						
//						System.out.print(arr[i][j]+" ");
//						
//				}
//				System.out.println();
//			}

			
			
			
		}
;		
		
		
	}


	

}
