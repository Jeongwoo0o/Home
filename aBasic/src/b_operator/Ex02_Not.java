package b_operator;

/*
 * 결과를 반대로 하는 연산자
 * 		- 일반 논리 : !
 * 		- 이진 논리 : ~
 */

public class Ex02_Not {
	public static void main(String[] args) {

		//	일반 논리 NOT
		boolean result = 3 < 4;
		System.out.println(result);
		System.out.println(!result);

		//	이진 논리 NOT
		int a = 15;
		System.out.println(a);		//00000000 00000000 00000000 00001111
		System.out.println(~a);		//11111111 11111111 11111111 11110000

	}
}












































