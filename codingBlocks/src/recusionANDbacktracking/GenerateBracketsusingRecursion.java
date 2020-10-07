package recusionANDbacktracking;

import java.util.Arrays;

public class GenerateBracketsusingRecursion {

	public static void main(String[] args) {
		
		int n=3;
		char arr[]=new char[100];
	    brackets(n,0,0,0,arr);
		
		
	}

	private static void brackets(int n,int index,int open,int close,char[] arr) {
		
		if(index == 2*n) {
			String str="";
			int i=0;
			while(arr[i] !='\0') {
				str+=arr[i];
				
				i++;
			}
			System.out.println(str);
			return;
		}
		
		//rec case
		if(open < n) {
			arr[index]='(';
			brackets(n,index+1,open+1,close,arr);
		}
		 if(close < open) {
			 arr[index]=')';
			brackets(n,index+1,open,close+1,arr);
		}
		return;
		
	}

}
