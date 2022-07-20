// Create class Employee_Detail with attributes Employee_id, Name, Designation,
// and Salary. Write a
// program to read the detail from user and print it.
import java.util.Scanner;

public class EmployeeDetails {
	int employee_id;
	String name;
	String designation;
	double salary;

	public EmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id ");
		employee_id = sc.nextInt();

		System.out.println("Enter Name of the employee ");
		sc.nextLine();
		name = sc.nextLine();

		System.out.println("Enter Designation of the employee ");
		designation = sc.nextLine();

		System.out.println("Enter Salary of the employee ");
		salary = sc.nextDouble();
	}

	public void employeeDetails() {
		System.out.println("<-------------------->");
		System.out.println("Employee id : " + employee_id);
		System.out.println("Name : " + name);
		System.out.println("Designation : " + designation);
		System.out.println("Salary : " + salary);
		System.out.println("<-------------------->");
		System.out.println();
	}

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails();
		EmployeeDetails emp2 = new EmployeeDetails();
		emp1.employeeDetails();
		emp2.employeeDetails();
	}
}