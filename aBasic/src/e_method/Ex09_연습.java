package e_method;
import java.util.Scanner;

public class Ex09_연습 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("영문자 1개 입력 : ");
		String str = in.nextLine();
		char x = str.charAt(0);
		
		// 메소드 호출
		boolean result = checkLower(x);
		System.out.println(result);
	}
	
	//메소드 선언
	/*
	 * 	(문제 1) 영문자를 입력하여 이 문자를 넘겨받아 
	 * 			이 문자가 소문자이면 true, 그렇지 않으면 false를 반환하는 메소드를 작성.
	 * 	함수명 	: checkLower
	 * 	인자		: char
	 * 	리턴(반환): boolean
	 */
	
	// **** [교제] p.133 ~ 147
	
	static boolean checkLower(char x) {
		boolean result = true;
		
		if(x >= 'a' && x <= 'z') {
			result = true;
		} else if(x >= 'A' && x <= 'Z') {
			result = false;
		}
		
		return result;
	}
	
}

































