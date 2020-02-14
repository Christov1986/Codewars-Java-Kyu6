/** 
 * @author Christov van Heerden
 * @version 1.0
 * @since 2020-02-14
 * @title Find the odd int
 * CodeWars exercises - 6Kyu

Given an array, find the integer that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

*/

import java.util.HashMap;

public class Find_the_odd_int {
	public static void main(String args[]) {
		int[] test1 = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
		int[] test2 = {1,1,2,-2,5,2,4,4,-1,-2,5};
		int[] test3 = {20,1,1,2,2,3,3,5,5,4,20,4,5};
		int[] test4 = {10};
		int[] test5 = {1,1,1,1,1,1,10,1,1,1,1};
		int[] test6 = {5,4,3,2,1,5,4,3,2,10,10};
		
		System.out.println(findIt(test1) + " = 5");
		System.out.println(findIt(test2) + " = -1");
		System.out.println(findIt(test3) + " = 5");
		System.out.println(findIt(test4) + " = 10");
		System.out.println(findIt(test5) + " = 10");
		System.out.println(findIt(test6) + " = 1");
	}
	
	public static int findIt(int[] a) {
	  	// Declare and initialize variables
		HashMap<Integer, Integer> map = new HashMap<>();
		
		// Add the int[] numbers into a Hashmap with the values being the counts
		for(int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])) map.put(a[i], map.get(a[i]) + 1);
			else map.put(a[i], 1);
		}
		
		// If the value is an odd number return the key int
		for(Integer key: map.keySet()) if(map.get(key) % 2 != 0) return key.intValue();
		
		return 0;
	}
}
