package e_method;

/*
 * 	Call by Value
 * 	
 * 	: 인자의 자료형이 기본형인 경우
 * 
 * 	원래 데이터에 영향이 없음
 */

public class Ex05_CallByValue {
	public static void main(String[] args) {

		int a = 10, b = 20;
		add(a, b);
		System.out.println("A = " + a + " B = " + b);
	}
	
	static void add(int a, int b) {
		a += b;
		System.out.println("A = " + a + " B = " + b);	// 값을 복사했기 때문에 원본에 영향 없음.
	}
}












































