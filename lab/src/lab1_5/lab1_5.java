package lab1_5;
import java.util.Scanner;	//	เพิ่มฟังค์ชั่นรับค่าจากผู้ใช้เข้ามา

public class lab1_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// รับค่า input จากผู้ใช้งาน
		int number001 = input.nextInt();	// ให้ number001 = ค่าที่กรอกเข้าไป	
		input.close();	// ปิดการรับค่า
		
		if (number001 == 1 ) {	//	เมื่อกรอกค่าเข้ามา = 1
			System.out.println("Americano");	//	ให้เเสดงคำว่า Americano
		} else if (number001 == 2) {	//	เมื่อกรอกค่าเข้ามา = 2
			System.out.println("Latte");	//	ให้เเสดงคำว่า Latte
		} else if (number001 == 3 ) {	//	เมื่อกรอกค่าเข้ามา = 3
			System.out.println("Espresso");	//	ให้เเสดงคำว่า Espresso
		} else if (number001 == 4 ) {	//	เมื่อกรอกค่าเข้ามา = 4
			System.out.println("Mocha");	//	ให้เเสดงคำว่า Mocha
		} else	// ถ้าค่าที่กรอกมาไม่ใช่ 1 - 4 
			System.out.println("Invalid Menu");	//	ให้เเสดงคำว่า Invalid Menu
	}
}