import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		Employee e = new Employee();
		do {
			System.out.println("1. Add employee.");
			System.out.println("2. Display All Employee.");
			System.out.println("3. Search Employee by name.");
			System.out.println("4. Delete Employee by id.");
			System.out.println("4. Update Salary of Employee by id.");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Exiting.......");
				break;
			case 1: 
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter salary: ");
				double sal = sc.nextDouble();
				e.add(id,name,sal);
				break;
			case 2:
				System.out.println("Employee details: ");
				e.display();
				break;
			case 3:
				System.out.println("Enter name to search: ");
				String key = sc.next();
				e.search(key);
				break;
			case 4:
				System.out.println("Enter id to delete: ");
				int id1 = sc.nextInt();
				e.delete(id1);
				break;
			default:
				System.out.println("Wrong choice, try again..");
				break;
			}
		} while (choice != 0);

	}

}
