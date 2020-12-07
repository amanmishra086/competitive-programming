package random;

import java.util.Scanner;

public class WhiteFalconAndSequence {

	public static void main(String[] args) {
		
		
		// 30 marks
		
		long N = 1000000000000l;

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		long dp[] = new long[n];
		long max = 0;

		for (int i = n - 1; i >= 0; i--) {

			for (int j = n - 1; j >= i; j--) {

				if (i == j)
					dp[j] = 0l;
				else if (j == i + 1)
					dp[j] = 1l * arr[i] * arr[i+1];
				else
					dp[j] = dp[j - 1] + 1l * arr[i] * arr[j];
				max = (max < dp[j]) ? dp[j] : max;
			}

		}

		System.out.println(max);

	}

}
