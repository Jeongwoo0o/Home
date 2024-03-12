package e_method;

/*
 * 	[메소드-함수 구조]
 * 
 * 	리턴형 메소드명 (파라미터 변수) {
 * 
 * 	}
 * 
 * 	리턴형 : 반환하는 값의 자료형
 * 			void : 없다
 * 
 * 	파라미터 변수 : 인자(argument)를 받는 변수
 * 					없으면 안써도 됨
 */

public class Ex01_인자 {
	public static void main(String[] args) {

		int a = 10, b = 20;
		
		add(a, b);	// 인자
		
	}
	
	static void add(int a, int b) {	// 파라미터
		int sum = a + b;
		System.out.println(sum);
	}
}

































