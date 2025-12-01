package lab2_7;
import java.util.Scanner;

public class lab2_7 {
	private String ownerName;
	private double balance;
	
	public lab2_7(String ownerName, double balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Insufficient funds.");
		}
	}
	
	public void displayBalance() {
		System.out.println("Balance: " + this.balance);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		String inputownerName = scanner.nextLine();
		System.out.print("Starting balance: ");
		double inputbalance = scanner.nextDouble();
		System.out.print("Amount to be withdrawn the first time: ");
		double withdrawal001 = scanner.nextDouble();
		System.out.print("Amount to be withdrawn the second time: ");
		double withdrawal002 = scanner.nextDouble();
		System.out.println("-------Output-------");
		
		lab2_7 account = new lab2_7(inputownerName, inputbalance);
		
		account.withdraw(withdrawal001);
		account.withdraw(withdrawal002);
		account.displayBalance();
		scanner.close();
	}
}