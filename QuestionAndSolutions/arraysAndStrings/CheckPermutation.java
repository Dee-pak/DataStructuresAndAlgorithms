/**
 * Given two strings write a method to decide if one is a permutation of other.
 */
package arraysAndStrings;

/**
 * @author deepakkhobragade
 *
 */
public class CheckPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String string1 = "abcdeppppp";
		String string2 = "pppppcdbae";
		System.out.println(checkPermutation2(string1, string2));
	}

	//Solution1
	private static boolean checkPermutation(String string1, String string2) {
		if(string1.trim().length() != string2.trim().length()){
			return false;
		}
		char[] charArr1 = string1.toCharArray();
		char[] charArr2 = string2.toCharArray();
		java.util.Arrays.sort(charArr1);
		java.util.Arrays.sort(charArr2);
		return new String(charArr1).equals(new String(charArr2)); 
	}
	
	//Solution2
	private static boolean checkPermutation1(String string1, String string2){
		String str1 = string1.toLowerCase().trim();
		String str2 = string2.toLowerCase().trim();
		if(str1.length() != str2.length()){
			return false;
		}
		int string1Sum = 0;
		int string2Sum = 0;
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		for( int i = 0 ; i < str1.length() ; i++){
			int value = charArray1[i];
			string1Sum += value;
		}
		for( int i = 0 ; i < str2.length() ; i++){
			int value = charArray2[i];
			string2Sum += value;
		}
		return string1Sum == string2Sum;
	}
	
	//Solution3
	private static boolean checkPermutation2(String string1, String string2){
		String str1 = string1.toLowerCase().trim();
		String str2 = string2.toLowerCase().trim();
		int[] charCountArray = new int[256];
		char[] charArray1 = str1.toCharArray();
		for( Character c : charArray1){
			charCountArray[c]++;
		}
		char[] charArray2 = str2.toCharArray();
		for( Character c : charArray2){
			charCountArray[c]--;
			if(charCountArray[c] < 0){
				return false;
			}
		}
		return true;
	}

}
