package divideAndConquer;

import java.util.Scanner;

public class WinningScholorship {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		// monotonic search on number of students i.e n;
		
		int s=0;
		int e=n;
		
		int ans=0;
		
		while(s<=e) {
			
			int mid=(s+e)/2;
			
			boolean scholorshipMilPayega = checkScholorship(n,m,x,y,mid);
			
			if(scholorshipMilPayega) {
				ans=mid;
				s=mid+1;
				
			}else {
				e=mid-1;
			}
			
		}
		System.out.println(ans);

	}

	private static boolean checkScholorship(int students, int totalcoupon, int goodcoupon, int badcoupon, int checkStu) {
		
		int badstu  =  students-checkStu;
		
		int total=totalcoupon +  (badstu * badcoupon);
		
		if((checkStu * goodcoupon) <= total ) {
			return true;
		}
	
		return false;
	}

}
