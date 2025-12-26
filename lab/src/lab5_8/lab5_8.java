package lab5_8;
import java.util.Scanner;

class Person {
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getStatus() {
		return "Person: " + name;
	}
}

class Student extends Person {
	protected int studentId;
	
	public Student(String name, int studentId) {
		super(name);
		this.studentId = studentId;
	}
	@Override
	public String getStatus() {
		return "Student: " + name + ", ID: " + studentId;
	}
}

class Employee extends Person {
	protected double salary;
	
	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	public void applyBonus(double bonus) {
		this.salary += bonus;
	}
	@Override
	public String getStatus() {
		return "Employee: " + name + ", Salary: " + salary;
	}
}

public class lab5_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			String sName = scanner.next();
			int sId = scanner.nextInt();
			String eName = scanner.next();
			double eSalary = scanner.nextDouble();
			Student s = new Student(sName, sId);
			Employee e = new Employee(eName, eSalary);
			Person[] people = {s, e};
			for (Person p : people) {
				if (p instanceof Employee) {
					Employee emp = (Employee) p;
					emp.applyBonus(1000.0);
				}
			}
			for (Person p : people) {
				System.out.println(p.getStatus());
			}
		}
		scanner.close();
	}
}