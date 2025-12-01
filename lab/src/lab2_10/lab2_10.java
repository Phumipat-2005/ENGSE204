package lab2_10;
import java.util.Scanner;
import java.util.ArrayList;

class Product {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}

class ShoppingCart {
	private Product[] items = new Product[10];
	private int itemCount = 0;
	
	public void addProduct(Product p) {
		if (itemCount < items.length) {
			this.items[itemCount] = p;
			this.itemCount++;
		} else {
			System.out.println("Cart is full");
		}
	}
	
	public double calculateTotalPrice() {
		double total = 0.0;
		for (int i = 0; i < itemCount; i++) {
			total += items[i].getPrice();
		}
		return total;
	}
}

public class lab2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of products: ");
		int N = scanner.nextInt();
		ShoppingCart cart = new ShoppingCart();
		
		for (int i = 0; i < N; i++) {
			System.out.print("Product name: ");
			String  name = scanner.next();
			System.out.print("Product price: ");
			double price = scanner.nextDouble();
			Product p = new Product(name, price);
			cart.addProduct(p);
		}
		
		double totalPrice = cart.calculateTotalPrice();
		System.out.println("-------Output-------");
		System.out.println("Amount: " + totalPrice);
		scanner.close();
	}
}