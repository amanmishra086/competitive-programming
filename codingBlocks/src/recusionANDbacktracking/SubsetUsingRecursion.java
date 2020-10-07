package recusionANDbacktracking;

public class SubsetUsingRecursion {

	public static void main(String[] args) {
		
		String str="abc";
		
		
		
		Subsets(str,"");
		
		
	}

	private static void Subsets(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
	
		Subsets(str.substring(1),ans+str.charAt(0));
		
		Subsets(str.substring(1),ans);
		
		
	}

}
