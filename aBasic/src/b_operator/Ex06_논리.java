package b_operator;
import java.util.Scanner;

/*
 * 		논리 연산자
 * 			
 * 			- 일반 논리 : &&(and)	||(or)	!
 * 			- 이진 논리 : &		|		^
 * 
 * 		A	B		A&&B			A||B
 * 		0	0		0				0
 * 		0	1		0				1	
 * 		1	0		0				1		
 * 		1	1		1				1		
 * 
 */

public class Ex06_논리 {
	public static void main(String[] args) {

		int 성적 = 75;
		char 태도 = 'A';
		
		if(성적 >= 80 || 태도 == 'A') {
			System.out.println("성적이 80점 이상이거나 태도가 A라면 우등생");
		} else {
			System.out.println("x");
		}
		
		if(성적 >= 80 && 태도 == 'A') {
			System.out.println("성적이 80점 이상이고 태도가 A라면 성적 향상반");
		} else {
			System.out.println("x");
		}
		
	}
}






















































