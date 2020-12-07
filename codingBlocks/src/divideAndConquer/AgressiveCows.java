package divideAndConquer;

public class AgressiveCows {

	public static void main(String[] args) {
		
		int stalls[] = {1,2,4,8,9};

		int n=5;
		
		int c=3;
		
		// monotonic search space question;
		
		int s=0;
		int e=stalls[n-1]-stalls[0];
		
		int ans=0;
		while(s<=e) {
			
			int mid=(s+e)/2;
			
			boolean rakhPaaRahe = CanPlace(stalls,n,c,mid);
			
			if(rakhPaaRahe) {
				ans=mid;
				s=mid+1;
			}else {
				e=mid-1;
			}
			
			
		}
		System.out.println(ans);
	
	}

	private static boolean CanPlace(int[] stalls, int n, int c, int min_dist) {
		
		int last_cow=stalls[0];
		
		c--;
		
		for(int i=1;i<n;i++) {
			
			if(stalls[i]-last_cow >= min_dist) {
				
				last_cow=stalls[i];
				c--;
				
				if(c==0) {
					return true;
				}
				
			}
			
		}
		
		
		
		return false;
	}

}
