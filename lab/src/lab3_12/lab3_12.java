package lab3_12;
import java.util.Scanner;

class Employee {
	private String name;
	private double monthlySalary;
	
	public Employee(String name, double monthlySalary) {
		this.name = name;
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		} else {
			this.monthlySalary = 0;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void giveRaise(double amount) {
		if (amount > 0) {
			this.monthlySalary += amount;
			System.out.println("Raise applied.");
		} else {
			System.out.println("Invalid amount.");
		}
	}
	
	private double getAnnualSalary() {
		return this.monthlySalary * 12;
	}
	
	public double calculateTax(double taxRate) {
		return getAnnualSalary() * taxRate;
	}
}

public class lab3_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter salary: ");
		double salary = scanner.nextDouble();
		System.out.print("Enter taxRate: ");
		double taxRate = scanner.nextDouble();
		System.out.print("Enter raiseAmout: ");
		double raiseAmount = scanner.nextDouble();
		System.out.println("-------Output-------");
		
		Employee emp = new Employee(name, salary);
		System.out.println("Tax (Before): " + emp.calculateTax(taxRate));
		emp.giveRaise(raiseAmount);
		System.out.println("Tax (After): " + emp.calculateTax(taxRate));
		scanner.close();
	}
}