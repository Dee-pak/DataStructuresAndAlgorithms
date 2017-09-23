/**
 * Given a circular linked list, implement an algorithm that returns the node
 * at the beginning of the loop.
 * Example:
 * Input: A->B->C->D->E->C [the same as earlier]
 * Output: C
 */
package linkedLists;

/**
 * @author deepakkhobragade
 *
 */
public class LoopDetection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNodeAtHead(11);
		list.addNodeAtHead(12);
		list.addNodeAtHead(13);
		list.addNodeAtHead(14);
		list.addNodeAtHead(15);
		list.addNodeAtHead(16);
		System.out.println();
		Node tail = list.getTail();
		tail.next = list.head.next.next;
		list.printForward();
		try{
			System.out.println(detectLoop(list).data);
		}catch (NullPointerException e) {
			System.out.println("No loop detected.");
		}
	}
	
	public static Node detectLoop(LinkedList list){
		Node slow = list.head;
		Node fast = list.head;
		while(slow != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				break;
			}
		}
		
		if(slow == null || slow.next == null){
			return null;
		}
		
		slow = list.head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}

}
