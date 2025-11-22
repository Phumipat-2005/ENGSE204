package lab1_9;
import java.util.Scanner;

public class lab1_9 {
	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner input = new Scanner(System.in);
		int array001 = input.nextInt();
		int [] allarray001 = new int [array001];
		
		for (int i = 0; i < allarray001.length; i++) {
			int arraynum = input.nextInt();
			allarray001[i] = arraynum;
		}

		int sum = 0;
        for (int i = 0; i < allarray001.length; i++) {
        	sum += allarray001[i];
        }
        
        double average = (double) sum / allarray001.length;
        System.out.println("Output : " + average);
        input.close();
	}
}