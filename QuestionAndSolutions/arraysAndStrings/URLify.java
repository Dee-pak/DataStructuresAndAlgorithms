/**
 * Write a method to replace all spaces in a string with "%20". You may assume that the
 * string has sufficient space at the end of the string to hold the additional characters,
 * and that you are given the "true" length of the string. (Note: if implementing in Java,
 * please use a character array so that you can perform this operation in place.)
 */
package arraysAndStrings;

/**
 * @author deepakkhobragade
 *
 */
public class URLify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(urlify("Mr John Smith Spec tar", 22));
		
	}

	private static String urlify(String string, int length) {
		char[] charArray = string.toCharArray();
		int spaceCount = 0;
		for(int i = 0 ; i < length ; i++){
			if(charArray[i] == ' '){
				spaceCount++;
			}
		}
		int newLength = spaceCount*2 + length;
		char[] newString = new char[newLength];
		int j = 0;
		boolean flag = false;
		for(int i = 0 ; i < length ; i++){
			if(charArray[i] == ' '){
				newString[j] = '%';
				newString[j+1] = '2';
				newString[j+2] = '0';
				j=j+3;
				flag = true;
			}else if(flag){
				newString[j++] = charArray[i];
				flag = false;
			}else{
				newString[j++] = charArray[i];
			}
		}
		return new String(newString);
	}

}
