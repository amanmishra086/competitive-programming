package divideAndConquer;

public class MonotonicSearchSpace {

	public static void main(String[] args) {
		
		//finding square root with binary search
		
		int n=2;
		
		//findSquareRoot(n);
		
		int s=0;
		int e=n;
		float ans=0;
		
		while(s<=e) {
			
			int mid=(s+e)/2; 
			
			if(mid*mid==n) {
				ans=mid;
				return;
			
			}
			else if(mid*mid > n) {
				e=mid-1;
			}else {
				ans=mid;
				s=mid+1;
			}
		
		}
		
		// finding more accurate squareroot after the decimal digit as well
		
		
		int decimalpoint=3;
		float inc=0.1f;
		for(int i=1;i<=decimalpoint;i++) {
			
			while(ans*ans <= n) {
				
				ans+=inc;
				
			}
			
			ans-=inc;
			
			inc/=10;
	
		}
		
		
		System.out.println(ans);
	
	}

	

}
