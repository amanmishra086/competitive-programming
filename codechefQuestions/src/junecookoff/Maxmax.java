package junecookoff;

import java.util.Scanner;

public class Maxmax {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			boolean find=false;
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=i+1) {
					if(i+1==m) {
						find =true;
						break;
					}else {
						find =false;
						break;
					}
				}
			}
			if(find) {
				System.out.println(n);
			}else {
				System.out.println("-1");
			}
			
			
			
			
		}
		t--;
	}

}
