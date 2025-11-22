package lab1_6;
import java.util.Scanner;	//	เพิ่มฟังค์ชั่นรับค่าจากผู้ใช้เข้ามา

public class lab1_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// รับค่า input จากผู้ใช้งาน
		int number001 = input.nextInt();	// ให้ number001 = ค่าที่กรอกเข้าไป	
		input.close();	// ปิดการรับค่า
		
		System.out.println(number001 + " x 1 = " + number001 * 1);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 1 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 2 = " + number001 * 2);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 2 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 3 = " + number001 * 3);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 3 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 4 = " + number001 * 4);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 4 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 5 = " + number001 * 5);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 5 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 6 = " + number001 * 6);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 6 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 7 = " + number001 * 7);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 7 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 8 = " + number001 * 8);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 8 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 9 = " + number001 * 9);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 9 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 10 = " + number001 * 10);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 10 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 11 = " + number001 * 11);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 11 = ผลคูณของตัวเลขที่เรากรอกมา
		System.out.println(number001 + " x 12 = " + number001 * 12);	//	ให้เเสดงค่า ตัวเลขที่กรอกมา x 12 = ผลคูณของตัวเลขที่เรากรอกมา
	}
}