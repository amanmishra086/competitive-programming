package JuneLongChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Evenm {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int t=0;
		
		if(sc.hasNextInt()) {
			
			t=sc.nextInt();
			
		}
		while(t!=0) {
			int a=1;
			int num=1;
			double n=sc.nextDouble();
			//double m[][]=new double[n][n];
			
			//int even[]=new int[(int) Math.floor(n/2)];
			
			ArrayList<Integer> even=new ArrayList<Integer>((int) Math.floor(n/2));
			
			//int odd[]=new int[(int) Math.ceil(n/2)];
			
			ArrayList<Integer> odd=new ArrayList<Integer>((int) Math.ceil(n/2));
			
			for(int i=1;i<=n*n;i++) {
				if(i%2==0) {
					even.add(i);
				}else {
					odd.add(i);
				}
			}
			System.out.println(even);
			System.out.println(odd);
			int number=1;
			
			for(int i=1;i<=n;i++) {
				
				
				
				if(i%2 != 0) {
					for(int j=1;j<=n;j++) {
						
						System.out.print(number);
						number++;
						
					}
				}else {
					
					//number=i*n;
					
				}
				
				System.out.println();
				
			}
			
			
			
			
		
		t--;
	}

  }
}
