/** 
 * @author Christov van Heerden
 * @version 1.0
 * @since 2020-02-13
 * @title Sum of Digits / Digital Root
 * CodeWars exercises - 6Kyu

In this kata, you must create a digital root function.

A digital root is the recursive sum of all the digits in a number. 
Given n, take the sum of the digits of n. If that value has more than one digit, 
continue reducing in this way until a single-digit number is produced. This is only 
applicable to the natural numbers.
*/

public class Digital_Root {
	public static void main(String args[]) {
		System.out.println(digital_root(16) + " = 7");
		System.out.println(digital_root(942) + " = 6");
		System.out.println(digital_root(132189) + " = 6");
		System.out.println(digital_root(493193) + " = 2");
	}
	
	public static int digital_root(int n) {
	    // Run the loop with the function calling itself until the value of n is a single digit
		while(n > 10) {
	    	// Convert the number into an integer array
			int[] digits = Integer.toString(n).chars().map(c -> c-'0').toArray();
	    	// Reset the value of the temporary variable sum
			int sum = 0;
	    	// Add all the values in the array
			for(int digit:digits) {
	    		sum = sum + digit;
	    	}
	    	// Assign the value of sum to n
			n = sum;
			// Call the function on itself again until the value of n is a single digit
	    	digital_root(n);
	    }
	    // Return the final n when the condition is met
		return n;
	  }
}
