package random;

import java.util.Scanner;

public class ChildChoco {

	public static void main(String[] args) {


		 Scanner sc=new Scanner(System.in);
		 int amount=0;
		 if(sc.hasNext()) {
			 
			 int k=sc.nextInt();
			 int x=sc.nextInt();
			 int n=sc.nextInt();
		 
			 
			 
			 int z=n*(n+1)*k/2;
			 amount=z-x;
			 
			 if(amount>0) {
				 System.out.println(amount);
			 }else {
				 System.out.println(0);
			 }
			 
			 
			 
			 
			 
			 
		 }		 
		 
	}

}
