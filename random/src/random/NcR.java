package random;

import java.util.Arrays;

public class NcR {
	
	static long fact(int n,long z){
		if(n==0) {
			return 0;
		}
        long f=1;
        for(int i=1;i<=n;i++){
            f*=(int)i;
        }
       
    // System.out.println(f);
     return f;
    }
	
	static int[] solve2(int n) {
     int arr[]=new int[n+1];
        
        int p=n/2;
        arr[0]=1;
        arr[1]=n;
		
        for(int i=2;i<=p;i++) {
        	long num;
        	long deno;
        	
        	num=fact(n,0);
        	deno=fact(i,0)*fact(n-i,0);
        	
        	arr[i]=(int) (num/deno);
        	
        	
        }
        int m=0;
        for(int k=n+1-1;k>p;k--){
            arr[k]=arr[m];
            m++;
        }
		
		
		return arr;
		
	}

    // Complete the solve function below.
    static int[] solve(int n) {
         long z=1000000000;
         int arr[]=new int[n+1];
        
        int p=n/2;
        arr[0]=1;
        arr[1]=n;
           for(int i=2;i<=p;i++){
                long num=1;
                long denom=0;
               for(int j=0;j<i;j++){
                   num=((num)*((n-j)));
               }
               denom=fact(i,z);
            long g=((num/denom));
            arr[i]=(int) (g%z);
           }
            int m=0;
            for(int k=n+1-1;k>p;k--){
                arr[k]=arr[m];
                m++;
            }
        
        return arr;

    }
	public static void main(String[] args) {

		int t=1;
		while(t-->0) {
			int n=59;
			
			int arr[]=solve2(n);
			
			System.out.println(Arrays.toString(arr));
			
		}
		
		
		
	}

}
