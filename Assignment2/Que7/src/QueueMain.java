import java.util.*;
public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Queue q = new Queue(5);
			Scanner sc = new Scanner(System.in);
			int choice;
			do {
				System.out.println("0. Exit.");
				System.out.println("1. push.");
				System.out.println("2. pop");
				System.out.println("3. peek");
				System.out.println("Enter choice: ");
				choice = sc.nextInt();
				
				switch(choice) {
				case 0:
					System.out.println("Exited......");
					break;
				case 1:
					if(q.isFull())
						System.out.println("Queue is full....");
					else {
						System.out.println("Enter data: ");
						int data = sc.nextInt();
						q.push(data);
					}
					break;
				case 2:
					if(q.isEmpty())
						System.out.println("Queue is empty");
					else {
						q.pop();
					}
					break;
				case 3:
					if(q.isEmpty())
						System.out.println("Queue is empty");
					else {
						System.out.println("Peeked element: "+q.peek());
					}
					break;
				default:
					System.out.println("Invalid choice........");
					break;
				}
			} while (choice != 0);
			sc.close();
	}

}
