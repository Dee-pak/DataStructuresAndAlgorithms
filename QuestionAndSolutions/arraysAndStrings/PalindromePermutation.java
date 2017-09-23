/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. 
 * A permutation is a rearrangment of letters. The palindrome does not need to be limited
 * to just dictionary words.
 */
package arraysAndStrings;

import java.util.HashMap;

/**
 * @author deepakkhobragade
 *
 */
public class PalindromePermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(isPalindromePermutation1("Tact Cao"));

	}

	// solution1
	private static boolean isPalindromePermutation(String string) {
		if (string == null || string.length() == 0) {
			return true;
		}
		String str1 = string.trim().toLowerCase();
		int[] charCountArray = new int[256];
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) >= 97 && str1.charAt(i) <= 122) {
				charCountArray[str1.charAt(i)]++;
			}
		}
		int countOdds = 0;
		int value = 0;
		for (int i = 0; i < str1.length(); i++) {
			value = charCountArray[str1.charAt(i)];
			if (value % 2 == 1) {
				countOdds++;
			}
		}

		return countOdds <= 1;
	}

	private static boolean isPalindromePermutation1(String string) {
		if (string == null || string.length() == 0 || string.isEmpty()) {
			return true;
		}
		String str1 = string.trim().toLowerCase();
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			int key = str1.charAt(i);
			int value = 1;
			if (key >= 97 && key <= 122) {
				if (countMap.get(key) == null) {
					countMap.put(key, value);
				} else {
					int updateValue = countMap.get(key);
					countMap.put(key, ++updateValue);
				}
			}
		}
		int oddCount = 0;
		for (int i = 0; i < str1.length(); i++) {
			int key = str1.charAt(i);
			if (key >= 97 && key <= 122) {
				int apperances = countMap.get(key);
				if (apperances % 2 == 1) {
					oddCount++;
				}
			}
		}
		return oddCount <= 1;
	}

}
