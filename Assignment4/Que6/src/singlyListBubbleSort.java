
public class singlyListBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new List();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.addFirst(3);
		l1.addFirst(4);
		l1.addFirst(5);
		l1.addFirst(6);
		System.out.println("Before Sort: ");
		l1.display();
		System.out.println("After sort: ");
		l1.bubbleSort(l1);
	}

}
