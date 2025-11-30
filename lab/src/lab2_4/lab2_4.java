package lab2_4;
import java.util.Scanner;

public class lab2_4 {
	private String name;
	private int midtermscore;
	private int finalscore;
	
	public lab2_4(String name, int midtermscore, int finalscore) {
		this.name = name;
		this.midtermscore = midtermscore;
		this.finalscore = finalscore;
	}
	
	public double calculateAverage() {
		double average = (midtermscore + finalscore) / 2.0;
		return average;
	}
	
	public void displaySummary() {
		double averageScore = calculateAverage();
		String status;
		
		if (averageScore >= 50.0) {
			status = "Pass";
		} else {
			status = "Fail";
		}
	
		System.out.println("------- Output -------");
		System.out.println("Name: " + this.name);
		System.out.println("Average Score: " + averageScore);
		System.out.println("Status: " + status);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		String inputName = scanner.nextLine();
		System.out.print("Enter midtermscore: ");
		int inputmidtermscore = scanner.nextInt();
		System.out.print("Enter finalscore: ");
		int inputfinalscore = scanner.nextInt();
		
		lab2_4 student001= new lab2_4(inputName, inputmidtermscore, inputfinalscore);
		student001.displaySummary();
		scanner.close();
	}
}