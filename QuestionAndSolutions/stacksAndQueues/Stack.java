/**
 * Own implementation of stack
 */
package stacksAndQueues;

import java.util.EmptyStackException;

/**
 * @author deepakkhobragade
 *
 */
public class Stack {
	
	private static class StackNode{
		private int data;
		private StackNode next;
		
		public StackNode(int data){
			this.data = data;
		}
	}
	
	StackNode top;
	public Stack(){
		this.top = null;
	}
	
	public void push(int data){
		StackNode newNode = new StackNode(data);
		newNode.next = top;
		top = newNode;
	}
	
	public int pop(){
		if(top == null){
			throw new EmptyStackException();
		}else{
			int data = top.data;
			top = top.next;
			return data;
		}
	}
	
	public int peek(){
		return top.data;
	}
	
	public boolean isEmpty(){
		return top == null;
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
	}

}
