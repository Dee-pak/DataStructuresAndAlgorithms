/**
 * Assume you have a method isSubstring() which checks if one word is a substring
 * of another. Given two strings s1 and s2, write code to check if s2 is a rotation
 * of s1 using only one call to isSubstring (e.g. "waterbottle" is a rotation of
 * "erbottlewat"
 */
package arraysAndStrings;

/**
 * @author deepakkhobragade
 *
 */
public class StringRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isRotation("waterbottle", "erbottlewat"));
	}

	private static boolean isRotation(String string1, String string2) {
		int len = string1.length();
		if (len == string2.length() && len > 0) {
			String s1s1 = string1 + string1;
			return isSubstring(s1s1, string2);
		}
		return false;
	}

	private static boolean isSubstring(String s1s1, String s2) {
		int i = s1s1.indexOf(s2);
		if (s1s1.indexOf(s2) >= 0) {
			return true;
		} else {
			return false;
		}
	}

}
