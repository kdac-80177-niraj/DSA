
public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(1);
		s.push(2);
		s.push(1);
		System.out.println("Topmost ele: "+s.peek());
		s.displayStack();
	}

}
