package lab4_3;
import java.util.Scanner;

class Player {
	
	private String username;
	private int level;
	
	public Player() {
		this.username = "Guest";
		this.level = 1;
	}
	
	public Player(String username, int level) {
		this.username = username;
		this.level = level;
	}
	
	public void displayProfile() {
		System.out.print("User: " + this.username + ", Level: " + this.level);
	}
}

public class lab4_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextInt());
		int mode = scanner.nextInt();
		scanner.nextLine();
		if (mode == 1) {
			Player p = new Player();
			System.out.println("------Output-------");
			p.displayProfile();
		} else if (mode == 2) {
			String username = scanner.nextLine();
			int level = scanner.nextInt();
			Player p = new Player(username, level);
			System.out.println("------Output-------");
			p.displayProfile();
		}
		scanner.close();
	}
}