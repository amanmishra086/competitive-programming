package recusionANDbacktracking;

import java.util.Scanner;

import com.sun.jdi.connect.spi.TransportService.Capabilities;

public class ZeroOneKnapsack {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		
//		int t=sc.nextInt();
//		while(t-->0) {
//			int s=sc.nextInt();
//			int n=sc.nextInt();
//			
//			int weight[]=new int[n];
//			int price[]=new int[n];
//			
//			for(int i=0;i<n;i++) {
//				int p=sc.nextInt();
//				int q=sc.nextInt();
//				weight[i]=p;
//				price[i]=q;
//			}
			//System.out.println(maxprice(s,weight,price,0,0));
		//}
		
		int capacity=6;
		int weight[]= {1,2,3,5};
		int price[]= {40,20,35,100};
		
	System.out.println(maxprice(capacity,weight,price,0,0));
		

	}

	static int maxprice(int cap,int[] w, int[] p,int index,int max) {
		
		if( index>=w.length) {
			return max;
		}
		
		if(cap == 0 || cap < w[index] ) {
			
			return max;
			
		}
		
		
		
		int a=maxprice(cap-w[index],w,p,index+1,max+p[index]);
		
	    int b=maxprice(cap,w,p,index+1,max);
		
	    if(a>b) {
	    	return a;
	    }
	    return b;
	    
	}
}
