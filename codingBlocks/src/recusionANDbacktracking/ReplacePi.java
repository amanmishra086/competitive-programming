package recusionANDbacktracking;

import java.util.Arrays;

public class ReplacePi {

	public static void main(String[] args) {
		
		String str="stopixyzpipi";
		
		char[] arr=new char[100];
		
		for(int i=0;i<100;i++) {
			if(i>str.length()-1) {
//				arr[i]='\0';
			}else {
				arr[i]=str.charAt(i);
			}
			
		}
		
		replace(arr,0);
		String s="";
		int p=0;
		while(arr[p]!='\0') {
			s+=arr[p];
			p++;
		}

		System.out.println(s);

	}

	private static void replace(char[] arr, int i) {
		
		if(arr[i] =='\0' || arr[i+1] =='\0') {
			return;
		}
		if(arr[i]=='p' && arr[i+1]=='i') {
			
			int j=i+2;
			
			while(arr[j] != '\0' ) {

				j++;
				
			}
			
			while(j >= i+2) {
				arr[j+2]=arr[j];
				j--;
			}
			
			arr[i]='3';
			arr[i+1]='.';
			arr[i+2]='1';
			arr[i+3]='4';
			
			replace(arr,i+4);
			
			
			
		}
		else {
			replace(arr,i+1);
		}
		return;
		
	}

}
