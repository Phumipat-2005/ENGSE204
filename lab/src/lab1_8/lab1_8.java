package lab1_8;
import java.util.Scanner;	//	เพิ่มฟังค์ชั่นรับค่าจากผู้ใช้เข้ามา

public class lab1_8 {

	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner input = new Scanner(System.in);
		int array = input.nextInt();
		int [] allarray = new int [array];
		
		for (int i = 0; i < allarray.length; i++) {
			int arraynum = input.nextInt();
			allarray[i] = arraynum;
		}	//	End For Loop
		
		int max = allarray[0];
        for (int i = 1; i < allarray.length; i++) {
            if (allarray[i] > max) {
                max = allarray[i];
            }	// end if
        }	//	End For Loop
        
        System.out.println("Maxinum score = " + max);	// ให้เเสดง Maxinum score = ผลลัพธ์
        input.close();	// ปิดการรับค่า
	}
}