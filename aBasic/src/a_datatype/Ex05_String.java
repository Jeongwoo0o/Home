package a_datatype;

/*
	자료형 (데이터타입)
	1. 기본형(primitive)
		-논리형 : boolean
		-문자형 : char
		-정수형 : int / long
		-실수형 : double
		
	2. 참조형(reference) : 클래스 / 배열
			=> new 키워드를 통해서 메모리(객체생성) 확보해야 함
	
	[ex] 이름이 홍길동
		char a = '홍길동';	//error
		char b = "홍길동";	//error
		
		char x = '홍';
		char y = '길';
		
	[cf] 문자 1개 	  => char
		 문자열(0개 이상) => String(클래스)
*/

public class Ex05_String {
	public static void main(String[] args) {

		char ch = 'ㅁ';
		
		// 참조형 변수 선언 / 메모리 확보(값 지정) -> 객체 생성
		String name = new String("홍길동");
		String irum = new String("홍길동");
		
		// 주소값 비교
		if(name == irum) {
			System.out.println("동일 이름");
		} else {
			System.out.println("다른 이름");
		}
		
		// 문자열 비교는 equals 함수를 이용해야만 함
		if(name.equals(irum)) {
			System.out.println("동일 이름2");
		} else {
			System.out.println("다른 이름2");
		}

	}
}





































