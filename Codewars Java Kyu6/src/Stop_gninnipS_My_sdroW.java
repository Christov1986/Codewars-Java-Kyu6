/* Author - Christov van Heerden
 * Date - 2020-02-06
 * CodeWars exercises - 6Kyu
 * Title - Stop gninnipS My sdroW!
 * 
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata). 
 * Strings passed in will consist of only letters and spaces. Spaces will be included only when 
 * more than one word is present.
 * 
 * Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
 * spinWords( "This is a test") => returns "This is a test" 
 * spinWords( "This is another test" )=> returns "This is rehtona test"

*/

public class Stop_gninnipS_My_sdroW {
	public static void main(String Args[]) {
		
		// Declare test Strings
		String TestString1 = "Hey fellow warriors";
		String TestString2 = "This is a test";
		String TestString3 = "This is another test";
		
		// Pass strings through spinWords function and print outputs
		System.out.println(spinWords(TestString1));
		System.out.println(spinWords(TestString2));
		System.out.println(spinWords(TestString3));
		
	}
	
	public static String spinWords(String sentence) {
		// Break sentence up into words and place in an Array
		String words[] = sentence.split(" ");
		
		// Spin all words longer than 5 letters and replace in array
		for(int i = 0; i < words.length; i++ ) {
			if(words[i].length() >= 5) {
				StringBuilder sb = new StringBuilder(words[i]);
				words[i] = sb.reverse().toString();
			}
		
		}
		// join array and return to reversed sentence
		return String.join(" ", words);
	}
}
