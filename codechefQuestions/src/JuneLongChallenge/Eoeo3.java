package JuneLongChallenge;

import java.util.Scanner;

public class Eoeo3 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			int no=0;
			int no1=0;
			int ts=sc.nextInt();
			
			if(ts%2==0) {
			
			String strts=Integer.toBinaryString(ts);
//			
//			StringBuilder sb=new StringBuilder(strts);  
//		    sb.reverse();  
//		    String strts2=sb.toString(); 
			
			//int no=no+Math.pow(2, strts.charAt(i));
//		    
		    
		    
		    //no= Integer.parseInt(strts2, 2);
		    no1=no/2;
			}
			else {
				no1=ts/2;
			}
		    
			System.out.println(no1);
		
		t--;
	}

}
	
}
