package numberTheory;

import java.util.*;

public class PrimeFactorization {
	
	static void primeSieve(List list) {
		int arr[]=new int[100000];
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
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		Collections.fill(l, 0);
		primeSieve(l);  //build this sieve once for all query
		
		
		
		//both are correct
		// using prime sieve
		int i=0;
		int p=l.get(0);
		List<Integer> list=new ArrayList<>();
		while(p*p<=n) {
			if(n%p==0) {
				while(n%p==0) {
					list.add(p);
					n=n/p;
				}
			}
		}	
		if(n!=1) {
			list.add(n);
		}
		System.out.println(list);
		
		
		
		// using simple optimised way.
		
//		List<Integer> list=new ArrayList<>();
//		for( i=2;i*i<=n;i++) {
//			if(n%i==0) {
//				
//				while(n%i==0) {
//					list.add(i);
//					n=n/i;
//				}
//			}
//		}
//		if(n!=1) {
//			list.add(n);
//		}
//		System.out.println(list);
		
	}

}
