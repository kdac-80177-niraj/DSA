
public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new List();
		System.out.println("Using addFirst: ");
		l1.addFirst(1);
		l1.addFirst(2);
		l1.display();
		System.out.println("Using addPosition on given position: ");
		l1.addAtPosition(3, 1);
		l1.addAtPosition(4, 3);
		l1.display();
		System.out.println("Using addPosition before given position: ");
		l1.addBeforePosition(5, 2);
		l1.addBeforePosition(6, 7);
		l1.display();
	}

}
