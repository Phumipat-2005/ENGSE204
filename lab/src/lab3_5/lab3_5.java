package lab3_5;
import java.util.Scanner;

class DatabaseConnection {
	private String connectionString;
	private boolean connected;
	
	public DatabaseConnection(String connectionString) {
		this.connectionString = connectionString;
		this.connected = false;
	}
	
	public boolean isConnected() {
		return connected;
	}
	
	public void connect() {
		if (connected == false){
			this.connected = true;
			System.out.println("Connected to " + this.connectionString);
		} else {
			System.out.println("Already connected.");
		}
	}
	
	public void disconnect() {
		if (connected == true) {
			this.connected = false;
			System.out.println("Disconnected.");
		} else {
			System.out.println("Already Disconnected.");
		}
	}
}

public class lab3_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter DB: ");
		String connectionStringinput = scanner.nextLine();
		System.out.println("-------Output-------");
		DatabaseConnection db = new DatabaseConnection(connectionStringinput);
		
		db.connect();
		db.disconnect();
		db.disconnect();
		
		System.out.println(db.isConnected());
		scanner.close();
	}
}