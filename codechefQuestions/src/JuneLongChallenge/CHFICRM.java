package JuneLongChallenge;

import java.util.Scanner;

public class CHFICRM {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {

			int i=0;
			
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    int p5=0;int p10=0;int p15=0;
		    
		    for( i=0;i<arr.length;i++) {
		    	arr[i]=sc.nextInt();
		    }
		    
		    for( i=0;i<arr.length;i++) {
		    	
		        
		    	 if(arr[i]==5) {
		    		 p5++;
		    		 continue;
		    	 }
		    	 else if(arr[i]==10) {
		    		 p10++;
		    		 if(p5>0) {
		    			 p5--;
		    			 continue;
		    		 }else {
			    		 break;
			    	 }
		    	 }
		    	 else if(arr[i]==15) {
		    		 p15++;
		    		 if(p10>0) {
		    			 p10--;
		    			 continue;}
		    	     else if(p5>=2){
		    	    	 p5=p5-2;
		    	    	 continue;
		    	     }
		    		 }else {
			    		 break;
		    		 }  	
		    	
		    }
		    if(i==arr.length) {
		    	System.out.println("YES");
		    }else {
		    	System.out.println("NO");
		    }
		    
		    
			
			
			
		
		
			t--;
	}

}
}
