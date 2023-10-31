
public class DequeueUsingLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dequeue d = new Dequeue();
		d.offer(4);
		d.offer(3);
		d.offer(2);
		d.offer(1);
		System.out.println("Before Delete: ");
		d.display();
		System.out.println("Peek: "+ d.peek());
		System.out.println("After Delete: ");
		d.poll();
		d.display();
	}

}
