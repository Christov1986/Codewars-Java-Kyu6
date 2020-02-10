/* Author - Christov van Heerden
 * Date - 2020-02-07
 * CodeWars exercises - 7Kyu
 * Enough is enough!
 * 
 * Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, 
 * and now they want to show Charlie their entire collection. However, Charlie doesn't like this sessions, 
 * since the motive usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells them 
 * that he will only sit during the session if they show the same motive at most N times. 
 * Luckily, Alice and Bob are able to encode the motive as a number. Can you help them to remove numbers 
 * such that their list contains each number only up to N times, without changing the order?
 * 
 * Task
 * 
 * Given a list lst and a number N, create a new list that contains each number of lst at most N 
 * times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], 
 * drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, 
 * which leads to [1,2,3,1,2,3].
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Enough_is_enough {
	public static void main(String args[]) {
		int[] testArray = {1, 1, 3, 3, 7, 2, 2, 2, 2};
		
		int[] result = deleteNth(testArray, 2);
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " , ");
		}
		
		
	}
	
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		// Convert Array to ArrayList
		List<Integer> list = new ArrayList<>();
		for(int element:elements) {
			list.add(element);
		}
		
		// Place all elements in a HashMap with the keys as the elements and the values as the counts
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < list.size(); i++) {
			if(map.containsKey(list.get(i))) {
				map.put(list.get(i), map.get(list.get(i)) + 1);
			}
			else {
				map.put(list.get(i), 1);
			}
		}
		
		// Check for all values in map that are higher than maxOccurances and remove the total over
		// from the back of the list
		for(Map.Entry<Integer, Integer> entry : map.entrySet())	{
			if(entry.getValue() > maxOccurrences) {
				for(int i = entry.getValue() - maxOccurrences; i > 0; i--) {
					list.remove(list.lastIndexOf(entry.getKey()));
				}
			}
		}		
		
		// Convert ArrayList back to array
		int[] finalArray = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			finalArray[i] = list.get(i);
		}
		
		return finalArray;
	}
	
}
