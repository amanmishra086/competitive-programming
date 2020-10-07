package beginnersQuestions;

public class Anagrams {

	public static void main(String[] args) {

		String a="silent";
		String b="listen";
		boolean anagram=true;
		
		int al[]=new int[256];
		int bl[]=new int[256];
		
		for(int i=0;i<a.length();i++) {
			int index = (int)a.charAt(i);
			al[index]++;
		}
		
		for(int i=0;i<b.length();i++) {
			int index = (int)b.charAt(i);
			bl[index]++;
		}
		
		for(int i=0;i<256;i++) {
			if(al[i]!=bl[i]) {
				anagram=false;
				break;
			}
		}
		if(anagram) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
		
		
	}

}
