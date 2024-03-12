package b_operator;
import java.util.Scanner;

/*
 * 		연도를 입력받아서 해당 연도가 윤년인지 평년인지 출력
 * 
 * 		[예]
 * 			연도 입력 : 2024
 * 			윤년입니다.
 * 
 * 		[예]
 * 			연도 입력 : 2023
 * 			윤년이 아닙니다.
 * 
 * 		[힌트]
 * 			년도 % 400 == 0, 년도 % 4 == 0, 년도 % 100 != 0
 */

public class 연습선택 {
	public static void main(String[] args) {

		System.out.print("연도 입력 : ");
		Scanner b = new Scanner(System.in);
		int a = b.nextInt();
		
		if(a % 4 == 0) {
			if(a % 400 == 0 || a % 100 != 0) {
				System.out.println("윤년");
			} else {
				System.out.println("평년");
			}
		} else {
			System.out.println("평년");
		}
		
	}
}



