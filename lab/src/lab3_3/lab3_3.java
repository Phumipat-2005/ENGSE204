package lab3_3;
import java.util.Scanner;

class User {
	private String password;
	
	public User(String initialpassword) {
		this.password = initialpassword;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String newPassword) {
		if (newPassword.length() >= 8) {
			this.password = newPassword;
			System.out.println("Password update.");
		} else {
			System.out.println("Password is too short.");
		}
	}
}

public class lab3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter password: ");
		String initialPasswordinput = scanner.nextLine();
		System.out.print("Enter new password: ");
		String newPasswordinput = scanner.nextLine();
		User userProfile = new User(initialPasswordinput);
		System.out.println("-------Output-------");
		userProfile.setPassword(newPasswordinput);
		
		System.out.println("Password: " + userProfile.getPassword());
		scanner.close();
	}
}