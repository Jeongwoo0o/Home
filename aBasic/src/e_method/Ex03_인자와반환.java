package e_method;

public class Ex03_인자와반환 {

	public static void main(String[] args) {

		int a = 10, b = 20;
		int sum = add(a, b);
		System.out.println("합 : " + sum);
		
	}

	static int add(int a, int b) {
		
		int sum = a + b;
		
		return sum;
		
	}
	
	/*
	 * 	method 명 	: add
	 * 	인자			: int형 2개 넘어옴
	 * 	리턴형		: 두 수를 더한 결과를 리턴
	 * 	역할			: 두 수를 넘겨받아 그 수를 더하고 결과를 리턴하는 함수
	 */
	
}
