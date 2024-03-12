package b_operator;

/*
 * 	문자열 처리 클래스
 * 		- String			//글자 변화가 심하면 속도 저하 발생(새 메모리 생성, 기존 메모리 삭제)
 * 		- StringBuffer		//글자 변화가 심할 때 사용(기존 메모리에 작성)
 * 		- StringBuilder
 * 
 * 	Garbage Collector : 더 이상 사용하지 않는 메모리 영역을 알아서 해제(실행 조건이 일정하지 않음)
 */

public class Ex11_문자열클래스 {
	public static void main(String[] args) {

//		String s = new String("홍길동");
//		System.out.println("String : " + s);
//		
//		String s2 = "홍길동2";
//		System.out.println("String : " + s2);
														
		String s3 = "홍길동3";							//String 특권 : new 생략 가능, + 연산 가능
		s3 += " 파이팅";									//s3 = s3 + "화이팅";
		System.out.println("String : " + s3);
		
		//--------------------------------------
		
		StringBuffer sb = new StringBuffer("홍길순");
		sb.append(" 파이팅");								//sb += "화이팅";
		System.out.println("StringB : " + sb);
		
//		StringBuffer sb2 = "홍길순";						//error
//		System.out.println("StringB : " + sb2);
		
		//--------------------------------------

//		StringBuilder sbd = new StringBuilder("홍길");
//		System.out.println("StringBD : " + sbd);
//		
//		StringBuilder sbd2 = "홍길";						//error
//		System.out.println("StringBD : " + sbd2);
		
	}
}






















































