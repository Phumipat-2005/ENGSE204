package lab2_2;
import java.util.Scanner;

public class lab2_2 {
	
	private String studentid;
	private String name;
	
	public void displayinfo() {
		System.out.println("------- Output -------");
		System.out.println("Studentid: " + studentid);
		System.out.println("Name: " + name);
	}

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Studentid: ");
        String inputstudentid = scanner.nextLine();
        System.out.print("Name: ");
        String inputname = scanner.nextLine();
        lab2_2 student = new lab2_2();
        student.studentid = inputstudentid;
        student.name = inputname;

        student.displayinfo();
        scanner.close();
    }
}