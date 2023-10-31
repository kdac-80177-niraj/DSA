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
	}
	
	public void addAtPosition(int val,int pos) {
		Node nn = new Node(val);
		if(isEmpty())
			head = nn;
		else if(pos <= 1)
			addFirst(val);
		else {
			Node trav = head;
			for(int i = 1 ; i < pos-1 ; i++) {
				trav = trav.next;
			}
			nn.next = trav.next;
			trav.next = nn;
		}
	}
	
	public void addBeforePosition(int val,int pos) {
		Node nn = new Node(val);
		if(isEmpty())
			head = nn;
		else if(pos <= 1)
			addFirst(val);
		else {
			Node trav = head;
			for(int i = 1 ; i < pos-2 ; i++) {
				trav = trav.next;
			}
			nn.next = trav.next;
			trav.next = nn;
		}
	}
	
	public void minMax() {
		int min = 1,max = 2;
		Node trav = head;
		while(trav != null) {
			if(min>trav.data)
				min = trav.data;
			if(max<trav.data)
				max = trav.data;
			trav = trav.next;
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
	
	public void display() {
		if(isEmpty())
			return;
		else {
			Node trav = head;
			System.out.println("Singly linear linked list: ");
			while(trav!=null) {
				System.out.print(" "+trav.data);
				trav = trav.next;
			}
			System.out.println();
		}
	}
}
