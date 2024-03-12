package a_datatype;

// 한 줄 주석
/* 여러 줄
   주석
*/
/**
   여러줄 주석
   설명문 주석
*/

/*
	명명 규칙
		- 문자 + 숫자 + _ + ($)
		- 첫 글자로 숫자는 안됨
		- 길이 제한 없음
		- 대소문자 구별
		- 키워드 안됨
		
	명명 권장사항
		- 패키지명 전부 소문자
		- 클래스명 첫 글자는 대문자 + 영단어의 첫 글자 대문자
			ex) CuteDogBath
		- 함수명 / 변수명 첫 글자는 소문자 + 영단어의 첫 글자 대문자
			ex) catBathAndFeed
*/

public class Ex01_변수명 {
	public static void main(String[] args) {
		
		// 변수 선언
		char chName;
		int i;
		int int1;
		double abcdef;
		boolean a;
		
		// 값 저장
		chName = '이';		// 문자형 ''
		i = 100;			// 정수형
		abcdef = 3.6;		// 실수형
		a = true;			// or false
		
		// 출력
		System.out.println(chName);
		System.out.println(i);
		System.out.println(abcdef);
		System.out.println(a);
		
	}
}

/*
	변수
		- 메모리상에 값을 저장하는 공간
		
	자료형 (데이터 타입)
		1. 기본형 (Primitive)
			- 논리형 : boolean(1B)
			- 문자형 : char(2B)
			- 정수형 : int(4B) / long(8B)		(byte : 1B / short : 2B)
			- 실수형 : double(8B)				(float : 4B)
			
		2. 참조형 (Reference)
			- 배열 / 클래스
	
	[참고]
		1 bit : 0 or 1
		8 bit = 1 byte
		
		1024B = 1KB
		1024KB = 1MB
		1024MB = 1GB
		1024GB = 1TB
		
	[참고]
		int : 4B = 32bit
		0	bit : 부호(0 : +, 1 : -)
		31	bit : 숫자 표현
		
		-2^31 ~ +2^31-1
		대략 22억
		
*/