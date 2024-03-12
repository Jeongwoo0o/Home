package a_datatype;

public class Ex03_변수선언 {
	public static void main(String[] args) {
	
		// [1] 변수 선언 + 값 대입
		int kor;
		kor = 30;
		
		// [2] 초기화 : 변수 선언 시 값 대입
		int eng = 30;
		
		// [3] 변수가 여러 개 일 경우
		int math = 30, java = 50;
		
		if(kor == java) {
			System.out.println("점수 동일");
		} else {
			System.out.println("점수 다름");
		}
		
		// [참고] 
		// swap :  두 변수의 값을 맞바꾸기
		int a = 10, b = 20;
		System.out.println("A = " + a + ", B = " + b);
		
		// 임시 변수 temp에 저장 후 바꾸기 (temp <= a, a <= b, b <= c)
		int temp = a;
		a = b;
		b = temp;
		System.out.println("A = " + a + ", B = " + b);
		
	}
}















































