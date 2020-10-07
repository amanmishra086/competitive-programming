package firstProject1;

public class HackerRank {
	public static void main(String[] args) {
		
		int n=4,i,j;
		for(i=4;i>=1;i--) {
			
			for(j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}for(int k=i;k<=n;k++) {
				System.out.print("#");
			}
			System.out.println();
			
		}
	}

}
