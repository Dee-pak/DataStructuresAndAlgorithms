/**
 * Design a Stack which, in addition to push and pop, has a function min(),
 * which would return the minimum element. 
 * Note: Push, pop, min should operate in O(1) time.
 */
package stacksAndQueues;

import java.util.EmptyStackException;

/**
 * @author deepakkhobragade
 *
 */
public class StackWithMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StackWithMin minStack = new StackWithMin();
		minStack.push(13);
		minStack.push(15);
		minStack.push(16);
		minStack.push(9);
		minStack.push(18);
		System.out.println("Min : " + minStack.min());
		minStack.peek();
		minStack.pop();
		minStack.peek();
		minStack.push(123);
		minStack.push(6);
		System.out.println("Min : " + minStack.min());
		System.out.println();
		System.out.println();
		minStack.print();
	}

	private class StackNode {
		private int data;
		private StackNode next;
		
		public StackNode(int data){
			this.data = data;
		}
	}
	
	StackNode top;
	Stack minStack = new Stack();
	public StackWithMin() {
		this.top = null;
	}
	
	public void push(int data){
		if(data <= min()){
			minStack.push(data);
		}
		StackNode newNode = new StackNode(data);
		newNode.next = top;
		top = newNode;
		System.out.println("Pushed : " + data);
	}
	
	public int pop(){
		if(top == null){
			throw new EmptyStackException();
		}
		int data = top.data;
		if(data == min()){
			minStack.pop();
		}
		top = top.next;
		System.out.println("Popped : " + data);
		return data;
	}
	
	public int peek(){
		if(top == null){
			throw new EmptyStackException();
		}
		System.out.println("Peeked : " + top.data);
		return top.data;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int min(){
		if(minStack.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return minStack.peek();
		}
	}
	
	
	public void print(){
		if(top == null){
			throw new EmptyStackException();
		}
		StackNode traversal = top;
		while( traversal != null){
			System.out.println(traversal.data);
			System.out.println("---");
			traversal = traversal.next;
		}
		
		System.out.println("-----Min Stack-----");
		minStack.print();
	}
	
}
