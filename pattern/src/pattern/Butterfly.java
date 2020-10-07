package pattern;

import java.util.*;

public class Butterfly {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	if(n==0) {
		System.out.println("0");
	}
		
		for(int i=0;i<n;i++ ) {
			
			
			
			for(int j=0;j<n;j++) {
				
				if(i==j) {
					System.out.print(n+" ");
				}
				else if(i+j==n-1 && i!=j) {
					System.out.print((n+4)+" ");
				}
				//left side
				
				else if(j<=n/2) {
					
					//space condition
					
					if(j>i || j>n-1-i) {
						System.out.print("  ");
					}else {
						System.out.print(((2*i)+j)+" ");
					}
					
				}
				else if(j>n/2) {
					if(j<n-i-1 || j< i) {
						System.out.print("  ");
					}else {
						System.out.print((i*j)+" ");
					}
				}
				
				
			
				
				
				
				
				
				
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
