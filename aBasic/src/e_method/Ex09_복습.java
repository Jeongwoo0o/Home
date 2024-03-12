package e_method;
import java.util.Scanner;

public class Ex09_복습 {
	public static void main(String[] args) {

		String result = func();
		
		method(result);

	}
	
	static void method(String result) {
		System.out.println("합격여부 : " + result);
	}
	
	// 역할 : 콘솔창에서 점수를 입력받기
	//		 해당 점수가 80점 이상이면 "합격" 
	//		 		  	   그렇지 않으면 "불합격"
	static String func() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = in.nextInt();

		if(score >= 80) {
			return "합격";
		} else {
			return "불합격";
		}
		
	}
}




































