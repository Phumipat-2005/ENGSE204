package lab1_10;
import java.util.Scanner;

public class lab1_10 {
	public static double calculateArea(double weight , double height) {
		double result = weight * height;
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		double height = input.nextDouble();
		double sum = calculateArea(weight , height);
		System.out.println(sum);
		input.close();
	}
}