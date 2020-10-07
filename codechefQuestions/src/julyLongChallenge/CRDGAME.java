package julyLongChallenge;

import java.util.Scanner;

public class CRDGAME {
	
	static int sum(int n) {
		int value=0;
		while(n!=0) {
			value+=n%10;
			n=n/10;
		}
		
		
		
		
		return value;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t!=0) {
			int chef=0;
			int monty=0;
			
			int n=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<n;i++) {
				String str=sc.nextLine();
				String[] arr=str.split(" ");
				int part1=Integer.parseInt(arr[0]);
				int part2=Integer.parseInt(arr[1]);
				int chefScore=sum(part1);
				int montyScore=sum(part2);
				
				if(chefScore>montyScore) {
					chef++;
				}else if(montyScore>chefScore) {
					monty++;
				}else {
					chef++;
					monty++;
				}
				
			
			}
			if(chef>monty) {
				System.out.print("0 "+chef);
			}else if(monty>chef) {
				System.out.print("1 "+monty);
			}else {
				System.out.print("2 "+chef);
			}
			
			
			System.out.println();
			t--;
		}
		
		
	}

}
