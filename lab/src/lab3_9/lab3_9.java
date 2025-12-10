package lab3_9;
import java.util.Scanner;

class User {
	private String username;
	private String password;
	private static int minPasswordLength = 8;
	
	public User(String username, String password) {
		this.username = username;
		if (password.length() >= minPasswordLength) {
			this.password = password;
			System.out.println("Creation successful.");
		} else {
			this.password = "invalid";
			System.out.println("Creation failed.");
		}
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String newPassword) {
		if (newPassword.length() >= minPasswordLength) {
			this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
		}
	}
	
	public static void setMinLength(int length) {
		if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            User.minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
	}
	
	public static int getMinLength() {
		return User.minPasswordLength;
	}
}

public class lab3_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number length set: ");
		int minLength1 = scanner.nextInt();
		System.out.print("Enter username1: ");
		String user1Name = scanner.next();
		System.out.print("Enter password: ");
		String user1Pass = scanner.next();
		System.out.print("Enter username2: ");
		String user2Name = scanner.next();
		System.out.print("Enter password: ");
		String user2Pass = scanner.next();
		System.out.print("Enter number length set: ");
		int minLength2 = scanner.nextInt();
		System.out.print("Enter password: ");
		String user2NewPass = scanner.next();
		System.out.println("-------Output-------");
		
		User.setMinLength(minLength1);
        User user1 = new User(user1Name, user1Pass);
        User user2 = new User(user2Name, user2Pass);
        User.setMinLength(minLength2);
        user2.setPassword(user2NewPass);
        
        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());
        scanner.close();
	}
}