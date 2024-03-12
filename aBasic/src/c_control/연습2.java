package c_control;
import java.util.Scanner;

public class 연습2 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		int second = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("세 정수를 입력하세요(띄어쓰기로 구분) : ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if(num1 > num2) {
			if(num2 > num3) {
				second = num2;
			} else if(num1 > num3) {
				second = num3;
			} else {
				second = num1;
			}
		} else {
			if(num1 > num3) {
				second = num1;
			} else if(num2 > num3) {
				second = num3;
			} else {
				second = num2;
			}
		}
		
		System.out.println("두 번째로 큰 정수는 : " + second);
		
	}
}














































