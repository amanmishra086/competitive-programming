package divideAndConquer;

public class PainterProblem {

	public static void main(String[] args) {
		
		//minimum amount of time to print all the boards
		
		int[] boards= {10,20,30,40};
		
		int k=2;// number of painters
		
		// binary search on time
		// same as book allocation problem
		
		int s=40; // atleast 40 unit time will take,beacuse its is the longest board
		int e=100;// sum of all boards length
		
		int ans=0;
		
		while(s<=e) {
			
			int mid=(s+e)/2;
			
			boolean hoPayega=check(boards,k,mid);
			
			if(hoPayega) {
				ans=mid;
				e=mid-1;	
				
			}else {
				s=mid+1;
			}
	
		}
		System.out.println(ans);
		
	}

	private static boolean check(int[] boards, int painters, int time) {
		
		int curTime=0;
		
		
		for(int i=0;i<boards.length;i++) {
			
			if(curTime<=time) {
				
				curTime+=boards[i];
				
			}else {
				
				painters--;
				if(painters<=0) {	
					
					return false;
					
				}
				curTime=0;
				
			}
			
			
		}
		
		painters--;
		
		if(painters<=0) {
			return false;
		}
		

		return true;
	}

}
