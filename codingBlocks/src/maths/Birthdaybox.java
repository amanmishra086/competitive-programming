package maths;

import java.util.Scanner;

public class Birthdaybox {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		float p=0;
		if(sc.hasNextFloat()) {
			 p=sc.nextFloat();
		}
		
		
		int people=0;
		float x=1.0f;
		
		float denom=365;
		float num=365;
		if(p==1.0) {
			people=366;
		}else {
			while(x > 1-p) {
				x=x*(num/denom);
				num--;
				people++;
				
			}
		}
		
		
		
		System.out.println(people);
	}

}
