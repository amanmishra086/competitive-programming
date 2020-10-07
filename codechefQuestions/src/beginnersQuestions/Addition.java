	package beginnersQuestions;
	
	import java.util.Scanner;
	
	public class Addition {
	
		public static void main(String[] args) {
			
			int arr[]= {10,7,12};
			
			int choc[]= {5,2,1};
		
			int count=0;

	        int big=0,i,j,k;
	       
	        for(i=0;i<choc.length;i++){
	        	
	        	 for(k=0;k<arr.length;k++){
	 	            if(arr[k]>big){
	 	                big=arr[k];
	 	            }
	 	        }
	        	 
	            
	            for(j=0;j<arr.length;j++) {
	            	if(arr[j]==big){
		                continue;
		            }
	            arr[j]=choc[i]+arr[j];
	            }
	            count++;
	                        
	        }
	        for(i=0;i<arr.length;i++) {
	        	System.out.println(arr[i]);
	        }
	        System.out.println(count);
			
			
			
			
			
			
			
			
			
//			Scanner sc=new Scanner(System.in);
//			
//			int t=sc.nextInt();
//			while(t>0) {
//				
//				int a=sc.nextInt();
//				int b=sc.nextInt();
//				int c=a+b;
//				System.out.println(c);
//				
//			
//				
//			}
//			
//			t--;
			
//			int arr[]= {1,2,3,4,5};
////			for(int i=0;i<arr.length;i++) {
////				//arr[i]=5+arr[i];
////				scanf("%d",&arr[i]);
////			}
//			for(int i=0;i<arr.length;i++) {
//				if(i==3) {
//					continue;
//				}
//				arr[i]=5+arr[i];
//			}
//			for(int i=0;i<arr.length;i++) {
//				//arr[i]=5+arr[i];
//				//printf("%d",arr[i]);
//				System.out.println(arr[i]);
//			}
//			
	
		}
	
	}
