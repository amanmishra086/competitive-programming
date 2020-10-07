package dynamicProgramming;

public class CoinCombination {

	public static void main(String[] args) {

		//total number of ways
		
		int x=9;
		//int arr[]= {0,7,5,1};
		int arr[]= {0,5,3,2};
		
		int n=arr.length-1;
		
		int dp[][]=new int[n+1][x+1];
		
		for(int i=1;i<=n;i++) {
			
			for(int sum=0;sum<=x;sum++) {
				
				 if(sum==0) {
					 dp[i][sum]=1;
				 }else {
					 
					 int opt1 = (i==1) ? 0 : dp[i-1][sum];
					 int opt2 =  (sum < arr[i]) ? 0 : dp[i][sum-arr[i] ];
					 dp[i][sum]=opt1+opt2;				
					 }
				
			}
			
		}
		
	     System.out.println(dp[n][x]);

	}

}
