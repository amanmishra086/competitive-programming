package pattern;

public class AdvPattern1 {

	public static void main(String[] args) {

		int n=7;
		int i,j,k;
		
		for(i=1;i<=n;i++) {
			
			for(k=n;k>i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
