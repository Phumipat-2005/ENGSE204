package lab1_8;
import java.util.Scanner;

public class lab1_8 {

	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner input = new Scanner(System.in);
		int array = input.nextInt();
		int [] allarray = new int [array];
		
		for (int i = 0; i < allarray.length; i++) {
			int arraynum = input.nextInt();
			allarray[i] = arraynum;
		}
		
		int max = allarray[0];
        for (int i = 1; i < allarray.length; i++) {
            if (allarray[i] > max) {
                max = allarray[i];
            }
        }
        
        System.out.println("Maxinum score = " + max);
        input.close();
	}
}