package lab5_3;
import java.util.Scanner;

class Employee {
	
	protected double salary;
	
	public double calculateBonus() {
		return this.salary * 0.10;
	}
}

class Manager extends Employee {
	
	@Override
	public double calculateBonus() {
		double baseBonus = super.calculateBonus();
		double extraBonus = this.salary * 0.05;
		return baseBonus + extraBonus;
	}
}

public class lab5_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextDouble()) {
			double salary = scanner.nextDouble();
			Manager mgr = new Manager();
			mgr.salary = salary;
			System.out.println("--------Output---------");
			System.out.println(mgr.calculateBonus());
		}
		scanner.close();
	}
}