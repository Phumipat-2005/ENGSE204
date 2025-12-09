package lab3_7;
import java.util.Scanner;

class Employee {
	private String employeeld;
	private String department;
	
	public Employee(String employeeld, String department) {
		this.employeeld = employeeld;
		this.department = department;
	}
	
	public String getEmployeeld() {
		return employeeld;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String newDepartment) {
		this.department = newDepartment;
	}
}

public class lab3_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ID: ");
		String inputID = scanner.nextLine();
		System.out.print("Enter Initialdept: ");
		String inputInitialdept = scanner.nextLine();
		System.out.print("Enter Newdept: ");
		String inputNewdept = scanner.nextLine();
		
		Employee emp = new Employee(inputID, inputInitialdept);
		emp.setDepartment(inputNewdept);
		
		System.out.println("-------Output-------");
		System.out.println("ID: " + emp.getEmployeeld());
		System.out.println("Dept: " + emp.getDepartment());
		scanner.close();
	}
}