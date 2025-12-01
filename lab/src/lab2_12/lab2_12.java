package lab2_12;
import java.util.Scanner; 

class Course {
	private String courseId;
	private String courseName;
	
	public Course(String courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public String getCourseInfo() {
		return courseId + ": " + courseName;
	}
}

class Student {
	private String studentName;
	private Course enrolledCourse;
	
	public Student(String studentName, Course enrolledCourse) {
		this.studentName = studentName;
		this.enrolledCourse = enrolledCourse;
	}
	
	public void displayEnrollment() {
		System.out.println("Student: " + this.studentName);
		System.out.println("Enrolled in: " + this.enrolledCourse.getCourseInfo());
	}
}

public class lab2_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input CourseID: ");
        String inputCourseId = scanner.nextLine();
        System.out.print("Input CourseName: ");
        String inputCourseName = scanner.nextLine();
        System.out.print("Input StudentName: ");
        String inputStudentName = scanner.nextLine();
        System.out.println("-------Output-------");
        
        Course courseObject = new Course(inputCourseId, inputCourseName);
        Student studentObject = new Student(inputStudentName, courseObject);
        
        studentObject.displayEnrollment();
        scanner.close();
	}
}