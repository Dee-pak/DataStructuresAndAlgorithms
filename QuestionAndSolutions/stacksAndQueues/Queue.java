/**
 * 
 */
package stacksAndQueues;

import java.util.NoSuchElementException;

/**
 * @author deepakkhobragade
 *
 */
public class Queue {
	
	private static class QueueNode{
		private int data;
		private QueueNode next;
		
		public QueueNode(int data) {
			this.data = data;
		}
	}
	
	QueueNode first;
	QueueNode last;
	
	public Queue() {
		first = null;
		last = null;
	}
	
	public void enqueue(int data){
		QueueNode newNode = new QueueNode(data);
		if(last != null){
			last.next = newNode;
		}
		last = newNode;
		if(first == null){
			first = last;
		}
	}
	
	public int dequeue(){
		int data;
		if(first == null){
			System.out.println("Queue is Empty!");
			throw new NoSuchElementException();
		}else if(first.next == null){
			data = first.data;
			first = null;
		}else{
			data = first.data;
			first = first.next;
		}
		return data;
	}
	
	public int peek(){
		if(first == null){
			throw new NoSuchElementException();
		}else{
			return first.data;
		}
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void printQueue(){
		if(first == null){
			System.out.println("Queue is empty!");
		}else{
			QueueNode traversal = first;
			System.out.print("first->");
			while(traversal != null){
				System.out.print(traversal.data + "->");
				traversal = traversal.next;
			}
			System.out.print("last");
		}
	}
	
}
