package lab3_11;
import java.util.Scanner;

class SystemConfig {
	private static SystemConfig instance;
	private String serverUrl;
	private int maxConnections;
	
	private SystemConfig() {
		this.serverUrl = "default.server.com";
		this.maxConnections = 10;
	}
	
	public static SystemConfig getInstance() {
		if (instance == null) {
			instance = new SystemConfig();
		}
		return instance;
	}
	
	public String getServerUrl() {
		return this.serverUrl;
	}
	
	public void setServerUrl(String url) {
		this.serverUrl = url;
	}
	
	public int getMaxConnections() {
		return this.maxConnections;
	}
	
	public void setMaxConnections(int count) {
		if (count > 0) {
			this.maxConnections = count;
			System.out.println("Max connections set.");
		} else if (count == 0 || count < 0) {
			System.out.println("Invalid count.");
		}
	}
}

public class lab3_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextInt()) {
			scanner.close();
			return;
		}
		int N = scanner.nextInt();
		
		for (int i = 0; i < N; i++) {
			String command = scanner.next();
			
			if (command.equalsIgnoreCase("SET_URL")) {
				String url = scanner.next(); 
				SystemConfig.getInstance().setServerUrl(url);
				
			} else if (command.equalsIgnoreCase("SET_MAX")) {
				int count = scanner.nextInt();
				SystemConfig.getInstance().setMaxConnections(count);
				
			} else if (command.equalsIgnoreCase("SHOW")) {
				SystemConfig config = SystemConfig.getInstance();
				System.out.println("URL: " + config.getServerUrl());
				System.out.println("MAX: " + config.getMaxConnections());
			}
		}
		scanner.close();
	}
}