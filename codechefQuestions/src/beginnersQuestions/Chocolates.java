package beginnersQuestions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Chocolates {

	static int equal(int[] arr) {
		
		int choc[]= {5,2,1};
		int a=3;

        int big=0,i,j;
        for(i=0;i<arr.length;i++){
            if(arr[i]>big){
                big=arr[i];
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]==big){
                continue;
            }
            for(j=0;j<3;j++) {
            arr[i]=choc[j]+arr[i];
            }
            
            
        }
        for(i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
        return a;
            
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int result = equal(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}


