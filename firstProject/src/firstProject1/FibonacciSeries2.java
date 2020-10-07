package firstProject1;

import java.util.Scanner;

public class FibonacciSeries2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the total number of elements");
		int n=sc.nextInt();
		int a[]=new int[n+5];
		int i;
		a[0]=0;
		a[1]=1;
		for( i=2;i<n;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		if(n==1)
		{
			System.out.println("array is:"+a[i]);
		}
		else {
			for( i=0;i<n;i++)
		      System.out.println("array is:"+a[i]);
		}
		
		
		
				
		
	

	}

}
