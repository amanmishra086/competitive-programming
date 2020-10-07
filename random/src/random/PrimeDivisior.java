package random;

import java.util.Scanner;

public class PrimeDivisior {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
		  t=sc.nextInt();
	     int arr[]={2,3,5,7,11,13,17,19};
	
		while(t-->0){
		    long n=sc.nextLong();
		    int count=0;
		    for(int i=0;i<arr.length;i++){
		        count+=n/arr[i];
		    }
		    
		    
		  //  long count=0;
		  //  for(int j=0;j<arr.length;j++){
		  //      int p=arr[j];
		  //      for(long i=1;i<=n;i++){
		  //           if(i%p==0){
		  //               count++;
		  //           }
		  //       }
		  //  }
		    System.out.println(count);
		}
	}

}
