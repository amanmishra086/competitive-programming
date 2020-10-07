package recusionANDbacktracking;

public class Power {

	public static void main(String[] args) {
		
		int a=2;
		int n=7;
		
		int p=pow(a,n);
		
      System.out.println(p);
      
      
      System.out.println(fast_power(a,n));
      
	}

	private static int fast_power(int a, int n) {
		
		if(n==0) {
			return 1;
		}
		
		int subans=fast_power(a,n/2);
		subans*=subans;
		
		if(n%2 != 0) {
			
			return subans*a;
		}
		
		return subans;
	}

	private static int pow(int a, int n) {
	
		if(n==0) {
			return 1;
		}
		
		int ans=a*pow(a,n-1);
		
		return ans ;
	}

}
