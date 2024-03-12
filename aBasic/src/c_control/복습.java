package c_control;

public class 복습 {
	public static void main(String[] args) {
		
		String sn = "880622-1234567";		//	주민번호
		char g = sn.charAt(0);				//	주민번호 9 저장
		
		if(g == '0' || g == '9') {
			System.out.println("MZ");
		}	//end if
		
		switch(g) {
			case '0':
			case '9': System.out.println("청년");	break;
			case '8': System.out.println("젊은이");	break;
			default: System.out.println("정상인");
		}	//end switch
		
	}
}












































