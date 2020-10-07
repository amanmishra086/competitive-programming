package maths;

import java.util.Arrays;
import java.util.Scanner;

public class pigeonHoleDivisibleSubarray {

	public static void main(String[] args) {

		//finding number of subarray divisible by n(size of array);
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		int frequency[]=new int[n];
		
		Arrays.fill(frequency, 0);
		
		int sum=0;
		int f=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();			
			sum+=arr[i];
			f=sum%n;
			f=(sum+n)%n;
			
			frequency[f]++;
			
		}
		long ans=0;
		for(int i=0;i<n;i++) {
			long m=frequency[i];
			ans+=m*(m-1)/2;
		}
		System.out.println(ans);
	}

}
