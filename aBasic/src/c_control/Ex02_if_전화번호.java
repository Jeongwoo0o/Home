package c_control;
import java.util.Scanner;

public class Ex02_if_전화번호 {
	public static void main(String[] args) {
		
		/*
		 *  지역번호가 02라면 "서울입니다" 출력
		 *  그렇지 않고 지역번호가 032라면 "인천입니다" 출력
		 *  나머지는 "한국입니다" 출력
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("전화번호 입력(ex:02-1111-1111) : ");
		
		String tel = input.nextLine();
		int idx = tel.indexOf("-");
		String localNum = tel.substring(0, idx);		// 0 부터 2 전까지
		
		/*
		 *  서울인 경우에 5번째 문자의 값이 3이라면 '마포구'
		 *  그렇지 않으면 '강남구' 출력
		 */
		
		String city = "";
		String gu = "";
		char ch = tel.charAt(5);
		
		if(localNum.equals("02")) {
			city = "서울";
			if(ch == '3') {
				gu = "마포구";
			} else {
				gu = "강남구";
			}
		} else if(localNum.equals("032")){
			city = "인천";
		} else {
			city = "한국";
		}
		
		
		
		System.out.println(city + " / " + gu + "입니다.");
		
	}
}








































