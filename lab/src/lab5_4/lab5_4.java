package lab5_4;
import java.util.Scanner;

class Vehicle {
	
	protected String color;
	
	public Vehicle(String color) {
		this.color = color;
	}
}

class Car extends Vehicle {
	
	protected int wheels;
	
	public Car(String color, int wheels) {
		super(color);
		this.wheels = wheels;
	}
	
	public void displayDetails() {
		System.out.println("Color: " + this.color + ", Wheels: " + this.wheels);
	}
}

public class lab5_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			String color = scanner.next();
			if (scanner.hasNextInt()) {
				int wheels = scanner.nextInt();
				Car myCar = new Car(color, wheels);
				System.out.println("--------Output---------");
				myCar.displayDetails();
			}
		}
		scanner.close();
	}
}