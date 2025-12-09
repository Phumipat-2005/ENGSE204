package lab3_6;
import java.util.Scanner;

class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		if (initialBalance >= 0) {
			this.balance = initialBalance;
		} else {
			this.balance = 0;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Deposit susccessful.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount.");
		} else if (amount > this.balance) {
			System.out.println("Insufficient funds.");
		} else {
			this.balance -= amount;
			System.out.println("Withdrawal successful.");
		}
	}
}

public class lab3_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Initial amount: ");
		double initialBalanceinput = scanner.nextDouble();
		System.out.print("Enter Deposit amount: ");
		double depositAmountinput = scanner.nextDouble();
		System.out.print("Enter Withdrawal amount: ");
		double withdrawAmountinput = scanner.nextDouble();
		System.out.println("-------Output-------");

		BankAccount account = new BankAccount(initialBalanceinput);
		account.deposit(depositAmountinput);
		account.withdraw(withdrawAmountinput);
		System.out.println("Final Balance: " + account.getBalance());
		scanner.close();
	}
}