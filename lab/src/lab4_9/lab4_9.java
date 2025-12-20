package lab4_9;
import java.util.Scanner;

class ImmutableAccount {
	
	private final String accountId;
	private final double balance;
	
	public ImmutableAccount(String accountId, double balance) {
		this.accountId = accountId;
		if (balance < 0) {
			this.balance = 0.0;
		} else {
			this.balance = balance;
		}
	}
	
	public ImmutableAccount(ImmutableAccount other) {
		this.accountId = other.accountId;
		this.balance = other.balance;
	}
	
	public String getAccountId() {
		return this.accountId;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public ImmutableAccount deposit(double amount) {
		if (amount > 0) {
			return new ImmutableAccount(this.accountId, this.balance + amount);
		} else {
			System.out.println("Invalid deposit amount.");
			return this;
		}
	}
	
	public ImmutableAccount withdraw(double amount) {
		if (amount > 0 && amount <= this.balance) {
			return new ImmutableAccount(this.accountId, this.balance - amount);
		} else if (amount > this.balance) {
			System.out.println("Insufficient funds.");
			return this;
		} else {
			System.out.println("Invalid withdrawal amount.");
			return this;
		}
	}
	
	public void displayInfo() {
		System.out.println("ID: " + this.accountId + ", Balance: " + balance);
	}
}

public class lab4_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNext());
		String id = scanner.next();
		double startBalance = scanner.nextDouble();
		double depositAmt = scanner.nextDouble();
		double withdrawAmt = scanner.nextDouble();
		
		ImmutableAccount acc1 = new ImmutableAccount(id, startBalance);
		ImmutableAccount acc2 = acc1.deposit(depositAmt);
		ImmutableAccount acc3 = acc2.withdraw(withdrawAmt);
		System.out.println("-------Output-------");
		acc1.displayInfo();
		acc3.displayInfo();
		scanner.close();
	}
}