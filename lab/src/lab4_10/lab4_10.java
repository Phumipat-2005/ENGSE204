package lab4_10;
import java.util.Scanner;

class TimePeriod {
	
	private int startHour;
	private int endHour;
	
	public TimePeriod() {
		this(9, 17);
	}
	
	public TimePeriod(int startHour, int endHour) {
		if (startHour < 0) startHour = 0;
		if (startHour > 23) startHour = 23;
		if (endHour < 0) endHour = 0;
		if (endHour > 23) endHour = 23;
		if (startHour > endHour) {
			int temp = startHour;
			startHour = endHour;
			endHour = temp;
		}
		this.startHour = startHour;
		this.endHour = endHour;
	}
	
	public void displayPeriod() {
		System.out.println(this.startHour + ":00 - " + this.endHour + ":00");
	}
}

public class lab4_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextInt());
		int mode = scanner.nextInt();
		TimePeriod tp = null;
		if (mode == 1) {
			tp = new TimePeriod();
		} else if (mode == 2) {
			int s = scanner.nextInt();
			int e = scanner.nextInt();
			tp = new TimePeriod(s, e);
		}
		if (tp != null) {
			System.out.println("-------Output-------");
			tp.displayPeriod();
		}
		scanner.close();
	}
}