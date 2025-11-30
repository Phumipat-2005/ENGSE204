package lab2_6;
import java.util.Scanner;

public class lab2_6 {
	private String ownerName;
	private double balance;
	
	public lab2_6(String ownerName, double balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void displaySummary() {
		System.out.println("-------Output-------");
		System.out.println("Owner: " + this.ownerName);
		System.out.println("Balance: " + this.balance);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ownerName: ");
		String inputownerName = scanner.nextLine();
		System.out.print("Enter balance: ");
		double inputbalance = scanner.nextDouble();
		System.out.print("Enter Deposits: ");
		double inputdeposits = scanner.nextDouble();
		
		lab2_6 account = new lab2_6(inputownerName, inputbalance);
		account.deposit(inputdeposits);
		account.displaySummary();
		scanner.close();
	}
}