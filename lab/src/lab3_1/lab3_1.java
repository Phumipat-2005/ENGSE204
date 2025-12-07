package lab3_1;
import java.util.Scanner;

class User {
	private String username;

	public User (String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}
}

public class lab3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		String inputUsername = scanner.nextLine();
		User userObject = new User(inputUsername);
		
		System.out.println("-------Output-------");
		System.out.println("name: " + userObject.getUsername());
		scanner.close();
	}
}