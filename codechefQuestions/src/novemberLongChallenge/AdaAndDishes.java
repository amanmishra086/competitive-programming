package novemberLongChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class AdaAndDishes {

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
			
			Arrays.sort(arr);
			int count=0;
			if(n==1) {
				System.out.println(arr[0]);
			}else if(n==2) {
				
				System.out.println(arr[n-1]);
				
			}else if(n==3){
				
				int a=arr[n-1];
				int b=arr[n-2];
				
				if(a==b) {
					
					count+=a;
					count+=arr[0];
					
					
				}else {
					
					count+=Math.min(a, b);
					
					a=a-b;
					b=arr[0];
					
					
					count+=Math.max(a, b);
			
				}
				System.out.println(count);
				
			}
			else {
				int a=arr[n-1];
				int b=arr[n-2];
				
				if(a==b) {
					
					count+=a;
					a=arr[n-3];
					b=arr[n-4];
					
					if(a==b) {
						count+=a;
					}
					
				
				}else {
					
					count+=Math.min(a, b);
					
					a=a-b;
					b=arr[n-3];
					
					
					if(a==b) {
						
						count+=a;
						count+=arr[n-4];
						
						 
						
					}else {
						
						count+=Math.min(a, b);
						
						if(Math.min(a, b)==a) {
							
							b=b-a;
							a=arr[n-4];
							
							if(a==b) {
								
								count+=a;
								
							}else {
								
								count+=Math.max(a, b);
								
							}
						
							
						}else {
							
							a=a-b;
							b=arr[n-4];
							
							if(a==b) {
								
								count+=a;
								
							}else {
								
								count+=Math.max(a, b);
								
							}
							
							
						}
						
					}
					
					
				}
				System.out.println(count);
				
			}
				
			
		}
	}

}
