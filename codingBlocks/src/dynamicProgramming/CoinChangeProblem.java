package dynamicProgramming;

import java.util.Arrays;

public class CoinChangeProblem {
	
	//using minimum number of coins
	
	static int minCoins(int n,int arr[], int dp[]) {
		
		if(n==0)return 0;	
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(n-arr[i] >= 0) {
				int subAns=0;
				if(dp[n-arr[i]]!=-1) {
					subAns=dp[n-arr[i]];
				}else {
					subAns=minCoins(n-arr[i],arr,dp);
				} 
				int result = subAns+1;
				if( subAns!= Integer.MAX_VALUE && result < ans) {
					ans=result;
				}
			}		
		}	
		dp[n]=ans;
		return ans;
	}

	public static void main(String[] args) {

		int n=18;
		int arr[]= {7,5,1};
		
//		int arr[]= {5,3,2};
		
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		
		dp[0]=0;
		
		int ans=minCoins(n,arr,dp);
		System.out.println(Arrays.toString(dp));
		System.out.println(ans);
		
		
		
		
	}

}
