package codechefLongChallenge;

import java.util.Scanner;

public class CovidQuestion {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0) {
			
			   int n=sc.nextInt();
			   int arr[]=new int[n];
			   for(int i=0;i<n;i++) {
				   
				   arr[i]=sc.nextInt();
				   
			   }			   
			   
			   int count=1;
				int worstArr[]=new int[10];
				for(int i=0;i<n-1;i++) {
					
					if(( arr [i+1] - arr [i] ) > 2) {
						worstArr[i]=count;
					    count=1;
						continue;
					}else {
						count++;
					}
					
				}
				
				int small=count;
				int big=count;
				
				for(int i=0;i<worstArr.length;i++) {
					
					if(worstArr[i]>big) {
						big=worstArr[i];
					}
					if(worstArr[i]<small && worstArr[i]!=0) {
						small=worstArr[i];
					}
					
				}
				
				System.out.print(small+" "+big);
				
				System.out.println();
						
			
			t--;
		}
		
	}

}
