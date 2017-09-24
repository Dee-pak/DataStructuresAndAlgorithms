/**
 * 
 */
package stacksAndQueues;

/**
 * @author deepakkhobragade
 *
 */
public class TestStacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(13);
		stack.push(15);
		stack.push(19);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.push(99);
		stack.push(20);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}

}
