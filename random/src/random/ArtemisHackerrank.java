package random;

import java.util.*;

public class ArtemisHackerrank {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
        int t=0;
        if(sc.hasNextInt())
            t=sc.nextInt();
        String s="abcdefghijklmnopqrstuvwxyz";
        char[] sArr=s.toCharArray();
        
        while(t-->0){
        	 int count=1;
            int n=sc.nextInt();
             sc.nextLine();
            String str=sc.next();
            HashSet<Character> set=new HashSet<>();
            ArrayList<Character> list=new ArrayList<>();
            for(char c:str.toCharArray()) {
            	list.add(c);
                set.add(c);
            }
//            System.out.println(set);
//            System.out.println(list);
            
            String q="";
            for(char c:set) {
            	q+=c;
            }
           // System.out.println(q);
            
           if(set.size()!=s.length() || q != s)count=0;
           else {
        	   
        	   for(char c:set){
        		   
        		  int cc= Collections.frequency(list, c);
        		  count*=cc;
                   
               }
        	   
           }
           System.out.println(count);
            
            
            
            
        }
		
	}

}
