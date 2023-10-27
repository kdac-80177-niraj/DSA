import java.util.*;
public class Que9 {

	public static void priority(String operator) {
		switch (operator) {
		case "()":
			System.out.println("priority 1");
			break;
		case "/":
			System.out.println("priority 2");
			break;
		case "*":
			System.out.println("priority 3");
			break;
		case "+":
			System.out.println("priority 4");
			break;
		case "-":
			System.out.println("priority 5");
			break;
		default:
			System.out.println("Operator still not invented....");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character: ");
		String c = sc.next();
		priority(c);
	}

}
