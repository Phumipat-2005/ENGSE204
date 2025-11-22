package lab1_7;
import java.util.Scanner;

public class lab1_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number001 = input.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= number001; i++) {
			int number = input.nextInt();
			sum += number;
		}
		System.out.println(sum);
		input.close();
	}
}