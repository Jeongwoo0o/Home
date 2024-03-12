package b_operator;
import java.util.Scanner;

/*
 * 	삼항 연산자
 * 		조건 ? 참인 경우 실행문 : 거짓인 경우 실행문
 * 		(조건) ? true : false;
 */

public class Ex09_삼항 {
	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		System.out.print("당신의 점수를 입력하세요 : ");
//		int score = in.nextInt();
//		
//		String result = (score >= 80) ? "합격" : "불합격";
//		
//		System.out.println(result);
		
		/*
		 * 	두 수를 입력받아 a, b 변수를 저장하기
		 * 	그 두 수 중에서 큰 수를 출력
		 * 
		 * 	int max = (a > b) ? a : b;
		 */
		
		Scanner in2 = new Scanner(System.in);
		System.out.print("정수를 2개 입력하세요(띄어쓰기로 구분) : ");
		int a = in2.nextInt();
		int b = in2.nextInt();
		
		
		int max = (a > b) ? a : b;
		
		System.out.println(max);
		
		if(a - b >= 0) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}
}














































