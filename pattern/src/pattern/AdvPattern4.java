package pattern;

public class AdvPattern4 {

	public static void main(String[] args) {

		int n=8;
		int i,j,k,l;
		
		for(i=1;i<=n;i++) {
			System.out.print("* ");
			
			if(i<3) {
				for(j=1;j<i;j++) {
					System.out.print("* ");
					}
			}
			if(i>2 && i<n) {
				for(k=3;k<=i;k++) {
					System.out.print("  ");
				}
			  System.out.print("* ");
			}
			if(i==n) {
				for(l=1;l<=n-1;l++) {
					System.out.print("* ");
				}
			}
			System.out.println();			
		}
		
		
	}

}
