package lab2_1;
import java.util.Scanner;

public class lab2_1 {
	
	private String studentID;
	private String name;

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนรหัสนักศึกษา: ");
        String inputStudentId = scanner.nextLine();
        System.out.print("ป้อนชื่อ-นามสกุล: ");
        String inputName = scanner.nextLine();
        lab2_1 myStudent = new lab2_1();

        myStudent.studentID = inputStudentId;
        myStudent.name = inputName;

        System.out.println("รหัสนักศึกษา: " + myStudent.studentID);
        System.out.println("ชื่อ-นามสกุล: " + myStudent.name);

        scanner.close();
    }
}
