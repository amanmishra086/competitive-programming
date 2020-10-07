package julyLongChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class PTMSSNG {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			long xc=0;
			long yc=0;
			int n=sc.nextInt();
			sc.nextLine();
			String[] arr=new String[4*n-1];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextLine();
			}
			ArrayList<Long> x=new ArrayList<>();
			ArrayList<Long> y=new ArrayList<>();
			
			for(int i=0;i<arr.length;i++) {
				String[] parts = arr[i].split(" ");
				long part1 = Long.parseLong(parts[0]); 
				x.add(part1);
				long part2 = Long.parseLong(parts[1]); 
				y.add(part2);
			}
		
			 for(int i=0;i<x.size();i++){
			     xc=xc^x.get(i);
			 }
			 for(int i=0;i<y.size();i++){
			     yc=yc^y.get(i);
			 }

			
			 //Set<Long> st = new HashSet<Long>(x); 
			 //Set<Long> st2 = new HashSet<Long>(y); 

		            
		  //    for(Long i:st) {
		  //  	  int f=Collections.frequency(x, i);
		  //  	  if(!(f%2==0)) {
		  //  		 xc=i;
		    		 
		  //  	  }
		    	  
		    	  
		  //    }  
		    	 
		      
		      
		  //    for(Long j:st2) {
		  //  	  int f1=Collections.frequency(y, j);
		  //  	  if(!(f1%2==0)) {
		  //  		  yc=j;
		    		  
		  //  	  }
		  //  	 }
		      
		     System.out.print(xc+" "+yc);
		     
			
			
			
			
			
			
//			
//			for(String str:arrOfStr) {
//				System.out.println(str);
//			}
			
			System.out.println();
			t--;
		}	
		
	}
}

