/**
 * Implement a MyQueue class which implements a queue using two stacks.
 */
package stacksAndQueues;

import java.util.Stack;

/**
 * @author deepakkhobragade
 *
 */
public class QueueViaStacks {
	
	
	private Stack<Integer> stack = new Stack<>();
	
	public void enqueue(int data){
		stack.push(data);
	}
	
	public int dequeue(){
		return stack.remove(0);
	}
	
	public void print(){
		System.out.print("Out");
		for( Integer data : stack){
			System.out.print("<-" + data);
		}
		System.out.println("<-In");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueViaStacks queue = new QueueViaStacks();
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		queue.enqueue(17);
		queue.print();
		queue.dequeue();
		queue.dequeue();
		System.out.println();
		queue.print();
	}

}
