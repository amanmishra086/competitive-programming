package codechefLongChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Chandf3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=1;//sc.nextInt();
		while(t!=0) {
			
			
		//int x=sc.nextInt();
//			int y=sc.nextInt();
//			int l=sc.nextInt();
//			int r=sc.nextInt();
			int x=5;
			int y=8;
			int l=1;
			int r=40;
			int n=0;
			
			List<Long> arr=new ArrayList<>();
			int z=0;
			n=2*Math.max(x, y);
			for(int i=l;i<=n;i++) {
				z=i;
				
				//arr[s]=(x&z)*(y&z);
				//arr.add((long) (andOperation(x,z) * andOperation(y,z)));
				
				arr.add((long) ((x&z)*(y&z)));
				
				}
			int z1=l+arr.indexOf(Collections.max(arr));
//			System.out.println( "ArrayList Max Value is at index: " 
//			        + arr.indexOf(Collections.max(arr)) );
			System.out.println(z1);
		t--;
		
	}

}
}
