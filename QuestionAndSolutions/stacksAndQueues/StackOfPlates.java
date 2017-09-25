/**
 * Imagine a literal stack of plates. If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack
 * exceeds some threshold. Implement a data structure SetOfStacks that mimics this.
 * SetOfStacks should be composed of several stacks and should create a new Stack once
 * the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should
 * behave identically to a single stack (that is, pop() should return the same value as it
 * would if there were just a single stack).
 * FOLLOW UP
 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
 */
package stacksAndQueues;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * @author deepakkhobragade
 *
 */
public class StackOfPlates {
		
	private ArrayList<Stack> stacks = new ArrayList<Stack>();
	private int capacity;
	private static final int stackSize = 3;
	
	public StackOfPlates(int capacity) {
		this.capacity = capacity;
	}
	
	public void push(int data){
		Stack last = getLastStack();
		if(last != null && last.size() != stackSize){
			last.push(data);
		}else{
			Stack stack = new Stack();
			stack.push(data);
			stacks.add(stack);
		}
	}
	
	public int pop(){
		Stack last = getLastStack();
		if(last == null){
			throw new EmptyStackException();
		}
		int data = last.pop();
		if(last.size() == 0){
			stacks.remove(stacks.size() - 1);
		}
		return data;
	}
	
	public Stack getLastStack(){
		if(stacks.size() == 0){
			return null;
		}
		return stacks.get(stacks.size() - 1);
	}
	
	
	//main
	public static void main(String[] args){
		StackOfPlates stack = new StackOfPlates(3);
		stack.push(13);
		stack.push(15);
		stack.push(17);
		stack.push(18);
		stack.push(21);
		stack.pop();
		stack.pop();
		stack.pop();
	}
	
}

