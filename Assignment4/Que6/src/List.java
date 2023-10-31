import java.util.*;
public class List {
	public class Node{
		private int data;
		private Node next;
		
		public Node() {
			
		}
		
		public Node(int val) {
			data = val;
			next = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
	}
	private Node head = null;
	int count;
	public List() {
		head = null;
		count = 0;
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
		count++;
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
	public int getDataNode() {
		Node n = new Node();
		return n.getData();
	}
//	public void reverse() {
//		Node t1 = head;
//		Node t2 = head.next;
//		head.next = null;
//		while(head!=null) {
//			head = t2.next;
//			t2.next = t1;
//			t1 = t2;
//			t2 = head;
//		}
//		head = t1;
//		display();
//	}
	public void bubbleSort(List l1) {
		for(Node i = head ; i != null ; i = i.next) {
			for(Node j = head ; j.next != null ; j = j.next) {
				if(j.data > j.next.data) {
					int temp = j.data;
					j.data = j.next.data;
					j.next.data = temp;
				}
			}
		}
		display();
	}
}
