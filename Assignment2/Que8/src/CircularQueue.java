import java.util.*;
public class CircularQueue {
	private int arr[];
	private int rear,front;
	private int SIZE;
	private int count = 0;
	public CircularQueue(int size) {
		SIZE = size;
		int rear = -1;
		int front = -1;
		arr = new int[SIZE];
	}
	public void push(int data) {
		rear = (rear+1)%SIZE;
		arr[rear] = data;
		count++;
	}
	public void pop() {
		front = (front+1)%SIZE;
		if(front == rear)
			front = rear = -1;
		count--;
	}
	
	public int peek() {
		return arr[(front+1)%SIZE];
	}
	public boolean isFull() {
		return count == SIZE;
	}
	public boolean isEMpty() {
		return count == 0;
	}
	
}
