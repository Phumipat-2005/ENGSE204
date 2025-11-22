package lab1_1;
import java.util.Scanner;	//	import รับค่าจากผู้ใช้งาน

public class lab1_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number001 = input.nextInt();	//	ให้ค่าที่กรอกเข้ามาตัวที่ 1 เป็น number001
		int number002 = input.nextInt();	//	ให้ค่าที่กรอกเข้ามาตัวที่ 2 เป็น number002
		System.out.println(number001 + number002);	//	แสดงผลลัพธ์ของ number001 + number002
		input.close();	//	ปิดการรับค่าจากผู้ใช้งาน
	}	//	End main
}	// End Class