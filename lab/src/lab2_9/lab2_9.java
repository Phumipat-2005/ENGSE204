package lab2_9;
import java.util.Scanner;

class Address {
	private String street;
	private String city;
	private String zipCode;
	
	public Address(String street, String city, String zipCode) {
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	
	public String getFullAddress() {
		return street + ", " + city + ", " + zipCode;
	}
}

class Student {
	private String name;
	private Address address;
	
	public Student(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public void displayProfile() {
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address.getFullAddress());
	}
}

public class lab2_9 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name: ");
		String fullname = scanner.nextLine();
		System.out.print("Street: ");
		String street = scanner.nextLine();
		System.out.print("City: ");
		String city = scanner.nextLine();
		System.out.print("Zipcode: ");
		String zipCode = scanner.nextLine();
		System.out.println("-------Output-------");
		
		Address studentAddress = new Address(street, city, zipCode);
		Student student001 = new Student(fullname, studentAddress);
		
		student001.displayProfile();
		scanner.close();
	}
}