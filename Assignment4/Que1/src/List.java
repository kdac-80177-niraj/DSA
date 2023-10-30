import java.util.*;
public class List {
	public class Node{
		private int data;
		private Node next,prev;
		public Node(int val) {
			data = val;
			next = null;
			prev = null;
		}
	}
	
	private Node head;
	private Node tail=null;
	
	public boolean isEmpty() {
		return head == null;
	}
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = tail = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			System.out.println("List is empty");
		else {
			head = head.next;
		}
	}
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(isEmpty())
			head = tail = newNode; 
		else {
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	public void deleteLast() {
		if(isEmpty())
			System.out.println("List is empty");
		else if(head.next == null)
			head = null;
		else {
			Node trav = head;
			while(trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
			tail = trav;
		}
	}
	
	public void addPosition(int value,int pos) {
		Node newNode = new Node(value);
		if(isEmpty())
			head = newNode;
		else if(pos<=1)
			addFirst(value);
		else {
			Node trav = head;
			for(int i = 1 ; i < pos-1 && trav.next != null; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}
	
	public void deletePosition(int pos) {
		if(isEmpty())
			System.out.println("List is empty");
		else if(pos<=1)
			deleteFirst();
		else if(head.next == null)
			head = null;
		else {
			Node trav = head;
			for(int i = 0 ; i < pos-1 && trav.next.next != null ; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}
	
	public void displayList() {
		Node trav = head;
		System.out.println("List: ");
		while(trav!=null) {
			System.out.println(" "+trav.data);
			trav = trav.next;
		}
		System.out.println(" ");
	}
}
