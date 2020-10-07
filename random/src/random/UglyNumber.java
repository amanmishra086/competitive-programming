package random;
import java.util.*;
public class UglyNumber {

	//ugly numbers are those whose prime factors are 2,3 and 5;
	
	
	static int maxDivide(int a, int b) 
    { 
        while(a % b == 0) 
            a = a/b; 
        return a;  
    } 
      
    
    static int isUgly(int no) 
    { 
        no = maxDivide(no, 2); 
        no = maxDivide(no, 3); 
        no = maxDivide(no, 5); 
          
        return (no == 1)? 1 : 0; 
    } 
      
    
    static int getNthUglyNo(int n) 
    { 
        int i = 1; 
          
        // ugly number count  
        int count = 1;  
          
        // check for all integers  
        // until count becomes n  
        while(n > count) 
        { 
            i++; 
            if(isUgly(i) == 1) 
                count++; 
        } 
        return i; 
    } 
      
   
    public static void main(String args[]) 
    { 
        int no = getNthUglyNo(150); 
        System.out.println("150th ugly "
                       + "no. is "+ no); 
    } 

}
