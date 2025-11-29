package lab2_2;
import java.util.Scanner;

public class lab2_2 {
	
	private String studentID;
	private String name;
	
	public void displayInfo() {
		System.out.println("รหัสนักศึกษา: " + studentID);
		System.out.println("ชื่อ-นามสกุล: " + name);
	}

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนรหัสนักศึกษา: ");
        String inputStudentId = scanner.nextLine();
        System.out.print("ป้อนชื่อ-นามสกุล: ");
        String inputName = scanner.nextLine();
        lab2_2 myStudent = new lab2_2();
        myStudent.studentID = inputStudentId;
        myStudent.name = inputName;

        myStudent.displayInfo();
        scanner.close();
    }
}