package pattern;

public class AdvPattern2 {

	public static void main(String[] args) {

		int n=5;
		int i,j,k;
		int count=1;
		
		for(i=1;i<=n;i++) {
			
			for(k=n;k>i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
