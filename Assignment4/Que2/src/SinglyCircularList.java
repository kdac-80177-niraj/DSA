
public class SinglyCircularList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new List();
		l1.addFirst(1);
		l1.addFirst(2);
		//l1.addFirst(3);
		//l1.addFirst(5);
		l1.deleteFirst();
		l1.addLast(4);
		l1.addLast(15);
		l1.deleteLast();
		//l1.deleteFirst();
		l1.displayList();
	}

}
