package augustChallenge;

import java.util.*;

public class LinChess {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			long k=sc.nextLong();
			
			long arr[]=new long[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextLong();
			}
			long turn=0;
			long ans=1000000000;
			long index=0;
			for(int i=0;i<n;i++) {
				
				if(k % arr[i]==0) {
					
					turn=(k/arr[i])-1;
					
					if(turn<ans) {
						ans=turn;
						index=arr[i];
					}
					
				}		
			}
			if(ans==1000000000) {
				index=-1;
			}
			
			System.out.println(index);
		}
		
		
		
	}

}
