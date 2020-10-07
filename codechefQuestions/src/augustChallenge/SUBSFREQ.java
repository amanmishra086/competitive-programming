package augustChallenge;

import java.util.*;


import java.util.Map.Entry;

public class SUBSFREQ {
	
	static int mostFrequent(List<Integer> subarr, int n) 
    { 
//          System.out.println(subarr);
        // Insert all elements in hash 
        Map<Integer, Integer> hp = 
               new HashMap<Integer, Integer>(); 
          
        for(int i = 0; i < n; i++) 
        { 
            int key = subarr.get(i); 
            if(hp.containsKey(key)) 
            { 
                int freq = hp.get(key); 
                freq++; 
                hp.put(key, freq); 
            } 
            else
            { 
                hp.put(key, 1); 
            } 
        } 
          
        // find max frequency. 
        int max_count = 0, res = -1; 
          
        for(Entry<Integer, Integer> val : hp.entrySet()) 
        { 
            if (max_count < val.getValue()) 
            { 
                res = val.getKey(); 
                max_count = val.getValue(); 
            } 
        } 
          
        return res; 
    } 
	
		static	List<Integer> printSubsequences(List<Integer> arr, int index,  
				List<Integer> subarr ,int cssi,List<Integer> ab) 
		{ 
			
		// Print the subsequence when reach 
		// the leaf of recursion tree 
		    
		
			
		if (index>= arr.size()) 
		{ 
		int l = subarr.size(); 
		
		// Condition to avoid printing 
		// empty subsequence 
		if (l != 0) {
			int p=mostFrequent(subarr,cssi);
			ab.add(p);
			//return ab;
			
		}
//		if (l != 0) {
//			for (int i = 0; i < cssi; i++) {
//				System.out.print(subarr.get(i)+" ");
//			}
//		System.out.println();
//		}
		} 
		else
		{ 
		// Subsequence without including 
		// the element at current index 
		printSubsequences(arr, index + 1, subarr , cssi,ab); 
		
		subarr.add(cssi,arr.get(index)); 
		
		// Subsequence including the element 
		// at current index 
		printSubsequences(arr, index + 1, subarr , cssi+1,ab); 
		} 
		//return ab;
		//System.out.println(ab);
		return ab;
		} 

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
			t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt();
			List<Integer> list=new ArrayList<>(n);
			List<Integer> sublist=new ArrayList<>();
			List<Integer> ab=new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				list.add(sc.nextInt());
			}
			
			//List<Integer> res=
			List<Integer> res=	printSubsequences(list, 0, sublist,0,ab); 
			//System.out.println(res);
			int arr[]=new int[n+1];
			Arrays.fill(arr, 0);
			for(int i=0;i<res.size();i++) {
				arr[res.get(i)]++;
			}
			for(int i=0;i<list.size();i++) {
				System.out.print(arr[list.get(i)]+" ");
				arr[list.get(i)]=0;
			}
			System.out.println();
		}
		
		
	}

}
