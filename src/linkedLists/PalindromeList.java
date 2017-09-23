/**
 * Implement a function to check if a linked list is a palindrome
 */
package linkedLists;

import java.util.Stack;

/**
 * @author deepakkhobragade
 *
 */
public class PalindromeList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNodeAtHead(1);
		list.addNodeAtHead(2);
		list.addNodeAtHead(3);
		list.addNodeAtHead(3);
		list.addNodeAtHead(2);
		list.addNodeAtHead(1);
		System.out.println(isPalindrome1(list));
	}
	
	public static boolean isPalindrome(LinkedList list){
		list.printForward();
		System.out.println();
		Node traversal = list.head;
		LinkedList reversedList = new LinkedList();
		while(traversal.next != null){
			traversal = traversal.next;
		}
		while(traversal != null){
			reversedList.addNodeAtTail(traversal.data);
			traversal = traversal.prev;
		}
		while(list.head != null){
			if(list.head.data != reversedList.head.data){
				return false;
			}
			list.head = list.head.next;
			reversedList.head = reversedList.head.next;
		}
		return true;
	}
	
	//slow and fast runner technique
	public static boolean isPalindrome1(LinkedList list){
		Node fast = list.head;
		Node slow = list.head;
		Stack<Integer> stack = new Stack<>();
		while(fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		//skip the middle element
		if(fast != null){
			slow = slow.next;
		}
		while(slow != null){
			int data = stack.pop();
			if(data != slow.data){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}

}
