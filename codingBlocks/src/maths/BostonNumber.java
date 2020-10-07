package maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BostonNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=0;
		if(sc.hasNextInt())
			n=sc.nextInt();
		
		int ans=0;
		
		int sum=sumOfElement(n);
		
		int fsum=factorSum(n);
		
		if(sum==fsum) {
			ans=1;
		}else {
			ans=0;
		}
		System.out.println(ans);
	}

	private static int factorSum(int n) {
		
		int sum=0;
		
		int arr[]=new int[100000];
		ArrayList<Integer> list=new ArrayList<>();
		
		Arrays.fill(arr, 0);
		arr[0]=arr[1]=1;
		for(int i=2;i<arr.length;i++) {
			if(arr[i]==0) {
				list.add(i);
				for(int j=2*i;j<arr.length;j+=i) {
					arr[j]=1;
				}
			}
		}
//		System.out.println(list);
		
		for(int i=0;i*i<=n;i++) {
			
			int p=list.get(i);
			if((p*p)>n) {
				break;
			}
			
			
			if(n%(list.get(i))==0) {
				while(n%(list.get(i))==0) {
					sum+=(list.get(i));
					n=n/(list.get(i));
				}
			}
			
			
		}
		
		if(n!=1) {
			sum+=n;
		}
		
		
		return sum;
	}

	private static int sumOfElement(int n) {
		
		int sum=0;
		while(n>0) {
			
			sum+=n%10;
			n/=10;
			
			
		}
			
	return sum;
	}

}
