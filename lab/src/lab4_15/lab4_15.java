package lab4_15;
import java.util.Scanner;

class AuditRecord {
	
	private final String user;
	private final String[] logMessages;
	private static int maxMessages = 3;
	
	public AuditRecord(String user) {
		this(user, new String[0]);
	}

	public AuditRecord(String user, String[] logs) {
		this.user = user;
		int size = logs.length;
		int copyCount;
		int sourceStart;
		if (size > maxMessages) {
			copyCount = maxMessages;
			sourceStart = size - maxMessages;
		} else {
			copyCount = size;
			sourceStart = 0;
		}
		this.logMessages = new String[copyCount];
		System.arraycopy(logs, sourceStart, this.logMessages, 0, copyCount);
	}

	public static void setPolicy(int max) {
		if (max > 0) {
			maxMessages = max;
			System.out.println("Policy set to " + max);
		} else {
			System.out.println("Invalid policy.");
		}
	}

	public AuditRecord addMessage(String message) {
		if (this.logMessages.length < maxMessages) {
			String[] newLogs = new String[this.logMessages.length + 1];
			System.arraycopy(this.logMessages, 0, newLogs, 0, this.logMessages.length);
			newLogs[this.logMessages.length] = message;
			return new AuditRecord(this.user, newLogs);
		} else {
			System.out.println("Log is full.");
			return this;
		}
	}
	
	public void displayLog() {
		System.out.print("User: " + this.user + ", Logs: " + this.logMessages.length + " [");
		for (int i = 0; i < this.logMessages.length; i++) {
			System.out.print(this.logMessages[i]);
			if (i < this.logMessages.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}

public class lab4_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			int max = scanner.nextInt();
			AuditRecord.setPolicy(max);
			scanner.nextLine();
			String user = scanner.nextLine();
			if (scanner.hasNextInt()) {
				int N = scanner.nextInt();
				scanner.nextLine();
				AuditRecord record = new AuditRecord(user);
				for (int i = 0; i < N; i++) {
					String line = scanner.nextLine();
					if (line.equals("SET_POLICY")) {
						if (scanner.hasNextInt()) {
							int val = scanner.nextInt();
							AuditRecord.setPolicy(val);
							scanner.nextLine();
						}
					} else {
						AuditRecord newRecord = record.addMessage(line);
						if (newRecord != record) {
							record = newRecord;
							System.out.println(line + " added.");
						}
					}
				}
				record.displayLog();
			}
		}
		scanner.close();
	}
}