package dynamicProgramming;

public class DiceCombinations {

	public static void main(String[] args) {

		int n=3;
		
		int dp[]=new int[n+1];
		
		dp[0]=1;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=6;j++) {
				if(j>n) {
					break;
				}
				dp[i] += dp[n-j];			
				
			}
			
		}
		
		System.out.println(dp[n]);
	}

}
