package challengesSTL;

import java.util.*;

public class PrimeSeive2 {

	public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        while(n!=0) {
		
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int[] arr=new int[b+1];
        
        for(int i=3;i<=b;i+=2) {
        	arr[i]=1;
        }
        
        for(int i=3;i<arr.length;i+=2) {
        	if(arr[i]==1) {
        		for(int j=i*2;j<arr.length;j+=i) {
        			arr[j]=0;
        		}
        	}
        }
        arr[0]=arr[1]=0;
        arr[2]=1;
        int count=0;
		for(int i=a;i<=b;i++) {
			if(arr[i]==1) {
				count++;
			}
		}
		System.out.println(count);
		n--;
        }
		
	}

}
