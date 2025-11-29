package lab2_1;
import java.util.Scanner;

public class lab2_1 {
	
	private String studentid;
	private String name;

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Studentid: ");
        String inputstudentID = scanner.nextLine();
        System.out.print("Name: ");
        String inputname = scanner.nextLine();
        lab2_1 Student = new lab2_1();
        Student.studentid = inputstudentID;
        Student.name = inputname;

        System.out.println("-------- Output ----------");
        System.out.println("StudentID: " + Student.studentid);
        System.out.println("Name: " + Student.name);
        scanner.close();
    }
}