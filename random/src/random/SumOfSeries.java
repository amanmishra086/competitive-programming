package random;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int ans=0;
       
		for(int i=1;i<=n;i++) {
			
			 int a=1;
			int sum=0;
			int j=i;
			while(j>0) {
				sum+=n*a;
				a=a*10;
				j--;
			}
			
		ans+=sum;
		}
		System.out.println(ans);
		
		
	}

}
