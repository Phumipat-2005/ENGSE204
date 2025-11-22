package lab1_2;
import java.util.Scanner;

public class lab1_2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float number001 = input.nextFloat();
		float number002 = input.nextFloat();
		System.out.println(number001 * number002);
		input.close();
	}
}