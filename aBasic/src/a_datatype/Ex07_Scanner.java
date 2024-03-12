package a_datatype;
import java.util.Scanner;	//	패키지 임포트 자동 단축키 : ctrl + shift + o

/*
	콘솔에 출력
		System.out
				` .print()
				` .println()
				` .printf()
	
	콘솔에 입력
		System.in
		
	 -> Scanner 이용
	 
	 	` 문자열 입력시 : next() / nextLine()	===>	[과제] 차이점 확인
	 	` 정수형 입력시 : nextInt()						* next() : spacebar 입력 전 까지
	 	` 실수형 입력시 : nextDouble()					* nextLine() : enter 입력 전 까지
	 	
*/

public class Ex07_Scanner {
	public static void main(String[] args) {

//		System.out.print("이름을 입력하세요 : ");
//		
//		Scanner input = new Scanner(System.in);
//		String name = input.nextLine();
//		
//		System.out.println("당신의 이름은 " + name + "입니다.");
		
		
		System.out.print("두 정수를 입력하세요(띄어쓰기로 구분) : ");
		
		Scanner one = new Scanner(System.in);
		int first = one.nextInt();
		int second = one.nextInt();
		
		int add = first + second;
		
		System.out.println("두 정수의 합 : " + add);
		
	}
}























































