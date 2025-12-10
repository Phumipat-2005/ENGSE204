package lab3_10;
import java.util.Scanner;

class SystemLogger {
	
	private static int currentLogLevel = 1;
	
	private static String getLevelName(int level) {
		if (level == 1) {
            return "INFO";
        } else if (level == 2) {
            return "DEBUG";
        } else if (level == 3) {
            return "ERROR";
        } else {
		    return "UNKNOWN";
        }
	}
	
	public static void setLogLevel(int newLevel) {
		if (newLevel >= 1 && newLevel <= 3) {
			SystemLogger.currentLogLevel = newLevel;
			System.out.println("Log level set to " + SystemLogger.getLevelName(newLevel));
		} else {
			System.out.println("Invalid log level.");
		}
	}
	
	public static void log(int messageLevel, String message) {
		 if (messageLevel >= SystemLogger.currentLogLevel) {
			 String levelName = SystemLogger.getLevelName(messageLevel);
	         System.out.println("[" + levelName + "]: " + message);
		 }
	}
}

public class lab3_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
		int N = scanner.nextInt();
		
		for (int i = 0; i < N; i++) {
            String command = scanner.next();
            if (command.equalsIgnoreCase("SET")) {
                int newLevel = scanner.nextInt();
                SystemLogger.setLogLevel(newLevel);
            } else if (command.equalsIgnoreCase("LOG")) {
                int messageLevel = scanner.nextInt();
                String message = scanner.nextLine().trim();
                if (message.isEmpty()) {
                    message = scanner.nextLine().trim();
                }
                
                SystemLogger.log(messageLevel, message);
            	}
        	}
		}
		scanner.close();
	}
}