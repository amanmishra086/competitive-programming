package novemberLongChallenge;

import java.util.Scanner;

public class IronMagnetAndWall {
	
	

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
			if(str.length()!=n) {
				return;
			}
			
			char[] arr=str.toCharArray();
			
			int totalMagnet=0,ironPos=-1,magnetPos=-1,sheetCount=0;
			
			for(int i=0;i<n;i++) {
				
				if(arr[i]=='I') {				
					ironPos=i;
					
					if(magnetPos>=0) {
						boolean powerHai=attractionPower(k,magnetPos,ironPos,sheetCount);
						
						if(powerHai) {
							totalMagnet++;
							magnetPos=-1;
							ironPos=-1;
						}else {
							magnetPos=-1;
						}
						
					} 
					
				}else if(arr[i]=='M') {
					magnetPos=i;
					
					if(ironPos>=0) {
						boolean powerHai=attractionPower(k,magnetPos,ironPos,sheetCount);
						 
						if(powerHai) {
							totalMagnet++;
							magnetPos=-1;
							ironPos=-1;
						}else {
							ironPos=-1;
						}
						
					}
					
				}else if(arr[i]==':') {
					sheetCount++;
					
				}else if(arr[i]=='_') {
					continue;
				}else {
					
					ironPos=-1;
					magnetPos=-1;
					sheetCount=0;
					
				}
				
				
			}
			System.out.println(totalMagnet);
			
		}
		

	}

	private static boolean attractionPower(int k, int magnetPos, int ironPos, int sheetCount) {
		
		int pij=k+1 - Math.abs(magnetPos-ironPos) - sheetCount;
		
		if(pij>0) {
			return true;
		}
		
		
		return false;
	}

}
