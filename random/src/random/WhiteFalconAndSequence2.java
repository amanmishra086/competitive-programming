package random;

import java.util.Arrays;
import java.util.Scanner;

public class WhiteFalconAndSequence2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0 ; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        long maxSum = 0;
        for (int left = 0; left < n; ++left) {
            for (int right = left + 1; right < n; ++right) {
                long s = sum(left, right, a);
                if (s > maxSum)
                    maxSum = s;
            }
        }
        System.out.println(maxSum);
    }
    static long sum(int left, int right, final long[] a) {
        long maxSum = 0;
        long sum = 0;
        while (left >= 0 && right < a.length) {
            sum += a[left] * a[right];
            if (sum > maxSum)
                maxSum = sum;
            left--;
            right++;
        }
        return maxSum;
    }
}
