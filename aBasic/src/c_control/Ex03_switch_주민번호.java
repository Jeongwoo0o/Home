package c_control;

public class Ex03_switch_주민번호 {
	public static void main(String[] args) {
		
		String id = "980622-1434567";
		String chul = "";
		String seong = "";

		char ch = id.charAt(8);			// id에서 8번째에 있는 문자를 ch에 저장
		char ch2 = id.charAt(7);		// id에서 7번째에 있는 문자를 ch에 저장
		
		/*
		 * 	출신지 값이
		 * 	0이라면 서울
		 * 	1이라면 인천/부산
		 * 	2라면 경기
		 */
		
		/*
		 * 	주민번호에서 7번째 문자에 의해 성별을 출력
		 * 	단, switch 문장으로 완성
		 */
		
		switch(ch) {
			case '0': chul = "서울";
				break;
			case '1': chul = "인천 / 부산";
				break;
			case '2': chul = "경기";
				break;
			default: chul = "한국";
		}
		
		switch(ch2) {
			case '1':
			case '3':
			case '9': seong = "남자";
				break;
			case '0':
			case '2':
			case '4': seong = "여자";
				break;
			default: seong = "한국인";
		}
		
		System.out.println(chul + " " + seong);
		
	}
}













































