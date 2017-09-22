/**
 * Write code to remove duplicates from an unsorted linked list.
 * Follow up:
 * How would you solve this problem if a temporary buffer in not allowed?
 * 
 */
package linkedLists;

import java.util.HashSet;

/**
 * @author deepakkhobragade
 *
 */
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNodeAtHead(17);
		list.addNodeAtHead(16);
		list.addNodeAtHead(3);
		list.addNodeAtHead(3);
		list.addNodeAtHead(3);
		list.addNodeAtHead(12);
		list.addNodeAtHead(13);
		list.addNodeAtHead(3);
		list.addNodeAtHead(13);
		list.addNodeAtHead(3);
		list.addNodeAtHead(19);
		list.addNodeAtHead(16);
		list.addNodeAtHead(3);;
		list.addNodeAtHead(13);
		list.addNodeAtHead(3);
		list.printList();
		removeDuplicates1(list);
		System.out.println();
		list.printList();
	}
	
	public static void removeDuplicates(LinkedList list){
		HashSet<Integer> set =  new HashSet<>();
		Node traversal = list.head;
		while(traversal != null){
			if(set.contains(traversal.data)){
				traversal.prev.next = traversal.next;
				traversal.next.prev = traversal.prev;
			}else{
				set.add(traversal.data);
			}
			traversal = traversal.next;
		}
	}
	
	//without buffer
	public static void removeDuplicates1(LinkedList list){
		Node slow = list.head;
		while(slow != null){
			Node fast = slow;
			while(fast.next != null){
				if(fast.next.data == slow.data){
					fast.next = fast.next.next;
				}else{
					fast = fast.next;
				}
			}
			slow = slow.next;
		}
	}

}
