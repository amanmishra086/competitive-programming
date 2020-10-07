package firstProject1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
       //int i;
						
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the total number of elements");
		int n=sc.nextInt();
		int a[]=new int[n+5];
		int b[]=new int[n+5];
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
		
		
		for( i=0;i<n;i++) {
			if(a[i]>9)
			{
				a[i]=a[i]%10;
			}
		System.out.println("new array is:"+a[i]);
		}
		   int p=n;
		   while(b.length!=2)
		   {
			for( i=0;i<p;i++)
			{
			int x=0;
				if(i%2==0)
				{
					
					b[x]=a[i];
				}
				for( int y=0;y<p;y++)
				{
					System.out.println(b[y]);
				}
				x++;
				p=p/2;
				
			}
			
		   }
			
		
			System.out.println(b[1]);
		}}}				
	