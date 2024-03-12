package b_operator;

/*
 *	ShortCircuitLogic
 *		- 일반 논리 연산자에서 발생하는 개념
 *
 *		- 앞의 조건에 의해 결과가 정해지면 뒤에 조건을 실행하지 않음
 */

public class Ex08_ShortCircuitLogic {
	public static void main(String[] args) {
		
		// 일반 논리 연산자
		int a = 3;
		
		if(a > 3 && ++a > 3) {					// 앞에서 false가 나온 순간, 뒷 내용은 하지 않음
			System.out.println("조건 만족");
		}
		
		System.out.println("A = " + a);
		
		if(a > 1 || ++a > 3) {
			System.out.println("조건 만족2");
		}
		
		System.out.println("A = " + a);
		
		System.out.println("========");
		
		
		// 이진 논리 연산자
		int b = 3;
		
		if(b > 3 & ++b > 3) {					// 이진 논리 연산자에서는 ShortCircuitLogic 발생하지 않음
			System.out.println("조건 만족");
		}
		
		System.out.println("B = " + b);
		
		if(b > 1 | ++b > 3) {
			System.out.println("조건 만족2");
		}
		
		System.out.println("B = " + b);

	}
}




















































