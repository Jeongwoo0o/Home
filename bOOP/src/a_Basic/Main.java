package a_Basic;

public class Main {
	public static void main(String[] args) {

		// (1) 변수 선언
		Student h;
		
		// (2) 객체 생성 - new 이용
		h = new Student();
		
		h.name = "홍길동";
		h.kor = 100;
		h.eng = 88;
		h.math = 77;
		
		System.out.println(h.name + "님의 총점 : " + h.calTotal());
		System.out.println(h.name + "님의 평균 : " + h.calAvg());
	}
}

























