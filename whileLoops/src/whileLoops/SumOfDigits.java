package whileLoops;

import java.util.LinkedList;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	LinkedList<Integer> list=new LinkedList<>();
	list.add(0);
	list.add(1);
	list.add(2);
	list.add(3);
	
	for(int i=1;i<2;i++) {
		
		list.remove(i);
		System.out.println(list.get(i));
		
	}
	System.out.println(list);
	
//	int n=sc.nextInt();
//	int sum=0;
//	while(n!=0) {
//        sum = sum + n % 10;
//        n=n/10;
//	}
//	System.out.println(sum);
//		
//	         OR	
	
   // USING LOG FUNCTION.
	
//	int numberOfDigits=(int) (Math.log10(n)+1);
//	
//	System.out.println(numberOfDigits);
	
	
	
	
	}

}
