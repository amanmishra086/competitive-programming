package random;

import java.util.Scanner;

public class Parenthsis {

	public static void main(String[] args) {


       Scanner sc=new Scanner(System.in);
		
		int t=0;
		
		if(sc.hasNextInt()) {
			
			t=sc.nextInt();
			sc.nextLine();
			
		}
		while(t!=0) {
			
			boolean balance=true;
			String str=sc.nextLine();
			int bracket[]=new int[6];
			
			for(char c:str.toCharArray()) {
				if(c=='(') {
					bracket[0]++;
				}
				else if(c==')') {
					bracket[1]++;
				}else if(c=='{') {
					bracket[2]++;
				}else if(c=='}') {
					bracket[3]++;
				}else if(c=='[') {
					bracket[4]++;
				}else if(c==']') {
					bracket[5]++;
				}
			}
			for(int i=0;i<6;i+=2) {
				if(!(bracket[i]==bracket[i+1])) {
					balance=false;
					break;
				}
			}
			if(balance) {
				System.out.println("balanced");
			}else {
				System.out.println("not balanced");
			}
			
			
			
			t--;
		}
		 
	}

}
