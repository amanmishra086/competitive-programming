package divideAndConquer;

public class Paratha {

	public static void main(String[] args) {
		

	
		
		int p=10;
		int c=4;
		
		int [] rank= {1,2,3,4};
		
		// we have to find the minimum time to get the order done for 10 paratha.
		
		// we will use montonic binary search for time with min time 0 and max time would be the time taken by rank 1 to make 
		// 10 paratha.
		
		int s=0;
		int e=0;
		int ans=0;
		for(int i=1;i<=p;i++) {
			e+=i*rank[0];
		}
		
		while(s<=e) {
			int mid=(s+e)/2;
			
			boolean banegaKiNhi= itnaTimeMeBanPayega(p,c,rank,mid);
//			System.out.println(mid);
//			System.out.println(banegaKiNhi);
			
			if(banegaKiNhi) {
				ans=mid;
				e=mid-1;
			}else {
				s=mid+1;
			}
		}
		System.out.println(ans);	
		
	}

	private static boolean itnaTimeMeBanPayega(int p, int c, int[] rank, int time) {
		
		int ans=0;
		
		for(int i=0;i<rank.length;i++) {
			
			int t=0;
			int t2=0;
			
			while(t2 <= time) {
				
				t+=rank[i];
				t2+=t;
				ans++;
				
				if(ans>=p) {
					
					return true;
				}
				
			}
			
			
		}
		
		return false;
	}

}
