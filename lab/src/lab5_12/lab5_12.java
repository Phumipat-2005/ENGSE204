package lab5_12;
import java.util.Scanner;

class Service {
	protected String name;
	protected double basePrice;
	
	public Service(String name, double basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}
	
	public double calculateFinalPrice() {
		return basePrice;
	}
}

class BasicService extends Service {
	public BasicService(String name, double basePrice) {
		super(name, basePrice);
	}
	@Override
	public double calculateFinalPrice() {
		return basePrice * 1.05;
	}
}

class PremiumService extends Service {
	protected double premiumRate;
	
	public PremiumService(String name, double basePrice, double premiumRate) {
		super(name, basePrice);
		this.premiumRate = premiumRate;
	}
	@Override
	public double calculateFinalPrice() {
		return basePrice * (1 + premiumRate);
	}
}

public class lab5_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextLine()) {
			String bName = scanner.nextLine();
			double bPrice = scanner.nextDouble();
			scanner.nextLine(); 
			String pName = scanner.nextLine();
			double pPrice = scanner.nextDouble();
			double pRate = scanner.nextDouble();
			BasicService basic = new BasicService(bName, bPrice);
			PremiumService premium = new PremiumService(pName, pPrice, pRate);
			Service[] services = {basic, premium};
			for (Service s : services) {
				System.out.println(s.calculateFinalPrice());
			}
		}
		scanner.close();
	}
}