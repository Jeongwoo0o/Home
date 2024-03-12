package c_array;
import java.util.Scanner;

public class Main {
	
	// 3명의 학생의 국영수 점수를 입력받아 총점과 평균 구하기
	// ********* 클래스 배열인 경우
	//			배열도 new 생성
	//			클래스도 new 생성
	public static void main(String[] args) {

		Student[] s = new Student[3];
		
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < s.length; i++) {
			
			s[i] = new Student();
			
			System.out.print("이름 : ");
			s[i].setName(input.next());
			System.out.print("국어 : ");
			s[i].setKor(input.nextInt());
			System.out.print("영어 : ");
			s[i].setEng(input.nextInt());
			System.out.print("수학 : ");
			s[i].setMath(input.nextInt());
			
			System.out.println("총점 : " + s[i].calTotal());
		}
		
	}
}
