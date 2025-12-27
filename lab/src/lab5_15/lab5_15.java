package lab5_15;
import java.util.Scanner;

class RentalVehicle {
	protected String model;
	protected double rentalRate;
	
	public RentalVehicle(String model, double rentalRate) {
		this.model = model;
		this.rentalRate = rentalRate;
	}
	
	public double calculateFee() {
		return rentalRate;
	}
}

class Car extends RentalVehicle {
	
	public Car(String model, double rentalRate) {
		super(model, rentalRate);
	}
	@Override
	public double calculateFee() {
		return rentalRate + 100.0;
	}
}

class Motorcycle extends RentalVehicle {
	
	public Motorcycle(String model, double rentalRate) {
		super(model, rentalRate);
	}
	@Override
	public double calculateFee() {
		return rentalRate * 1.10;
	}
}

public class lab5_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextLine()) {
			String cModel = scanner.nextLine();
			double cRate = scanner.nextDouble();
			scanner.nextLine(); 
			String mModel = scanner.nextLine();
			double mRate = scanner.nextDouble();
			Car car = new Car(cModel, cRate);
			Motorcycle moto = new Motorcycle(mModel, mRate);
			RentalVehicle[] vehicles = {car, moto};
			double totalFee = 0.0;
			for (RentalVehicle v : vehicles) {
				totalFee += v.calculateFee();
			}
			System.out.println(totalFee);
		}
		scanner.close();
	}
}