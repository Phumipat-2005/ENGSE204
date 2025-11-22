package lab1_2;
import java.util.Scanner;

public class lab1_2 {
	public static void main(String[] args) {
		float number001;
		float number002;
		System.out.println("Enter number :");
		Scanner input = new Scanner(System.in);
		number001 = input.nextFloat();
		number002 = input.nextFloat();
		System.out.println(number001 * number002);
		input.close();
	}
}