package random;

import java.util.Scanner;

public class TcsNqt2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		int numbercount=0;
		while(true) {
			numbercount++;
			String str=sc.next();
			
			if(str.equals("q") || str.equals("Q")) {
				numbercount--;
				break;
			}
			else if(str.length()!=10) {
				continue;
			}
			else {
				for(int i=0;i<str.length();i++) {
					if(!Character.isDigit(str.charAt(i))) {
						break;
					}
				}
			}
			
			
			count++;
		}
		if(numbercount!=5) {
			System.out.println("INPUT LIMIT IS 5");
		}else {
			System.out.println(count);
		}
		

	}

}
