package lab1_11;
import java.util.Scanner;

public class lab1_11 {
	public static int sumArray(int [] allarray , int maxarray) {
		int sum = 0;
		for (int i = 0; i < maxarray; i++) {
			sum += allarray[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner input = new Scanner (System.in);
		int maxarray = input.nextInt();
		int [] allarray = new int [maxarray];
		
		for (int i = 0; i < maxarray; i++) {
			int numarray = input.nextInt();
			allarray[i] = numarray;
		}
		
		int outputArray = sumArray(allarray , maxarray);
		System.out.println(outputArray);
		input.close();
	}
}