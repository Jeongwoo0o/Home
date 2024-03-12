package c_control;
import java.util.Scanner;

public class Ex04_switch_전화번호 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("전화번호 입력 : ");
		String num = input.nextLine();
		
		int idx = num.indexOf('-');
		String localNum = num.substring(0, idx);		//0번째 ~ idx('-')전 까지 저장
		
		switch(localNum) {
			case "02": System.out.println("서울"); break;
			case "032": System.out.println("인천"); break;
			default: System.out.println("한국");
		}
		
	}
}




















































