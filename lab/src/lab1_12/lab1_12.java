package lab1_12;
import java.util.Scanner;

public class lab1_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Inventory = input.nextInt();
		int[] product_ID = new int[Inventory];
		int[] product_Stock = new int[Inventory];
		
		for (int i = 0; i < Inventory; i++) {
			product_ID[i] = input.nextInt();
			product_Stock[i] = input.nextInt();
		}
		
		boolean check = false;
		int searchID = input.nextInt();
		
		for (int i = 0; i < Inventory; i++) {
			if (product_ID[i] == searchID) {
				System.out.println(product_Stock[i]);
				check = true;
			}
		}
	}
}