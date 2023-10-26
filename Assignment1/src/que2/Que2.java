package que2;
import java.util.*;
class Employee{
	private int empid;
	private String name;
	private double salary;
	
	public Employee() {
		super();
	}
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Que2 {
	public static boolean empidLinearSearch(Employee[] arr,int id) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(id == arr[i].getEmpid()) {
				System.out.println("Employee found at index: "+i);
				System.out.println("Employee id: "+arr[i].getEmpid());
				System.out.println("Employee name: "+arr[i].getName());
				System.out.println("Employee salary: "+arr[i].getSalary());
				return true;
			}
		}
		return false;
	}
	
	public static int empidBinarySearch(Employee[] arr,int id) {
		int left = 0,right = arr.length-1,mid;
		while(left<=right) {
			mid = (left+right)/2;
			if(id == arr[mid].getEmpid()) {
				System.out.println("Employee found at index: "+mid);
				System.out.println("Employee id: "+arr[mid].getEmpid());
				System.out.println("Employee name: "+arr[mid].getName());
				System.out.println("Employee salary: "+arr[mid].getSalary());
				return 0;
			}
			
			else if(id < arr[mid].getEmpid()) {
				right = mid-1;
			}
			else
				left = mid+1;
			
		}
		return -1;
	}
	
	public static int empnameLinearSearch(Employee[] arr,String Empname) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].getName().equals(Empname)){
				System.out.println("Employee found at index: "+i);
				System.out.println("Employee id: "+arr[i].getEmpid());
				System.out.println("Employee name: "+arr[i].getName());
				System.out.println("Employee salary: "+arr[i].getSalary());
				return 0;
			}
		}
		return -1;
	}
	
	public static boolean empsalaryBinarySearch(Employee[] arr,double Esalary) {
		int left = 0,right = arr.length-1;
		int mid;
		while(left<=right) {
			mid = (left+right)/2;
			if(Esalary == arr[mid].getSalary()) {
				System.out.println("Employee found at index: "+mid);
				System.out.println("Employee id: "+arr[mid].getEmpid());
				System.out.println("Employee name: "+arr[mid].getName());
				System.out.println("Employee salary: "+arr[mid].getSalary());
				return true;
			}
			else if(Esalary < arr[mid].getSalary()) {
				right = mid-1;
			}
			else
				left = mid+1;
				
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(1,"Niraj",50000);
		arr[1] = new Employee(2,"Rutik",60000);
		arr[2] = new Employee(3,"Abhishek",70000);
		arr[3] = new Employee(4,"Niraj",80000);
		arr[4] = new Employee(5,"Raj",100000);
		
		
		System.out.println("Search by empid");
		System.out.println("Enter empid to search: ");
		int id = sc.nextInt();
		if(!empidLinearSearch(arr, id)) {
			System.out.println("Employee not found");
		}
		System.out.println("*********************************");
		
		System.out.println("Search by name");
		System.out.println("Enter name to search: ");
		String Empname = sc.next();
		if(empnameLinearSearch(arr, Empname) == -1)
			System.out.println("Employee not found");
		System.out.println("*********************************");
		
		
		System.out.println("Search by salary");
		System.out.println("Enter employee salary to search: ");
		double esal = sc.nextDouble();
		if(!empsalaryBinarySearch(arr, esal))
			System.out.println("Employee not found.");
		System.out.println("*********************************");
	}

}
