package lab1_4;
import java.util.Scanner;

public class lab1_4 {
	public static void main(String[] args) {
		int Scores;
		System.out.print("Enter number : ");
		Scanner input = new Scanner(System.in);
		Scores = input.nextInt();
		input.close();
		
		if (Scores >= 80 ) {
			System.out.println("A");
		} else if (Scores >= 70) {
			System.out.println("B");
		} else if (Scores >= 60 ) {
			System.out.println("C");
		} else if (Scores >= 50 ) {
			System.out.println("D");
		} else if (Scores < 50 ) {
			System.out.println("F");
		}
	}
}