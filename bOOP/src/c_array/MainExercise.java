package c_array;
import java.util.Scanner;

public class MainExercise {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int su = input.nextInt();

		Student[] s = new Student[su];

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
		}

		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].getName() + " 총점 : " + s[i].calTotal() + ", 평균 : " + s[i].calAvg());
		}
	}

}
