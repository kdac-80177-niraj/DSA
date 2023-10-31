import java.util.*;
public class List {
	public class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
		
	}
	
	private Node head;

	public List() {
		this.head = null;
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
	
	public void middleNode() {
		Node f  = head;
		Node s = head;
		while(f != null && f.next != null) {
			f = f.next.next;
			s = s.next;
		}
		System.out.println(" Middle key: "+s.data);
	}
	
	public void displayList() {
		if(isEmpty())
			System.out.println("List is empty");
		else {
			System.out.println(" List: ");
			Node trav = head;
			while(trav!= null) {
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
			System.out.println();
		}
	}
	
}
