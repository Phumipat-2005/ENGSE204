package lab4_13;
import java.util.Scanner;

class Subscription {
	
	private final String planName;
	private final int durationDays;
	private static int maxDuration = 365;

	public Subscription(String planName, int durationDays) {
		this.planName = planName;
		if (durationDays > maxDuration) {
			this.durationDays = maxDuration;
		} else if (durationDays < 0) {
			this.durationDays = 0;
		} else {
			this.durationDays = durationDays;
		}
	}

	public Subscription(Subscription other) {
		this.planName = other.planName;
		this.durationDays = other.durationDays;
	}

	public static void setMaxDuration(int max) {
		if (max > 0) {
			maxDuration = max;
			System.out.println("Max duration set to " + max);
		} else {
			System.out.println("Invalid max policy.");
		}
	}

	public Subscription extend(int days) {
		if (days <= 0) {
			System.out.println("Invalid extension days.");
			return this;
		}
		int newTotal = this.durationDays + days;
		if (newTotal > maxDuration) {
			System.out.println("Extension failed: Exceeds max policy.");
			return this;
		}
		System.out.println("Extension successful.");
		return new Subscription(this.planName, newTotal);
	}
	
	public void displayInfo() {
		System.out.println("Plan: " + this.planName + ", Days: " + this.durationDays);
	}
}

public class lab4_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			int max = scanner.nextInt();
			Subscription.setMaxDuration(max);
			String plan = scanner.next();
			int startDays = scanner.nextInt();
			int ext1 = scanner.nextInt();
			int ext2 = scanner.nextInt();
			Subscription sub = new Subscription(plan, startDays);
			sub = sub.extend(ext1);
			sub = sub.extend(ext2);
			sub.displayInfo();
		}
		scanner.close();
	}
}