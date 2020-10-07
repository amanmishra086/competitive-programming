package MayLunchTime;

import java.util.Scanner;

public class LostWeekends {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			int arr[]=new int[6];
			for(int i=0;i<arr.length;i++) {
				
				arr[i]=sc.nextInt();
				
			}
			int sum=0;
			int p=arr[5];
			for(int i=0;i<5;i++) {
				sum=sum+(p*arr[i]);
			}
			if(sum>120) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}			
					
			t--;
		}
		
		
		
	}

}
