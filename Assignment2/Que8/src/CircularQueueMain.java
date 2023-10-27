import java.util.*;
public class CircularQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CircularQueue q = new CircularQueue(5);
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Exited.....");
				break;
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.println("Enter data: ");
					int data = sc.nextInt();
					q.push(data);
				}
					break;
			case 2:
				if(q.isEMpty())
					System.out.println("Queue is empty");
				else {
					q.pop();
				}
				break;
			case 3:
				System.out.println("Peeked element: "+q.peek());
				break;
			default:
				System.out.println("Invalid choice.....");
				break;
			}
		} while (choice != 0);
	}

}
