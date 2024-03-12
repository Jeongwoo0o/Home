package b_operator;
import java.util.Scanner;

public class 복습 {
	public static void main(String[] args) {

		/*
		 * 	100점 만점의 학생 점수를 입력받아 80 ~ 90 사이라면
		 * '평균'이라고 출력
		 */
		
		// 1) 학생 점수 변수 선언
		// 2) Scanner 선언
		// 3) 콘솔에 "점수입력" 문장 출력
		// 4) 입력값을 1번 변수에 저장
		// 5) 입력값이 90보다 크고 90보다 작다면
		// 6) '평균' 출력
		
		int jum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		jum = input.nextInt();

		if(90 > jum && jum > 80) {
			System.out.println("평균");
		} else {
			System.out.println("평균X");
		}
		
		/*
		 * 	컴파일 + 실행 :이클립스 -> ctrl + F11
		 * 
		 * 	java - > class
		 * 
		 * 	[참고] F11 -> debug
		 */
		
	}
}























































