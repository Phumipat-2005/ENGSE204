package lab3_15;
import java.util.Scanner;

class User {
	private String username;
	private int failedAttempts;
	private boolean isLocked;
	private static int maxAttempts = 3;
	
	public User(String username) {
		this.username = username;
		this.failedAttempts = 0;
		this.isLocked = false;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public boolean isLoocked() {
		return this.isLocked;
	}
	
	public int getFailedAttempts() {
		return this.failedAttempts;
	}
	
	public static void setPolicy(int max) {
		if (max > 0) {
			maxAttempts = max;
			System.out.println("Policy updated.");
		} else {
			System.out.println("Invalid policy.");
		}
	}
	
	public void login(String password) {
		if (isLocked) {
			System.out.println("Account is locked.");
		} else {
			if (password.equals("pass123")) {
				failedAttempts = 0;
				System.out.println("Login successful.");
			} else {
				failedAttempts++;
				if (failedAttempts >= maxAttempts) {
					isLocked = true;
					System.out.println("Login failed. Account locked.");
				} else {
					int left = maxAttempts - failedAttempts;
					System.out.println("Login failed. " + left + " attempts left.");
				}
			}
		}
	}
}

public class lab3_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		User user = new User(username);
		if (scanner.hasNextInt()) {
			int N = scanner.nextInt();
			for (int i = 0; i < N; i++) {
				String command = scanner.next();
				if (command.equals("SET_POLICY")) {
					int max = scanner.nextInt();
					User.setPolicy(max);
				} else if (command.equals("LOGIN")) {
					String password = scanner.next();
					user.login(password);
				}
			}
		}
		scanner.close();
	}
}