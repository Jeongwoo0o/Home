package c_control;
import java.util.Scanner;

public class Ex11_dowhile연습 {
	public static void main(String[] args) {
		
		//	구구단의 단수를 입력받아서 해당 구구단을 출력
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
													//	반복 횟수가 정해진 경우 		-> for문 사용
//		System.out.print("반복 : ");					//	반복 횟수가 정해지지 않은 경우	-> while문
//		int num = in2.nextInt();
//		for(int j = 0; j < num; j++) {
//			System.out.print("입력 : ");
//			int dan = in.nextInt();
//			for(int i = 1; i <= 9; i++) {
//				System.out.println(dan + " * " + i + " = " + dan*i);
//			}	//end for(i)
//		}	//	end for(j)
		
//		while(true) {
//			System.out.print("입력 : ");
//			int dan = in.nextInt();
//			for(int i = 1; i <= 9; i++) {
//				System.out.println(dan + " * " + i + " = " + dan*i);
//			}	//	end for(i)
//			System.out.print("종료?(Y/N) : ");
//			String answer = in.next();
//			if(answer.equals("Y") | answer.equals("y")) break;
//		}	//end while
		
		String answer = "";
		do {
			System.out.print("입력 : ");
			int dan = in.nextInt();
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}	//	end for(i)
			System.out.print("계속?(Y/N) : ");
			answer = in.next();
		} while(answer.equals("Y") | answer.equals("y"));	//	end do-while(i)		
		
	}
}










































