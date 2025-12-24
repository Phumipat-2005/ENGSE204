package lab5_2;
import java.util.Scanner;

class Animal {
	
	protected String name;
	protected int age;
	
	public void makeSound() {
		System.out.println("I am animal.");
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

class Cat extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
}

public class lab5_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextLine()) {
			String name = scanner.nextLine();
			if (scanner.hasNextInt()) {
				int age = scanner.nextInt();
				Cat myCat = new Cat();
				myCat.name = name;
				myCat.age = age;
				System.out.println("--------Output---------");
				myCat.displayInfo();
				myCat.makeSound();
			}
		}
		scanner.close();
	}
}