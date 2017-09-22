/**
 * Doubly linkedlist own implementation
 */
package linkedLists;

/**
 * @author deepakkhobragade
 *
 */
public class LinkedList {

	Node head;

	public LinkedList() {
		head = null;
	}

	public void addNodeAtHead(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			newNode.next = head;
			head = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void addNodeAtTail(int data) {
		Node newNode = new Node(data);
		Node traversal = head;
		if (traversal == null) {
			addNodeAtHead(data);
		} else {
			while (traversal.next != null) {
				traversal = traversal.next;
			}
			traversal.next = newNode;
			newNode.prev = traversal;
		}
	}

	public void removeNodeFromHead() {
		head = head.next;
		head.prev = null;
	}

	public void removeNodeFromTail() {
		Node traversal = head;
		while (traversal.next.next != null) {
			traversal = traversal.next;
		}
		traversal.next = null;
	}

	public int getListSize() {
		int count = 1;
		Node traversal = head;
		while (traversal.next != null) {
			count++;
			traversal = traversal.next;
		}
		return count;
	}

	public void addNodeAtPosition(int data, int position) {
		if (position - 1 > getListSize()) {
			System.out.println("Position greater than list size!");
		} else if (position - 1 == getListSize()) {
			addNodeAtTail(data);
		} else if (position == 1) {
			addNodeAtHead(data);
		} else {
			Node newNode = new Node(data);
			Node traversal = head;
			for (int i = 1; i < position - 1; i++) {
				traversal = traversal.next;
			}
			newNode.next = traversal.next;
			newNode.prev = traversal;
			traversal.next.prev = newNode;
			traversal.next = newNode;
		}
	}

	public void removeNodeAtPosition(int position) {
		if (position > getListSize()) {
			System.out.println("Position greater than list size!");
		} else if (position == getListSize()) {
			removeNodeFromTail();
		} else if (position == 1) {
			removeNodeFromHead();
		} else {
			Node traversal = head;
			for (int i = 1; i < position - 1; i++) {
				traversal = traversal.next;
			}
			traversal.next = traversal.next.next;
		}
	}

	public void printList() {
		Node first = head;
		while (first != null) {
			System.out.print(first.data + " -> ");
			first = first.next;
		}
		System.out.print("null");
	}

}
