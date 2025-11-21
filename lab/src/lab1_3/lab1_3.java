package lab1_3;
import java.util.Scanner;

public class lab1_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		if (number1 % 2 == 0) {
			System.out.println("Even");
		} else
			System.out.println("Odd");
	}
}