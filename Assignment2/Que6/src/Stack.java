import java.lang.reflect.Array;
import java.util.*;
public class Stack {
	private int data[];
	private int size;
	private int top;
	public Stack(int s) {
		size = s;
		data = new int[size];
		top = size;
	}
	
	public boolean isFull(){
		return top == 0;
	}
	public boolean isEmpty() {
		return top == size;
	}
	public void push(int val) {
		if(isFull())
			return;
		else {
			top--;
			data[top] = val;
		}
	}
	public void pop() {
		if(isEmpty())
			return;
		else {
			int val = data[top];
			top++;
			System.out.println("Popped element is: "+val);
		}
	}
	public int peek() {
			return data[top];
	}
	public void displayStack() {
		System.out.println("stack: "+Arrays.toString(data));
	}
}
