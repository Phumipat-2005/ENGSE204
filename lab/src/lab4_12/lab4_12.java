package lab4_12;
import java.util.Scanner;

class Schedule {
	
	private int hour;
	
	public Schedule(int hour) {
		this.hour = hour;
	}
	
	public void setHour(int newHour) {
		this.hour = newHour;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public Schedule(Schedule other) {
		this.hour = other.hour;
	}
}

class EmployeeSchedule {
	
	private String name;
	private Schedule schedule;
	
	public EmployeeSchedule(String name, Schedule schedule) {
		this.name = name;
		this.schedule = schedule;
	}
	
	public EmployeeSchedule(EmployeeSchedule other) {
		this.name = other.name;
		this.schedule = new Schedule(other.schedule);
	}
	
	public void displaySchedule() {
		System.out.println(this.name + ": " + this.schedule.getHour() + ":00");
	}
}

public class lab4_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			String name = scanner.next();
			int startHour = scanner.nextInt();
			int newHour = scanner.nextInt();
			Schedule sch1 = new Schedule(startHour);
			EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);
			EmployeeSchedule emp2 = new EmployeeSchedule(emp1);
			sch1.setHour(newHour);
			System.out.println("--------Output--------");
			emp1.displaySchedule(); 
			emp2.displaySchedule();
		}
		scanner.close();
	}
}