package lab5_1;
import java.util.Scanner;

class Animal {
	protected String name;
	protected int age;
	
	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

class Dog extends Animal {
	
	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
}

public class lab5_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextLine()) {
			String name = scanner.nextLine();
			if (scanner.hasNextInt()) {
				int age = scanner.nextInt();
				Dog myDog = new Dog();
				myDog.name = name;
				myDog.age = age;
				System.out.println("--------Output--------");
				myDog.makeSound();
				myDog.displayInfo();
			}
		}
		scanner.close();
	}
}