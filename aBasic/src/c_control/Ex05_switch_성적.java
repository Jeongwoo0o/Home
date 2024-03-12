package c_control;
import java.util.Scanner;

public class Ex05_switch_성적 {
	public static void main(String[] args) {

		int kor = 0, eng = 0, math = 0;
		String score = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 성적 입력(띄어쓰기로 구분) : ");
		kor = input.nextInt();
		eng = input.nextInt();
		math = input.nextInt();
		
		int total = kor + eng + math;
		int avg = total / 3;

		switch(avg / 10) {
			case 10:
			case 9: score = "A"; break;
			case 8: score = "B"; break;
			case 7: score = "C"; break;
			default: score = "F";
		}
		System.out.println(score);
	}
}













































