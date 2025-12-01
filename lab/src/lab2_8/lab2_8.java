package lab2_8;
import java.util.Scanner;

public class lab2_8 {
	public static double celsiusToFahrenheit(double celsius) {
		return ((celsius * 9.0 / 5.0) + 32);
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return ((fahrenheit - 32) * 5.0 / 9.0);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Select Mode (C TO F or F TO C): ");
		String mode = scanner.nextLine();
		System.out.print("Enter Temperature: ");
		double temperature = scanner.nextDouble();
		double result;
		
		if (mode.equalsIgnoreCase("C_TO_F")) {
			result = lab2_8.celsiusToFahrenheit(temperature);
		} else if (mode.equalsIgnoreCase("F_TO_C")) {
			result = lab2_8.fahrenheitToCelsius(temperature);
		} else {
			System.out.println("Invalid Mode selected.");
			return;
		}
		System.out.println("-------Output-------");
		System.out.println(result);
		scanner.close();
	}
}