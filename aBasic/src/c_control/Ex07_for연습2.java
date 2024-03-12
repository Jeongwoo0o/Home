package c_control;
import java.util.Scanner;

public class Ex07_for연습2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("입력 : ");
		String N = input.nextLine();		//str = "f"
		char ch = N.charAt(0);			//ch = 'f'
		
//		for(char alpha = 'a'; alpha <= ch; alpha++) {
//			System.out.print(alpha + " ");
//		}
//		System.out.println();
		
//		for(char alpha = ch; alpha <= 'z'; alpha++) {
//			System.out.print(alpha + " ");
//		}
//		System.out.println();
		
		if(ch >= 'a' && ch <= 'z') {
			for(char alpha = 'a'; alpha <= ch; alpha++) {
				System.out.print(alpha + " ");
			}
		} else if(ch >= 'A' && ch <= 'Z') {
			for(char alpha = ch; alpha <= 'Z'; alpha++) {
				System.out.print(alpha + " ");
			}
		} else {
			System.out.println("Error");
		}
		
	}
}



















































