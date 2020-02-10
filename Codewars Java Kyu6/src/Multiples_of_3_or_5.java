/* Author - Christov van Heerden
 * Date - 2020-02-05
 * CodeWars exercises - 6Kyu
 * Title - Multiples of 3 or 5
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * 
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * 
 * Note: If the number is a multiple of both 3 and 5, only count it once.

*/

import java.util.Scanner;

public class Multiples_of_3_or_5 {
	public static void main(String args[]) {
		// Declare a scanner to take inputs
		Scanner input = new Scanner(System.in);
		
		// Request user to enter a number and take the input
		System.out.println("Please enter a natural number : ");
		int userNumber = input.nextInt();
		
		int answer = solution(userNumber);
		
		System.out.println(answer);
		
		input.close();
	}
	
	// Method calculates and returns the sum of all multiple of 3 or 5 below the number that the user entered
	public static int solution(int number) {
	    // Declare variables
		int answer = 0;
		
		// Check if each number is a multiple of 3 or 5 and add it to the sum
		for(int i=3; i < number; i++) {
	    	if(i % 3 == 0 || i % 5 == 0) {
	    		answer = answer + i;
	    	}
	    }
		
		return answer;
	}
}
