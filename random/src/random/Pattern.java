package random;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
			int n=sc.nextInt();
	        if(n==0){
	            //return 0;
	        }
	        long f=(long)n;
			int rows=0;
			long a = 1, b = 1, c = -2*f;
	        long root1, root2;

	        long determinant = b * b - 4 * a * c;

	        // condition for real and different roots
	        if(determinant >= 0) {
	            root1 =   (long) ((-b + Math.sqrt(determinant)) / (2 * a));
	            root2 =  (long) ((-b - Math.sqrt(determinant)) / (2 * a));
	            //System.out.println(root1 +" "+root2);

	            if(root1>0) {
	            	rows=(int)root1;
	            }else {
	            	rows=(int)root2;
	            }
	           
	        }
	        System.out.println(rows);
	        //return rows;
		
//		Scanner sc =new Scanner(System.in);
//		long n=sc.nextLong();
//		long rows=0;
//		long a = 1, b = 1, c = -2*n;
//        long root1, root2;
//
//        long determinant = b * b - 4 * a * c;
//
//        // condition for real and different roots
//        if(determinant >= 0) {
//            root1 =   (long) ((-b + Math.sqrt(determinant)) / (2 * a));
//            root2 =  (long) ((-b - Math.sqrt(determinant)) / (2 * a));
//            System.out.println(root1 +" "+root2);
//
//            if(root1>0) {
//            	rows=root1;
//            }else {
//            	rows=root2;
//            }
//           
//        }
//        System.out.println(rows);
//		boolean b=true;
//		int n=sc.nextInt();
//		int k=0;
//		for(int i=1;i<n;i++) {
//			for(int j=1;j<=i;j++) {
//				if(n!=0) {
//					System.out.print("* ");
//					n--;
//				}else if(n==0 && j==i) {
//					//b=false;
//					return;
//				}else {
//					b=false;
//					return;
//				}
//			}
//			if(b) {
//			k++;
//		
//			}else {
//				return;
//			}
//			System.out.println();
//			
//			
//		}
//		System.out.println(k);
//        
		
	}

}
