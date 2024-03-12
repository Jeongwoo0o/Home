package c_control;

/*
 * 	자료형
 * 		- 기본형 : boolean / char / int / double
 * 		- 참조형 : 클래스 / 배열
 * 				(*)String
 */

public class Ex01_if_주민번호 {
	public static void main(String[] args) {

		String id = "980622-5234567";
		
		char sung = id.charAt(7);
		
		if(sung == '1' || sung == '3' || sung == '9') {
			System.out.println("남자");
		} else if (sung == '0' || sung == '2' || sung == '4'){
			System.out.println("여자");
		} else {
			System.out.println("?");
		}

	}
}





























































