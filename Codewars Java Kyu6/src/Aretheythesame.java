/* Author - Christov van Heerden
 * Date - 2020-02-07
 * CodeWars exercises - 6Kyu
 * Are they the "same"?
 * 
 * Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) 
 * that checks whether the two arrays have the "same" elements, with the same multiplicities. 
 * "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 */

import java.util.Arrays;

public class Aretheythesame {
	public static void main(String args[]) {
		int[] test1a = {121, 144, 19, 161, 19, 144, 19, 11};
		int[] test1b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
		int[] test2a = {121, 144, 19, 161, 19, 144, 19, 11};
		int[] test2b = {132, 14641, 20736, 361, 25921, 361, 20736, 361};
		
		System.out.println(comp(test1a, test1b) + " = True");
		System.out.println(comp(test2a, test2b) + " = False");
		
	}
	
	public static boolean comp(int[] a, int[] b) {
	    // Declare variables
		boolean test = true;
		
		// Return false directly if either of the arrays are null
		if(a == null || b == null || a.length != b.length) {
			return false;
		}
		
		// Convert all negative values in array a to positive
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				a[i] = a[i] * -1;
			}
		}
		
		// Sort both arrays
		Arrays.sort(a);
		Arrays.sort(b);
		
		// Loop through the arrays comparing and change the condition to false if no match is found
		for(int i =0; i < a.length; i++) {
			if(Math.pow(a[i], 2) != b[i]) {
				test = false;
				break;
			}
		}
		return test;
	  }
}
