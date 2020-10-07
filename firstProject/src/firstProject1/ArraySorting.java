package firstProject1;

import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;

public class ArraySorting {
	static int n;
	static int i;
	int j;
	int t;
	static int a[]=new int[10];
	
	 static Scanner sc=new Scanner(System.in);
	
    
	void decending()
	{
		System.out.println("decending order will be:");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[j]>a[i])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
					
		}
	}
	
	void ascending()
	{
		System.out.println("ascending order will be:");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
					
		}
	}
	void display()
	{
		System.out.println("array is:");
		for(i=0;i<n;i++)
			System.out.println(a[i]);		

	}

	public static void main(String[] args) {
		
		ArraySorting ob=new ArraySorting();
		//Scanner sc=new Scanner(System.in);

		System.out.println("enter the no.of elements of array");
		n=sc.nextInt();

   	System.out.println("enter the elements in array");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();

				
		//ob.enterElements();
		ob.decending();
		ob.display();
		ob.ascending();
		ob.display();
		
		
				
		
		
		
	}

}
