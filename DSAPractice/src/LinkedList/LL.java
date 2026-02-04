package LinkedList;

public class LL {
	
	Node head;
	private int size;
	
	LL() {
		this.size = 0;
	}
	
	
	class Node {
		
		String data;
		Node next;
		
		Node(String data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			size++;
			return;
		} 
		
		newNode.next = head;
		head = newNode;
		size++;
		
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode ;
			size++;
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		size++;
		
	}
	
//	deleting first and last
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty!");
			return;
		}
		
		head = head.next;
		size--;
	}
	
	public void deleteLast() {
		Node currentNode = head;
		Node secondLastNode = null;
		
		while(currentNode.next != null) {
			secondLastNode = currentNode;
			currentNode = currentNode.next;
		}
		
		secondLastNode.next = null;
		size--;
	}
	
	public void getSize() {
		System.out.println("Size of list is " + size);
	}
	
	public void printLL() {
		if(head == null) {
			System.out.println("List is empty");
		}
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LL list = new LL();
	    
		list.addFirst("C");
		list.addFirst("B");
		list.printLL();
		list.getSize();
		list.addFirst("A");
		list.addLast("D");
		list.printLL();
		list.getSize();
		list.addLast("E");
		list.printLL();
		list.getSize();
		list.deleteFirst();
		list.printLL();
		list.getSize();
        list.deleteLast();
        list.printLL();
        list.getSize();
	}

}
