import java.util.*;
public class Queue {
	private int arr[];
	private int rear,front;
	private int SIZE;
	public Queue(int size) {
		super();
		SIZE = size;
		this.arr = new int[SIZE];
		this.rear = -1;
		this.front = -1;
	}
	
	public void push(int data) {
		rear++;
		arr[rear] = data;
	}
	public void pop() {
		front++;
	}
	public int peek() {
		return arr[front+1];
	}
	public boolean isFull() {
		return rear == SIZE-1;
	}
	public boolean isEmpty() {
		return rear == front;
	}
	
	
}
