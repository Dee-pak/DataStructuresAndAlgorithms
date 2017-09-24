/**
 * Describe how you could use a single array to implement three stacks.
 */
package stacksAndQueues;

/**
 * @author deepakkhobragade
 *
 */
public class ThreeInOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreeInOne x = new ThreeInOne(3);
	}
	
	
	private int numOfStacks = 3;
	private int arraySize;
	private int stackSize;
	
	public ThreeInOne(int stackSize){
		this.stackSize = stackSize;
		this.arraySize = stackSize * numOfStacks;
	}

}
