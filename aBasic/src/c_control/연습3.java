package c_control;
import java.util.Scanner;

public class 연습3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = input.nextLine();
		
		char ch;
		for(int i = str.length() - 1; i >= 0; i--) {
			ch = str.charAt(i);
			System.out.print(ch);
		}
		
	}
}













































