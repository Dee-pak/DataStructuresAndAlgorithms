/**
 * Write code to partition a linked list around a value x, such that all nodes
 * less than x come before all nodes greater than or equal to x. If x is contained
 * within the list, the values of x only need to be after the elements less than x.
 * The partition element x can appear anywhere in the "right partition"; it does
 * not need to appear between the left and right partitions
 * 
 * Example:
 * Input: 3->5->8->5->10->2->1 [partition = 5]
 * Output: 3->1->2->10->5->5->8
 */
package linkedLists;

/**
 * @author deepakkhobragade
 *
 */
public class Partition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for(int i = 1 ; i <= 15 ; i++){
			list.addNodeAtHead(i*10);
		}
		list.printList();
		System.out.println();
		partitionList1(list, 70);
	}
	
	public static void partitionList(LinkedList list, int partition){
		LinkedList smallerList = new LinkedList();
		LinkedList higherList = new LinkedList();
		Node traversal = list.head;
		while(traversal != null){
			if(traversal.data < partition){
				smallerList.addNodeAtHead(traversal.data);
			}else{
				higherList.addNodeAtHead(traversal.data);
			}
			traversal = traversal.next;
		}
		Node smallerTraversal = smallerList.head;
		while(smallerTraversal.next != null){
			smallerTraversal = smallerTraversal.next;
		}
		smallerTraversal.next = higherList.head;
		smallerList.printList();
	}
	
	public static void partitionList1(LinkedList list, int partition){
		LinkedList newList = new LinkedList();
		Node traversal = list.head;
		while(traversal != null){
			if(traversal.data < partition){
				newList.addNodeAtHead(traversal.data);
			}else{
				newList.addNodeAtTail(traversal.data);
			}
			traversal = traversal.next;
		}
		newList.printList();
	}

}
