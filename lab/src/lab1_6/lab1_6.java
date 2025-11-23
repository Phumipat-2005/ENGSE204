package lab1_6;
import java.util.Scanner;

public class lab1_6 {

	public static void main(String[] args) {
		int number;
		System.out.print("Enter number : ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		System.out.println("Multiplication table of " + number);
		
		for (int i = 1; i <= 12; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		
		input.close();
	}
}