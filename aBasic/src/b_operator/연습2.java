package b_operator;
import java.util.Scanner;

/*
 * 		문자 하나를 입력받아서 그 문자가 대문자인지 소문자인지 출력
 * 		
 * 		[예]
 * 			문자 입력 : a
 * 			소문자입니다.
 * 
 * 		[예]
 * 			문자 입력 : Y
 * 			대문자입니다.
 * 
 * 		[힌트]
 * 			비교 연산자와 일반 논리 연산자 활용
 */

public class 연습2 {
	public static void main(String[] args) {

		System.out.print("문자 입력 : ");
		Scanner input = new Scanner(System.in);
		
		char a = input.nextLine().charAt(0);	// input에 들어간 0번째 문자를 가져와서 a에 저장
												// String -> char 형 변환 안됨
												// *String : 참조형
												// *char : 기본형
		
		if (a >= 'a' && a <= 'z') {				// 문자 비교 가능
			System.out.println("소문자입니다.");
		} else if(a >= 'A' && a <= 'Z') {
			System.out.println("대문자입니다.");
		} else {
			System.out.println("똑바로 입력.");
		}

	}
}
