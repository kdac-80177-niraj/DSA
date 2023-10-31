
public class Dequeue {
	List l1;
	public Dequeue() {
		l1 = new List();
	}
	
	public boolean isEmpty() {
		return l1.isEmpty();
	}
	
	public void offer(int val) {
		l1.addFirst(val);
	}
	
	public void poll() {
		l1.deleteLast();
	}
	
	public int peek() {
		return l1.getData();
	}
	
	public void display() {
		l1.display();
	}
}
