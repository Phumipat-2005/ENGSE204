package lab2_3;
import java.util.Scanner;

public class lab2_3 {
	private String studentid;
	private String name;
	private static int studentcount = 0;
	
	public lab2_3(String studentid, String name) {
		this.studentid = studentid;
		this.name = name;
		studentcount++;
	}
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("enter number student: ");
			int n = scanner.nextInt();
			
			for (int i = 0; i < n; i++) {
				String inputid = scanner.next();
				String inputname = scanner.next();
				lab2_3 newstudent = new lab2_3(inputid, inputname);
			}
			
			System.out.println("-------Output-------");
			System.out.println(lab2_3.studentcount);
			scanner.close();
	}
}