package b_encapsulation;
import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		
		CalculatorExpr c = new CalculatorExpr();

		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력(띄어쓰기로 구분) : ");
		c.setNum1(input.nextInt());
		c.setNum2(input.nextInt());
		
		System.out.println("덧셈 : " + c.getAddition());
		System.out.println("뺄셈 : " + c.getSubtraction());
		System.out.println("곱셈 : " + c.getMultiplication());
		System.out.println("나눗셈 : " + c.getDivision());
	}
}
