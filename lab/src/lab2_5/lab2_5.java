package lab2_5;
import java.util.Scanner;

public class lab2_5 {
	double width;
	double height;
	
	public lab2_5(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Width: ");
		double inputwidth = scanner.nextDouble();
		System.out.print("Enter Height: ");
		double inputheight = scanner.nextDouble();
		lab2_5 con = new lab2_5(inputwidth, inputheight);

		System.out.println("-------Output-------");
		System.out.println("Area: " + con.getArea());
		System.out.println("Perimeter: " + con.getPerimeter());
		scanner.close();
	}
}