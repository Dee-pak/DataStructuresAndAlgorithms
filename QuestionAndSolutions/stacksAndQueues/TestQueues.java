/**
 * 
 */
package stacksAndQueues;

/**
 * @author deepakkhobragade
 *
 */
public class TestQueues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(17);
		queue.enqueue(18);
		queue.printQueue();
		queue.dequeue();
		queue.dequeue();
		System.out.println();
		queue.printQueue();
		System.out.println();
		System.out.println(queue.peek());
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.isEmpty());
	}

}
