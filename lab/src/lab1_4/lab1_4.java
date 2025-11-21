package lab1_4;
import java.util.Scanner;

public class lab1_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		input.close();
		if (number1 >= 80 ) {
			System.out.println("A");
		} else if (number1 >= 70) {
			System.out.println("B");
		} else if (number1 >= 60 ) {
			System.out.println("C");
		} else if (number1 >= 50 ) {
			System.out.println("D");
		} else if (number1 < 50 ) {
			System.out.println("F");
		} 
	}
}