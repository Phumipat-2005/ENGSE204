package lab5_11;
import java.util.Scanner;

class Document {
	protected String title;
	
	public Document(String title) {
		this.title = title;
	}
	
	public void displayDetails() {
		System.out.println("Document: " + title);
	}
}

class TextDocument extends Document {
	protected int wordCount;
	
	public TextDocument(String title, int wordCount) {
		super(title);
		this.wordCount = wordCount;
	}
	@Override
	public void displayDetails() {
		System.out.println("Text: " + title + ", Words: " + wordCount);
	}
}

class PDFDocument extends Document {
	protected int pageCount;
	
	public PDFDocument(String title, int pageCount) {
		super(title);
		this.pageCount = pageCount;
	}
	@Override
	public void displayDetails() {
		System.out.println("PDF: " + title + ", Pages: " + pageCount);
	}
}

public class lab5_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextLine()) {
			String t1Name = scanner.nextLine();
			int t1Words = scanner.nextInt();
			scanner.nextLine();
			String p1Name = scanner.nextLine();
			int p1Pages = scanner.nextInt();
			scanner.nextLine();
			String t2Name = scanner.nextLine();
			int t2Words = scanner.nextInt();
			scanner.nextLine();
			String p2Name = scanner.nextLine();
			int p2Pages = scanner.nextInt();
			Document t1 = new TextDocument(t1Name, t1Words);
			Document p1 = new PDFDocument(p1Name, p1Pages);
			Document t2 = new TextDocument(t2Name, t2Words);
			Document p2 = new PDFDocument(p2Name, p2Pages);
			Document[] docs = {t1, p1, t2, p2};
			int totalPages = 0;
			for (Document d : docs) {
				if (d instanceof PDFDocument) {
					PDFDocument pdf = (PDFDocument) d;
					totalPages += pdf.pageCount;
				}
			}
			for (Document d : docs) {
				d.displayDetails();
			}
			System.out.println("Total Pages: " + totalPages);
		}
		scanner.close();
	}
}