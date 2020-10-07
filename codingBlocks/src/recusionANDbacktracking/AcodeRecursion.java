package recusionANDbacktracking;


public class AcodeRecursion {

	public static void main(String[] args) {
		
		char ch[]= {'\0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		int arr[]= {1,0,3,1,6};
		
		char out[]=new char[arr.length];
		
	   genearte(arr,ch,out,0,0); 
		
		
	}

	private static void genearte(int[] arr, char[] ch, char[] out, int i,int j) {
		
		if(i>=arr.length ) {
			if(j<arr.length) {
				out[j]='\0';
			}
			System.out.println(new String(out));
			
			
			return;
		}
	
	
		 int digit=arr[i];
		 char c;
		 if(digit!=0) {
		  c=ch[digit];
		 
		 out[j]=c;
		 genearte(arr, ch, out, i+1, j+1);
		 }

		 
		 if(i+1!=arr.length) {
			 
			 int secdigit=arr[i+1];
			 int no=digit*10+secdigit;
			 
			 if(no<=26) {
				  c=ch[no];
				  out[j]=c;
				  genearte(arr, ch, out, i+2, j+1);
			 }
			 
			 
		 }
		 return;
		 
	}

}
