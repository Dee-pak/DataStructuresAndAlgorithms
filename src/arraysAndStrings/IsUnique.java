/**
 *Implement an Algorithm to determine if a String has all unique characters.
 *What if you cannot use additional Data Structures
 **/
package arraysAndStrings;

/**
 * @author deepakkhobragade
 *
 */
public class IsUnique {
	
	public static void main(String[] args){
		System.out.println(isUnique("a bcdeefghijklmnopqrstuvwxyz!"));
	}

	private static boolean isUnique(String stringToCheck) {
		if(stringToCheck.length() > 128){
			return false;
		}
		
		boolean[] boolArray = new boolean[256];
		for( int i = 0 ; i < stringToCheck.length() ; i++ ){
			int value = stringToCheck.charAt(i);
			System.out.println(value);
			if(boolArray[value]){
				return false;
			}
			boolArray[value] = true;
		}
		return true;
	}
	
}

