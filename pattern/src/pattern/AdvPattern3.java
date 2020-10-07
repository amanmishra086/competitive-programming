package pattern;

public class AdvPattern3 {

	public static void main(String[] args) {

		int n=6;
		int rows=2*n-1;
		int i,j,k;
		
		for(i=1;i<=rows;i++) {
			
			if(i<=n) {	
				for(j=1;j<=i;j++) {
					System.out.print("* ");
					}
				}
			else {
				for(j=i;j<=rows;j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		
		}
		
	}

}
