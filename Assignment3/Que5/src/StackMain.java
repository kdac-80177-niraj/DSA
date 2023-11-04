import java.util.Arrays;

class Stack{
	private int size,top,data[];
	public Stack(int s) {
		size = s;
		top = -1;
		data = new int[size];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == size;
	}
	public void push(int val) {
		if(isFull())
			return;
		else {
			top++;
			data[top] = val;
		}
	}
	public void pop() {
		if(isEmpty())
			return;
		else {
			int d = data[top];
			top--;
			System.out.println("Popped element is: "+d);
		}
	}
	public void peek() {
		System.out.println("Top element: "+data[top]);
	}
	public void displayReverse() {
		for(int i = top ; i > -1 ; i--) {
			System.out.print(""+data[i]);
		}
	}
}
public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.displayReverse();
	}

}
