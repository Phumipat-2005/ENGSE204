package lab4_7;
import java.util.Scanner;

class Resource {
	
	private String id;
	
	public Resource(String id) {
		this.id = id;
		System.out.println("Resource " + this.id + " created.");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Resource " + this.id + " finalized (destroyed).");
	}
}

public class lab4_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNext());
		String id1 = scanner.next();
		String id2 = scanner.next();
		String id3 = scanner.next();
		System.out.println("-------Output-------");
		Resource r1 = new Resource(id1);
		Resource r2 = new Resource(id2);
		Resource r3 = new Resource(id3);
		
		r1 = null;
		r2 = null;
		System.gc();
		r3 = null;
		System.gc();
		try {
			Thread.sleep(500); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}