package augustLunchtime;

import java.util.Arrays;
import java.util.Scanner;

public class ModeFreq {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			int freq[]=new int[10000];
			int freq2[]=new int[10000];
			
			Arrays.fill(freq, 0);
			Arrays.fill(freq2, 0);
			
			for(int i=0;i<n;i++) {
				freq[arr[i]]++;
			}
			
			for(int i=0;i<freq.length;i++) {
				
				freq2[freq[i]]++;
				
			}
			freq2[0]=0;
//			System.out.println(Arrays.toString(freq));
//			System.out.println(Arrays.toString(freq2));
			
			int max=0;
			int maxindex=0;
			for(int i=0;i<10000;i++) {
				if(freq2[i]>max) {
					max=freq2[i];
					maxindex=i;
				}
			}
			System.out.println(maxindex);
		}
		
		
	}

}
