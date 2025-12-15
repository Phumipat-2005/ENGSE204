package lab4_2;
import java.util.Scanner;

class Product {
	
	private String name;
	private double price;
	
	public Product(String name) {
		this(name, 0.0);
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void displayInfo() {
		System.out.println("Product: " + this.name + ", Price: " + this.price);
	}
}

public class lab4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextInt());
		int mode = scanner.nextInt();
		scanner.nextLine();
		if (mode == 1) {
			String name = scanner.nextLine();
			Product p = new Product(name);
			System.out.println("------Output-------");
			p.displayInfo();
		} else if (mode == 2) {
			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			Product p = new Product(name, price);
			System.out.println("------Output-------");
			p.displayInfo();
		}
		scanner.close();
	}
}