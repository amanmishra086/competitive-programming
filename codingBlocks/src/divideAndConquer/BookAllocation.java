package divideAndConquer;

public class BookAllocation {

	public static void main(String[] args) {
		
		int books[]= {10,20,30,40};
		
		int n=4;
		
		int students=2;  // no of students;
		
		// create monotonic search space;
		
		int s=0;
		
		int e=100; // sum of all pages;
		
		int ans=0;
		
		while(s<=e) {
			
			int mid=(s+e)/2;
			
			boolean karPayega=canReadNoOfPages(books,n,students,mid);
			
			if(karPayega) {
				ans=mid;
				e=mid-1;
			}else {
				s=mid+1;
			}
			
			
		}
		
		System.out.println(ans);

	}

	private static boolean canReadNoOfPages(int[] books, int n, int students, int max_page) {
		
		int sum=0;
		
		 for(int i=0;i<n;i++) {
		
			 if(sum<=max_page) {
				 sum+=books[i];
			 }else {
				 students--;
				 if(students<=0) {
					 return false;
				 }
				 sum=0;
				 
			 }
		 }
		 
		 students--;
		 
		 if(students<=0) {
			 return false;
		 }
		
		
		
		return true;
	}

}
