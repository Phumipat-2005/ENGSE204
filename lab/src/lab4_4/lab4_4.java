package lab4_4;
import java.util.Scanner;

class Location {
	
	private double latitude;
	private double longitude;
	
	public Location(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Location(Location other) {
		this.latitude = other.latitude;
		this.longitude = other.longitude;
	}
	
	public void setLatitude(double newLat) {
		this.latitude = newLat;
	}
	
	public void displayInfo() {
		System.out.println("Lat: " + this.latitude + ", Lon: " + this.longitude);
	}
}

public class lab4_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextDouble());
		double startLat = scanner.nextDouble();
		double startLon = scanner.nextDouble();
		double newLat = scanner.nextDouble();
		
		Location loc1 = new Location(startLat, startLon);
		Location loc2 = new Location(loc1);
		loc1.setLatitude(newLat);
		System.out.println("------Output-------");
		loc1.displayInfo();
		loc2.displayInfo();
		scanner.close();
	}
}