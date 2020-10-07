package beginnersQuestions;

public class Anagram2 {

	public static void main(String[] args) {

		String a="act";
		String b="cat";
		boolean anagram=false;
		
		boolean visited[]=new boolean[b.length()];
			
		if(a.length()==b.length()) {
			
			for(int i=0;i<a.length();i++) {
				 anagram=false;
				 char c=a.charAt(i);
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j) == c && !visited[j]) {
						visited[j]=true;
						anagram=true;
						break;
					}	
				}
				if(!anagram) {
					break;
				}
			}
			if(anagram) {
				System.out.println("anagram");
			}else {
				System.out.println("not anagram");
			}
			
			
		}else {
			System.out.println("not anagram");
		}
		
		
	}

}
