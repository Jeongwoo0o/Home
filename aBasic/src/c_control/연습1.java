package c_control;
import java.util.Scanner;

public class 연습1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("학번을 입력하세요 : ");
		String num = input.nextLine();
		String num1 = num.substring(0, 4);		//입학년도
		String num2 = num.substring(4, 5);		//단과대번호	1:공대, 2:사회대
		String num3 = num.substring(5, 7);		//학과번호		공대					사회대
												//			11:컴퓨터학과			11:사회학과
												//			12:소프트웨어학과		12:경영학과
												//			13:모바일학과			13:경제학과	
												//			22:자바학과			
												//			33:서버학과	
		int st = 0;
		String dan = "";
		String hak = "";
		if(num2.equals("1")) {
			dan = "공대";
			if(num3.equals("11")) {
				hak = "컴퓨터학과";
			} else if(num3.equals("12")) {
				hak = "소프트웨어학과";
			} else if(num3.equals("13")) {
				hak = "모바일학과";
			} else if(num3.equals("22")) {
				hak = "자바학과";
			} else if(num3.equals("33")) {
				hak = "서버학과";
			} else {
				st += 1;
			}
		} else if (num2.equals("2")) {
			dan = "사회대";
			if(num3.equals("11")) {
				hak = "사회학과";
			} else if(num3.equals("12")) {
				hak = "경영학과";
			} else if(num3.equals("13")) {
				hak = "경제학과";
			} else {
				st += 1;
			}
		} else {
			st += 1;
		}
		
		if(st == 1) {
			System.out.println("학번을 똑바로 입력해주세요.");
		} else {
			System.out.println(num + "은(는) " + num1 + "년도에 입학한 " + dan + " " + hak + " 학생입니다.");
		}
		
	}
}























































