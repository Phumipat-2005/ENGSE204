package lab3_4;
import java.util.Scanner;

class Product {
	private String name;
	private static int productCount = 0;
	
	public Product(String name) {
        this.name = name;
        Product.productCount++;
    }
	
	public String getName() {
		return this.name;
	}
	
	public static int getProductCount() {
		return Product.productCount;
	}
}

public class lab3_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number product: ");
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.print("Enter name product: ");
			String productname = scanner.next();
			new Product(productname);
		}
		
		System.out.println("-------Output-------");
		System.out.println("Total number of product: " + Product.getProductCount());
		scanner.close();
	}
}