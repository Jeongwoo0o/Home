package b_encapsulation;

public class Main {
	public static void main(String[] args) {

		// (1) 변수 선언
		Student h;
		
		// (2) 객체 생성 - new 이용
		h = new Student();
		
		/*h.name = "홍길동";
		h.kor = 100;
		h.eng = 88;
		h.math = 77;*/
		h.setName("홍길동");
		h.setKor(100);
		h.setEng(88);
		h.setMath(77);
		
		System.out.println(h.getName() + "님의 총점 : " + h.calTotal());
		System.out.println(h.getName() + "님의 평균 : " + h.calAvg());
	}
}

























