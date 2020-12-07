package greedyAlgo;

import java.util.*;


public class ActivitySelectionProblem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			
			int n=sc.nextInt();
			
			List<Map<Integer,Integer>> list=new ArrayList<>();		
			Map<Integer,Integer> map;
			for(int i=0;i<n;i++) {
				
				int s=sc.nextInt();
				int e=sc.nextInt();
				
				 map=new HashMap<>();
				map.put(s,e);
				list.add(map);
				

			}
			
			Collections.sort(list,new Comparator<Map<Integer,Integer>>() {

				@Override
				public int compare(Map<Integer, Integer> o1, Map<Integer, Integer> o2) {
					
					int v1 = 0,v2=0;
					for (Map.Entry<Integer,Integer> entry : o1.entrySet()) {
						v2=entry.getValue();
					}
					
					for (Map.Entry<Integer,Integer> entry : o2.entrySet()) {
						v1=entry.getValue();
					}
			
					return v2-v1;
				}		
				
			});
			// now implement greedy method
			
			int i=0;
			int end=0,start=0;
			
			for(Integer a:list.get(i).keySet() )
				end=list.get(i).get(a);
			
			int ans=1;
			
			for(int j=1;j<n;j++) {
				
				for(Integer b:list.get(j).keySet() ) {
					start=b;
					if(start >= end) {
						ans++;
						end=list.get(j).get(b);
					}
					
				}
					
				
			}
			
			
			System.out.println(list);
			System.out.println(ans);
			
		}

	}



}
