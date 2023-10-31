
public class StackUsingLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println("Stack: ");
		s.display();
		s.pop();
		s.pop();
		System.out.println("After delete: ");
		s.display();
		System.out.println(s.peek());

	}

}
