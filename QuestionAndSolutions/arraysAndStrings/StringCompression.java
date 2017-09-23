/**
 * Implement a method to perform basic string compression using the 
 * counts of repeated characters.For example, the string aabcccccaa 
 * would become a2b1c5a3. If the "compressed" string would not smaller 
 * than the original string, your method should return the original string. 
 * You can assume the string has only upper and lower case letters(a-z).
 */
package arraysAndStrings;

/**
 * @author deepakkhobragade
 *
 */
public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(compressString("aabbbccccdddddaaaaaaaaaaaaa"));
	}
	
	private static String compressString(String string){
		StringBuffer strBuffer = new StringBuffer();
		char lastChar = string.charAt(0);
		int count = 1;
		for( int i = 1 ; i < string.length() ; i++ ){
			if(string.charAt(i) == lastChar){
				count++;
			}else{
				strBuffer.append(lastChar);
				strBuffer.append(count);
				lastChar = string.charAt(i);
				count = 1;
			}
		}
		strBuffer.append(lastChar);
		strBuffer.append(count);
		return strBuffer.toString();
	}

}
