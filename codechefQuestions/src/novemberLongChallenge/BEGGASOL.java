package novemberLongChallenge;

import java.util.Scanner;

public class BEGGASOL {

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
			
			
			int sum=0;
			int total=0;
			int count=0;
			
			if( arr[0]==0) {
				System.out.println(0);
				
			}else {
				for(int i=0;i<arr.length;i++) {
					
					
					 if(i==0 && arr[i]>0) {
						
						sum+=arr[i];
						
						
					}else {
						
						sum+=arr[i]-1;
						if(sum<=0) {
							count++;
							break;
						}else {
							count++;
						}
						
					}
					

				}
				
				System.out.println(count+sum);
				
				
			}
			
			
			
			
			
		}
	}

}
