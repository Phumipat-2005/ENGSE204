package lab4_1;
import java.util.Scanner;

class Book {
	
	private String title;
	private String author;
	
	public Book(String title) {
		this.title = title;
		this.author = "Unknown";
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.println("Title: " + this.title + "Author: " + this.author);
	}
}

public class lab4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextInt());
		int mode = scanner.nextInt();
		scanner.nextLine();
		if (mode == 1) {
			String title = scanner.nextLine();
			Book book = new Book(title);
			System.out.println("-------Output-------");
			book.displayInfo();
		} else if (mode == 2) {
			String title = scanner.nextLine();
			String author = scanner.nextLine();
			Book book = new Book(title, author);
			System.out.println("-------Output-------");
			book.displayInfo();
		}
		scanner.close();
	}
}