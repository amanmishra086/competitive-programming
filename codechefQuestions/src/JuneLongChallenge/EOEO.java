package JuneLongChallenge;

import java.util.Scanner;

public class EOEO {
 
	
	static long evenno(long ts) {
		
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
			
			long ts=sc.nextInt();
			long n=0;
			
			long num=0;
              if(ts%2==0) {
			    
            	  long a = ts & (ts-1);
			   if(a==0){
			   num =1;
//			   System.out.println(num);
			} else{
			    
			 num=evenno(ts);
//			 System.out.println(num);
			}
			}else {
				num=ts;
//				System.out.println(num);
			}

			 n=num/2;
			

			System.out.println(n);		
		
		t--;
	}

 }
}