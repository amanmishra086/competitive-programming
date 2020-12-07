package novemberLongChallenge;

import java.util.*;

public class ironMagnetAndWallQueue {
	
private static boolean attractionPower(int k, int magnetPos, int ironPos, int sheetCount) {
		
		int pij=k+1 - Math.abs(magnetPos-ironPos) - sheetCount;
		
		if(pij>0) {
			return true;
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			sc.nextLine();
			String str=sc.next();
			
			char[] arr=str.toCharArray();
			
			int p=k+1,l,r,count=0;
			
			Queue<Integer> mag =new LinkedList<>();
			Queue<Integer> iron =new LinkedList<>();
			
			for(int i=0;i<n;i++) {
				
				if(arr[i]=='M') {
					mag.add(i);
				}
				if(arr[i]=='I') {
					iron.add(i);
				}
				
				if(arr[i]=='X' || i==n-1) {
					
					int sheet;
					while(!mag.isEmpty() && !iron.isEmpty()) {
						
						sheet=0;
						l=Math.min(mag.peek(), iron.peek());
						r=Math.max(mag.peek(), iron.peek());
						
						for(int j=l;j<=r;j++) {
							
							if(arr[j]==':') {
								sheet++;
							}
							
						}
						if(attractionPower(k,l,r,sheet)) {
							
							count++;
							mag.remove();
							iron.remove();
							
						}else if(mag.peek() < iron.peek()) {
							mag.remove();
						}else {
							iron.remove();
						}	
						
					}
					
					while(!mag.isEmpty()) {
						mag.remove();
					}
					while(!iron.isEmpty()) {
						iron.remove();
					}
					
					
				}
				
				
			}
			System.out.println(count);
			
		}

	}

}
