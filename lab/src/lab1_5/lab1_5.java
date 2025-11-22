package lab1_5;
import java.util.Scanner;

public class lab1_5 {

	public static void main(String[] args) {
		int number001;
		System.out.println("Enter number :");
		Scanner input = new Scanner(System.in);
		number001 = input.nextInt();
		input.close();
		
		if (number001 == 1 ) {
			System.out.println("Americano");
		} else if (number001 == 2) {
			System.out.println("Latte");
		} else if (number001 == 3 ) {
			System.out.println("Espresso");
		} else if (number001 == 4 ) {
			System.out.println("Mocha");
		} else
			System.out.println("Invalid Menu");
	}
}