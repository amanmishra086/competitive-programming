package novemberLongChallenge;

import java.util.*;

public class IronMagnetAndWall2 {
	
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
			
			if(str.length()!=n) {
				return;
			}
			
			char[] arr=str.toCharArray();
			Stack<String> stack=new Stack<>();
			

			int totalMagnet=0,ironPos=-1,magnetPos=-1;
			
			for(int i=0;i<n;i++) {
				
				if(arr[i]=='X') {
					while(!stack.isEmpty()) {
						stack.pop();
					}
					continue;
				}
				
				
				else if(stack.isEmpty() && arr[i]!='X' && arr[i]!='_' && arr[i]!=':') {
					stack.push(arr[i]+""+i);
				}
				else if(arr[i]=='I') {
					int sheetCount=0;
					
					while(stack.peek().charAt(0)!='M' && !stack.isEmpty()) {
					
						
						if(stack.peek().charAt(0)=='_') {
							
							stack.pop();
							
						}else if(stack.peek().charAt(0)=='I') {
							
							break;
							
						}else if(stack.peek().charAt(0)==':') {
							sheetCount++;
							stack.pop();
						}
						
					}
					if(stack.isEmpty() || stack.peek().charAt(0)=='I') {
						stack.push(arr[i]+""+i);
					}else {
						
						String posStr=stack.peek().substring(1);
						 magnetPos=Integer.parseInt(posStr);
						 ironPos=i;
						 
						 if(attractionPower(k, magnetPos, ironPos, sheetCount)) {
							 totalMagnet++;
							 stack.pop();
						 }else {
							 stack.push(arr[i]+""+i);
						 }
				
					}
					
					
				}
					
				else if(arr[i]=='M') {
					int sheetCount=0;
					
					while(stack.peek().charAt(0)!='I' && !stack.isEmpty()) {
					
						
						if(stack.peek().charAt(0)=='_') {
							
							stack.pop();
							
						}else if(stack.peek().charAt(0)=='M') {
							
							break;
							
						}else if(stack.peek().charAt(0)==':') {
							sheetCount++;
							stack.pop();
						}
						
					}
					if(stack.isEmpty() || stack.peek().charAt(0)=='M') {
						stack.push(arr[i]+""+i);
					}else {
						
						String posStr=stack.peek().substring(1);
						 ironPos=Integer.parseInt(posStr);
						 magnetPos=i;
						 
						 if(attractionPower(k, magnetPos, ironPos, sheetCount)) {
							 totalMagnet++;
							 stack.pop();
						 }else {
							 stack.push(arr[i]+""+i);
						 }
				
					}
					
					
				}else {
					stack.push(arr[i]+""+i);
				}
				
					
					
		
				
				
			}
			System.out.println(totalMagnet);
			
		}
	}

}
