/**
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit
 * (or zero edits) away.
 * Example:
 * pale, ple -> true
 * pales, pale -> true
 * pale
 */
package arraysAndStrings;

/**
 * @author deepakkhobragade
 *
 */
public class OneAway {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(isOneAway("kdeepak", "deepak"));
		
	}
	
	private static boolean isOneAway(String string1, String string2){
		String first = string1.trim().toLowerCase();
		String second = string2.trim().toLowerCase();
		if(first.length() == second.length())
			return checkReplacement(first, second);
		else if(first.length() + 1 ==  second.length())
			return checkInsertion(first, second);
		else if(first.length() - 1 ==  second.length())
			return checkInsertion(second, first);
		return false;
	}
	
	private static boolean checkReplacement(String first, String second){
		boolean foundDifference = false;
		for(int i = 0 ; i < first.length() ; i++){
			if(first.charAt(i) != second.charAt(i)){
				if(foundDifference){
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}
	
	private static boolean checkInsertion(String smaller, String larger){
		int index1 = 0, index2 = 0;
		while(index2 < larger.length() && index1 < smaller.length()){
			if(smaller.charAt(index1) != larger.charAt(index2)){
				if(index1 != index2){
					return false;
				}
				index2++;
			}else{
				index1++;
				index2++;
			}
		}
		return true;
	}

}
