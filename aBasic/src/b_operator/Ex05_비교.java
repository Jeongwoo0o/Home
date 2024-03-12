package b_operator;
import java.util.Scanner;

/*
 * 	비교 연산자
 * 
 * 		>	>=	<	<=	==	!=
 * 
 */

public class Ex05_비교 {
	public static void main(String[] args) {

		System.out.print("국어, 영어, 수학 점수를 입력하세요(띄어쓰기로 구분) : ");
		Scanner input = new Scanner(System.in);

		int kor = input.nextInt();
		int eng = input.nextInt();
		int math = input.nextInt();
		int total = kor + eng + math;
		double avg = (double)total / 3;

		System.out.println("총점 : " + total + "\n평균 : " + avg);
		
		if(avg >= 90) {
			System.out.println("A");
		} else if(avg >= 80) {
			System.out.println("B");
		} else if(avg >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

	}
}














































