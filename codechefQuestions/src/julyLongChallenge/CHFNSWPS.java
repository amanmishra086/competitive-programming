package julyLongChallenge;

import java.util.*;
import java.util.Scanner;

public class CHFNSWPS {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		int t=0;
		if(sc.hasNextInt()) {
			t=sc.nextInt();
		}
		while(t--!=0) {
			boolean costfound=false;
			int n=sc.nextInt();
			int cost=0;
			int finalcost=0;
			List<Integer> a=new ArrayList<>();
			List<Integer> b=new ArrayList<>();
			
			for(int i=0;i<n;i++)
				a.add(sc.nextInt());
			for(int i=0;i<n;i++)
				b.add(sc.nextInt());
			
			Collections.sort(a);
			Collections.sort(b);
			
			for(int i=0;i<n;i++) {
				if(a.get(i)==b.get(i)) {
					cost=0;
					
				}else {
					cost=-1;
					break;
				}
			}
			if(cost==0) {
				System.out.println("0");
			}else {
			
			HashSet<Integer> seta=new HashSet<>(a);
			HashSet<Integer> setb=new HashSet<>(b);
			
			List<Integer> fa=new ArrayList<>();
			List<Integer> fb=new ArrayList<>();
			
			for(Integer i:seta) {
				int f=Collections.frequency(a, i);
				if(f%2==0) {
					int z=f-Collections.frequency(b, i);
					z=z/2;
					
					for(int j=0;j<z;j++)
						fa.add(i);
					
				}else {
					int z=f-Collections.frequency(b, i);
					if(z%2==0) {
						z=z/2;
						for(int j=0;j<z;j++)
							fa.add(i);
					}else {
						cost=-1;
						costfound=true;
						break;
					}
				}
			}
			if(costfound==false) {
			
			for(Integer i:setb) {
				int f=Collections.frequency(b, i);
				if(f%2==0) {
					int z=f-Collections.frequency(a, i);
					z=z/2;
					
					for(int j=0;j<z;j++)
						fb.add(i);
					
				}else {
					int z=f-Collections.frequency(a, i);
					if(z%2==0) {
						z=z/2;
						for(int j=0;j<z;j++)
							fb.add(i);
					}else {
						cost=-1;
						break;
					}
				}
			 }
			}
			System.out.println(fa);
			System.out.println(fb);
			
			if(fa.size()== fb.size() && fa.size()!=0) {
				for(int i=0;i<fa.size();i++) {
					finalcost = finalcost+Math.min(fa.get(i), fb.get(i));
				}
				cost=finalcost;
			}
			System.out.println(cost);
			
			
		  }
		}
		
	}

}
