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

	private  Node tail;
	public List() {
		this.tail = null;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			tail = newNode ;
			newNode.next=newNode;
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("List empty");
		}
		else if(tail.next == tail) {
			tail = null;
		}
		else {
			tail.next = tail.next.next;
		}
	}
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			tail = newNode;
			newNode.next = newNode;
		}else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void deleteLast() {
		if(isEmpty())
			System.out.println("List Empty");
		else if(tail.next == tail) {
			tail = null;
		}
		else {
			Node trav = tail;
			while(trav.next != tail) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
	}
	
	public void addPosition(int val,int pos) {
		
	}
	
	public void displayList() {
		Node trav = tail;
		if(isEmpty())
			System.out.println("List is empty");
		else {
			do {
				trav = trav.next;
				System.out.print(" "+trav.data);
			} while (trav!= tail);
		}
	}
	
	
}
