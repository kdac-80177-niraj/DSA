
public class List {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int val) {
			data = val;
			next = null;
			prev = null;
		}
	}
	private Node head,tail;
	
	public List() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty())
			head = tail = newNode;
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if (head.next == null) {
			head = tail = null;
		}
		else {
			tail.prev.next = null;
		}
	}
	
	public int getData() {
		return head.data;
	}
	
	public void display() {
			Node trav = head;
			while(trav!= null) {
				System.out.print(" "+trav.data);
				trav = trav.next;
			}
			System.out.println();
					
	}
}
