/**
 * Given two (singly) linked lists, determine if the two lists intersect. 
 * Return the intersecting node. Note that the intersection is defined
 * based on the reference, not value. That is, if the Kth node of the
 * first linked list is the exact same node (by reference) as the Jth node
 * of the second linked list, then they are intersecting.
 */
package linkedLists;

/**
 * @author deepakkhobragade
 *
 */
public class IntersectingLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.addNodeAtHead(5);
		l1.addNodeAtHead(10);
		l1.addNodeAtHead(20);
		l1.addNodeAtHead(30);
		l1.addNodeAtHead(40);
		l1.addNodeAtHead(50);
		

		//l2.head = l1.head.next.next;
		l2.addNodeAtHead(60);
		l2.addNodeAtHead(50);
		l2.addNodeAtHead(90);
		l2.addNodeAtHead(80);
		l2.addNodeAtHead(70);
		
		l1.printForward();
		System.out.println();
		l2.printForward();
		System.out.println();
		try{
			System.out.println("Intersecting Node: " + intersectingLists(l1, l2).data);
		}catch (NullPointerException e) {
			System.out.println("Linked lists does not intersect.");
		}
	}
	
	public static Node intersectingLists(LinkedList l1, LinkedList l2){
		int size1 = l1.getListSize();
		int size2 = l2.getListSize();
		int diff = size1 - size2;
		diff = Math.abs(diff);
		LinkedList shorter = size1 < size2 ? l1 : l2;
		LinkedList longer = size1 > size2 ? l1 : l2;
		for(int i = 0 ; i < diff ; i++){
			longer.head = longer.head.next;
		}
		Node tLonger = longer.head;
		Node tShorter = shorter.head;
		while( tLonger != null || tShorter != null){
			if(tLonger == tShorter){
				return tShorter;
			}
			tLonger = tLonger.next;
			tShorter = tShorter.next;
		}
		return null;
	}

}
