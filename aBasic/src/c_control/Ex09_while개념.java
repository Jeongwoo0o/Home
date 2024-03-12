package c_control;
import java.util.Scanner;

/*
 * 		for		: 주로 반복 횟수가 정해진 경우
 * 		while	: 주로 반복 횟수가 고정적이지 않은 경우
 */

public class Ex09_while개념 {
	public static void main(String[] args) {

//		int sum = 0;
//		
//		int i = 1;
//		
//		for(; i <= 10; i++) {
//			sum += i;
//		}	//	end for(i)
//		
//		while(i <= 10) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println("합 : " + sum);
		
		Scanner in = new Scanner(System.in);
		System.out.print("입력 : ");
		int dan = in.nextInt();
		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(dan + " * " + i + " = " + dan*i);
//		}	//	end for(i)
		
		int i = 1;
		while ( i <= 9 ) {
//			System.out.println(dan + " * " + i + " = " + dan*i);
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			i++;
		}	//end while(i)

	}
}















































