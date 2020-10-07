package recusionANDbacktracking;

public class Multiply {

	public static void main(String[] args) {
		
		int a=5;
		int b=3;
		
		int ans=multiply(a,b);
		System.out.println(ans);
	}
	
	private static int multiply(int a, int b) {
		int ans=0;
		
		if(b==0) {
			return 0;
		}
		
		ans=a+multiply(a,b-1);
		return ans;
	}

}
