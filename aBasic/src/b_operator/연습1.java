package b_operator;
import java.util.Scanner;

/*
 * 		정수 하나 입력 받아서 3의 배수인지 여부를 출력
 * 		
 * 		[예]
 * 			숫자 입력 : 4
 * 			3의 배수가 아닙니다.
 * 
 * 		[예]
 * 			숫자 입력 : 9
 * 			3의 배수가 맞습니다.
 * 
 * 		[힌트]
 * 			% 연산자 활용
 */

public class 연습1 {
	public static void main(String[] args) {
		
		System.out.print("정수 입력 : ");
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		String result = (a % 3 == 0) ? "3의 배수가 맞습니다." : "3의 배수가 아닙니다.";
		System.out.println(result);
		
		
	}
}
