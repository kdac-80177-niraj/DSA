class StackSorted{
	private int data[];
	private int size;
	private int top;
	private int max;
	public StackSorted(int s) {
		size = s;
		top = -1;
		data = new int[size];
		max = data[0];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == size-1;
	}
	public void push(int val) {
		if(isFull())
			return;
		else {
			top++;
			data[top] = val;
			if(val > max) {
				max = val;
			}
		}
	}
	public void pop() {
		if(isEmpty()) {
			return;
		}
		else {
			int val = data[top];
			System.out.println("Popped element: "+val);
		}
	}
	
	public void peek() {
		System.out.println(data[top]);
	}
	
	
	
	public void maxElement() {
		System.out.println("Max element is: "+max);
	}
}
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackSorted s = new StackSorted(6);
		s.push(1);
		s.push(4);
		s.push(2);
		s.push(3);
		s.push(5);
		s.maxElement();
		s.pop();
		s.maxElement();
	}

}
