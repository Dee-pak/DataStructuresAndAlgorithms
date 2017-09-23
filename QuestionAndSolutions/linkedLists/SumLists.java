/**
 * 
 */
package linkedLists;

/**
 * @author deepakkhobragade
 *
 */
public class SumLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addNodeAtHead(6);
		list1.addNodeAtHead(1);
		list1.addNodeAtHead(7);
		LinkedList list2 = new LinkedList();
		list2.addNodeAtHead(2);
		list2.addNodeAtHead(9);
		list2.addNodeAtHead(5);
		list1.printForward();
		System.out.println();
		list2.printForward();
		LinkedList sumList = addListForward(list1, list2);
		System.out.println();
		sumList.printForward();
	}
	
	public static LinkedList addLists(LinkedList l1, LinkedList l2){
		int carry = 0;
		Node traversalL1 = l1.head;
		Node traversalL2 = l2.head;
		LinkedList sumList = new LinkedList();
		while(traversalL1 != null || traversalL2 != null || carry != 0){
			int sum = 0;
			if(traversalL1 != null){
				sum = traversalL1.data;
				traversalL1 = traversalL1.next;
			}
			if(traversalL2 != null){
				sum += traversalL2.data;
				traversalL2 = traversalL2.next;
			}
			int sumNode = sum%10 + carry;
			sumList.addNodeAtTail(sumNode);
			carry = sum/10;
		}
		return sumList;
	}
	
	public static LinkedList addListForward(LinkedList l1, LinkedList l2){
		int carry = 0;
		Node t1 = l1.head;
		Node t2 = l2.head;
		LinkedList sumList = new LinkedList();
		while(t1.next != null){
			t1 = t1.next;
		}
		while(t2.next != null){
			t2 = t2.next;
		}
		while( t1 != null || t2 != null || carry != 0){
			int sum = 0;
			if(t1 != null){
				sum = t1.data;
				t1 = t1.prev;
			}
			if(t2 != null){
				sum += t2.data;
				t2 = t2.prev;
			}
			int sumNode = sum%10 + carry;
			sumList.addNodeAtHead(sumNode);
			carry = sum/10;
		}
		return sumList;
	}

}
