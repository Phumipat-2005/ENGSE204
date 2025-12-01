package lab2_11;
import java.util.Scanner;

class Car {
	private String model;
	private int year;
	
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int newYear) {
		this.year = newYear;
	}
}

public class lab2_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Carmodel: ");
		String carModel = scanner.nextLine(); 
		System.out.print("Year of the vehicle: ");
		int productionYear = scanner.nextInt();
		System.out.print("Year of update of the car: ");
		int updateYear = scanner.nextInt();
		Car myCar = new Car(carModel, productionYear);
		
		myCar.setYear(updateYear);
		
        System.out.println("-------Output-------");
		System.out.println("Model: " + myCar.getModel());
		System.out.println("Year: " + myCar.getYear());
		scanner.close();
	}
}