package JuneLongChallenge;

import java.util.Scanner;

public class Eoeo2 {
	
static int evenno(int ts) {
		
		ts=ts/2;
		if(ts%2==0) {
			ts=evenno(ts);
		}
		
		return ts;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			
			int ts=sc.nextInt();
			int n=0;
			
			if(ts%2==0) {
			
			String strts=Integer.toBinaryString(ts);
			
			for(int i=1;i<strts.length();i++) {
				if(strts.charAt(0)=='1' && strts.charAt(i)=='0') {
					n=1;
				}else {
					ts=evenno(ts);
					n=ts/2;
				}

			}
			
			}
		
		
		t--;
	}

}
}
