/* Author - Christov van Heerden
 * Date - 2020-02-06
 * CodeWars exercises - 6Kyu
 * Title - Count the number of Duplicates
 * 
 * Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric 
 * digits that occur more than once in the input string. The input string can be assumed to contain only alphabets 
 * (both uppercase and lowercase) and numeric digits.
 * 
 * Example
 * 
 * "abcde" -> 0 # no characters repeats more than once
 * "aabbcde" -> 2 # 'a' and 'b'
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2 # 'a' and '1'
 * "ABBA" -> 2 # 'A' and 'B' each occur twice

*/
import java.util.HashMap;

public class Counting_Duplicates {
	public static void main(String args[]) {
		String testWord1 = "abcde";
		String testWord2 = "aabbcde";
		String testWord3 = "aabBcde";
		String testWord4 = "indivisibility";
		String testWord5 = "Indivisibilities";
		String testWord6 = "aA11";
		String testWord7 = "ABBA";
		
		System.out.println(testWord1 + " " + duplicateCount(testWord1));
		System.out.println(testWord2 + " " + duplicateCount(testWord2));
		System.out.println(testWord3 + " " + duplicateCount(testWord3));
		System.out.println(testWord4 + " " + duplicateCount(testWord4));
		System.out.println(testWord5 + " " + duplicateCount(testWord5));
		System.out.println(testWord6 + " " + duplicateCount(testWord6));
		System.out.println(testWord7 + " " + duplicateCount(testWord7));
		
	}
	
	public static int duplicateCount(String text) {
	    // Convert string to lower case;
		text = text.toLowerCase();
		
		// Declare and initialize a variables
		int count = 0;
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for(int i = 0; i < text.length(); i++) {
			if(charCount.containsKey(text.charAt(i))) {
				charCount.put(text.charAt(i), charCount.get(text.charAt(i))+1);
			}
			else {
				charCount.put(text.charAt(i), 1);
			}
		}
		
		for(Object value: charCount.values()) {
			if((Integer)value != 1) {
				count++;
			}
		}
		return count;
	}
	
}
