import java.util.*;
public class Stack {
	private char arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		top = -1;
		arr = new char[SIZE];
	}
	
	public void push(char data) {
		top++;
		arr[top] = data;
	}
	public char pop() {
		char data = arr[top];
		top--;
		return data;
	}
	public char peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == SIZE-1;
	}
}
