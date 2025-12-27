package lab5_13;
import java.util.Scanner;

class User {
	protected String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public int getClearanceLevel() {
		return 1;
	}
}

class Developer extends User {
	protected int projects;
	
	public Developer(String name, int projects) {
		super(name);
		this.projects = projects;
	}
	@Override
	public int getClearanceLevel() {
		return 2;
	}
}

class Admin extends Developer {
	protected String adminKey;
	
	public Admin(String name, int projects, String adminKey) {
		super(name, projects);
		this.adminKey = adminKey;
	}
	@Override
	public int getClearanceLevel() {
		return 3;
	}
	
	public String getAdminKey() {
		return adminKey;
	}
}

public class lab5_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextLine()) {
			String dName = scanner.nextLine();
			int dProjects = scanner.nextInt();
			scanner.nextLine(); 
			String aName = scanner.nextLine();
			int aProjects = scanner.nextInt();
			scanner.nextLine();
			String aKey = scanner.nextLine();
			User u1 = new User("Guest");
			Developer d1 = new Developer(dName, dProjects);
			Admin a1 = new Admin(aName, aProjects, aKey);
			User[] users = {u1, d1, a1};
			int totalClearance = 0;
			for (User u : users) {
				totalClearance += u.getClearanceLevel();
			}
			for (User u : users) {
				if (u instanceof Admin) {
					Admin admin = (Admin) u;
					System.out.println(admin.getAdminKey());
				}
			}
			System.out.println(totalClearance);
		}
		scanner.close();
	}
}