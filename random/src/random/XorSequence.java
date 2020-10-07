package random;

import java.util.Arrays;

public class XorSequence {

	public static void main(String[] args) {

		int n=35;
		int arr[]=new int[n];
		int cum[]=new int[n+1];
		arr[0]=0;
		for(int i=1;i<n;i++) {
			arr[i]=arr[i-1]^i;
		}
		for(int i=0;i<n;i++) {
			System.out.println(i+"-"+arr[i]+"-"+Integer.toBinaryString(arr[i]));
		}
		cum[0]=0;
		for(int i=1;i<n;i++) {
			cum[i]=cum[i-1]^arr[i-1];
		}
		System.out.println("---------------------------------------");
		for(int i=1;i<n;i++) {
			System.out.println(i-1+"-"+cum[i]+"-"+Integer.toBinaryString(cum[i]));
		}
		
//		long  uptonxor( long n)
//		{
//		    int a=n%8;
//		    if(a==0 || a==1)
//		        return n;
//		    else if(a==2 || a==3)
//		        return 2;
//		    else if(a==4 || a==5)
//		        return n+2;
//		    return 0;
//		}
//		
	}

}
