package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapQuestion {
	
	 public static long andOperation(long a, long b) {
			int arr[]=new int[8];
			int brr[]=new int[8];
			int crr[]=new int[8];
			long num=0;
			for(int i=0;i<8;i++) {
				arr[i]=(int) (a%2);
				a=a/2;
			}
			for(int i=0;i<8;i++) {
				brr[i]=(int) (b%2);
				b=b/2;
			}
			for(int i=7;i>=0;i--) {
				if(arr[i]==1 && brr[i]==1) {
					crr[i]=1;
				}
				else {
					crr[i]=0;
				}
			}
			int j=0;
			for(int i=7;i>=0;i--) {
				num= (long) (num+crr[i]*Math.pow(2, j));
				j++;
			}
			
			
			return num;
		}

	public static void main(String[] args) {
		


		Scanner sc=new Scanner(System.in);
		int t=1;//sc.nextInt();
		while(t!=0) {
			
			
		//int x=sc.nextInt();
//			int y=sc.nextInt();
//			int l=sc.nextInt();
//			int r=sc.nextInt();
			int x=7;
			int y=12;
			int l=0;
			int r=40;
			
			HashMap<Long,Long> list=new HashMap<>();
			long z=0;
			long key=0;
			for(int i=l;i<=r;i++) {
				z=i;
				//key=(x&z)*(y&z);
				key=(andOperation(x,z) * andOperation(y,z));
				list.putIfAbsent(key, z);
				
			}
			
			
			long z1=list.get(Collections.max(list.keySet()));
			System.out.println(list);
			System.out.println(z1);
			
			
			
			t--;
//			List<Integer> arr=new ArrayList<>();
//			int z=0;
//			
//			for(int i=l;i<=r;i++) {
//				z=i;
//				
//				//arr[s]=(x&z)*(y&z);
//				arr.add((x&z)*(y&z)); }
//			int z1=l+arr.indexOf(Collections.max(arr));
////			System.out.println( "ArrayList Max Value is at index: " 
////			        + arr.indexOf(Collections.max(arr)) );
//			System.out.println(z1);
		
		
	}

	}
}
