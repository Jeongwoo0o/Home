package e_method;

/*
 * 	멤버변수 : 클래스안의 변수
 * 	멤버함수 : 함수(method)
 */

public class Ex04_참고_멤버변수 {
	
	// 멤버변수
	static int a = 10, b = 20;
	static int sum = 0;
	
	public static void main(String[] args) {

		add();
		System.out.println("합 : " + sum);
		
	}
	
	static void add() {
		sum = a + b;
	}
}








































