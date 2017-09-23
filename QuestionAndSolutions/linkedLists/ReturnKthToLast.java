/**
 * Implement an algorithm to find the Kth to last element of singly linked list.
 */
package linkedLists;

/**
 * @author deepakkhobragade
 *
 */
public class ReturnKthToLast {

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
		int KthToLast = returnKthToLastIteratively(list, 3);
		//int KthToLast = printKthToLastElement(list.head, 3);
		System.out.println();
		System.out.println(KthToLast);
	}

	//if size can be calculated
	private static int returnKthToLast(LinkedList list, int K) {
		int listSize = list.getListSize();
		Node traversal = list.head;
		for(int i = 1 ; i < listSize - K ; i++){
			traversal = traversal.next;
		}
		return traversal.next.data;
	}
	
	private static int printKthToLastElement(Node head, int K){
		if(head == null){
			return 0;
		}
		int index = printKthToLastElement(head.next, K) + 1;
		if(index == K){
			System.out.println(K + "th to last node : " + head.data);
		}
		return index;
	}
	
	private static int returnKthToLastIteratively(LinkedList list, int K){
		Node p1 = list.head;
		Node p2 = list.head;
		for( int i = 1 ; i < K ; i++){
			p2 = p2.next;
		}
		
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1.data;
	}

}
