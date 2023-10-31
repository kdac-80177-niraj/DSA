
public class DoublyCircularLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new List();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.addFirst(3);
		l1.addFirst(4);
		l1.addPosition(0, 1);
		l1.addPosition(5, 6);
		System.out.println("Before deletion: ");
		l1.fDisplay();
		l1.deletePosition(2);
		l1.deletePosition(3);
		System.out.println("After deletion: ");
		l1.fDisplay();
	}

}
