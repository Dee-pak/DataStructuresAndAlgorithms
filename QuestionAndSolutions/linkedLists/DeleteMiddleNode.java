/**
 * Implement an Algorithm to delete a node in the middle 
 * (i.e. any node but the first and last node, not necessarily the exact
 * middle) of a singly linked list, given only access to that node.
 * Example:
 * Input: the node c from linked list a->b->c->d->e->f
 * Result: new linked list a->b->d->->e->f
 */
package linkedLists;

/**
 * @author deepakkhobragade
 *
 */
public class DeleteMiddleNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addNodeAtHead(17);
		list.addNodeAtHead(16);
		list.addNodeAtHead(23);
		list.addNodeAtHead(34);
		list.addNodeAtHead(39);
		list.addNodeAtHead(12);
		list.addNodeAtHead(13);
		list.addNodeAtHead(354);
		list.addNodeAtHead(13);
		list.addNodeAtHead(523);
		list.addNodeAtHead(19);
		list.addNodeAtHead(16);
		list.addNodeAtHead(398);;
		list.addNodeAtHead(13);
		list.addNodeAtHead(3);
		list.printForward();
		System.out.println();
		Node nodeToDelete = list.head.next.next.next.next;
		System.out.println("Node to delete: " + nodeToDelete.data);
		deleteMiddleNode(nodeToDelete);
		list.printForward();
	}
	
	public static boolean deleteMiddleNode(Node node){
		if(node == null || node.next == null){
			return false;
		}
		Node next = node.next;
		node.data = next.data;
		node.next = next.next;
		return true;
	}

}
