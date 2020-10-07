package dynamicProgramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CoinageCombinatorics {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		List<Integer> coin=new LinkedList<>() ;
		coin.add(10);
		coin.add(5);
		coin.add(2);
		coin.add(1);
		
		int sum=15;
		List<Integer> arr=new LinkedList<>() ;
		arr.add(1);
		arr.add(1);
		arr.add(3);
		arr.add(2);
		
//		System.out.println(arr.remove(1));
		
		int ans=possibleways(sum,arr,coin);
		
		System.out.println(ans);
		
	}

	private static int possibleways(int sum, List<Integer> arr, List<Integer> coin) {
		
		int ans=0;
		if(sum==0) {
			return 1;
		}
		
		for(int i=0;i<coin.size();i++) {
			int p=coin.remove(i);
			int opt1=possibleways(sum,arr,coin);
			
			coin.add(i, p);
			int opt2=possibleways(sum-p,arr,coin);
			
			ans=opt1+opt2;
			
		}
		
		
		return ans;
	}

}
