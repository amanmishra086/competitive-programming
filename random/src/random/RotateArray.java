package random;
import java.util.*;

public class RotateArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int j=0;
		int k=0;
		for(int i=r-1;i<n+r-1;i++) {
			k=i%n;
			brr[j]=arr[k];
			j++;
		}
		for(int i=0;i<n;i++) {
			System.out.print(brr[i]+" ");
		}
		
	}

}
