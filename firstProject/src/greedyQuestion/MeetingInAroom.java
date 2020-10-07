package greedyQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;



public class MeetingInAroom {
	
	public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Entry<Integer, Integer>> list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
  

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0) {
			
			int n=sc.nextInt();
			int s[]=new int[n];
			int f[]=new int[n];
			int arr[]=new int[100000];
			//ArrayList<Integer> arr=new ArrayList<>();
			HashMap<Integer,Integer> map=new HashMap<>();
			
			for(int i=0;i<n;i++) {
				s[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				f[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				 map.put( i , f[i]-s[i] );
			}
			//System.out.println(map);
			
//			Map<Integer, Integer> tmap = new TreeMap<Integer, Integer>(map); 
//			
//			System.out.println(tmap);
			
			Map<Integer, Integer> hm1 = sortByValue(map); 
			//System.out.println(hm1);
			boolean found=false;
			ArrayList<Integer> l=new ArrayList<>();
			for (Map.Entry<Integer, Integer> entry : hm1.entrySet()) {
	            int k = entry.getKey();
	            
	            for(int i=s[k];i<=f[k];i++) {
	            	
	            	if(arr[i]!=1) {
	            	arr[i]=1;
	            	}else {
	            		continue;
	            	}
	            	if(i==f[k]) {
	            		l.add(k+1);
	            	}
	            	
	            	
	            }
	            
	            
	        }
			Collections.sort(l);
			for(int i=0;i<l.size();i++) {
				System.out.print(l.get(i)+" ");
			}
			t--;
		}
		
		
	}

}
