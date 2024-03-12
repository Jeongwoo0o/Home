package c_control;
import java.util.Scanner;

public class Ex07_for연습 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int su = input.nextInt();
		
		for(int i = 1; i <= su; i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
	}
}






























































