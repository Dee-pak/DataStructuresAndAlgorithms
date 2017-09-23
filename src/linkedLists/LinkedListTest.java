/**
 * Write code to remove duplicates from an unsorted linked list.
 * Follow up:
 * How would you solve this problem if a temporary buffer in not allowed?
 */
package linkedLists;

/**
 * @author deepakkhobragade
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.addNodeAtHead(13);
		linkedList.addNodeAtHead(14);
		linkedList.addNodeAtHead(15);
		linkedList.addNodeAtHead(16);
		linkedList.addNodeAtHead(17);
		linkedList.addNodeAtTail(23);
		linkedList.removeNodeFromHead();
		linkedList.printForward();
		linkedList.addNodeAtPosition(999, 3);
		System.out.println();
		linkedList.printForward();
		linkedList.removeNodeAtPosition(3);
		System.out.println();
		linkedList.printForward();
		linkedList.addNodeAtHead(27);
		System.out.println();
		linkedList.printForward();
		System.out.println();
		linkedList.removeNodeFromHead();
		linkedList.addNodeAtHead(99);
		linkedList.addNodeAtTail(200);
		linkedList.printForward();
		System.out.println();
		linkedList.removeNodeFromTail();
		linkedList.printForward();
		System.out.println();
		System.out.println(linkedList.getListSize());
		linkedList.addNodeAtPosition(999, 5);
		linkedList.printForward();
		System.out.println();
		System.out.println(linkedList.getListSize());
		linkedList.removeNodeAtPosition(4);
		linkedList.printForward();
		System.out.println();
		System.out.println(linkedList.getListSize());
	}

}
