/**
 * 
 */
package stacksAndQueues;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author deepakkhobragade
 *
 */
public class StackOfPlates2 {
	
	
	private static final int STACK_SIZE = 3;
	private LinkedList<Stack<Integer>> stacks = new LinkedList<>();
	
	public void push(int data){
		if(stacks.isEmpty() || stacks.getLast().size() == STACK_SIZE){
			//Stack newStack = new Stack();
			Stack<Integer> newStack = new Stack<>();
			newStack.push(data);
			stacks.add(newStack);
		}else{
			stacks.getLast().push(data);
		}
	}
	
	public int pop(){
		if(stacks.isEmpty() || stacks.getLast().isEmpty()){
			throw new EmptyStackException();
		}else{
			Stack<Integer> last = stacks.getLast();
			int data = last.pop();
			if(last.isEmpty()){
				stacks.removeLast();
			}
			return data;
		}
	}
	
	public int popAt(int index){
		if(stacks.isEmpty()){
			throw new EmptyStackException();
		}
		if(index < 0 || index >= stacks.size()){
			throw new IllegalArgumentException("Invalid Index!");
		}
		int data = stacks.get(index).pop();
		for(int i = index ; i < stacks.size() -1 ; ++i){
			Stack<Integer> curr = stacks.get(i);
			Stack<Integer> next = stacks.get(i + 1);
			curr.push(next.remove(0));
		}
		if(stacks.getLast().isEmpty()){
			stacks.removeLast();
		}
		return data;
	}
	
	public void printStacks(){
		for(Stack<Integer> stack : stacks){
			for(int data : stack){
				System.out.println(data + " ");
			}
			System.out.println("---");
		}
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackOfPlates2 setOfStacks = new StackOfPlates2();
		setOfStacks.push(1); 
		setOfStacks.push(2); 
		setOfStacks.push(3);
		
        setOfStacks.push(4); 
        setOfStacks.push(5); 
        setOfStacks.push(6);
        
        setOfStacks.push(7); 
        setOfStacks.push(8); 
        setOfStacks.push(9);
        setOfStacks.printStacks();
        System.out.println();
        setOfStacks.popAt(1);
        setOfStacks.printStacks();
        setOfStacks.popAt(0);
        setOfStacks.popAt(0);
        setOfStacks.printStacks();
	}

}
