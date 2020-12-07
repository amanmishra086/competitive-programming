package novemberLongChallenge;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RestoreSequence {
	
	static void primeSieve(List list) {
		int arr[]=new int[10000000];
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
		
		List<Integer> list=new ArrayList<>();
		Collections.fill(list, 0);
		primeSieve(list);  
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			
			
			//System.out.println(list.size());
			
			int res[]=new int[n];
			for(int i=0;i<n;i++) {
				
				res[i] = list.get(i);
				
			}
			
			for(int i=0;i<n;i++) {
	
				if(arr[i]==i+1) {
					continue;
				}else {
					int num=arr[i];
					int num2=res[num-1];
					res[i]=num2;
				}
				
			}
			
			//HashMap<Integer,Integer> map=new HashMap<>();
//			List<Integer> list2 = null;
			
//			for(int i=0;i<n;i++) {
//				
//				 list2=new ArrayList<>();
//				 
//				 list2.add(i);
//				
//				for(int j=i+1;j<n;j++) {
//					
//					if(arr[j]==arr[i]) {
//						
//						list2.add(j);
//						
//					}
//					
//				}
//				
//				for(int k=0;k<list2.size();k++) {
//					
//					int index=list2.get(k);
//					res[index] = res[list2.get(list2.size()-1)];
//					
//					
//				}
//				
//				
//			}
			for(int i=0;i<n;i++) {
				System.out.print(res[i]+" ");
			}
			System.out.println();
	
		
		}
		

	}

	

}
