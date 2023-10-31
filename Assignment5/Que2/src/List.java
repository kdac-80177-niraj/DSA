
public class List {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node() {
			
		}
		public Node(int val) {
			data = val;
		}

		public int getData() {
			return data;
		}		
		
	}
	
	
	public int getD() {
		return head.data;
	}
	
	private Node head;
	
	public List() {
		head = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
			head.next = newNode;
			head.prev = newNode;
		}
		else {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head = newNode;
		}
	}
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
			head.next = newNode;
			head.prev = newNode;
		}
		else {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty()) {
			return;
		}
		else if(head.next == head) {
			head = null;
		}
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}
	
	public void addPosition(int val,int pos) {
		Node newNode = new Node(val);
		if(isEmpty())
			head = newNode;
		else {
			Node trav = head;
			for(int i = 1 ; i < pos-1 ; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			newNode.prev = trav;
			trav.next = newNode;
			newNode.next.prev = newNode;
		}
	}
	
	public void deletePosition(int pos) {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			Node trav = head;
			for(int i = 1 ; i < pos-1 ; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
			trav.next.next.prev = trav;
		}
	}
	
	public void fDisplay() {
		if(isEmpty())
			return;
		Node trav = head;
		do {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}while(trav!=head);
		System.out.println();
	}
}
