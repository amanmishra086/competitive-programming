package challengesSTL;

import java.util.*;

public class Dean {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		int k=sc.nextInt();
		sc.nextLine();
		String[] input=new String[q];
		for(int i=0;i<q;i++) {
			input[i]=sc.nextLine();
		}
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		for(int i=0;i<input.length;i++) {
			
			String str[]=input[i].split(" ");
			int a=Integer.parseInt(str[0]);
					
			if(a==1) {
				int b=Integer.parseInt(str[1]);
				int c=Integer.parseInt(str[2]);
				arr.add(0,b*b + c*c);
				
			}else if(a==2) {
				
				System.out.println(arr.get(k-1));
			}
			
		}
		
		
		
	}

}
