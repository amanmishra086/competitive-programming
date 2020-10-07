package random;
import java.util.*;
public class Groot {
	
	static int grootFunction(LinkedList<Integer> list) {
		int result=0;
		int k=0;
		
		if(list.get(0)==list.get(list.size()-1)) {
			k=list.get(0);
			list.remove(list.size()-1);
			list.remove(0);
			list.add(k+1);
		}
		
		for(int i=0;i<list.size()-1;i++) {
			
			
			
			 if(list.get(i)==list.get(i+1)) {
				k=list.get(i);
				 list.remove(i);
				 list.remove(i);
				list.add(i, k+1);
			}
			
			
//			if(list.get(i)==list.get(i+1)) {
//				if(i==list.size()-8) {
//					k=list.get(i);
//					list.remove(i);
//					list.remove(i);
//					//list.remove(0);
//					list.add(i-1,k+1);
//					
//				}else {
//				 k=list.get(i);
//				 list.remove(i);
//				 list.remove(i);
//				list.add(i, k+1);
//				}
//				
//			}
			
		}
		if(list.size()!=1) {
//			System.out.println(list);
//			System.out.println(list.size());
			result=grootFunction(list);
			
		}else {
			//System.out.println("hello");
			result=list.get(0);
		}
		//System.out.println(list);
		
		return result;
	}
	
	 

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0) {
			
			int n=sc.nextInt();
			
			LinkedList<Integer> list=new LinkedList<>();
			for(int i=0;i<n;i++) {
				int p=sc.nextInt();
				list.add(p);
			}
			//list.add(n, list.get(0));
			//System.out.println(list);
			int result=grootFunction(list);
			System.out.println(result);
			
			
			
			
			
			
			
			
			t--;
		}
		
		
	}

}
