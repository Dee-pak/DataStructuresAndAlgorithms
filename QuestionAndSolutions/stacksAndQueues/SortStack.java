/**
 * Write a program to sort a stack such that the smallest items are on the top. You can
 * use an additional temporary stack, but you may not copy the elements into any other data
 * structure (such as an array). The stack supports the following operations: push, pop, peek
 * and isEmpty.
 */
package stacksAndQueues;

/**
 * @author deepakkhobragade
 *
 */
public class SortStack {
	
	public static void sort(Stack s1){
		Stack s2 = new Stack();
		while(!s1.isEmpty()){
			int temp = s1.pop();
			while(!s2.isEmpty() && s2.peek() > temp){
				s1.push(s2.pop());
			}
			s2.push(temp);
		}
		
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(13);
		stack.push(78);
		stack.push(3);
		stack.push(9);
		stack.push(95);
		stack.push(11);
		stack.push(56);
		stack.print();
		SortStack.sort(stack);
		System.out.println("---Sorted Stack---");
		stack.print();
	}

}
