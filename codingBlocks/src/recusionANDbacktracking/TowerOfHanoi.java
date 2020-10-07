package recusionANDbacktracking;
import java.util.*;

public class TowerOfHanoi {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		move(n,'A','B','C');
		

	}

	private static void move(int n, char src, char helper, char dest) {
		
		//Base case
		if(n==0) {
			return;
		}
		//Rec case 
		
		move(n-1,src, dest ,helper);
		System.out.println("moved plates "+n+" from "+src+" to"+dest);
		move(n-1,helper,src,dest);
		
		
	}

}
