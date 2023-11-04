public class List {
	public class Node{
		private int data;
		private Node next;
		
		public Node(int val) {
			data = val;
			next = null;
		}
	}
	private Node head = null;
	public List() {
		head = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty())
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	public void display() {
		if(isEmpty())
			System.out.println("Empty list");
		else {
			Node trav = head;
			while(trav != null) {
				System.out.print(" "+trav.data);
				trav = trav.next;
			}
			System.out.println();
		}
	}
	public void reverse() {
		Node t1 = head;
		Node t2 = head.next;
		head.next = null;
		while(head!=null) {
			head = t2.next;
			t2.next = t1;
			t1 = t2;
			t2 = head;
		}
		head = t1;
		display();
	}
}
