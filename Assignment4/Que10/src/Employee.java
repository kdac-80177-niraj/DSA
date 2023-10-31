import java.util.*;
public class Employee {
	public class Node{
		//private Employee data;
		private Node next;
		private int id;
		private String name;
		private double sal;
		
		public Node(int id, String name, double sal) {
			this.id = id;
			this.name = name;
			this.sal = sal;
			next = null;
		}
	}
	
	Scanner sc = new Scanner(System.in);
	private Node head;
	public Employee() {
		super();
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void add(int id, String name, double sal) {
		Node nn = new Node(id,name,sal);
		if(isEmpty())
			head = nn;
		else {
			nn.next = head;
			head = nn;
		}
	}
	
	public void search(String key) {
		if(isEmpty()) {
			System.out.println("No data.");
		}
		else {
			Node trav = head;
			while(trav!=null) {
				if(key.equals(trav.name)) {
					System.out.print("\nId: "+trav.id+" ,Name: "+trav.name+" ,Salary: "+trav.sal);
					break;
				}
				trav = trav.next;
			}
		}
	}
	
	public void delete(int id) {
		int pos = 0;
		if(isEmpty())
			System.out.println("No data.");
		else {
			Node trav = head;
			while(trav != null) {
				if(id == trav.id) {
					break;
				}
				trav = trav.next;
				pos++;
			}
				if(pos<=1) {
					head = null;
				}
				else {
					Node trav1 = head;
					for(int i = 1 ; i < pos ; i++) {
						trav1 = trav1.next;
					}
					trav.next = trav.next.next;
				}
			}
	}
	
	public void update(int id) {
		
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("No data.");
		else {
			Node trav = head;
			while(trav!=null) {
				System.out.print("\nId: "+trav.id+" ,Name: "+trav.name+" ,Salary: "+trav.sal);
				trav = trav.next;
			}
			System.out.println();
		}
	}
}
