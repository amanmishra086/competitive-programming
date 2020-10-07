package firstProject1;

public class StringProblem {

	public static void main(String[] args) {

		String s="hackerhappy";
		String t="hackerrank";
		int k=9;
		int i=0,j=0;
		//char[] sa=new char[s.length()];
		char[] sa=s.toCharArray();
		char[] ta=t.toCharArray();
		for(i=0;i<s.length();i++) {
			if(sa[i]!=ta[i]) {
				break;
			}
		}
		//System.out.println(i);
		for(j=s.length()-1;j>=i;j--) {	
			sa[j]=' ';
			k--;
		}
		for(j=i;j<ta.length;j++) {
			sa[j]=ta[j];
			k--;
		}
		for(char c:sa) {
			System.out.print(c);
		}
		
	}

}
