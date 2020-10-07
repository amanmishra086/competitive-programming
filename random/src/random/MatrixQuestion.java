package random;
import java.util.*;
public class MatrixQuestion {

	public static void main(String[] args) {

		int r=0 , c=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int n=sc.nextInt();
				if(n==1) {
					r=i;
					c=j;
				}
			}
//			System.out.println();
		}
		int result=Math.abs(2-r)+Math.abs(2-c);
		System.out.println(result);
		
		
		
	}

}
