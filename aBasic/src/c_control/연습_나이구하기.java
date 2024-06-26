package c_control;
import java.util.*;

/*
 * 		[참고]
 * 			
 * 		 9 	: 숫자
 * 		'9' : 문자
 * 		"9" : 문자열
 */

public class 연습_나이구하기 {
	public static void main(String[] args) {
		
		Calendar c 	= Calendar.getInstance();
		int year 	= c.get(Calendar.YEAR);					//	년 불러오기

		String id 		= "241212-3234567";
		String gen_str	= id.substring(7, 8);				//	성 가져오기
		String nai_str 	= id.substring(0, 2);				//	90 가져오기
		int nai 		= Integer.parseInt(nai_str);		//	String	-> int 형 변환 ("90"	-> 90)
		
		int age = 0;
		switch(gen_str) {
		case "1":
		case "2":	age = year - (1900 + nai) + 1; break;	//	한국 나이 구하기
		case "3":
		case "4":	age = year - (2000 + nai) + 1; break;	//	한국 나이 구하기 (2000년생 이후)
		}	//end switch

		System.out.println("나이 : " + age);

	}
}









































