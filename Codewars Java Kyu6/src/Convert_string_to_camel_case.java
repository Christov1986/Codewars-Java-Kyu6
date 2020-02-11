/* Author - Christov van Heerden
 * Date - 2020-02-11
 * CodeWars exercises - 6Kyu
 * Convert string to camel case
 * 
 * Complete the method/function so that it converts dash/underscore 
 * delimited words into camel casing. The first word within the output 
 * should be capitalized only if the original word was capitalized 
 * (known as Upper Camel Case, also often referred to as Pascal case).
 */

public class Convert_string_to_camel_case {
	public static void main(String args[]) {
		// Run test strings
		System.out.println(toCamelCase("the-stealth-warrior") + " = theStealthWarrior");
		System.out.println(toCamelCase("The_Stealth_Warrior") + " = TheStealthWarrior");
	}
	
	static String toCamelCase(String s){
	    // Convert the string to a char[]
		char[] charArray = s.toCharArray();
		
		// Loop through the char[] and change all char after -/_ to uppercase and remove -/_
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == '-' || charArray[i] == '_') {
				charArray[i+1] = Character.toUpperCase(charArray[i+1]);
			}
		}
		
		// Convert char[] back to a string
		String string = new String(charArray);
		
		return string.replaceAll("-", "").replaceAll("_", "");
	}
}
