package codechefLongChallenge;

import java.util.Scanner;
import java.util.*;

public class Chandf2 {
	
	public static double andOperation(int a, int b) {
		int arr[]=new int[8];
		int brr[]=new int[8];
		int crr[]=new int[8];
		double num=0;
		for(int i=0;i<8;i++) {
			arr[i]=a%2;
			a=a/2;
		}
		for(int i=0;i<8;i++) {
			brr[i]=b%2;
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
			num=num+crr[i]*Math.pow(2, j);
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
			int r=25;
			
			System.out.println(x|y);
			
			List<Long> arr=new ArrayList<>();
			int z=0;int n=0;
			n=2*Math.max(x, y);
			int g=x+y;
			System.out.println(g);
			for(int i=g;i<=n;i++) {
				z=i;
				
				//arr[s]=(x&z)*(y&z);
				//arr.add((long) (andOperation(x,z) * andOperation(y,z)));
				
				arr.add((long) ((x&z)*(y&z)));
				if((x&z)*(y&z)==x*y) {
					break;
				}
				}
			System.out.println(z);
			int z1=l+z;
//			System.out.println( "ArrayList Max Value is at index: " 
//			        + arr.indexOf(Collections.max(arr)) );
			System.out.println(z1);
			//int arr[]=new int[r-l+1];
			
			//int s=0;
			//int max = arr[0];
			// int q=0;
			//for(int i=l;i<=r;i++) {
				//z=i;
				
				//arr[s]=(x&z)*(y&z);
				//arr.add((x&z)*(y&z));
				
				
//					if(max < arr[s])
//					{
//		                max = arr[s];
//		                q=s;
//		            }
//					if(arr[s]==x*y) {
//						break;
//					}
//				
				//s++;
			//}
			
			//int z1=l+arr.indexOf(Collections.max(arr));
//			System.out.println( "ArrayList Max Value is at index: " 
//			        + arr.indexOf(Collections.max(arr)) );
			//System.out.println(z1);
			
			Iterator i = arr.iterator();
		      System.out.println("The ArrayList elements are:");
		      while (i.hasNext()) {
		         System.out.print(i.next()+" ");
		      }
			
			
//			z=l+q;
//			System.out.println(z);
//			for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i]+" ");
//			}
			System.out.println();
			for(int j=g;j<=n;j++) {
				System.out.print((x & j)+" ");
			}
			System.out.println();
			for(int j=g;j<=n;j++) {
				System.out.print((y & j)+" ");
			}
			
//			System.out.println();
			
//			 int max = arr[0];
//			 int q=0;
//		        for(int i = 0; i < r-l; i++)
//		        {
//		            if(max < arr[i])
//	            {
//		                max = arr[i];
//		                q=i;
//		            }
//		        }
//		        
//			z=l+q;
//			System.out.println(z);
//			
			
			
			
			
			
			
			t--;
		}
		
		
	}

}
