package numberTheory;

import java.util.*;

public class PrimeGenerator {
	
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
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==0) {
//				
//			}
//		}
		
	}

	public static void main(String[] args) {

		// segmented prime sieve;
		//important to use when constraints are larger;
      List<Integer> list=new ArrayList<>();
		Collections.fill(list, 0);
		primeSieve(list);  //build this sieve once for all query
		
		Scanner sc=new Scanner(System.in);
		long m=sc.nextLong();
		long n=sc.nextLong();
		
		int d=(int)Math.abs(m-n)+1;
		
		long[] input=new long[d];
		boolean[] b=new boolean[d];
		long f=Math.min(n, m);
		for(int i=0;i<d;i++) {
			input[i]= f;
			f++;
		}
		
		for(int i=0;i<list.size();i++) {
			int p=list.get(i);
			for(int j=0;j<input.length;j++) {
				if(input[j]%p==0) {
					b[j]=true;
				}
			}	
		}
		int ans=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]==true) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
