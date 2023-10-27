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
	@Override
	public String toString() {
		return "\nEmployee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}


public class Que5 {

	public static void salInsertionSort(Employee arr[]) {
		for(int i = 1 ; i < arr.length ; i++) {
			Employee temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j].getSalary() > temp.getSalary()) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = new Employee[5];
		arr[0] = new Employee(1,"Niraj",50000);
		arr[1] = new Employee(2,"Rutik",60000);
		arr[2] = new Employee(3,"Abhishek",700000);
		arr[3] = new Employee(4,"Niraj",8500);
		arr[4] = new Employee(5,"Raj",12000);
		
		System.out.println("Employee ordering before: \n"+Arrays.toString(arr));
		salInsertionSort(arr);
		System.out.println("Employee ordering after: \n"+Arrays.toString(arr));
	}

}
