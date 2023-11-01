import java.util.Scanner;

public class TestEmployeeUsingList {

	public static void main(String[] args) {
		
		List l1 = new List();
		Employee emp ;
		int choice;
		

		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("\n0.EXIT\n1.ADD EMPLOYEE\n2.SEARCH EMPLOYEE\n3.DELETE EMPLOYEE BY EMPID\n4.UPDATE SALARY OF EMPLOYEE\n5.DISPLAY ALL EMPLOYEES");
			System.out.println("Enter your choice = ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: emp =  new Employee();
					emp.accept();
					l1.addFirst(emp);
					System.out.println("Employee Added!!!");
					break;
			case 2:
					System.out.println("Enter Name = ");
					String name = sc.next();
					l1.searchByName(name);
					break;
			case 3: System.out.println("Enter Empid to delete = ");
			 		int id = sc.nextInt();
					l1.DeleteByEmpid(id);
					break;
			case 4: System.out.println("Enter Empid to update = ");
	 				int id1 = sc.nextInt();
	 				System.out.println("Enter new Salary = ");
	 				double salary  =sc.nextDouble();
	 				l1.UpdateSalaryByEmpid(id1, salary);
	 				break;
			case 5: l1.displayList();
					break;
			}
		}while(choice!=0);
	}

}