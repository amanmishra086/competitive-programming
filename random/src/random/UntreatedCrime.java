package random;

import java.util.*;

public class UntreatedCrime {

	public static void main(String[] args) {

	   Scanner sc=new Scanner(System.in);	
	   int n=sc.nextInt();
	  
	   
	   int police=0;
	   int crime=0;
	   for(int i=0;i<n;i++) {
		   int p=sc.nextInt();
		   
		  if(p>0) {
			  police+=p;
		  }else if(p<0) {
			  if(police<=0) {
				  crime++;
			  }else {
				  police--;
			  }
		  }
	   }
	   System.out.println(crime);
	
	}

}
