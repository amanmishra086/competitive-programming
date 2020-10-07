package JuneLongChallenge;

import java.util.Scanner;

public class Xystr {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		sc.nextLine();
		while(t!=0) {
		
			int pair=0;
			
			String s=sc.nextLine();
			
			for(int i=0;i<s.length()-1;i++) {
				if((s.charAt(i)=='x' && s.charAt(i+1)=='y')|| (s.charAt(i)=='y' && s.charAt(i+1)=='x')) {
					pair++;
					i++;
				}else {
					continue;
				}
			}
			System.out.println(pair);
		
		
			t--;
		
	}

}
}
