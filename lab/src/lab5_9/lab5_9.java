package lab5_9;
import java.util.Scanner;

class Item {
	protected String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	public double getValue() {
		return 0.0;
	}
}

class PhysicalProduct extends Item {
	protected double unitPrice;
	protected int quantity;
	
	public PhysicalProduct(String name, double unitPrice, int quantity) {
		super(name);
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	@Override
	public double getValue() {
		return unitPrice * quantity;
	}
}

class DigitalSubscription extends Item {
	protected double monthlyCost;
	protected int months;
	public DigitalSubscription(String name, double monthlyCost, int months) {
		super(name);
		this.monthlyCost = monthlyCost;
		this.months = months;
	}
	@Override
	public double getValue() {
		return monthlyCost * months;
	}
}

public class lab5_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextLine()) {
			String pName = scanner.nextLine();
			double pPrice = scanner.nextDouble();
			int pQty = scanner.nextInt();
			scanner.nextLine();
			String dName = scanner.nextLine();
			double dCost = scanner.nextDouble();
			int dMonths = scanner.nextInt();
			PhysicalProduct p = new PhysicalProduct(pName, pPrice, pQty);
			DigitalSubscription d = new DigitalSubscription(dName, dCost, dMonths);
			Item[] items = {p, d};
			double totalValue = 0.0;
			for (Item item : items) {
				totalValue += item.getValue();
			}
			System.out.println(totalValue);
		}
		scanner.close();
	}
}