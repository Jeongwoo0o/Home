package d_constructor2;

public class Main {
	public static void main(String[] args) {

		
		// 변수 선언 + 객체 생성(new 이용)
		Student h = new Student();

		Student h2 = new Student("홍길동", 100, 88, 77);
		
		
		
		System.out.println(h.getName() + "님의 총점 : " + h.calTotal());
		System.out.println(h.getName() + "님의 평균 : " + h.calAvg());
		
		System.out.println("\n" + h2.getName() + "님의 총점 : " + h2.calTotal());
		System.out.println(h2.getName() + "님의 평균 : " + h2.calAvg());
	}
}





















