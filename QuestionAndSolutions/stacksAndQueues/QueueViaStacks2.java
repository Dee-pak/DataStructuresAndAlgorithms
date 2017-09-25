/**
 * Implement a MyQueue class which implements a queue using two stacks.
 */
package stacksAndQueues;

/**
 * @author deepakkhobragade
 *
 */
public class QueueViaStacks2 {
	
	private Stack stackNewest, stackOldest;
	
	
	public QueueViaStacks2() {
		stackNewest = new Stack();
		stackOldest = new Stack();
	}
	
	public int size(){
		return stackNewest.size() + stackOldest.size();
	}
	
	public void enqueue(int data){
		stackNewest.push(data);
	}
	
	public void shiftStacks(){
		if(stackOldest.isEmpty()){
			while(!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public int peek(){
		shiftStacks();
		return stackOldest.peek();
	}
	
	public int dequeue(){
		shiftStacks();
		return stackOldest.pop();
	}
	
	public void print(){
		//stackNewest.print();
		System.out.println("----");
		stackOldest.print();
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueViaStacks2 queue = new QueueViaStacks2();
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		queue.enqueue(17);
		queue.enqueue(18);
		queue.enqueue(19);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(37);
		queue.enqueue(48);
		queue.enqueue(59);
		queue.peek();
		//queue.print();
	}

}
