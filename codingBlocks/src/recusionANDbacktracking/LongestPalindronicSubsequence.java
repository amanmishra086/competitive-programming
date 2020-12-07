package recusionANDbacktracking;

import java.util.Scanner;

public class LongestPalindronicSubsequence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		int ans=longestSubsequenceFunction(str,0,str.length());

		System.out.println(ans);
	}

	private static int longestSubsequenceFunction(String str, int i, int n) {
		
		if(i==n-1) {
			return 1;
		}
		else if(i+1 == n-1 && str.charAt(i)==str.charAt(n-1)) {
			return 2;
		}
		
		else if(str.charAt(i)!=str.charAt(n-1)) {
			return Math.max(longestSubsequenceFunction(str, i+1, n), longestSubsequenceFunction(str, i, n-1));
		}
		else {
		return longestSubsequenceFunction(str, i+1, n-1) + 2 ;
	}
		}

}
