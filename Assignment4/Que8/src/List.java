import java.util.*;
public class List {
	public class Node{
		private int data;
		private Node next;
		
		public Node(int val) {
			data = val;
			next = null;
		}
	}
	
	private Node head;
	
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int val) {
		Node nn = new Node(val);
		if(isEmpty())
			head = nn;
		else {
			nn.next = head;
			head = nn;
		}
		Node trav = head;
		for(Node i = head ; i != null ; i = i.next) {
			for(Node j = head ; j.next != null ; j = j.next) {
				if(j.data>j.next.data) {
					int temp = j.data;
					j.data = j.next.data;
					j.next.data = temp;
				}
			}
		}
	}
	
	public void display() {
		if(isEmpty())
			return;
		else {
			Node trav = head;
			while(trav!=null) {
				System.out.println(" "+trav.data);
				trav = trav.next;
			}
			System.out.println();
		}
	}
}
